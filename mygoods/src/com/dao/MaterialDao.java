package com.dao;
import java.util.ArrayList;

import com.bean.*;
public interface MaterialDao {
	public ArrayList<MaterialBean> showmaterial();
	public void insertmaterial(MaterialBean mb);
	public MaterialBean querymaterial();
	public MaterialBean querymaterial(MaterialBean mb);
}