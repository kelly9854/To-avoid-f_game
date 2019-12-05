import java.util.Scanner;

public class Attendance{
	public int[] check = {0,0,0,0,0,0,0}; //���� �⼮���θ� üũ 0�� ��üũ. 1�� �⼮, 2�� �Ἦ
	public int week=0; //���������� üũ�ϴ� int
	public String input; //�⼮���� Ȯ���ʵ�
	public boolean fail; //�������� üũ�ʵ�
	
	Scanner mS = new Scanner(System.in); //��ĳ��
	
	public void weekStart(){
		randomSay(); //ȥ�㸻 ����
		weekCheck(); //�⼮���� üũ
		failCheck(); //3���̻�Ἦ���� üũ
		week++; //������ ī��Ʈ+1
	}
	
	public void randomSay(){ //���� �����Ҷ� ��µǴ� ���� ȥ�㸻
		int raNum = (int)(Math.random()*3); //Ȯ�� 1/3
		if(raNum==0) System.out.println("���� ���� �ʹ� ���� ���ż� ���밡 ���ϴ�. ������ ���� �Ἦ�� �ϰ�ʹ�.");
		else if(raNum==1) System.out.println("���� ���Ƽ� �б��� ���� ���� �ȴ�.");
		else System.out.println("���� ���Ƽ� �б��� ���� ���� �ȴ�.");
	}
	
	public void weekCheck(){ //�⼮���� ����		
		while(true){
			System.out.print("�⼮���θ� �������ּ���(�⼮/��Ƣ/�Ἦ):");
			input = mS.nextLine();
			int raNum = (int)(Math.random()*2); //Ȯ�� 1/2
			
			if(input.equals("�⼮")){
				check[week]=1;
				break;
			}
			else if(input.equals("�Ἦ")){
				check[week]=2;
				break;
			}
			else if(input.equals("��Ƣ")){
				if(raNum==0){
					System.out.println("���õ� ������ �ɸ��� �ʾұ� [��Ƣ�Ѱ� �ɸ��� �ʾҽ��ϴ�]");
					check[week]=1;
					break;
				}
				else{
					System.out.println("�����ٰ� �����԰� �����ƽ��ϴ� [��Ƣ�� �� �ɷȽ��ϴ�: �Ἦó��]");
					check[week]=2;
					break;
				}
			}
			else{
				System.out.println("[����]�⼮���θ� ����� �Է����ּ���!!!");
				continue;
			}
		}
	}
	
	public void failCheck(){
		int n=0; //�Ἦ ī����
		for(int i=0; i<check.length; i++){
			if(check[i]==2) n++; //�Ἦ�� n++
		}
		if(n>2){
			fail=true;
		}
	}
	
	public void whatWeek(){
		System.out.printf("<%d����>\n",week+1);
	}
}


/*�̰Ŵ� Ȥ�ó� �����Լ��� ��� ����ϳ� �Ҷ� �����Ͻö�...
class AttTest{
	public static void main(String [] args){
		Attendance AAA = new Attendance(); //�⼮ Ŭ���� ����
		//�ູŬ���� �ູ = new �ູ();
		//���ε�Ŭ���� ���ε� = new ���ε�();
		//�����׽�ƮŬ���� �����׽�Ʈ = new ����Ŭ����();
		
		//1���� ���� ����
		AAA.weekStart(); //�⼮üũ ����.
		//�ູ.�⼮����Ȯ�θ޼ҵ�(AAA.input); //AAA.input �ʵ忡 ������ �⼮���ΰ� ���ڿ��� ����Ǿ�����.
		//���ε�.�⼮����Ȯ�θ޼ҵ�(AAA.input);
		//�����׽�Ʈ.�Ἦ����Ȯ�̸޼ҵ�(AAA.input); //���������� �Ἦ�̸� �����׽�Ʈ���� 0��ó��
		
		//if(AAA.fail==true){
		//}//�Ἦ 3�� �̻��� ?�� ������ �´� ����, �⸻��缺��, ������ �����Լ����� ó��
		
		//�������� 2~7���� �ݺ�
	}
}
*/



/*
3. �⼮ Class
���� �⼮üũ�� �մϴ�. Week 1 ~ Week 7 ������ �⼮������ �����˴ϴ�.
Week 8�� �⸻��� �ְ����� �⼮üũ�� ���� �ʽ��ϴ�.
�⼮���θ� �Է¹޽��ϴ�. (�⼮ / ��Ƣ / �Ἦ)
�⼮: ���δɷ��� ����ϰ� �ູ���� �����մϴ�.
��Ƣ: ���δɷ��� �ణ �����ϰ� �ູ���� �ణ �����մϴ�. (����Ȯ���� �Ἦó�� �˴ϴ�.)
�Ἦ: ���δɷ��� �����ϰ� �ູ���� �����մϴ�.
7������ 3�� �̻� �Ἦó���Ǹ� ����ó�� �˴ϴ�. (�ڵ����� F������ �޽��ϴ�.)
*/