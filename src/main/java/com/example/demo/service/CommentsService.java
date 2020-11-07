package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.po.Comments;

@Service
public interface CommentsService extends BaseService<Comments, Integer>{
List<Comments> SelectByBookId(Integer bookid);
}
