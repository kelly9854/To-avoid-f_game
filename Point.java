import java.util.Scanner;


class Happiness{
	public int point=50;
	public int temp;
	public boolean unhappy; //�ູ�� 0 üũ
	//�ູ�� 0�Ǹ� �����ϴ� �����̶� �������� �׷��� main�Լ����� ó���ϴ� �������!!
	//�ູ��Ŭ���� �ȿ����� �ູ���� 0���� �ƴ����� üũ�ϴ� boolean �ʵ常 �����ϴ¹��!
	
	void attendance(String input){ //�⼮���� input ���ڿ� �Է¹ް�.
		//�⼮���ο� ���� ������ ũ�Ի�� or ũ�԰��� ���̶� ���� ��ȭ�ϴ� ��츸 �������ٲ���.
		temp=(int)(Math.random()*11+10); //(10~20)�뷱�� ���߿� ���ľߵǿ�!!
		
		if(input.equals("�⼮")){
			point-=temp;
			System.out.println("[�ູ�� DOWN!!!!! ���δɷ� UP!!!!!]");
		}
		
		else if(input.equals("�Ἦ")){
			point+=temp;
			System.out.println("[�ູ�� UP!!!!! ���δɷ� DOWN!!!!]");
		}
		
		else if(input.equals("��Ƣ")){
			point+=temp;
			System.out.println("[�ູ�� UP!!!!! ���δɷ� DOWN]");
		}
		
		if(point>=100) point=100; //�⼮Ȯ�θ޼ҵ忡 100�ʰ� ���ϰ� ����.
		else if(point<=0){
			point=0; //����Ʈ 0 �̸� ���ϰ� ����
			unhappy=true; //�ູ�� 0 true üũ.
		}
	}
	
	
	//���� �Ѵ� ���Ѵٴ� main�Լ����� Scanner �޾Ƽ�,,,, �ູ��/���η� Ŭ���������� �׳� �Է¹޴� ������� �Ҳ���~~~
	void study(String input){ //������ �׽�Ʈ ��� ���θ� ���� �������� �Է¹޾� �ູ�� �����ϴ� �޼ҵ�.
		//�̸����� ���ο� ���� �׳� ���� ��ȭ�ۿ� ��� �ϳ��� ����!
		temp=(int)Math.random()*11; //(0~10) �뷱�� ���߿� ����~~
		
		if(input.equals("�����Ѵ�")){
			point-=temp;
			System.out.println("[�ູ�� DOWN ���δɷ� UP]");
		}
		
		else if(input.equals("���Ѵ�")){
			point+=temp;
			System.out.println("[�ູ�� UP ���δɷ� DOWN]");
		}
		
		if(point>=100) point=100; //�̸�����Ȯ�θ޼ҵ忡 100�ʰ� ���ϰ� ����.
		else if(point<=0){
			point=0; //����Ʈ 0 �̸� ���ϰ� ����
			unhappy=true; //�ູ�� 0 true üũ.
		}
	}
}



class Studiesness extends Happiness{
	int point=50;
	
	void attendance(String input){
		temp=(int)(Math.random()*11+10);
		
		if(input.equals("�⼮")){
			point+=temp;
			
		}
		
		else if(input.equals("�Ἦ")){
			point-=temp;
			
		}
		
		else if(input.equals("��Ƣ")){
			temp=(int)Math.random()*11;
			point-=temp;
			
		}
		if(point>=100) point=100; 
		else if(point<=0){
			point=0; 
		}
	}
	
	void study(String input){
		temp=(int)Math.random()*11;
		
		if(input.equals("�����Ѵ�")){
			point+=temp;
			
		}
		
		else if(input.equals("���Ѵ�")){
			point-=temp;
			
		}
		
		if(point>=100) point=100; 
		else if(point<=0){
			point=0; 
		}
	
	}
}

//main Ŭ���� �ȿ� ���� ��
/*
class Point{
	public static void main(String []args){
		int week;//
		String input;//
		
		Happiness happypoint = new Happiness();
		Studiesness studypoint = new Studiesness();
		
		
		// �⼮üũ��
		happypoint.attendence(input);
		studypoint.attendence(input);
		
		//��������
		System.out.printf("%d���� �׽�Ʈ�� �����ұ�?(�����Ѵ�/���Ѵ�): ",week+1);
		Scanner s = new Scanner(System.in);
		input = s.nextLine();
		happypoint.study(input);
		studypoint.study(input);
		
	}
}
*/
















