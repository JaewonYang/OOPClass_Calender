package before_refactoring;

public class Days {

	private int[] dateArr;
	private int[] keyArr;
	private String[] daysStr;

	public Days() {
		dateArr = new int[] { 101, 101, 301, 406, 505, 403, 606, 505, 717, 719,
				729, 808, 815, 922, 922, 1003, 1009, 1225 };
		keyArr = new int[] { 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0,
				0 };

		daysStr = new String[] { "����", "����", "������", "�ѽ�", "��̳�", "����ź����",
				"������", "�ܿ�", "������", "�ʺ�", "�ߺ�", "����", "������", "������", "�� ����",
				"��õ��", "�ѱ۳�", "��ź��" };
	}
	public int[] getDateArr(){return dateArr;}
	public int[] getKeyArr(){return keyArr;}
	public String[] getStr(){return daysStr;}
}
