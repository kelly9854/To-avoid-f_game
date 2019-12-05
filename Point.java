import java.util.Scanner;


class Happiness{
	public int point=50;
	public int temp;
	public boolean unhappy; //행복도 0 체크
	//행복도 0되면 자퇴하는 엔딩이랑 시험점수 그런건 main함수에서 처리하는 방식으로!!
	//행복도클래스 안에서는 행복도가 0인지 아닌지만 체크하는 boolean 필드만 제공하는방식!
	
	void attendance(String input){ //출석여부 input 문자열 입력받고.
		//출석여부에 따라서 어차피 크게상승 or 크게감소 뿐이라서 많이 변화하는 경우만 생각해줄께요.
		temp=(int)(Math.random()*11+10); //(10~20)밸런스 나중에 고쳐야되요!!
		
		if(input.equals("출석")){
			point-=temp;
			System.out.println("[행복도 DOWN!!!!! 공부능력 UP!!!!!]");
		}
		
		else if(input.equals("결석")){
			point+=temp;
			System.out.println("[행복도 UP!!!!! 공부능력 DOWN!!!!]");
		}
		
		else if(input.equals("출튀")){
			point+=temp;
			System.out.println("[행복도 UP!!!!! 공부능력 DOWN]");
		}
		
		if(point>=100) point=100; //출석확인메소드에 100초과 못하게 제한.
		else if(point<=0){
			point=0; //포인트 0 미만 못하게 제한
			unhappy=true; //행복도 0 true 체크.
		}
	}
	
	
	//공부 한다 안한다는 main함수에서 Scanner 받아서,,,, 행복도/공부량 클래스에서는 그냥 입력받는 방식으로 할께용~~~
	void study(String input){ //다음주 테스트 대비 공부를 할지 안한지를 입력받아 행복도 조절하는 메소드.
		//미리공부 여부에 따라선 그냥 보통 변화밖에 없어서 하나만 지정!
		temp=(int)Math.random()*11; //(0~10) 밸런스 나중에 수정~~
		
		if(input.equals("공부한다")){
			point-=temp;
			System.out.println("[행복도 DOWN 공부능력 UP]");
		}
		
		else if(input.equals("안한다")){
			point+=temp;
			System.out.println("[행복도 UP 공부능력 DOWN]");
		}
		
		if(point>=100) point=100; //미리공부확인메소드에 100초과 못하게 제한.
		else if(point<=0){
			point=0; //포인트 0 미만 못하게 제한
			unhappy=true; //행복도 0 true 체크.
		}
	}
}



class Studiesness extends Happiness{
	int point=50;
	
	void attendance(String input){
		temp=(int)(Math.random()*11+10);
		
		if(input.equals("출석")){
			point+=temp;
			
		}
		
		else if(input.equals("결석")){
			point-=temp;
			
		}
		
		else if(input.equals("출튀")){
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
		
		if(input.equals("공부한다")){
			point+=temp;
			
		}
		
		else if(input.equals("안한다")){
			point-=temp;
			
		}
		
		if(point>=100) point=100; 
		else if(point<=0){
			point=0; 
		}
	
	}
}

//main 클래스 안에 넣을 것
/*
class Point{
	public static void main(String []args){
		int week;//
		String input;//
		
		Happiness happypoint = new Happiness();
		Studiesness studypoint = new Studiesness();
		
		
		// 출석체크뒤
		happypoint.attendence(input);
		studypoint.attendence(input);
		
		//공부할지
		System.out.printf("%d주차 테스트를 공부할까?(공부한다/안한다): ",week+1);
		Scanner s = new Scanner(System.in);
		input = s.nextLine();
		happypoint.study(input);
		studypoint.study(input);
		
	}
}
*/
















