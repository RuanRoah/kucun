package com.service;

import java.util.ArrayList;

import com.bean.RoleBean;
import com.bean.UserBean;

public interface LoginService {
	public String getLoginResult(UserBean user);
	public ArrayList<RoleBean> ShowRole();
}
