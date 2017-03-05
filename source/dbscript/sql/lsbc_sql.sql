-- ----------------------------
-- Table structure for "ls_role"
-- ----------------------------
CREATE TABLE "ls_role" (
"id"  INTEGER NOT NULL,
"role_name"  character varying(20) NOT NULL,
PRIMARY KEY ("id")
);

-- ----------------------------
-- Records of ls_role
-- ----------------------------
INSERT INTO "ls_role" VALUES ('1', '管理员');
INSERT INTO "ls_role" VALUES ('2', '营业员');

-- ----------------------------
-- Table structure for "ls_goods_type"
-- ----------------------------
CREATE TABLE "ls_goods_type" (
"id"  INTEGER NOT NULL,
"goods_type_name"  character varying(20) NOT NULL,
PRIMARY KEY ("id")
);

-- ----------------------------
-- Records of ls_goods_type
-- ----------------------------
INSERT INTO "ls_goods_type" VALUES ('1', '板材');
INSERT INTO "ls_goods_type" VALUES ('2', '五金');
INSERT INTO "ls_goods_type" VALUES ('3', '门');
INSERT INTO "ls_goods_type" VALUES ('4', '地板');
INSERT INTO "ls_goods_type" VALUES ('5', '方条');
INSERT INTO "ls_goods_type" VALUES ('6', '吊顶');

-- ----------------------------
-- Table structure for "ls_order_type"
-- ----------------------------
CREATE TABLE "ls_order_type" (
"id"  INTEGER NOT NULL,
"order_type_name" character varying(20) NOT NULL,
PRIMARY KEY ("id")
);

-- ----------------------------
-- Records of ls_order_type
-- ----------------------------
INSERT INTO "ls_order_type" VALUES ('1', '进货单');
INSERT INTO "ls_order_type" VALUES ('2', '退货单');
INSERT INTO "ls_order_type" VALUES ('3', '销售单');
INSERT INTO "ls_order_type" VALUES ('4', '零售单');

-- ----------------------------
-- Table structure for "ls_pay_type"
-- ----------------------------
CREATE TABLE "ls_pay_type" (
"id"  INTEGER NOT NULL,
"role_name"  character varying(20) NOT NULL,
PRIMARY KEY ("id")
);

-- ----------------------------
-- Records of ls_pay_type
-- ----------------------------
INSERT INTO "ls_pay_type" VALUES ('1', '现金');
INSERT INTO "ls_pay_type" VALUES ('2', '刷卡');
INSERT INTO "ls_pay_type" VALUES ('3', '现金+刷卡');

-- ----------------------------
-- Table structure for "ls_user_info"
-- ----------------------------
CREATE TABLE "ls_user_info" (
"id" serial,
"username"  character varying(30) NOT NULL,
"password"  character varying(30) NOT NULL,
"realname"  character varying(30) NOT NULL,
"phone"  character varying(11) NOT NULL,
"address"  character varying(50) NOT NULL,
"sex"  INTEGER NOT NULL DEFAULT 0,
"role_id"  INTEGER NOT NULL,
PRIMARY KEY ("id")
);

-- ----------------------------
-- Records of ls_user_info
-- ----------------------------
INSERT INTO public.ls_user_info(username,password,realname,phone,address,sex,role_id) VALUES ('zc', '123456', '张成', '15102727731', '湖北省武汉
市', '1', '1');
INSERT INTO public.ls_user_info(username,password,realname,phone,address,sex,role_id) VALUES ('lcf', '123456', '李翠芳', '15102727731', '湖北省武汉
市', '2', '1');

-- ----------------------------
-- Table structure for "ls_goods"
-- ----------------------------
CREATE TABLE ls_goods (
"id" serial,
"goods_name"  character varying(30) NOT NULL,
"in_price"  float default 0.0,
"out_price"  float default 0.0,
"address"  character varying(30),
"factory"  character varying(30),
"number"  Integer default 0,
"unit"  character varying(20),
"goods_type_id"  INTEGER NOT NULL,
"warn_line"  INTEGER  NOT NULL,
PRIMARY KEY ("id")
);

-- ----------------------------
-- Records of ls_goods
-- ----------------------------
insert into public.ls_goods(goods_name,in_price,out_price,address,factory,number,unit,goods_type_id) values('三夹板','0','0','湖北省武汉市','武汉世嘉板材有限公司','0','块','1','10');
insert into public.ls_goods(goods_name,in_price,out_price,address,factory,number,unit,goods_type_id) values('小铝扣','0','0','湖北省武汉市','武汉鑫鑫五金有限公司','0','个','2','10');
-- ----------------------------
-- Table structure for "ls_order"
-- ----------------------------
CREATE TABLE "ls_order" (
"id"  character varying(30) NOT NULL,
"order_date"  date NOT NULL,
"customer"  character varying(30) NOT NULL,
"money"  character varying(30) NOT NULL,
"pay_type"  INTEGER NOT NULL,
"real_money"  float NOT NULL,   
"order_type"  INTEGER NOT NULL,
"user_id"  INTEGER NOT NULL,
PRIMARY KEY ("id")
);

-- ----------------------------
-- Records of ls_order
-- ----------------------------
INSERT INTO "ls_order" VALUES ('XS-2017-02-03-1143258', '2017-02-03', '宏发零售', '10050', 
'1', '10000', '3', '1');

-- ----------------------------
-- Table structure for "ls_order_list"
-- ----------------------------
CREATE TABLE "ls_order_list" (
"id" serial,
"in_order_id"  character varying(30) NOT NULL,
"goods_id"  INTEGER NOT NULL,
"number"  INTEGER NOT NULL,
"price"  float NOT NULL,
"money"  float NOT NULL,
"by_order_id"  character varying(30),
"remark"  character varying(100),
PRIMARY KEY ("id")
);

-- ----------------------------
-- Records of ls_order_list
-- ----------------------------
INSERT INTO public.ls_order_list(in_order_id,goods_id,number,price,money,by_order_id,remark) VALUES ('XS-201702031143-258', '1', '11', '2', '22', '', '暂无');


-- ----------------------------
-- Table structure for "ls_warn_line"
-- ----------------------------
CREATE TABLE "ls_warn_line" (
"id" serial,
"goods_id"  Integer NOT NULL,
"warn_line"  INTEGER NOT NULL DEFAULT 0,
PRIMARY KEY ("id")
);

