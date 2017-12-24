package cn.jfinal.controller;

import com.jfinal.core.Controller;

public class OrderController extends Controller{
	
	public void index(){
		setAttr("orderMoney", 1000.00);
		renderTemplate("index.html");
	}

}
