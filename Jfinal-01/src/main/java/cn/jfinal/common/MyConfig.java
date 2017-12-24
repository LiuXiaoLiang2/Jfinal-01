package cn.jfinal.common;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.template.Engine;

import cn.jfinal.controller.BlogController;
import cn.jfinal.controller.MyController;
import cn.jfinal.controller.UserController;
import cn.jfinal.route.AdminRoute;
import cn.jfinal.route.FrontRoute;

/**
 * 自定义JfinalConfig
 * @author Administrator
 *
 */
public class MyConfig extends JFinalConfig{

	/**
	 * 配置Jfinal开发模式,可以看到很多调试信息
	 * 这个方法主要是设置Jfinal的常量
	 */
	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
	}

	/**
	 * 用于模版引擎配置
	 */
	@Override
	public void configEngine(Engine me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 配置全局拦截器
	 */
	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 配置插件：比如数据库连接池等等
	 */
	@Override
	public void configPlugin(Plugins me) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 配置controller入口
	 */
	@Override
	/*public void configRoute(Routes me) {
		me.add("/", MyController.class);
		
		 *第一个参数 ：用于匹配URL访问路径的
		 *第二个参数： 用于匹配对应的是哪个Controller
		 *第三个参数：  用于匹配视图的,和controller中的 renderTemplate("index.html"); 配套使用
		 *访问的页面就是 /user/index.html，或者是 /blog/index.html
		 
		
		//适用于不同模块的开发
		
		//访问路径 /user  跳转的页面：/user/index.html
		me.add("/user", UserController.class, "/user");
		me.add("/blog", BlogController.class, "/blog");
	}*/
	
	//路由配置的第二种方法
	public void configRoute(Routes me) {
		me.add("/", MyController.class);
		//添加后端路由
		me.add(new AdminRoute());
		//添加前端路由
		me.add(new FrontRoute());
	}
	

	/**
	 * 使用Jfinal自带的容器jetty启动项目
	 */

	public static void main(String[] args) {
		JFinal.start("src/main/webapp", 80, "/",5);
	}
}
