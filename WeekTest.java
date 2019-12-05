import java.util.Scanner;

class WeekTest{
	Scanner s = new Scanner(System.in);
	int[] testScore = new int[6];//1차원 배열 안에 테스트 점수를 집어 넣음
	int sum =0;
	int count=0;
	String study;
	
	
	void test(int week){
		while(true){
			if(week<7){//1~6주차는 다음주차 공부
				System.out.printf("%d주차 테스트를 공부할까?(공부한다/안한다): ", week+1);
				study = s.nextLine();
				
				if(study.equals("공부한다")){
				
				
				this.score(1);

				break;
				}
				
				else if(study.equals("안한다")){
				
				
				this.score(0);
				
				break;
				}
				
				else{
					System.out.println("[에러]공부여부를 제대로 입력해주세요!!!");
					continue;
				}
			}
		}
	}
	
	void score(int n){
		if(n==1){//공부할 때
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
		System.out.printf("[%d 주차 시험점수: %d점]\n",week,testScore[count-1]);
	}
}
