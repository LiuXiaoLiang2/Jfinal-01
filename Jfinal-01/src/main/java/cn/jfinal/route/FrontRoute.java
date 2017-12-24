package cn.jfinal.route;

import com.jfinal.config.Routes;

import cn.jfinal.controller.OrderController;
import cn.jfinal.controller.UserController;
import cn.jfinal.intercptor.FrontIntercptor;

/**
 * 前端路由配置
 * @author Administrator
 *
 */
public class FrontRoute extends Routes{

	@Override
	public void config() {
		//添加路由拦截器,下面的任何一个controller都会执行这个拦截器
		addInterceptor(new FrontIntercptor());
		add("/user", UserController.class, "user");
		//这里要注意,默认找到的Controller的index方法
		add("/order", OrderController.class, "order");
	}

}
