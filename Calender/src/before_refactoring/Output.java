package before_refactoring;

public class Output { // �����, ù��°������̸�, �ι�°������̸�, ù��°�����, �ι�° �����, ù��° Ű��, �ι�°
	// Ű��
public void outputDate(int r, String firstDayS, String secondDayS,
int firstPassedDays, int secondPassedDays, int firstKey,
int secondKey) {

System.out.println("ù��° ����� : " + firstDayS);
System.out.println("�ι�° �����  : " + secondDayS);
System.out.println("�� ����� ���� ������� " + r + " �� �Դϴ�.");

if (firstKey == 1 && secondKey == 0) {
System.out.println("�ι�° ������� ������ ������Դϴ�. �ι�° ������� ��� 1�� 1�Ϻ����� �������  "
		+ secondPassedDays+"�� �Դϴ�");

} else if (firstKey == 0 && secondKey == 1) {
System.out.println("ù��° ������� ������ ������Դϴ�. ù��° ������� ��� 1�� 1�Ϻ����� �������  "
		+ firstPassedDays+"�� �Դϴ�");

} else {
System.out.println("�� ������� ��� ������ ������Դϴ�. ù��° ������� ���  1�� 1�Ϻ����� �������    "
		+ firstPassedDays
		+ " \n �ι�° ������� ���  1�� 1�Ϻ����� ������� "
		+ secondPassedDays+"�� �Դϴ�");
}
}
}

