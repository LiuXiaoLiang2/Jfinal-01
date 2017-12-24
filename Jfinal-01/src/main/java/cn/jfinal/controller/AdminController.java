package cn.jfinal.controller;

import com.jfinal.core.Controller;
/**
 * 自定义的controler（后端模块）
 * @author Administrator
 *
 */
public class AdminController extends Controller{

	public void index(){
		//类似于向域中存储内容111
		setAttr("msg", "hello jfinal 3.0");
		//这里使用的使Jfinal的自带模版
		renderTemplate("index.html");
	}
}
