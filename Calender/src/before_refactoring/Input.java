package before_refactoring;

import java.util.Scanner;

public class Input {
	private int n1;
	private int n2;

	public void getdays(int[] days, String[] daysS) {
		System.out.println("����� ���� �����Ͽ�, �� ������ ����ϼ��� ���ϴ� ���α׷�");

		for (int i = 0; i < 18; i++) {
			System.out.print(i + 1 + ". " + days[i] + " " + daysS[i] + "   ");
		}
		System.out.print("\n");

	}

	public void inputdata() {
		while (true) {
			System.out.println("ù��° ������� ������. 1~18������ ���ڸ� �Է����ּ���.");
			Scanner scan1 = new Scanner(System.in);
			n1 = scan1.nextInt();

			if (n1 >= 1 & n1 <= 17) {
				System.out.println("�ι�° ������� ������. 1~18������ ���ڸ� �Է����ּ���.");
				Scanner scan2 = new Scanner(System.in);
				n2 = scan2.nextInt();
				break;
			} else {
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
				continue;
			}
		}
	}
		public int getnum1() {return n1;}
		public int getnum2() {return n2;}
}