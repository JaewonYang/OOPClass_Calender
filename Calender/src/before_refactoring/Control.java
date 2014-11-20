package before_refactoring;

import before_refactoring.Input;
import before_refactoring.Output;

public class Control {
	private int[] speDaysN; // ����ڿ��� �Է��� �ޱ����� �����ִ� ����� ��ü �迭
	private String[] speDaysS;
	private int n1; // ����ڿ��� �Է¹��� ���� �ΰ�
	private int n2;
	private String choiceFirDayS; // ����ڰ� �� ����� ���ڿ�
	private String choiceSecDayS;
	private int resultDay; // ��� �����
	private int moonPassedDayFirst;
	private int moonPassedDaySecond;
	private int firstKey;
	private int secondKey;

	Input input;
	Output output;
	Calculator calculator;
	Days days;

	public void controlProgm() {
		input = new Input();
		output = new Output();
		calculator = new Calculator();
		days = new Days();

		speDaysN = days.getDateArr(); // days Ŭ�������� ������ ��� �����
		speDaysS = days.getStr();

		input.getdays(speDaysN, speDaysS);
		input.inputdata();
		n1 = input.getnum1();
		n2 = input.getnum2();

		calculator.dayHow(n1, n2);
		calculator.result();

		resultDay = calculator.returnDay(); // �� ������� �����
		choiceFirDayS = calculator.returnNameF(); // ù���� ������� �̸�
		choiceSecDayS = calculator.returnNameS(); // �ι�° ������� �̸�
		moonPassedDayFirst = calculator.returnPassedFirstDay();
		moonPassedDaySecond = calculator.returnPassedSecondDay();
		firstKey = calculator.returnFirstKey();
		secondKey = calculator.returnSecondKey();

		output.outputDate(resultDay, choiceFirDayS, choiceSecDayS,
				moonPassedDayFirst, moonPassedDaySecond, firstKey, secondKey);
	}
}
