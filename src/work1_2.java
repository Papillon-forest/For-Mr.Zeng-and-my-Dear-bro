import java.util.Scanner;
public class work1_2 {
	/**
	 * ������main������ɵ��ǣ�1������������
	 * aΪ��һ��������
	 * bΪ�ڶ���������
	 * cΪ�����
	 * s1��c1����ȷ����continue����finish
	 * @author XY
	 * @param args ��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) 
		{
			System.out.println("������������������һ�������");
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
				System.out.println("�Բ��������������˴������"+(c));
			}
		System.out.println("�Ƿ���� continue or finsih?");
		Scanner input=new Scanner(System.in);
		String s1;
		s1=input.nextLine();
		char c1=s1.toCharArray()[0];
		if(c1=='c') continue;
		else if(c1=='f') break;
		else System.out.println("error!��������ȷѡ��");
		}
	}
}
