package com.service;
import java.util.ArrayList;

import com.bean.*;
public interface MaterialService {
	public ArrayList<MaterialBean> showmaterial();
	public void insertmaterial(MaterialBean gb);
	public MaterialBean querymaterial(MaterialBean gb);
}