package cn.jfinal.route;

import com.jfinal.config.Routes;

import cn.jfinal.controller.BlogController;
import cn.jfinal.intercptor.AdminIntercptor;

/**
 * 后端路由配置
 * @author Administrator
 *
 */
public class AdminRoute extends Routes{

	@Override
	public void config() {
		//添加路由拦截器
		addInterceptor(new AdminIntercptor());
		//添加基础路径,和下面的第三个参数配合使用
		//最终访问的页面是 /WEB-INF/admin目录下
		setBaseViewPath("/WEB-INF");
		add("/admin", BlogController.class, "/admin");
	}

}
