package testpro1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.sun.java_cup.internal.runtime.Symbol;

public class TestDemo1 {

	public static void main(String[] args) {
		try {
			//字节码文件对象
			Class<?> clazz = Class.forName("testpro1.Person");
			//System.out.println(clazz);
			Person p = (Person) clazz.newInstance();
			p.setName("haoren");
			p.setAge(12);
			System.out.println(p.getName()+","+p.getAge());
			//获得所有的构造函数
			Constructor<?>[] cons = clazz.getConstructors();
			//System.out.println(cons.length);
			Person p2 = (Person) cons[1].newInstance("huairen",1);
			System.out.println(p2.getName()+","+p2.getAge());
			//获得具体的构造函数
			Constructor<?> con= clazz.getConstructor(String.class,int.class);
			Person p3 = (Person) con.newInstance("zhangsan",2);
			System.out.println(p3.getName()+","+p3.getAge());
			//获得实现的接口
			Class<?>[] inter = clazz.getInterfaces();
			System.out.println(inter[0]);
			//获得父类
			Class<?> superclass = clazz.getSuperclass();
			System.out.println(superclass);
			//获得方法
			Method[] methods = clazz.getMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i]);
			}
			
			//拿出一个具体的方法
			Method mth1 = clazz.getDeclaredMethod("test1", String.class);
			//System.out.print(mth1);
			//调用具体的函数
			mth1.invoke(clazz.newInstance(), "aaaaaa");
			
			//获得所有字段
			Field[] fields = clazz.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				//System.out.print("1111");
				System.out.println(fields[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
