package controlstatements;

public class Continueinloop10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=10;i++) {
			if (i==5) {
				continue;
			}
			System.out.println(i);
		}
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
			if ((i==2)&&(j==2)) {
				continue;
			}
			System.out.println(i +" "+j);
			}
		}

	}

}
