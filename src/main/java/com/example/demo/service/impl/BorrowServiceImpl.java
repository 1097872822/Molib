package com.example.demo.service.impl;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.BorrowMapper;
import com.example.demo.po.Borrow;
import com.example.demo.po.BorrowExample;
import com.example.demo.po.BorrowrecordExample;
import com.example.demo.po.BorrowExample.Criteria;
import com.example.demo.service.BorrowService;
@Service
public class BorrowServiceImpl implements BorrowService {
@Autowired  private BorrowMapper borrowMapper;
@Value("${spring.mail.username}")
private String from;
	@Override
	public List<Borrow> getAll() {
		// TODO Auto-generated method stub

		BorrowExample example=new BorrowExample();
		example.setOrderByClause("add_time desc");
		return borrowMapper.selectByExample(example);
	}

	@Override
	public int add(Borrow t) {
		// TODO Auto-generated method stub
		return borrowMapper.insertSelective(t);
	}

	@Override
	public int update(Borrow t) {
		// TODO Auto-generated method stub
		return borrowMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return borrowMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Borrow getById(Integer id) {
		// TODO Auto-generated method stub
		return borrowMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<Borrow> userBorrow(Integer uid) {
		// TODO Auto-generated method stub
		BorrowExample example=new BorrowExample();
		Criteria criteria=example.createCriteria();
		criteria.andUIdEqualTo(uid);
		return borrowMapper.selectByExample(example);
		
	}

	@Override
	public List<Borrow> bookBorrowASC() {
		// TODO Auto-generated method stub
		return borrowMapper.selectByBorrowASC(null);
	}
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	JavaMailSenderImpl mailSender;
	@Override
	public void sendMimeMail(String to,String bookname) {
		// TODO Auto-generated method stub
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = null;
		String subject = "移动图书馆书目查询系统借阅到期提醒";
		String context = "<h3>您所借阅的书《" + bookname + " 》  ，借阅时间将至，请记得归还!</h3>";
		try {
			helper = new MimeMessageHelper(message, true);
			helper.setFrom(from);
			helper.setSubject(subject);
			helper.setTo(to);
			helper.setText(context, true);
			mailSender.send(message);
			// 日志信息
			logger.info("邮件已经发送。");
		} catch (MessagingException e) {
			logger.error("发送邮件时发生异常！", e);
		}
	}


}
