import java.util.Scanner;
public class work1_2 {
	/**
	 * 主方法main函数完成的是（1）的四则运算
	 * a为第一个运算数
	 * b为第二个运算数
	 * c为运算符
	 * s1和c1用来确定是continue还是finish
	 * @author XY
	 * @param args 四则运算
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) 
		{
			System.out.println("请输入两个运算数和一个运算符");
			Scanner reader=new Scanner(System.in);
			double a;
			double b;
			String s;
			char c;
			a=reader.nextDouble();
			b=reader.nextDouble();
			s=reader.nextLine();
			s=reader.nextLine();
			c=s.toCharArray()[0];
			switch(c)
			{
			case'+':
				System.out.println("a+b="+(a+b));break;
			case'-':
				System.out.println("a-b="+(a-b));break;
			case'*':
				System.out.println("a*b="+(a*b));break;
			case'/':
				System.out.println("a/b="+(a/b));break;
			default:
				System.out.println("对不起，运算器处理不了此运算符"+(c));
			}
		System.out.println("是否继续 continue or finsih?");
		Scanner input=new Scanner(System.in);
		String s1;
		s1=input.nextLine();
		char c1=s1.toCharArray()[0];
		if(c1=='c') continue;
		else if(c1=='f') break;
		else System.out.println("error!请输入正确选择！");
		}
	}
}
