
public class work1_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [ ] [ ] a2= new double [3] [ ];

        a2 [0] = new double[3];

        a2 [1] = new double[2];

        a2 [2] = new double[4];

        a2 [0][0]=85;a2 [0][1]=90;a2 [0][2]=96;

        a2 [1][0]=90;a2 [1][1]=85;

        a2 [2][0]=90;a2 [2][1]=90;a2 [2][2]=80;a2 [2][3]=95;

        System.out.println("这三位同学的成绩是:");

        for(int i=0;i<3;++i)

            for(int j=0;j<a2[i].length;++j)

                System.out.println(a2[i][j]);

            System.out.print("\n");
	}

}
