package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bean.UserBean;
import com.service.impl.*;
@Controller
public class UserController {
	@RequestMapping("login.do")
	public String sent(Model model,@ModelAttribute UserBean user){
		LoginServiceImpl login=new LoginServiceImpl();
		String result=login.getLoginResult(user);
		if(result.equals("success")){
			return "redirect:home.do";
		}else{
			model.addAttribute("result", result);
			return "redirect:";
		}	
	}
}