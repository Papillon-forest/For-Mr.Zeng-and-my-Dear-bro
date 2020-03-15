
public class work1_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [ ] [ ] a1 ={{85,90,96},{90,85},{90,90,80,95}};

        System.out.println("这三位同学的成绩是:");

        for(int i=0;i<3;++i)

            for(int j=0;j<a1[i].length;++j)

                System.out.println(a1[i][j]);

            System.out.print("\n");
	}

}
