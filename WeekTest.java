import java.util.Scanner;

class WeekTest{
	Scanner s = new Scanner(System.in);
	int[] testScore = new int[6];//1���� �迭 �ȿ� �׽�Ʈ ������ ���� ����
	int sum =0;
	int count=0;
	String study;
	
	
	void test(int week){
		while(true){
			if(week<7){//1~6������ �������� ����
				System.out.printf("%d���� �׽�Ʈ�� �����ұ�?(�����Ѵ�/���Ѵ�): ", week+1);
				study = s.nextLine();
				
				if(study.equals("�����Ѵ�")){
				
				
				this.score(1);

				break;
				}
				
				else if(study.equals("���Ѵ�")){
				
				
				this.score(0);
				
				break;
				}
				
				else{
					System.out.println("[����]���ο��θ� ����� �Է����ּ���!!!");
					continue;
				}
			}
		}
	}
	
	void score(int n){
		if(n==1){//������ ��
			testScore[count]= (int)(Math.random()*5)+6;
			
			sum += testScore[count];
		}
		else if(n==0){
			testScore[count]= (int)(Math.random()*6);
			
			sum += testScore[count];
		}
	
		count++;
	}
	void result(int week){
		System.out.printf("[%d ���� ��������: %d��]\n",week,testScore[count-1]);
	}
}
