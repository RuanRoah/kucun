package com.controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.BuysBean;
import com.bean.GoodsBean;
import com.bean.MaterialBean;
import com.service.*;
import com.service.impl.*;
@Controller
public class QueryController {
	@RequestMapping("querygoods.do")
	public String QueryGoodsInfo(Model m,@ModelAttribute GoodsBean goods,int value){
		MaterialService ms=new MaterialServiceImpl();
	
		
		return null;		
	}
	@RequestMapping("querymaterial.do")
	public String QueryMaterial(Model m,@ModelAttribute GoodsBean goods,int value){
		MaterialService ms=new MaterialServiceImpl();		
		return null;		
	}
	@RequestMapping("querybuys.do")
	public String QueryBuys(Model m,@ModelAttribute BuysBean goods,int value){
		MaterialService ms=new MaterialServiceImpl();
		return null;		
	}
	@RequestMapping("jump.do")
	public String jump(Model m,int val){
		MaterialService gs=new MaterialServiceImpl();
		
		if(val==1){
			ArrayList<MaterialBean> gb=gs.showmaterial();
			m.addAttribute("material", gb);
			return "info/buyinfo";	
		}
		
		if(val==2)
			return "info/materialinfo";
		else
			return null;		
	}
}
