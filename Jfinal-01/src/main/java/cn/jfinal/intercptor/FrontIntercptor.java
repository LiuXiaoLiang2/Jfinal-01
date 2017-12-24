package cn.jfinal.intercptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * 路由级别的拦截器
 * 前端拦截器
 * @author Administrator
 *
 */
public class FrontIntercptor implements Interceptor{

	@Override
	public void intercept(Invocation inv) {
		System.out.println("进入前端拦截器");
		//放行,继续向下执行
		inv.invoke();
	}

}
