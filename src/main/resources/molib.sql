/*
 Navicat MySQL Data Transfer

 Source Server         : mylib
 Source Server Type    : MySQL
 Source Server Version : 50162
 Source Host           : localhost:3306
 Source Schema         : molib

 Target Server Type    : MySQL
 Target Server Version : 50162
 File Encoding         : 65001

 Date: 07/11/2020 18:43:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books`  (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_author` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_press` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'book',
  `ca_id` int(11) NULL DEFAULT NULL,
  `ca_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_number` int(11) NULL DEFAULT NULL,
  `book_brief` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_introduce` varchar(600) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `collect_number` int(11) NULL DEFAULT 0,
  `borrow_number` int(11) NULL DEFAULT 0,
  `add_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`book_id`) USING BTREE,
  INDEX `ca_name`(`ca_name`) USING BTREE,
  INDEX `ca_id`(`ca_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES (1, '沉默的巡游', '[日] 东野圭吾', '南海出版公司', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585561813958.jpg', 4, '小说', 8, '★东野圭吾全新长篇小说，简体中文版首次出版《白夜行》《嫌疑人X的献身》《放学后》《新参者》后，第5次夺得周刊文春推理榜年度第1名！★东野圭吾：《沉默的巡游》是我的集大成之作，希望能将《嫌疑人X的献身》没能拿到的爱伦·坡奖一举拿下。★东野圭吾前所未有的创新之作，让他直呼难写！一桩众目睽睽下的凶杀案，华丽的多重反转，出人意料的神展开！★这是一个悲伤的故事，却会给你一整年的温暖。★日本上市当月，平均每6秒卖出1本', '<p>佐织已经失踪三年了。 她曾是我们这个小镇最受欢迎的女孩，人长得漂亮，歌唱得也好听。我们看着她一天天长大，视她若珍宝。可就在佐织即将出道成为歌手的时候，她突然失踪了。 漫长的等待，我们只等到她遇害的噩耗。凶手明明就是镇上那个无耻的男人，但他竟然被释放了。既然警察和法律都拿他没办法，那就让我们给他点厉害瞧瞧！但一场突发事故打乱了我们所有的安排，只能静待下一次机会的到来。 就在这时，传来了那个男人被杀的消息，我们都成了嫌疑人。</p>', 2, 4, '2020-03-22 00:00:00');
INSERT INTO `books` VALUES (2, '活着', '余华', '作家出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641120773.jpg', 3, '历史', 10, '《活着(新版)》荣获意大利格林扎纳•卡佛文学奖最高奖项（1998年）、台湾《中国时报》10本好书奖（1994年）、香港“博益”15本好书奖（1994年）、第三届世界华文“冰心文学奖”（2002年），入选香港《亚洲周刊》评选的“20世纪中文小说百年百强”、中国百位批评家和文学编辑评选的“20世纪90年代最有影响的10部作品”。', '<p>《活着(新版)》讲述了农村人福贵悲惨的人生遭遇。福贵本是个阔少爷，可他嗜赌如命，终于赌光了家业，一贫如洗。他的父亲被他活活气死，母亲则在穷困中患了重病，福贵前去求药，却在途中被国民党抓去当壮丁。经过几番波折回到家里，才知道母亲早已去世，妻子家珍含辛茹苦地养大两个儿女。此后更加悲惨的命运一次又一次降临到福贵身上，他的妻子、儿女和孙子相继死去，最后只剩福贵和一头老牛相依为命，但老人依旧活着，仿佛比往日更加洒脱与坚强。</p>', 2, 2, '2020-03-23 00:00:00');
INSERT INTO `books` VALUES (3, '人类简史', '[以色列] 尤瓦尔·赫拉利', '中信出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641236384.jpg', 3, '历史', 0, '十万年前，地球上至少有六种不同的人但今日，世界舞台为什么只剩下了我们自己？从只能啃食虎狼吃剩的残骨的猿人，到跃居食物链顶端的智人，从雪维洞穴壁上的原始人手印，到阿姆斯壮踩上月球的脚印，从认知革命、农业革命，到科学革命、生物科技革命，我们如何登上世界舞台成为万物之灵的？', '<p>《人类简史：从动物到上帝》是以色列新锐历史学家的一部重磅作品。从十万年前有生命迹象开始到21世纪资本、科技交织的人类发展史。十万年前，地球上至少有六个人种，为何今天却只剩下了我们自己？我们曾经只是非洲角落一个毫不起眼的族群，对地球上生态的影响力和萤火虫、猩猩或者水母相差无几。为何我们能登上生物链的顶端，最终成为地球的主宰？</p>', 3, 8, '2020-03-24 22:33:06');
INSERT INTO `books` VALUES (4, '天才在左 疯子在右', '高铭', '武汉大学出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641259647.jpg', 5, '心理', 0, '本书以访谈录的形式记载了生活在另一个角落的人群（精神病患者、心理障碍者等边缘人）深刻、视角独特的所思所想，让人们可以了解到疯子抑或天才真正的内心世界。', '<p>本书以访谈录的形式记载了生活在另一个角落的人群（精神病患者、心理障碍者等边缘人）深刻、视角独特的所思所想，让人们可以了解到疯子抑或天才真正的内心世界。此书是国内第一本具有人文情怀的精神病患谈访录。内容涉及生理学、心理学、佛学、宗教、量子物理、符号学以及玛雅文明和预言等众多领域。 本书以访谈录的形式记载了生活在另一个角落的人群（精神病患者、心理障碍者等边缘人）深刻、视角独特的所思所想，让人们可以了解到疯子抑或天才真正的内心世界。此书是国内第一本具有人文情怀的精神病患谈访录。内容涉及生理学、心理学、佛学、宗教、量子物理、符号学以及玛雅文明和预言等众多领域。</p>', 5, 3, '2020-03-25 22:33:08');
INSERT INTO `books` VALUES (5, '非暴力沟通', '[美] 马歇尔·卢森堡', '华夏出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641278605.jpg', 5, '心理', 1, '作为一个遵纪守法的好人，也许我们从来没有想过和“暴力”扯上关系。不过如果稍微留意一下现实生活中的谈话方式，并且用心体会各种谈话方式给我们的不同感受，我们一定会发现，有些话的确伤人！', '<p>作为一个遵纪守法的好人，也许我们从来没有想过和&ldquo;暴力&rdquo;扯上关系。不过如果稍微留意一下现实生活中的谈话方式，并且用心体会各种谈话方式给我们的不同感受，我们一定会发现，有些话的确伤人！言语上的职责、嘲讽、否定、说教以及任意打断、拒不回应、随意出口的评价和结论给我们带来的情感和精神上的创伤，甚至比肉体的伤害更加令人痛苦。这些无心或有意的语言暴力让人与人变得冷漠、隔阂、敌视</p>', 1, 3, '2020-03-26 22:33:10');
INSERT INTO `books` VALUES (7, '薛兆丰经济学讲义', '薛兆丰', '中信出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641299994.jpg', 10, '经管职场', 3, '我们每天收到无数纷繁复杂的信息，看到各种光怪陆离的现象，世界是复杂的。', '<p>世界又并不复杂，只是你需要一双慧眼。经济学是一种帮助你成为明白人的智慧，它是观察世界的视角和态度，而不是一堆函数、公式和图表。</p>\r\n\r\n<p>薛兆丰老师善于把复杂的现象用简单直接的方式说清楚。这本书讲解了生活中不可能绕过的经济学核心概念，比如稀缺、成本、价格、交易、信息不对称、收入等与个人生活密切相关的知识，通过大量真实案例的经济学分析，更实际、更有趣、更深入和彻底地将经济学思维运用于各种实际场景，帮你绕过经济学花招，理解现象背后的经济逻辑，从而启发你将同样的思维运用到日常生活和工作中去。</p>\r\n\r\n<p>你将摆脱直觉和经验的控制，拥有可以举一反三、能够学以致用的知识体系，从而对这个由海量陌生人连接而成的社会做出恰如其分的反应。</p>\r\n\r\n<p>相信读完本书之后，你会对自己身处的世界有更深刻的理解，成为这个复杂世界的明白人。</p>', 1, 3, '2020-03-27 22:33:14');
INSERT INTO `books` VALUES (10, '时间的秩序', '[意] 卡洛·罗韦利', '湖南科学技术出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641446082.jpg', 9, '科技', 8, '为什么我们记得过去，而非未来？时间“流逝”意味着什么？是我们存在于时间之内，还是时间存在于我们之中？卡洛·罗韦利用诗意的文字，邀请我们思考这一亘古难题——时间的本质。', '<p>物理学与哲学的完美融合，在习以为常之处，探索世界的惊人真相，用诗意语言、前沿物理学理论探索时间的本质，颠覆我们的常识与直觉。</p>\r\n\r\n<p>奇异博士本尼迪克特&middot;康伯巴奇（卷福）倾情朗读，有声书获得英国国家图书奖。</p>\r\n\r\n<p>《时代》《自然》《卫报》《新科学家》《纽约时报》等10余家媒体好评推荐。</p>\r\n\r\n<p>精美装帧，相同开本，延续《七堂极简物理课》《现实不似你所见》《极简科学起源课》的唯美设计。</p>', 2, 5, '2020-03-31 15:57:25');
INSERT INTO `books` VALUES (11, '你当像鸟飞往你的山', '[美] 塔拉·韦斯特弗', '南海出版公司', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585986743398.jpg', 1, '传记', 4, '一个惊人的故事，真正鼓舞人心。我在阅读她极端的童年故事时，也开始反思起自己的生活。《你当像鸟飞往你的山》每个人都会喜欢。它甚至比你听说的还要好。  ——比尔•盖茨', '<p>人们只看到我的与众不同：一个十七岁前从未踏入教室的大山女孩，却戴上一顶学历的高帽，熠熠生辉。</p>\r\n\r\n<p>只有我知道自己的真面目：我来自一个极少有人能想象的家庭。我的童年由垃圾场的废铜烂铁铸成，那里没有读书声，只有起重机的轰鸣。不上学，不就医，是父亲要我们坚持的忠诚与真理。父亲不允许我们拥有自己的声音，我们的意志是他眼中的恶魔。</p>\r\n\r\n<p>哈佛大学，剑桥大学，哲学硕士，历史博士。我知道，像我这样从垃圾堆里爬出来的无知女孩，能取得如今的成就，应当感激涕零才对。但我丝毫提不起热情。</p>\r\n\r\n<p>我曾怯懦，崩溃，自我怀疑，内心里有什么东西腐烂了，恶臭熏天。</p>\r\n\r\n<p>直到我逃离大山，打开另一个世界。</p>\r\n\r\n<p>那是教育给我的新世界，那是我生命的无限可能。</p>', 2, 3, '2020-04-04 15:53:05');
INSERT INTO `books` VALUES (12, '看见', '柴静', '广西师范大学出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585986880520.jpg', 1, '传记', 6, '我试着尽可能诚实地写下这不断犯错、不断推翻、不断疑问、不断重建的事实和因果，一个国家由人构成，一个人也由无数他人构成，你想如何报道一个国家，就要如何报道自已。', '<p>《看见》是知名记者和主持人柴静讲述央视十年历程的自传性作品，既是柴静个人的成长告白书，某种程度上亦可视作中国社会十年变迁的备忘录。十年前她被选择成为国家电视台新闻主播，却因毫无经验而遭遇挫败，非典时期成为现场记者后，现实生活犬牙交错的切肤之感，让她一点一滴脱离外在与自我的束缚，对生活与人性有了更为宽广与深厚的理解。十年之间，非典，汶川地震，两会报道，北京奥运，在每个重大事件现场，几乎都能发现柴静的身影，而如华南虎照、征地等刚性的调查报道她也多有制作。在书中，她记录下淹没在宏大叙事中的动人细节，为时代留下私人的注脚。一如既往，柴静看见并记录下新闻中给她留下强烈生命印象的个人，每个人都深嵌在世界之中，没有人可以只是一个旁观者，他人经受的，我必经受。书中记录下的人与事，是他们的生活，也是你和我的生活。</p>\r\n\r\n<p>《看见》中，我没有刻意选择标志性事件，也没有描绘历史的雄心，在大量的新闻报道里，我只选择了留给我强烈生命印象的人，因为工作原因，我恰好与这些人相遇。他们是流淌的，从我心腹深处的石坝上漫溢出来，坚硬的成见和模式被一遍遍冲刷，摇摇欲坠，土崩瓦解。这种摇晃是危险的，但思想的本质就是不安。</p>', 0, 2, '2020-04-04 15:55:08');
INSERT INTO `books` VALUES (13, '浪潮之巅', '吴军', '电子工业出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585986987573.jpg', 9, '科技', 7, '近一百多年来，总有一些公司很幸运地、有意识或无意识地站在技术革命的浪尖之上。在这十几年间，它们代表着科技的浪潮，直到下一波浪潮的来临。', '<p>近一百多年来，总有一些公司很幸运地、有意识或无意识地站在技术革命的浪尖之上。在这十几年间，它们代表着科技的浪潮，直到下一波浪潮的来临。</p>\r\n\r\n<p>从一百年前算起，AT&amp;T 公司、IBM 公司、苹果公司、英特尔公司、微软公司、思科公司、雅虎公司和Google公司都先后被幸运地推到了浪尖。虽然，它们来自不同的领域，中间有些已经衰落或正在衰落，但是它们都极度辉煌过。本书系统地介绍了这些公司成功的本质原因及科技工业一百多年的发展。</p>\r\n\r\n<p>在极度商业化的今天，科技的进步和商机是分不开的。因此，本书也系统地介绍了影响到科技浪潮的风险投资公司，诸如 KPCB 和红杉资本，以及百年来为科技捧场的投资银行，例如高盛公司，等等。</p>\r\n\r\n<p>在这些公司兴衰的背后，有着它必然的规律。本书不仅讲述科技工业的历史，更重在揭示它的规律性。</p>', 0, 3, '2020-04-04 15:56:43');
INSERT INTO `books` VALUES (14, '硅谷钢铁侠', '[美] 阿什利·万斯', '中信出版集团', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585987055979.jpg', 9, '科技', 0, '埃隆•马斯克是风格独具的梦想家，也是眼光独到、一再开创新商业模式的企业家。从PayPal，到特斯拉、Space X、太阳城，他的创业历程中遭遇了无数棘手的事件，但是每一次突破都令全球惊艳。无论钟情于什么领域，他都可以展现出惊人的专注力。', '<p>埃隆&bull;马斯克是风格独具的梦想家，也是眼光独到、一再开创新商业模式的企业家。从PayPal，到特斯拉、Space X、太阳城，他的创业历程中遭遇了无数棘手的事件，但是每一次突破都令全球惊艳。无论钟情于什么领域，他都可以展现出惊人的专注力。44岁的马斯克已经涉足颠覆互联网、 金融、汽车、航空以及能源业。他近乎疯狂的对科技的专注，使他成为目前最成功的连续创业者和科技创业家。</p>\r\n\r\n<p>硅谷资深科技记者阿什利&bull;万斯与马斯克超过40个小时的深度对话，记录了他从粗放贫瘠的南非到国际商业世界顶峰的不凡之旅。在三年多的时间里，作者首次深入特斯拉、Space X等公司，采访了马斯克的伙伴、员工、家人、朋友超过300人，真实地讲述了马斯克在创立、运营他那些足够改变世界的公司（包括PayPal，特斯拉，Space X和太阳城）时发生的惊人故事。同时也揭示了企业家和创业者如何专注于创业本身，并同时管理多领域公司所需要的能力、方法和经验，以及如何在与许多竞争对手交手时不断推进企业创新的步伐。</p>\r\n\r\n<p>埃隆&bull;马斯克的人生经历，和无数改变世界的伟大实业家的经历一样，是那种可以被千百次地写进小说、搬上银幕后，每一次重看都依然激动人心的，属于全人类的传奇故事。</p>', 0, 3, '2020-04-04 15:58:25');
INSERT INTO `books` VALUES (15, '被讨厌的勇气', '岸见一郎 / 古贺史健', '机械工业出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585987219924.jpg', 5, '心理', 5, '「被讨厌的勇气」并不是要去吸引被讨厌的负向能量，而是，如果这是我生命想绽放出最美的光彩，那么，即使有被讨厌的可能，我都要用自己的双手双脚往那里走去。」', '<p>被讨厌的勇气」并不是要去吸引被讨厌的负向能量，而是，如果这是我生命想绽放出最美的光彩，那么，即使有被讨厌的可能，我都要用自己的双手双脚往那里走去。」</p>\r\n\r\n<p>「因为拥有了被讨厌的勇气，于是有了真正幸福的可能。」</p>\r\n\r\n<p>你是否常常对繁琐的生活感到乏味？</p>\r\n\r\n<p>你是否时时为复杂的人际关系感到疲惫？</p>\r\n\r\n<p>你是否认为人生的意义越来越模糊难见？</p>\r\n\r\n<p>我们如何能够在繁杂的日常琐碎和复杂的人际关系中用自己的双手去获得真正的幸福？</p>\r\n\r\n<p>这一切的答案尽在这本《被讨厌的勇气》中！</p>\r\n\r\n<p>★日本亚马逊2014年度销售冠军，连续300天雄踞销售榜首！</p>\r\n\r\n<p>★蔡康永、张德芬 陈文茜、曾宝仪、勇气推荐！</p>\r\n\r\n<p>★张沛超、胡慎之、动机在杭州 作序推荐！</p>\r\n\r\n<p>★阿德勒思想拥有改变人一生的力量。剩下的就只有能否鼓起迈出一步的&ldquo;勇气&rdquo;</p>', 0, 3, '2020-04-04 16:00:13');
INSERT INTO `books` VALUES (17, '社会心理学', '[美] 戴维·迈尔斯', '人民邮电出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585987347216.jpg', 5, '心理', 4, '《社会心理学》这本书被美国700多所大学或学院的心理系所采用，是这一领域的主导教材，已经成为评价其他教材的标准。', '<p>《社会心理学》这本书被美国700多所大学或学院的心理系所采用，是这一领域的主导教材，已经成为评价其他教材的标准。</p>\r\n\r\n<p>这本书将基础研究与实践应用完美地结合在一起，以富有逻辑性的组织结构引领学生了解人们是如何思索、影响他人并与他人建立联系的。是人们了解自身、了解社会、了解自己与社会之间关系的最佳的指导性书籍。</p>', 1, 3, '2020-04-04 16:02:26');
INSERT INTO `books` VALUES (18, '亲密关系', '罗兰•米勒 (Rowland Miller) / 丹尼尔•珀尔曼 (Daniel Perlman)', '人民邮电出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585987401350.jpg', 5, '心理', 3, '爱情是人类情感中最美妙的一种体验，古今中外关于爱情的伟大文学作品有许多，但从心理学角度对两性关系进行科学而系统总结的专著尚为数不多。', '<p>爱情是人类情感中最美妙的一种体验，古今中外关于爱情的伟大文学作品有许多，但从心理学角度对两性关系进行科学而系统总结的专著尚为数不多。</p>\r\n\r\n<p>《亲密关系》从一出版，就立即获得了读者的普遍喜爱，不仅得到了专业人士的首肯，更是得到普通读者的高度评价。作者综合了心理学多个分支的研究理论和成果，用饶有趣味的论述，总结出人们在交往与沟通、爱情与承诺、婚姻与性爱、嫉妒与背叛等方面的行为特点和规律。</p>\r\n\r\n<p>本书内容丰富、语言优美；既注重专业性，有强调可读性。研究亲密关系的专业人士可以从中得到学习和参考；而对于社会大众来说，只要他（她）想获得一份满意的亲密关系，都可以从中得到启发。</p>', 2, 1, '2020-04-04 16:03:31');
INSERT INTO `books` VALUES (19, '亮剑', '都梁', '解放军文艺出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009064288.jpg', 2, '军事', 3, '李云龙是一个叱咤风云、百战沙场的职业军人，是一个一生都在血与火中搏斗的名将。', '<p>李云龙是一个叱咤风云、百战沙场的职业军人，是一个一生都在血与火中搏斗的名将。他的人生信条是：面对强大的对手，明知不敌，也要毅然亮剑，即使倒下，也要成为一座山、一道岭。在战争与和平的时空转换中，他的命运注定要充满悲欢离合&mdash;无论是政治生涯还是婚姻、爱情。</p>', 2, 1, '2020-04-04 22:04:28');
INSERT INTO `books` VALUES (20, '孙子兵法', '孙武', '上海古籍出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009143768.jpg', 2, '军事', 7, '《孙子兵法》是我国最古老最杰出的一部兵书，历来备受推崇，研习者辈出不穷。我们现在能见到的最早为《孙子兵法》作注的乃一代枭雄曹操，字里行间不乏曹操的真知灼见。', '<p>《孙子兵法》是我国最古老最杰出的一部兵书，历来备受推崇，研习者辈出不穷。我们现在能见到的最早为《孙子兵法》作注的乃一代枭雄曹操，字里行间不乏曹操的真知灼见。当代著名军事家郭化若更是长期研究《孙子兵法》，不但为全文作了校勘、注释、今译，还撰有题解及考订、评论文字，既有较高的学术水平，又浅显易懂。本书在郭化若注评的基础上又加上了曹操的注，将孙武、曹操、郭化若的军事思想融为一书，以裨读者把握我国两千年来军事思想演化的脉络。同时为方便阅读，在开本、版式、装帧等方面亦作了精心的设计。堪称形式与内容相得益彰。</p>', 1, 0, '2020-04-04 22:05:49');
INSERT INTO `books` VALUES (21, '中央帝国的军事密码', '郭建龙', '鹭江出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009222953.jpg', 2, '军事', 1, '以技术化方式，读懂中央帝国两千余年军事战略的演化。读懂了中央帝国的军事密码，就读懂了中国何以过去，何以现在。', '<p>本书将中国从秦朝到清末的两千多年历史划分为五个军事战略演化时代，从地理角度出发，详细分析每一次中国古代战争背后的军事逻辑，以及它对各朝代的兴衰和中国历史的走向产生的影响。作者通过详尽而真实的叙述、珍贵而丰富的史料，让读者了解军事家们每一场战争的目的，最终理解历代战争中的战略问题。</p>\r\n\r\n<p>这是一本能看懂脉络的中国军事史，以浅显易懂的文字讲故事，以故事带动知识，体现了很高的专业水平。作者历时多年实地考察，精心搜集各种资料，以此展现战争的逻辑，帮助人们理解战争这个宏大的主题，表达出&ldquo;我们反对战争，但又必须了解战争，以免受人宰割&rdquo;这一核心观点。</p>', 0, 1, '2020-04-04 22:06:56');
INSERT INTO `books` VALUES (22, '撒哈拉的故事', '三毛', '皇冠出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009342551.jpg', 8, '生活', 1, '三毛作品中最膾炙人口的《撒哈拉的故事》﹐', '<p>三毛作品中最膾炙人口的《撒哈拉的故事》﹐</p>\r\n\r\n<p>由１２篇精采動人的散文結合而成﹐</p>\r\n\r\n<p>其中＜沙漠中的飯店＞﹐</p>\r\n\r\n<p>是三毛適應荒涼單調的沙漠生活後﹐</p>\r\n\r\n<p>重新拾筆的第一篇文字﹐</p>\r\n\r\n<p>自此之後﹐三毛便寫出一系列以沙漠為背景的故事﹐</p>\r\n\r\n<p>風靡了全世界的中文讀者。</p>', 0, 0, '2020-04-04 22:09:03');
INSERT INTO `books` VALUES (23, '我们仨', '杨绛', '生活·读书·新知三联书店', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009409561.jpg', 8, '生活', 2, '《我们仨》是钱钟书夫人杨绛撰写的家庭生活回忆录。1998年，钱钟书逝世，而他和杨绛唯一的女儿钱瑗已于此前（1997年）先他们而去。', '<p>《我们仨》是钱钟书夫人杨绛撰写的家庭生活回忆录。1998年，钱钟书逝世，而他和杨绛唯一的女儿钱瑗已于此前（1997年）先他们而去。在人生的伴侣离去四年后，杨绛在92岁高龄的时候用心记述了他们这个特殊家庭63年的风风雨雨、点点滴滴，结成回忆录《我们仨》。</p>\r\n\r\n<p>这本书分为两部分。第一部分中，作者以其一贯的慧心、独特的笔法，用梦境的形式讲述了最后几年中一家三口相依为命的情感体验。第二部分，以平实感人的文字记录了自1935年伉俪二人赴英国留学并在牛津喜得爱女，直至1998年丈夫逝世，63年间这个家庭鲜为人知的坎坷历程。</p>', 1, 2, '2020-04-04 22:10:06');
INSERT INTO `books` VALUES (24, '云边有个小卖部', '张嘉佳', '湖南文艺出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009499463.jpg', 8, '生活', 1, '云边镇少年刘十三的成长故事。  刘十三自幼与开小卖部的外婆相依为命，努力读书为了离开小镇，追寻远方与梦想。在城市里碰壁受挫的刘十三回到了小镇，与少时玩伴程霜重逢。小镇生活平静却暗潮汹涌，一个孤儿，一场婚礼，一场意外，几乎打破了所有人的生活。', '<p>云边镇少年刘十三的成长故事。</p>\r\n\r\n<p>刘十三自幼与开小卖部的外婆相依为命，努力读书为了离开小镇，追寻远方与梦想。在城市里碰壁受挫的刘十三回到了小镇，与少时玩伴程霜重逢。小镇生活平静却暗潮汹涌，一个孤儿，一场婚礼，一场意外，几乎打破了所有人的生活。</p>\r\n\r\n<p>为了完成一个几乎不可能完成的任 务，刘十三拼尽全力，却不知道，生命中更重要的正在离自己而去。</p>\r\n\r\n<p>&mdash;&mdash;&mdash;&mdash;&mdash;&mdash;&mdash;</p>\r\n\r\n<p>【名家评论】</p>\r\n\r\n<p>苏童：南方小城镇的少年时代是我曾经熟悉却已远离的过往，嘉佳用极具时代感的语言和生动的画面感，书写了一个充满江南味道的成长故事。离现实很远，离往事很近。作家总会从自己的经验和记忆出发来构建大厦，也是基于此，我愿意相信这个故事的真诚与坦率，我也相信虚构背后的真实，温柔与善良的底色。 故事里的外婆是让我印象最为深刻的人物，相较于爱情，亲情总是容易被忽略却更震撼人心的部分。一些孤独的人拼凑起暂时的圆满，转瞬之间，永远的离别已经到来。无常与幻灭是写作者最钟爱的主题。在一个轻描淡写的时代里，嘉佳的轻，状如云图，嘉佳的淡，有阳光的色泽与气味。</p>', 0, 0, '2020-04-04 22:11:36');
INSERT INTO `books` VALUES (25, '许三观卖血记', '余华', '南海出版公司', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009615990.jpg', 8, '生活', 2, '《许三观卖血记》是余华1995年创作的一部长篇小说，它以博大的温情描绘了磨难中的人生，以激烈的故事形式表达了人在面对厄运时求生的欲望。', '<p>《许三观卖血记》是余华1995年创作的一部长篇小说，它以博大的温情描绘了磨难中的人生，以激烈的故事形式表达了人在面对厄运时求生的欲望。小说讲述了许三观靠着卖血渡过了人生的一个个难关，战胜了命运强加给他的惊涛骇浪，而当他老了，知道自己的血再也没有人要时，精神却崩溃了。</p>', 0, 0, '2020-04-04 22:13:33');
INSERT INTO `books` VALUES (26, '邓小平时代', '[美] 傅高义', '生活·读书·新知三联书店', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009724222.jpg', 1, '传记', 1, '邓小平深刻影响了中国历史和世界历史的走向，也改变了每一当代中国人的命运。解读邓小平的政治生涯及其行为逻辑，就是解读当代中国，解读个人命运背后的历史变局。', '<p>邓小平深刻影响了中国历史和世界历史的走向，也改变了每一当代中国人的命运。解读邓小平的政治生涯及其行为逻辑，就是解读当代中国，解读个人命运背后的历史变局。</p>\r\n\r\n<p>哈佛大学傅高义教授倾十年心力完成的权威巨著《邓小平时代》，是对邓小平跌宕起伏的一生以及中国惊险崎岖的改革开放之路的全景式描述。作者对邓小平个人性格及执政风格进行了深层分析，并对中国改革开放史进行了完整而独到的阐释。书中涵盖丰富的中外档案资料和研究成果，以及为数众多的作者独家访谈。对中美建交、华国锋历史评估、改革开放的幕后曲折、邓小平和诸多当时关键人物之关系，香港问题，邓小平南巡等重大议题均有详述及剖析。本书既具学院研究的严谨专精，又对中国现实政治与事理人情有透彻把握，被誉为邓小平研究纪念碑式的著作。</p>', 1, 2, '2020-04-04 22:15:23');
INSERT INTO `books` VALUES (27, '史蒂夫·乔布斯传', '[美] 沃尔特·艾萨克森', '中信出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009897676.jpg', 1, '传记', 2, '这本乔布斯唯一授权的官方传记，在2011年上半年由美国出版商西蒙舒斯特对外发布出版消息以来，备受全球媒体和业界瞩目，这本书的全球出版日期最终确定为2011年11月21日，简体中文版也将同步上市。', '<p>两年多的时间，与乔布斯40多次的面对面倾谈，以及与乔布斯一百多个家庭成员， 朋友，竞争对手，同事的不受限的采访，造就了这本独家传记。尽管乔布斯给予本书的采访和创作全面的配合，但他对内容从不干涉，也不要求出版前阅读全文的权利。对于任何资源和关联的人，他都不设限，甚至鼓励他所熟知的人袒露出自己的心声。</p>\r\n\r\n<p>我已经做了很多并不值得自豪的事情，比如23岁时就让我的女友怀了孕，以及我对这件事的处理方式，他说，对我而言，没有什么不可以对外袒露的。谈及和他共过事的人以及竞争对手，他直言不讳，甚至尖酸刻薄。他的激情，精力，欲望，完美主义，艺术修养，残暴还有对掌控权的迷恋塑造出的商业哲学一览无余。</p>\r\n\r\n<p>同样，他的朋友，敌人，还有同事得以为我们提供了一个前所未有的毫无掩饰的视角。</p>\r\n\r\n<p>乔布斯的个性经常让周围的人愤怒和绝望，但其所创造出的产品也与这种个性息息相关，全然不可分割的，正如苹果的硬件和软件一样。</p>\r\n\r\n<p>他的故事既具有启发意义，又有警示意义，充满了关于创新、个性、领导力以及价值观的教益。</p>', 0, 0, '2020-04-04 22:17:03');
INSERT INTO `books` VALUES (28, '成为', '[美] 米歇尔·奥巴马', '天地出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009947872.jpg', 1, '传记', 2, '当米歇尔·罗宾逊还是个小女孩的时候，她的世界还只限于芝加哥南城。那时，他们一家租住在位于二楼的小公寓里，米歇尔和哥哥克雷格共用一间卧室，他们还常常去公园里玩传球游戏。', '<p>当米歇尔罗宾逊还是个小女孩的时候，她的世界还只限于芝加哥南城。那时，他们一家租住在位于二楼的小公寓里，米歇尔和哥哥克雷格共用一间卧室，他们还常常去公园里玩传球游戏。在父亲弗雷泽罗宾逊，母亲玛丽安罗宾逊的教导下，米歇尔养成了直率敢言，无所畏惧的性格。然而，生活很快就 将她带向更远的地方：在普林斯顿大学，她第一次体会到作为班里唯一的黑人女生是怎样的感觉；在全玻璃幕墙的办公大厦，她成为一名杰出的公司法律师，也是在那里，一个夏日的早晨，一位名叫贝拉克&middot;奥巴马的法学院学生出现在她的办公室，打破了她人生的所有精心规划。</p>', 1, 2, '2020-04-04 22:19:12');
INSERT INTO `books` VALUES (29, '百年孤独', '[哥伦比亚] 加西亚·马尔克斯', '南海出版公司', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586010090912.jpg', 6, '文学', 1, '《百年孤独》是魔幻现实主义文学的代表作，描写了布恩迪亚家族七代人的传奇故事，以及加勒比海沿岸小镇马孔多的百年兴衰，反映了拉丁美洲一个世纪以来风云变幻的历史。', '<p>《百年孤独》是魔幻现实主义文学的代表作，描写了布恩迪亚家族七代人的传奇故事，以及加勒比海沿岸小镇马孔多的百年兴衰，反映了拉丁美洲一个世纪以来风云变幻的历史。作品融入神话传说、民间故事、宗教典故等神秘因素，巧妙地糅合了现实与虚幻，展现出一个瑰丽的想象世界，成为20世纪最重要的经典文学巨著之一。1982年加西亚&bull;马尔克斯获得诺贝尔文学奖，奠定世界级文学大师的地位，很大程度上乃是凭借《百年孤独》的巨大影响。</p>', 0, 2, '2020-04-04 22:21:38');
INSERT INTO `books` VALUES (30, '小王子', '[法] 安东尼·德·圣-埃克苏佩里', '人民文学出版社', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586010167625.jpg', 6, '文学', 3, '小王子是一个超凡脱俗的仙童，他住在一颗只比他大一丁点儿的小行星上。陪伴他的是一朵他非常喜爱的小玫瑰花。但玫瑰花的虚荣心伤害了小王子对她的感情。', '<p>小王子是一个超凡脱俗的仙童，他住在一颗只比他大一丁点儿的小行星上。陪伴他的是一朵他非常喜爱的小玫瑰花。但玫瑰花的虚荣心伤害了小王子对她的感情。小王子告别小行星，开始了遨游太空的旅行。他先后访问了六个行星，各种见闻使他陷入忧伤，他感到大人们荒唐可笑，太不正常。只有在其中一个点灯人的星球上，小王子才找到一个可以作为朋友的人。但点灯人的天地又十分狭小，除了点灯人他自己，不能容下第二个人。在地理学家的指点下，孤单的小王子来到人类居住的地球。</p>\r\n\r\n<p>小王子发现人类缺乏想象力，只知像鹦鹉那样重复别人讲过的话。小王子这时越来越思念自己星球上的那枝小玫瑰。后来，小王子遇到一只小狐狸，小王子用耐心征服了小狐狸，与它结成了亲密的朋友。小狐狸把自己心中的秘密肉眼看不见事务的本质，只有用心灵才能洞察一切作为礼物，送给小王子。用这个秘密，小王子在撒哈拉大沙漠与遇险的飞行员一起找到了生命的泉水。最后，小王子在蛇的帮助下离开地球，重新回到他的B612号小行星上。</p>\r\n\r\n<p>童话描写小王子没有被成人那骗人的世界所征服，而最终找到自己的理想。这理想就是连结宇宙万物的爱，而这种爱又是世间所缺少的。因此，小王子常常流露出一种伤感的情绪。作者圣埃克絮佩里在献辞中说：这本书是献给长成了大人的从前那个孩子。</p>', 3, 2, '2020-04-04 22:22:46');
INSERT INTO `books` VALUES (31, '时尚', '时尚', '时尚', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1591411059479.jpg', 7, '时尚娱乐', 4, '这本乔布斯唯一授权的官方传记，在2011年上半年由美国出版商西蒙舒斯特对外发布出版消息以来，备受全球媒体和业界瞩目，这本书的全球出版日期最终确定为2011年11月21日，简体中文版也将同步上市。', '<p>这本乔布斯唯一授权的官方传记，</p>', 0, 0, '2020-06-06 10:37:52');

-- ----------------------------
-- Table structure for borrow
-- ----------------------------
DROP TABLE IF EXISTS `borrow`;
CREATE TABLE `borrow`  (
  `borrow_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NULL DEFAULT NULL,
  `u_no` int(11) NULL DEFAULT NULL,
  `u_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_id` int(11) NULL DEFAULT NULL,
  `book_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `add_time` datetime NULL DEFAULT NULL,
  `stop_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`borrow_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 62 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of borrow
-- ----------------------------
INSERT INTO `borrow` VALUES (5, 6, 1117, '张明', 7, '薛兆丰经济学讲义', 'chengdu.myqcloud.com/1585641299994.jpg', '2020-04-04 00:02:19', '2020-05-04 00:02:19');
INSERT INTO `borrow` VALUES (27, 26, 1110, '撒撒', 23, '我们仨', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009409561.jpg', '2020-04-10 15:20:59', '2020-05-10 15:20:59');
INSERT INTO `borrow` VALUES (28, 26, 1110, '撒撒', 2, '活着', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641120773.jpg', '2020-04-10 15:51:56', '2020-05-10 15:51:56');
INSERT INTO `borrow` VALUES (29, 26, 1110, '撒撒', 14, '硅谷钢铁侠', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585987055979.jpg', '2020-04-10 15:59:58', '2020-05-10 15:59:58');
INSERT INTO `borrow` VALUES (30, 26, 1110, '撒撒', 7, '薛兆丰经济学讲义', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641299994.jpg', '2020-04-10 16:23:17', '2020-05-10 16:23:17');
INSERT INTO `borrow` VALUES (31, 26, 1110, '撒撒', 17, '社会心理学', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585987347216.jpg', '2020-04-10 17:17:27', '2020-05-10 17:17:27');
INSERT INTO `borrow` VALUES (32, 26, 1110, '撒撒', 12, '看见', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585986880520.jpg', '2020-04-11 14:33:50', '2020-05-11 14:33:50');
INSERT INTO `borrow` VALUES (33, 26, 1110, '撒撒', 19, '亮剑', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009064288.jpg', '2020-04-11 14:39:17', '2020-05-11 14:39:17');
INSERT INTO `borrow` VALUES (34, 26, 1110, '撒撒', 18, '亲密关系', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585987401350.jpg', '2020-04-11 14:42:39', '2020-05-11 14:42:39');
INSERT INTO `borrow` VALUES (35, 26, 1110, '撒撒', 13, '浪潮之巅', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585986987573.jpg', '2020-04-11 14:46:47', '2020-05-11 14:46:47');
INSERT INTO `borrow` VALUES (36, 26, 1110, '撒撒', 7, '薛兆丰经济学讲义', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641299994.jpg', '2020-04-11 14:54:39', '2020-05-11 14:54:39');
INSERT INTO `borrow` VALUES (37, 26, 1110, '撒撒', 15, '被讨厌的勇气', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585987219924.jpg', '2020-04-11 14:55:13', '2020-05-11 14:55:13');
INSERT INTO `borrow` VALUES (38, 26, 1110, '撒撒', 5, '非暴力沟通', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641278605.jpg', '2020-03-13 14:55:17', '2020-04-13 14:55:17');
INSERT INTO `borrow` VALUES (47, 23, 1145, '小店', 30, '小王子', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586010167625.jpg', '2020-04-11 17:33:15', '2020-05-11 17:33:15');
INSERT INTO `borrow` VALUES (49, 23, 1145, '小店', 10, '时间的秩序', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641446082.jpg', '2020-04-11 17:33:42', '2020-05-11 17:33:42');
INSERT INTO `borrow` VALUES (50, 23, 1145, '小店', 13, '浪潮之巅', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585986987573.jpg', '2020-04-11 17:33:46', '2020-05-11 17:33:46');
INSERT INTO `borrow` VALUES (51, 26, 1110, '撒撒', 21, '中央帝国的军事密码', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009222953.jpg', '2020-04-12 14:48:45', '2020-05-12 14:48:45');
INSERT INTO `borrow` VALUES (52, 25, 1456, '白白', 1, '沉默的巡游', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585561813958.jpg', '2020-04-13 15:55:48', '2020-05-13 15:55:48');
INSERT INTO `borrow` VALUES (53, 25, 1456, '白白', 11, '你当像鸟飞往你的山', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585986743398.jpg', '2020-04-13 15:56:02', '2020-05-13 15:56:02');
INSERT INTO `borrow` VALUES (55, 27, 2222, '小强', 11, '你当像鸟飞往你的山', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585986743398.jpg', '2020-06-03 21:21:42', '2020-07-03 21:21:42');
INSERT INTO `borrow` VALUES (56, 27, 2222, '小强', 1, '沉默的巡游', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585561813958.jpg', '2020-06-03 21:27:56', '2020-07-03 21:27:56');
INSERT INTO `borrow` VALUES (57, 27, 2222, '小强', 26, '邓小平时代', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009724222.jpg', '2020-06-03 21:28:30', '2020-07-03 21:28:30');
INSERT INTO `borrow` VALUES (61, 27, 2222, '小强', 3, '人类简史', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641236384.jpg', '2020-06-06 04:03:08', '2020-07-06 04:03:08');

-- ----------------------------
-- Table structure for borrowrecord
-- ----------------------------
DROP TABLE IF EXISTS `borrowrecord`;
CREATE TABLE `borrowrecord`  (
  `bohuai_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NULL DEFAULT NULL,
  `u_no` int(11) NULL DEFAULT NULL,
  `u_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `borrow_time` datetime NULL DEFAULT NULL,
  `back_time` datetime NULL DEFAULT NULL,
  `state` int(255) NULL DEFAULT 0,
  PRIMARY KEY (`bohuai_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of borrowrecord
-- ----------------------------
INSERT INTO `borrowrecord` VALUES (1, 23, 1145, '小店', '百年孤独', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586010090912.jpg', '2020-04-11 16:31:26', NULL, 0);
INSERT INTO `borrowrecord` VALUES (5, 23, 1145, '小店', '人类简史', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641236384.jpg', '2020-04-11 16:46:48', '2020-04-11 18:13:50', 1);
INSERT INTO `borrowrecord` VALUES (6, 23, 1145, '小店', '人类简史', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641236384.jpg', '2020-04-11 17:33:00', '2020-04-11 18:13:50', 1);
INSERT INTO `borrowrecord` VALUES (7, 23, 1145, '小店', '我们仨', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009409561.jpg', '2020-04-11 17:33:08', '2020-04-11 18:33:54', 1);
INSERT INTO `borrowrecord` VALUES (8, 23, 1145, '小店', '小王子', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586010167625.jpg', '2020-04-11 17:33:15', NULL, 0);
INSERT INTO `borrowrecord` VALUES (9, 23, 1145, '小店', '硅谷钢铁侠', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585987055979.jpg', '2020-04-11 17:33:37', '2020-04-11 18:14:15', 1);
INSERT INTO `borrowrecord` VALUES (11, 23, 1145, '小店', '浪潮之巅', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585986987573.jpg', '2020-04-11 17:33:46', NULL, 0);
INSERT INTO `borrowrecord` VALUES (12, 26, 1110, '撒撒', '中央帝国的军事密码', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009222953.jpg', '2020-04-12 14:48:45', NULL, 0);
INSERT INTO `borrowrecord` VALUES (13, 25, 1456, '白白', '沉默的巡游', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585561813958.jpg', '2020-04-13 15:55:48', NULL, 0);
INSERT INTO `borrowrecord` VALUES (14, 25, 1456, '白白', '你当像鸟飞往你的山', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585986743398.jpg', '2020-04-13 15:56:02', NULL, 0);
INSERT INTO `borrowrecord` VALUES (15, 27, 2222, '小强', '被讨厌的勇气', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585987219924.jpg', '2020-06-03 20:20:21', '2020-06-03 21:38:01', 1);
INSERT INTO `borrowrecord` VALUES (16, 27, 2222, '小强', '你当像鸟飞往你的山', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585986743398.jpg', '2020-06-03 21:21:42', NULL, 0);
INSERT INTO `borrowrecord` VALUES (17, 27, 2222, '小强', '沉默的巡游', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585561813958.jpg', '2020-06-03 21:27:56', NULL, 0);
INSERT INTO `borrowrecord` VALUES (18, 27, 2222, '小强', '邓小平时代', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009724222.jpg', '2020-06-03 21:28:30', NULL, 0);
INSERT INTO `borrowrecord` VALUES (19, 27, 2222, '小强', '社会心理学', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585987347216.jpg', '2020-06-03 21:35:01', '2020-06-03 21:38:28', 1);
INSERT INTO `borrowrecord` VALUES (20, 27, 2222, '小强', '社会心理学', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585987347216.jpg', '2020-06-04 01:42:09', '2020-06-06 03:55:46', 1);
INSERT INTO `borrowrecord` VALUES (21, 27, 2222, '小强', '成为', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009947872.jpg', '2020-06-06 02:55:27', '2020-06-06 02:56:57', 1);
INSERT INTO `borrowrecord` VALUES (22, 27, 2222, '小强', '人类简史', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641236384.jpg', '2020-06-06 04:03:08', NULL, 0);
INSERT INTO `borrowrecord` VALUES (23, 27, 2222, '小强', '看见', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585986880520.jpg', '2020-06-06 11:38:22', '2020-06-06 11:39:35', 1);

-- ----------------------------
-- Table structure for categoryindex
-- ----------------------------
DROP TABLE IF EXISTS `categoryindex`;
CREATE TABLE `categoryindex`  (
  `ca_id` int(11) NOT NULL AUTO_INCREMENT,
  `ca_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `isActive` tinyint(1) NULL DEFAULT NULL,
  PRIMARY KEY (`ca_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of categoryindex
-- ----------------------------
INSERT INTO `categoryindex` VALUES (1, '传记', 1);
INSERT INTO `categoryindex` VALUES (2, '军事', 0);
INSERT INTO `categoryindex` VALUES (3, '历史', 0);
INSERT INTO `categoryindex` VALUES (4, '小说', 0);
INSERT INTO `categoryindex` VALUES (5, '心理', 0);
INSERT INTO `categoryindex` VALUES (6, '文学', 0);
INSERT INTO `categoryindex` VALUES (7, '时尚娱乐', 0);
INSERT INTO `categoryindex` VALUES (8, '生活', 0);
INSERT INTO `categoryindex` VALUES (9, '科技', 0);
INSERT INTO `categoryindex` VALUES (10, '经管职场', 0);

-- ----------------------------
-- Table structure for clientuser
-- ----------------------------
DROP TABLE IF EXISTS `clientuser`;
CREATE TABLE `clientuser`  (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_no` int(11) NOT NULL,
  `u_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '123456',
  `u_qq` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_borrow` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of clientuser
-- ----------------------------
INSERT INTO `clientuser` VALUES (2, 1111, '晓红', '12345', '1123561684@qq.com', 9);
INSERT INTO `clientuser` VALUES (3, 1112, '明明', '12345', '253456778@qq.com', 4);
INSERT INTO `clientuser` VALUES (5, 1116, '王东', '123456', '3321561684@qq.com', 7);
INSERT INTO `clientuser` VALUES (6, 1117, '张明', '123456', '2628561684@qq.com', 9);
INSERT INTO `clientuser` VALUES (15, 1128, '王强', '123456', '2628562345@qq.com', 12);
INSERT INTO `clientuser` VALUES (23, 1145, '小店', '123456', '2628561684@qq.com', 7);
INSERT INTO `clientuser` VALUES (24, 1324, '西西', '123456', '2628561684@qq.com', 4);
INSERT INTO `clientuser` VALUES (25, 1456, '白白', '123456', '2628561684@qq.com', 9);
INSERT INTO `clientuser` VALUES (26, 1110, '撒撒', '123456', '2628561684@qq.com', 29);
INSERT INTO `clientuser` VALUES (27, 2222, '小强', '123456', '2628561684@qq.com', 9);

-- ----------------------------
-- Table structure for collect
-- ----------------------------
DROP TABLE IF EXISTS `collect`;
CREATE TABLE `collect`  (
  `collect_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NULL DEFAULT NULL,
  `book_id` int(11) NULL DEFAULT NULL,
  `book_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`collect_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 35 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of collect
-- ----------------------------
INSERT INTO `collect` VALUES (3, 2, 1, '沉默的巡游', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585561813958.jpg');
INSERT INTO `collect` VALUES (6, 26, 4, '天才在左 疯子在右', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641259647.jpg');
INSERT INTO `collect` VALUES (16, 26, 17, '社会心理学', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585987347216.jpg');
INSERT INTO `collect` VALUES (17, 23, 30, '小王子', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586010167625.jpg');
INSERT INTO `collect` VALUES (19, 25, 4, '天才在左 疯子在右', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641259647.jpg');
INSERT INTO `collect` VALUES (20, 25, 10, '时间的秩序', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585641446082.jpg');
INSERT INTO `collect` VALUES (21, 25, 30, '小王子', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586010167625.jpg');
INSERT INTO `collect` VALUES (24, 27, 26, '邓小平时代', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009724222.jpg');
INSERT INTO `collect` VALUES (30, 27, 20, '孙子兵法', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1586009143768.jpg');
INSERT INTO `collect` VALUES (34, 27, 11, '你当像鸟飞往你的山', 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585986743398.jpg');

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments`  (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_no` int(11) NULL DEFAULT NULL,
  `u_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_id` int(11) NULL DEFAULT NULL,
  `c_concent` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `c_time` datetime NULL DEFAULT NULL,
  `c_state` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0',
  PRIMARY KEY (`comment_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of comments
-- ----------------------------
INSERT INTO `comments` VALUES (1, 1111, '晓红', 3, '太好了', '2020-03-03 21:32:23', '0');
INSERT INTO `comments` VALUES (2, 1112, '小明', 3, '很不错', '2020-03-05 21:38:42', '1');
INSERT INTO `comments` VALUES (3, 1112, '小明', 4, '太好了', '2020-04-02 21:39:30', '1');
INSERT INTO `comments` VALUES (4, 1145, '小店', 6, '挺不错的', '2020-04-10 21:40:18', '1');
INSERT INTO `comments` VALUES (5, 1111, '晓红', 4, '写得很生动', '2020-06-02 01:35:18', '0');
INSERT INTO `comments` VALUES (6, 1110, '撒撒', 3, 'good', '2020-06-02 02:47:29', '0');
INSERT INTO `comments` VALUES (7, 1110, '撒撒', 3, 'goodd', '2020-06-02 02:50:15', '0');
INSERT INTO `comments` VALUES (8, 1110, '撒撒', 3, 'very', '2020-06-02 02:54:26', '0');
INSERT INTO `comments` VALUES (9, 1110, '撒撒', 3, 'en', '2020-06-02 02:56:12', '0');
INSERT INTO `comments` VALUES (10, 2222, '小强', 17, '挺好的', '2020-06-06 03:54:54', '0');
INSERT INTO `comments` VALUES (11, 2222, '小强', 1, '很不错', '2020-06-06 09:25:55', '0');
INSERT INTO `comments` VALUES (12, 2222, '小强', 30, '挺好的额', '2020-06-06 09:31:08', '0');
INSERT INTO `comments` VALUES (13, 2222, '小强', 11, '好的', '2020-06-06 11:38:09', '0');

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager`  (
  `m_id` int(11) NOT NULL AUTO_INCREMENT,
  `m_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`m_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES (1, 'admin', '1234');
INSERT INTO `manager` VALUES (2, 'mim', '1111');
INSERT INTO `manager` VALUES (3, 'admin2', '2222');
INSERT INTO `manager` VALUES (5, 'liu', '123111');
INSERT INTO `manager` VALUES (7, 'wang', '1234567');

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menuName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `menuPid` int(11) NULL DEFAULT NULL,
  `menuUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `menuIcon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sort` int(255) NULL DEFAULT NULL,
  `visible` int(255) NULL DEFAULT NULL,
  `level` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES (1, '用户管理', 0, '/user/client', NULL, 1, 1, 0);
INSERT INTO `menu` VALUES (2, '管理员信息', 1, '/manager/toAll', NULL, 2, 1, 1);
INSERT INTO `menu` VALUES (3, '用户信息', 1, '/user/client', NULL, 3, 1, 1);
INSERT INTO `menu` VALUES (4, '书籍管理', 0, '/books/index', NULL, 4, 1, 0);
INSERT INTO `menu` VALUES (5, '查看书籍', 4, '/books/index', NULL, 5, 1, 1);
INSERT INTO `menu` VALUES (6, '书籍分类', 4, '/category/index', NULL, 6, 1, 1);
INSERT INTO `menu` VALUES (7, '轮播图管理', 0, '/swiperdata/index', NULL, 7, 1, 0);
INSERT INTO `menu` VALUES (8, '查看轮播图', 7, '/swiperdata/index', NULL, 8, 1, 1);
INSERT INTO `menu` VALUES (9, '借阅管理', 0, '/borrow/index', NULL, 9, 1, 0);
INSERT INTO `menu` VALUES (10, '借阅信息', 9, '/borrow/index', NULL, 10, 1, 1);
INSERT INTO `menu` VALUES (11, '借阅历史记录', 9, '/borrowrecord/index', NULL, 11, 1, 1);
INSERT INTO `menu` VALUES (12, '视频管理', 0, '/videos/toAll', NULL, 12, 1, 0);
INSERT INTO `menu` VALUES (13, '查看视频', 12, '/videos/toAll', NULL, 13, 1, 1);
INSERT INTO `menu` VALUES (14, '评论管理', 0, '/comment/index', NULL, 14, 1, 0);
INSERT INTO `menu` VALUES (15, '查看评论', 14, '/comment/index', NULL, 15, 1, 1);

-- ----------------------------
-- Table structure for swiperdatas
-- ----------------------------
DROP TABLE IF EXISTS `swiperdatas`;
CREATE TABLE `swiperdatas`  (
  `sw_id` int(11) NOT NULL AUTO_INCREMENT,
  `sw_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `open_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_id` int(11) NULL DEFAULT NULL,
  `navigato_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sw_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of swiperdatas
-- ----------------------------
INSERT INTO `swiperdatas` VALUES (1, 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585718348072.jpg', 'navigate', 3, '/pages/book_detail/index?bookId=3');
INSERT INTO `swiperdatas` VALUES (2, 'https://wyl-1300435080.cos.ap-chengdu.myqcloud.com/1585718513647.jpg', 'navigate', 4, '/pages/book_detail/index?bookId=4');

-- ----------------------------
-- Table structure for videos
-- ----------------------------
DROP TABLE IF EXISTS `videos`;
CREATE TABLE `videos`  (
  `v_id` int(11) NOT NULL AUTO_INCREMENT,
  `v_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `v_url` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `v_img` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `v_concent` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`v_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of videos
-- ----------------------------
INSERT INTO `videos` VALUES (1, '钟南山', 'https://vdept.bdstatic.com/653743744c696934703367554774426c/34565442544c4834/b92b4b270dedd0a2a00e18ea2808df3734515f2a14537f8a79ccf3457c90d297e145e3c521177da694eb4c7548d72cc112146aa474fb8554188f0e8c7c02c70f.mp4?auth_key=1591415582-0-0-29ec1cadaec0a2ce684a07c14d570cc9', 'http://i1.hdslb.com/bfs/archive/f413f414d4f388c4e4e1f4af711a3f830b035e61.png@320w_200h.webp', '从新冠疫情线索切入。讲述钟南山在2020新冠疫情和2003年非典疫情当中奋斗在抗疫-线的故事，回顾钟南山八十多年来人生的奋斗历程\r\n一“理解南山, 感悟南山”');
INSERT INTO `videos` VALUES (2, '“我叫志愿者！”', 'https://cn-hbsjz2-cmcc-bcache-03.bilivideo.com/upgcxcode/20/00/175890020/175890020-1-16.mp4?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfq9rVEuxTEnE8L5F6VnEsSTx0vkX8fqJeYTj_lta53NCM=&uipk=5&nbs=1&deadline=1586768415&gen=playurl&os=bcache&oi=3084081711&trid=ff23095f222a4f79999d9075b074ab0dh&platform=html5&upsig=86c4d0ecd422330520771d7b1ea79c58&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=0&logo=80000000', '//i1.hdslb.com/bfs/archive/cba4ea3a10c7786ae4565fa9aa4a8a94d5579627.jpg@320w_200h.webp', '“我叫志愿者！”“我叫志愿者！”“我叫志愿者！”“我叫志愿者！”“我叫志愿者！”“我叫志愿者！”“我叫志愿者！”');
INSERT INTO `videos` VALUES (3, '《Undercover billionaire》', 'https://cn-zjwz-cmcc-v-05.bilivideo.com/upgcxcode/22/63/147556322/147556322-1-16.mp4?expires=1586662800&platform=html5&ssig=-YpU_REogfzFx6k3jXYr4Q&oi=3745522421&trid=48c30838b5524939b3d7438c78425a09h&nfc=1&nfb=maPYqpoel5MI3qOUX6YpRA==&mid=0&logo=80000000', '//i0.hdslb.com/bfs/archive/6527dcd08009a44f3b68e5bf6ff9111bfdc68701.jpg@320w_200h.webp', '\r\n在一个陌生的城市，100美元、一辆破皮卡、零人脉，如何创立一家百万估值的企业？');
INSERT INTO `videos` VALUES (4, '【CCTV纪录片】世界历史', 'https://cn-hncs2-cmcc-v-06.bilivideo.com/upgcxcode/31/15/21981531/21981531-1-16.mp4?expires=1586664900&platform=html5&ssig=aZOcUh3FefJUFJmJ40d6cg&oi=3745522421&trid=3fab15a5b1984a4eb8ed55ffe0bf79e9h&nfc=1&nfb=maPYqpoel5MI3qOUX6YpRA==&mid=0&logo=80000000', '//i0.hdslb.com/bfs/archive/d3ebb1d47e6c5949f7952bd80da5419074b1b999.png@200w_125h.webp', '这是一部以人类社会发展史为题材的大型纪录片，它再现了自远古人类起源到万隆会议的历史图景，比较全面地讲述了人类社会发展过程、揭示了人类历史发展趋势及规律。');

SET FOREIGN_KEY_CHECKS = 1;
