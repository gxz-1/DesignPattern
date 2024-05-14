package type2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//Ҫ��Ŀ��������ʵ��һ���ӿ�
class ProxyFactory {

	// ά��һ��Ŀ�����
	private Object target;

	// ��ʼ��Ŀ�����
	public ProxyFactory(Object target) {
		this.target = target;
	}

	// ��Ŀ���������һ���������
	public Object getProxyinstance() {

		// loader---��ǰĿ�����ʹ�õ��������
		// interface---Ŀ�����ʵ�ֵĽӿ����ͣ�ʹ�÷��͵ķ�ʽȷ������
		// InvocationHandler h---�¼�����ִ��Ŀ�����ķ���ʱ���ᴥ�����鴦��������
		// ��ѵ�ǰִ�е�Ŀ�������Ϊ��������
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("JDK����ʼ~");
						
						Object returnval=method.invoke(target, args);
						return returnval;
					}
				});

	}

}
