package cn.jfinal.intercptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * 路由级别的拦截器
 * 后端拦截器
 * @author Administrator
 *
 */
public class AdminIntercptor implements Interceptor{

	@Override
	public void intercept(Invocation inv) {
		System.out.println("进入后端拦截器");
		//放行,继续向下执行
		inv.invoke();
	}

}
