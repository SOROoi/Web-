package ajax;

import java.util.ArrayList;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Demo {
	
	public static void main(String[] args) {
		method1();
//		method2();
//		method3();
		
	}

	//Object对象无法转为json数据，被转化的对象 其类必须为JavaBean格式，object类不符合
	private static void method1() {
		String json = JSONObject.fromObject(new Object() {
			private String name="A";
			private int age=16;
			private String sex="男";
			
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public String getSex() {
				return sex;
			}

			public void setSex(String sex) {
				this.sex = sex;
			}
		}).toString();
		System.out.println(json);
	}

	//JavaBean对象可以转为json数据
	private static void method2() {
		String json = JSONObject.fromObject(new Bean()).toString();
		System.out.println(json);
	}

	//多个JavaBean对象转为json数据
	private static void method3() {
		Bean b1 = new Bean("B",22);
		Bean b2 = new Bean("C",32);
		Bean b3 = new Bean("D",42);
		ArrayList<Bean> list = new ArrayList<Bean>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		JSONArray jArray = JSONArray.fromObject(list);	//将List数据封装到 JSONArray对象中
		String json = jArray.toString();	//toString()打印 json数据
		System.out.println(json);
	}
}
