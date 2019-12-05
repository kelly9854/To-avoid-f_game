import java.util.Scanner;

public class Attendance{
	public int[] check = {0,0,0,0,0,0,0}; //매주 출석여부를 체크 0은 미체크. 1은 출석, 2는 결석
	public int week=0; //몇주차인지 체크하는 int
	public String input; //출석여부 확인필드
	public boolean fail; //재적여부 체크필드
	
	Scanner mS = new Scanner(System.in); //스캐너
	
	public void weekStart(){
		randomSay(); //혼잣말 랜덤
		weekCheck(); //출석여부 체크
		failCheck(); //3번이상결석여부 체크
		week++; //몇주차 카운트+1
	}
	
	public void randomSay(){ //매주 시작할때 출력되는 랜덤 혼잣말
		int raNum = (int)(Math.random()*3); //확률 1/3
		if(raNum==0) System.out.println("어제 술을 너무 많이 마셔서 숙취가 심하다. 오늘은 정말 결석을 하고싶다.");
		else if(raNum==1) System.out.println("날이 좋아서 학교를 정말 가기 싫다.");
		else System.out.println("날이 좋아서 학교를 정말 가기 싫다.");
	}
	
	public void weekCheck(){ //출석여부 선택		
		while(true){
			System.out.print("출석여부를 선택해주세요(출석/출튀/결석):");
			input = mS.nextLine();
			int raNum = (int)(Math.random()*2); //확률 1/2
			
			if(input.equals("출석")){
				check[week]=1;
				break;
			}
			else if(input.equals("결석")){
				check[week]=2;
				break;
			}
			else if(input.equals("출튀")){
				if(raNum==0){
					System.out.println("오늘도 무사히 걸리지 않았군 [출튀한걸 걸리지 않았습니다]");
					check[week]=1;
					break;
				}
				else{
					System.out.println("나가다가 교수님과 마주쳤습니다 [출튀한 걸 걸렸습니다: 결석처리]");
					check[week]=2;
					break;
				}
			}
			else{
				System.out.println("[에러]출석여부를 제대로 입력해주세요!!!");
				continue;
			}
		}
	}
	
	public void failCheck(){
		int n=0; //결석 카운터
		for(int i=0; i<check.length; i++){
			if(check[i]==2) n++; //결석시 n++
		}
		if(n>2){
			fail=true;
		}
	}
	
	public void whatWeek(){
		System.out.printf("<%d주차>\n",week+1);
	}
}


/*이거는 혹시나 메인함수에 어떻게 써야하나 할때 참고하시라구...
class AttTest{
	public static void main(String [] args){
		Attendance AAA = new Attendance(); //출석 클래스 생성
		//행복클래스 행복 = new 행복();
		//공부도클래스 공부도 = new 공부도();
		//매주테스트클래스 매주테스트 = new 매주클래스();
		
		//1주차 시작 구간
		AAA.weekStart(); //출석체크 시작.
		//행복.출석여부확인메소드(AAA.input); //AAA.input 필드에 그주의 출석여부가 문자열로 저장되어있음.
		//공부도.출석여부확인메소드(AAA.input);
		//매주테스트.결석여부확이메소드(AAA.input); //마찬가지로 결석이면 메주테스트점수 0점처리
		
		//if(AAA.fail==true){
		//}//결석 3번 이상일 ?의 엔딩에 맞는 학점, 기말고사성적, 엔딩을 메인함수에서 처리
		
		//나머지는 2~7주차 반복
	}
}
*/



/*
3. 출석 Class
매주 출석체크를 합니다. Week 1 ~ Week 7 매주차 출석유무가 결정됩니다.
Week 8는 기말고사 주간으로 출석체크는 하지 않습니다.
출석여부를 입력받습니다. (출석 / 출튀 / 결석)
출석: 공부능력이 상승하고 행복도가 감소합니다.
출튀: 공부능력이 약간 감소하고 행복도가 약간 증가합니다. (랜덤확률로 결석처리 됩니다.)
결석: 공부능력이 감소하고 행복도가 증가합니다.
7주차중 3번 이상 결석처리되면 제적처리 됩니다. (자동으로 F학점을 받습니다.)
*/