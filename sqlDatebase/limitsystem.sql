/*
Navicat MySQL Data Transfer

Source Server         : 远程数据库
Source Server Version : 50551
Source Host           : 45.64.75.179:3306
Source Database       : limitsystem

Target Server Type    : MYSQL
Target Server Version : 50551
File Encoding         : 65001

Date: 2016-10-25 18:15:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for module
-- ----------------------------
DROP TABLE IF EXISTS `module`;
CREATE TABLE `module` (
  `moduleId` int(50) NOT NULL AUTO_INCREMENT COMMENT '模块id',
  `moduleName` varchar(20) DEFAULT NULL COMMENT '模块名',
  `moduleLevel` int(10) DEFAULT NULL COMMENT '模块级别',
  `moduleParentId` int(50) DEFAULT NULL COMMENT '父模块ID',
  `moduleurl` varchar(100) DEFAULT NULL COMMENT '模块地址',
  `moduleChildren` varchar(10) DEFAULT NULL COMMENT '是否有子模块',
  `moduleOrder` int(10) DEFAULT NULL COMMENT '模块序号',
  PRIMARY KEY (`moduleId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of module
-- ----------------------------
INSERT INTO `module` VALUES ('1', '出勤管理', null, null, null, '0', null);

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleId` int(50) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `roleName` varchar(20) DEFAULT NULL COMMENT '角色名',
  `roleDepict` varchar(100) DEFAULT NULL COMMENT '角色描述',
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '班长', '班长负责出勤管理的模块业务');
INSERT INTO `role` VALUES ('2', '编辑', '测试编辑');
INSERT INTO `role` VALUES ('5', '', '');

-- ----------------------------
-- Table structure for rolemodule
-- ----------------------------
DROP TABLE IF EXISTS `rolemodule`;
CREATE TABLE `rolemodule` (
  `assId` int(20) NOT NULL AUTO_INCREMENT COMMENT '关联ID',
  `roleId` int(50) DEFAULT NULL COMMENT '角色ID',
  `moduleId` int(50) DEFAULT NULL COMMENT '模块ID',
  PRIMARY KEY (`assId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rolemodule
-- ----------------------------
INSERT INTO `rolemodule` VALUES ('1', '1', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(50) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `userName` varchar(20) DEFAULT NULL COMMENT '用户名',
  `userPwd` varchar(20) DEFAULT NULL COMMENT '用户密码',
  `roleId` int(50) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'qq', 'qq', '1');
INSERT INTO `user` VALUES ('2', 'ss', 'ss', null);
INSERT INTO `user` VALUES ('5', 'hh', 'hh', null);
