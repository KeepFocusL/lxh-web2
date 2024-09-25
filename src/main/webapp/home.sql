-- 创建数据库
create database if not exists `home`;

-- 进入指定数据库
use `home`;

-- 创建用户表
create table if not exists `user`
(
    id       int auto_increment comment '唯一编号',
    name     varchar(20)  null comment '用户名',
    email    varchar(50)  not null comment '邮箱',
    password varchar(255) not null comment '密码',

    constraint user_pk primary key (id)
    ) comment '用户表';

-- 插入基础数据
insert into `user`(name, email, password)
values ('admin', 'admin@example.com', 'password'),
       ('user', 'user@example.com', 'password')
