import java.io.*;
import java.util.*;

class ending{
	public static void main(String [] args) throws Exception{
		System.out.println("2018�� 1�б� ���ӽ� ������������ �ڹ����α׷��� ���Ǹ� �����ϱ�� �ߴ�.");
		System.out.println("�ڹٸ� 7���� �ȿ� �����ͽ����ֽŴٴ� �İ����� ���� ��ȹ�� ���Ҿ�");
		System.out.println("8������ �⸻��縦 ġ�� ������ �Ѵٴ� �ҽĿ� �ʵ����� �޷���� ������û�ϱ� �������....");
		System.out.println("���� �׽�Ʈ�� �⼮üũ�� ����Ѵٴϱ� �׽�Ʈ�� ġ�� ��Ƣ�� �� �� �ְھ�!!");
		System.out.println();
		
		Attendance AAA = new Attendance();
		
		finalexam FFF = new finalexam();
		
		WeekTest WWW = new WeekTest();
		
		Happiness HHH = new Happiness();
		
		Studiesness SSS = new Studiesness();
		
		AAA.whatWeek();
		System.out.printf("[�ູ��: %d / ���δɷ�: %d]\n", HHH.point, SSS.point);
		System.out.println();
		AAA.weekStart();
		HHH.attendance(AAA.input);
		SSS.attendance(AAA.input);
		System.out.println();
		
		WWW.test(AAA.week);
		HHH.study(WWW.study);
		SSS.study(WWW.study);
		
		for(int i=1; i<6; i++){
			System.out.println();
			AAA.whatWeek();
			System.out.printf("[�ູ��: %d / ���δɷ�: %d]\n", HHH.point, SSS.point);
			System.out.println();
			AAA.weekStart();
			HHH.attendance(AAA.input);
			SSS.attendance(AAA.input);
			System.out.println();
			
			WWW.result(AAA.week);
			System.out.println();
			WWW.test(AAA.week);
			HHH.study(WWW.study);
			SSS.study(WWW.study);
		}
		System.out.println();
		AAA.whatWeek();
		System.out.printf("[�ູ��: %d / ���δɷ�: %d]\n", HHH.point, SSS.point);
		System.out.println();
		AAA.weekStart();
		HHH.attendance(AAA.input);
		SSS.attendance(AAA.input);
		System.out.println();
		
		WWW.result(AAA.week);
		System.out.println();
		
		int gimal = FFF.finaltest(SSS.point); //
		int mjtest = (int)((WWW.sum)/6);
		int cheojong = (int)((gimal+mjtest*10)/2); //���� �׽�Ʈ�� 40���� ��
		FFF.printfinal(gimal);
		
		System.out.println();
		System.out.println("----- ������� -----");
		System.out.println("�⸻��� ����: "+gimal+"�� (100�� ����)");
		System.out.println("�����׽�Ʈ ����: "+mjtest*10+"�� (100�� ����)");
		System.out.println("��������: "+(gimal+mjtest*10)/2+" (100�� ����)");
		System.out.println();
		
		if(AAA.fail == true){System.out.println("����: F");}
		else{
		if(cheojong>=0 && cheojong<=20){
			System.out.println("����: F");
		}
		else if(cheojong>20 && cheojong<=35){
			System.out.println("����: D");
		}
		else if(cheojong>35 && cheojong<=50){
			System.out.println("����: C");
		}
		else if(cheojong>50 && cheojong<=65){
			System.out.println("����: B");
		}
		else if(cheojong>65 && cheojong<=100){
			System.out.println("����: A");
		}
		}
		
		
		int happy = HHH.point;
		System.out.println("�ູ��: "+happy);
		int human = (int)((cheojong + happy)/2);
		File f = new File("����.txt");
		PrintWriter pw = new PrintWriter(f);
		if(AAA.fail == true){
			System.out.println("������: �ʴ� ��� F�� / ��� F�� ���߽��ϴ�.");
			pw.format("������: �ʴ� ��� F�� / ��� F�� ���߽��ϴ�.");
		}
		else if(happy != 0){
		if(human>0 && human<=20){
			System.out.println("���ε� �ູ�� �� ���ƴ�. �����ؾ߰ڴ�.");
			pw.format("���ε� �ູ�� �� ���ƴ�. �����ؾ߰ڴ�.");
		}
		else if(human>20 && human<=40){
			System.out.println("���� ���ζ� �ȸ³���.");
			pw.format("���� ���ζ� �ȸ³���.");
		}
		else if(human>40 && human<=60){
			System.out.println("�̹� �б�� �ð��� ���� ���� ����. ��� ������ �������� �ٸ��ɷ� �޲���� !!");
			pw.format("�̹� �б�� �ð��� ���� ���� ����. ��� ������ �������� �ٸ��ɷ� �޲���� !!");
		}
		else if(human>60 && human<=80){
			System.out.println("���ΰ� ���� �� �´µ���.");
			pw.format("���ΰ� ���� �� �´µ���.");
		}
		else if(human>80 && human<=100){
			System.out.println("����Ǹ� ���п��� ���� �ǰھ�.");
			pw.format("����Ǹ� ���п��� ���� �ǰھ�.");
			}
		}
		else{
			System.out.println("���̻� ����Ƽ�ھ�... �� �����Ѵ�. �־��� ����: �л��� �����Ͽ����ϴ�.");
			pw.format("���̻� ����Ƽ�ھ�... �� �����Ѵ�. �־��� ����: �л��� �����Ͽ����ϴ�.");
			
		}
		
		System.out.println();
		System.out.println("������ ����.txt�� �����մϴ�.");
		pw.close();
		
	/*
	public static void Days(){
		AAA.whatWeek();
		AAA.weekStart();
		for(int i=2; i<8; i++){
			AAA.whatWeek();
			
			AAA.weekStart();
		}
	}
	*/
	}	
}
		

class finalexam{
	public static int finaltest(int studypoint){
	int finalscore = 0;
	if(studypoint>=0 && studypoint<=30){
		finalscore = (int)(Math.random()*30);
	
	}
	else if(studypoint>30 && studypoint<=60){
		finalscore = (int)(Math.random()*30+30);
	
	}
	else if(studypoint>60 && studypoint<=100){
		finalscore = (int)(Math.random()*40+60);
		
		}
		return finalscore;
	}
	
	public static void printfinal(int finalscore){
		System.out.println();
		System.out.println("----- �⸻��� -----");
		System.out.printf("�⸻��� ����: %d��\n", finalscore);
		if(finalscore>=0 && finalscore<20){
		System.out.println("�� �λ��� ������");
		}
		else if(finalscore>=20 && finalscore<50){
		System.out.println("��... ���ߴ�");
		}
		else if(finalscore>=50 && finalscore<80){
		System.out.println("������� ���ص� �ǰھ�");
		}
		else if(finalscore>=80 && finalscore<=100){
		System.out.println("���� ���ƾ�!");
		}
		
	}
	
}



/*
5. �⸻��� Class
Week8�� �⸻��縦 ġ���ϴ�. ���ݱ��� �׾ƿ� ���δɷ¿� ���� �⸻��� ������ �����˴ϴ�.(0~100).

6. ���� Class 
����Ŭ���� ������ �Ͽ� �� ��ü���� �����ϸ�, ���ݱ����� �����׽�Ʈ + �⸻��縦 �����ؼ� 
���������� �����մϴ�(A ~ F). ���������� �ູ���� ���� �پ��� ������ ��Ÿ���ϴ�.
������ �°� ����������� ���� ������ ȭ�鿡 ����� �� ���Ϸ� �����մϴ�.
*/