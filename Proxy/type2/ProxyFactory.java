package type2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//要求目标对象必须实现一个接口
class ProxyFactory {

	// 维护一个目标对象
	private Object target;

	// 初始化目标对象
	public ProxyFactory(Object target) {
		this.target = target;
	}

	// 给目标对象生成一个代理对象
	public Object getProxyinstance() {

		// loader---当前目标对象使用的类加载器
		// interface---目标对象实现的接口类型，使用泛型的方式确认类型
		// InvocationHandler h---事件处理，执行目标对象的方法时，会触发事情处理器方法
		// 会把当前执行的目标对象作为方法传入
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("JDK代理开始~");
						
						Object returnval=method.invoke(target, args);
						return returnval;
					}
				});

	}

}
