package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bean.*;
import com.service.BuysService;
import com.service.GoodsService;
import com.service.MaterialService;
import com.service.impl.BuysServiceImpl;
import com.service.impl.GoodsServiceImpl;
import com.service.impl.MaterialServiceImpl;
@Controller
public class DoController {
	@RequestMapping(value="addgoods.do", produces="text/plain;charset=UTF-8")
	public String addGoods(Model m,@ModelAttribute GoodsBean val){
		GoodsService gs=new GoodsServiceImpl();
		gs.insertgoods(val);	
		return "redirect:showgoods.do";
	}
	@RequestMapping(value="addmaterial.do",produces="text/plain;charset=UTF-8")
	public String addMaterials(Model m,@ModelAttribute MaterialBean val){
		System.out.println(val.getMaterialname());
		MaterialService ms=new MaterialServiceImpl();
		ms.insertmaterial(val);
		return "redirect:showmaterial.do";
	}
	@RequestMapping(value="addbuy.do", produces="text/plain;charset=UTF-8")
	public String addBuys(Model m,@ModelAttribute BuysBean val){
		System.out.println(val.getMaterialname());
		BuysService bs=new BuysServiceImpl();
		bs.insertBuys(val);
		return "redirect:showbuys.do";
	}
	@RequestMapping(value="updatebuy.do", produces="text/plain;charset=UTF-8")
	public String updatebuys(Model m,@ModelAttribute BuysBean val){
		if(val.getZhuangtai().equals("已入库"))
			return "redirect:showbuys.do";
		val.setZhuangtai("已入库");
		BuysService bs=new BuysServiceImpl();
		return "redirect:showbuys.do";
	}	
}
