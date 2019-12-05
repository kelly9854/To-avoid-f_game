import java.io.*;
import java.util.*;

class ending{
	public static void main(String [] args) throws Exception{
		System.out.println("2018년 1학기 제임스 고슬링교수님의 자바프로그래밍 강의를 수강하기로 했다.");
		System.out.println("자바를 7주차 안에 마스터시켜주신다는 파격적인 강의 계획과 더불어");
		System.out.println("8주차에 기말고사를 치고 종강을 한다는 소식에 너도나도 달려들어 수강신청하기 힘들었다....");
		System.out.println("매주 테스트로 출석체크를 대신한다니까 테스트를 치고 출튀도 할 수 있겠어!!");
		System.out.println();
		
		Attendance AAA = new Attendance();
		
		finalexam FFF = new finalexam();
		
		WeekTest WWW = new WeekTest();
		
		Happiness HHH = new Happiness();
		
		Studiesness SSS = new Studiesness();
		
		AAA.whatWeek();
		System.out.printf("[행복도: %d / 공부능력: %d]\n", HHH.point, SSS.point);
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
			System.out.printf("[행복도: %d / 공부능력: %d]\n", HHH.point, SSS.point);
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
		System.out.printf("[행복도: %d / 공부능력: %d]\n", HHH.point, SSS.point);
		System.out.println();
		AAA.weekStart();
		HHH.attendance(AAA.input);
		SSS.attendance(AAA.input);
		System.out.println();
		
		WWW.result(AAA.week);
		System.out.println();
		
		int gimal = FFF.finaltest(SSS.point); //
		int mjtest = (int)((WWW.sum)/6);
		int cheojong = (int)((gimal+mjtest*10)/2); //매주 테스트가 40점일 시
		FFF.printfinal(gimal);
		
		System.out.println();
		System.out.println("----- 최종결과 -----");
		System.out.println("기말고사 점수: "+gimal+"점 (100점 만점)");
		System.out.println("매주테스트 점수: "+mjtest*10+"점 (100점 만점)");
		System.out.println("최종점수: "+(gimal+mjtest*10)/2+" (100점 만점)");
		System.out.println();
		
		if(AAA.fail == true){System.out.println("학점: F");}
		else{
		if(cheojong>=0 && cheojong<=20){
			System.out.println("학점: F");
		}
		else if(cheojong>20 && cheojong<=35){
			System.out.println("학점: D");
		}
		else if(cheojong>35 && cheojong<=50){
			System.out.println("학점: C");
		}
		else if(cheojong>50 && cheojong<=65){
			System.out.println("학점: B");
		}
		else if(cheojong>65 && cheojong<=100){
			System.out.println("학점: A");
		}
		}
		
		
		int happy = HHH.point;
		System.out.println("행복도: "+happy);
		int human = (int)((cheojong + happy)/2);
		File f = new File("엔딩.txt");
		PrintWriter pw = new PrintWriter(f);
		if(AAA.fail == true){
			System.out.println("교수님: 너는 출결 F다 / 출결 F를 당했습니다.");
			pw.format("교수님: 너는 출결 F다 / 출결 F를 당했습니다.");
		}
		else if(happy != 0){
		if(human>0 && human<=20){
			System.out.println("공부도 행복도 다 놓쳤다. 휴학해야겠다.");
			pw.format("공부도 행복도 다 놓쳤다. 휴학해야겠다.");
		}
		else if(human>20 && human<=40){
			System.out.println("나는 공부랑 안맞나봐.");
			pw.format("나는 공부랑 안맞나봐.");
		}
		else if(human>40 && human<=60){
			System.out.println("이번 학기는 시간이 정말 빨리 갔다. 비록 학점은 망했지만 다른걸로 메꿔야지 !!");
			pw.format("이번 학기는 시간이 정말 빨리 갔다. 비록 학점은 망했지만 다른걸로 메꿔야지 !!");
		}
		else if(human>60 && human<=80){
			System.out.println("공부가 나랑 잘 맞는듯해.");
			pw.format("공부가 나랑 잘 맞는듯해.");
		}
		else if(human>80 && human<=100){
			System.out.println("이즘되면 대학원을 가도 되겠어.");
			pw.format("이즘되면 대학원을 가도 되겠어.");
			}
		}
		else{
			System.out.println("더이상 못버티겠어... 난 자퇴한다. 최악의 엔딩: 학생이 자퇴하였습니다.");
			pw.format("더이상 못버티겠어... 난 자퇴한다. 최악의 엔딩: 학생이 자퇴하였습니다.");
			
		}
		
		System.out.println();
		System.out.println("엔딩을 엔딩.txt에 저장합니다.");
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
		System.out.println("----- 기말고사 -----");
		System.out.printf("기말고사 점수: %d점\n", finalscore);
		if(finalscore>=0 && finalscore<20){
		System.out.println("내 인생은 끝났어");
		}
		else if(finalscore>=20 && finalscore<50){
		System.out.println("하... 망했다");
		}
		else if(finalscore>=50 && finalscore<80){
		System.out.println("재수강은 안해도 되겠어");
		}
		else if(finalscore>=80 && finalscore<=100){
		System.out.println("완전 잘쳤어!");
		}
		
	}
	
}



/*
5. 기말고사 Class
Week8에 기말고사를 치릅니다. 지금까지 쌓아온 공부능력에 따라 기말고사 성적이 결정됩니다.(0~100).

6. 엔딩 Class 
메인클래스 역할을 하여 각 개체들을 연결하며, 지금까지의 매주테스트 + 기말고사를 종합해서 
최종학점을 결정합니다(A ~ F). 최종학점과 행복도에 따라서 다양한 엔딩이 나타납니다.
엔딩에 맞게 파일입출력을 통해 엔딩을 화면에 출력한 뒤 파일로 저장합니다.
*/