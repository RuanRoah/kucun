package com.controller;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bean.*;
import com.service.*;
import com.service.impl.*;
@SuppressWarnings("unused")
@Controller
public class ShowController {
	@RequestMapping("showgoods.do")
	public String showgoods(Model m){		
		GoodsService gs=new GoodsServiceImpl();
		ArrayList<GoodsBean> gg=new ArrayList<GoodsBean>(); 
		gg=gs.showgoods();
		m.addAttribute("gg",gg);
		
		return "goods";		
	}
	@RequestMapping("showmaterial.do")
	public String showmaterial(Model m){
		MaterialService ms=new MaterialServiceImpl();
		ArrayList<MaterialBean> mb=new ArrayList<MaterialBean>(); 
		mb=ms.showmaterial();
		m.addAttribute("material",mb);
		return "material";		
	}
	@RequestMapping("home.do")
	public String showrole(Model m,HttpSession session){
		if(session==null)
			return "redirect:index";
		LoginService ls=new LoginServiceImpl();
		ArrayList<RoleBean> rb=new ArrayList<RoleBean>(); 
		rb=ls.ShowRole();
		m.addAttribute("role", rb);
		return "home";		
	}
	@RequestMapping("showbuys.do")
	public String showbuys(Model m){		
		BuysService bs=new BuysServiceImpl();
		ArrayList<BuysBean> buys=new ArrayList<BuysBean>(); 
		buys=bs.queryBuys();
		m.addAttribute("buys",buys);
		
		return "buys";		
	}
	@RequestMapping("showplans.do")
	public String showplans(Model m,int id){		
		PlansService ps=new PlansServiceImpl();
		GoodsService gs=new GoodsServiceImpl();
		ArrayList<PlansBean> plansl=new ArrayList<PlansBean>(); 
		plansl=ps.showplans(id);
		m.addAttribute("plans",plansl);
		GoodsBean g=gs.queryGoods(id);
		m.addAttribute("goods",g);
		return "plans";		
	}
	@RequestMapping("none.do")
	public String none(){				
		return "none";		
	}
}