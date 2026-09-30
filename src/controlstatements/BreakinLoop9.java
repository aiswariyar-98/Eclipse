package controlstatements;

public class BreakinLoop9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=10;i++) {
			System.out.println(i);
			if (i==5) {
				break;
			}
		}
		
		outer : for (int i=1;i<=3;i++) { //outer is label
			for (int j=1;j<=3;j++) {
				System.out.println(i+" "+j);
				if ((i==2)&&(j==2)) {
					break outer;
				}
			}
		}

	}

}
