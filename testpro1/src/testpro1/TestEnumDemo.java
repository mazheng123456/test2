package testpro1;
/**
 * 枚举：一个具有范围限定的数据集合
 * 在java中枚举也是一个特殊的类,每一个枚举的元素都是枚举的实例,
 * 枚举中的构造函数都必须为私有的，枚举不能在外部创建实例
 * 
 * @author Administrator
 *
 */
public class TestEnumDemo {

	public static void main(String[] args) {
		/*System.out.println(Grade.A);
		System.out.println("------");
		Grade a = Grade.A;
		a.out();
		System.out.println(a.ordinal());*/
		System.out.println(Grade.B.ordinal());
		Grade[] values = Grade.values();
		for (Grade x : values) {
			System.out.println(x);
		}

	}

}

enum Grade{
	A("90-100"){

		@Override
		public void out() {
			System.out.println("优秀");
			
		}
		
	},B("80-90"){
		@Override
		public void out() {
			System.out.println("良好");
			
		}
	},C("60-80"){
		@Override
		public void out() {
			System.out.println("及格");
			
		}
	},D("0-59"){
		@Override
		public void out() {
			System.out.println("不及格");
			
		}
	};
	private String info;
	private  Grade(String info){
		this.info = info;
	}
	public abstract void out();
	
}
