package com.p1.dao;
import com.p1.entity.UserInfo;
public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
}