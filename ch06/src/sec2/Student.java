package sec2;

public class Student {
	String name;	//name 문자
	int kor;	//kor 숫자
	int eng;	//eng 숫자
	int mat;	//mat 숫자
	
	//객체(인스턴스) 생성시에는 
	public Student () {}	//1. 매개변수가 없는 경우
	
	public Student (String name){
		this.name = name;	//	2. 매개변수가 name이 있는 경우
	}
	public Student (String name, int kor, int eng, int mat){
		this.name = name;	this.kor = kor;
		this.eng = eng;		this.mat = mat;		
		//	3. 매개변수가 name, kor, eng, mat가 있는 경우
	}
	
	//사용자 정의 메서드
	public int calcTot() { //총점  kor+eng+mat 를 계산하여 반환함
		int tot = kor+eng+mat;	
		return tot;	
	}
	public double calcAvg(){ //	평균 총점/과목수 를 계산하여 반환함
		double avg = (float) (Math.round((kor+eng+mat)/3*100)/100); 
		return avg;
	}
	public String calHak(){	
		String hak="";
		double avg = this.calcAvg();
		if(avg>=90) {	//학점을 평균이 90점 이상이면, A
			hak="A";
		} else if(avg>=80){	//80점 이상이면, B
			hak="B";
		} else if(avg>=70){	//70점 이상이면, C
			hak="C";
		} else {	//나머지는 'D'로 계산하여 반환함
			hak="D";	
		}
		return hak;
	}
	public String calcRes(){
		double avg = this.calcAvg();
		String res = "불합격"; //조건불충족시 '불합격'
		//String res 변수명을 생성해준것.
		if(avg>=80) res="합격"; //평균이 80점 이상이면 '합격'
		return res;
	}	
}


