package cn.jfinal.controller;

import com.jfinal.core.Controller;
/**
 * 自定义的controler
 * @author Administrator
 *
 */
public class MyController extends Controller{

	public void index(){
		//类似于向域中存储内容
		setAttr("msg", "hello jfinal 3.0");
		//这里使用的使Jfinal的自带模版
		renderTemplate("index.html");
	}
}
