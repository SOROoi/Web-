package 小题目;

/*
	键盘录入一个数据n（1<= n <=9）,输出对应的nn乘法表
	
	1*1=1	
	1*2=2	2*2=4	
	1*3=3	2*3=6	3*3=9	
	1*4=4	2*4=8	3*4=12	4*4=16	
	1*5=5	2*5=10	3*5=15	4*5=20	5*5=25	
	1*6=6	2*6=12	3*6=18	4*6=24	5*6=30	6*6=36	
	1*7=7	2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49	

*/
public class JiuJiuChengFa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		method(num);
	}

	private static void method(int num) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= num; i++) {	//n行
			for (int j = 1; j <= i; j++) {	
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
		
	}
}
