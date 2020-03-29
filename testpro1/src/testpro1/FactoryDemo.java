package testpro1;
//工厂设计模式
public class FactoryDemo {
	public static void main(String[] args) {
		Fruit f;
		try {
			f = Factory.produce("testpro1.Orange");
			System.out.println(f);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
//传统
/*class Factory{
	public static  Fruit produce(String info){
		if("apple".equals(info)){
			return new Apple();
		}
		if("orange".equals(info)){
			return new Orange();
		}
		if("banana".equals(info)){
			return new Banana();
		}
		return null;
		
	}
}*/
//反射

class Factory{
	public static  Fruit produce(String info) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Fruit f = (Fruit) Class.forName(info).newInstance();
		return f;
		
	}
}
interface Fruit{
	
}

class Orange implements Fruit{
	
}

class Apple implements Fruit{
	
}
class Banana implements Fruit{
	
}