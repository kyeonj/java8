package sec1;
//비선점형: 쓰레드객체.run()
//선점형 : 쓰레드객체.start()
//쓰레드 주기설정 : Thred.sleep()
//쓰레드 우선순위 설정 : 쓰레드객체.setPriority()
//쓰레드 우선순위 값 가져오기 : 쓰레드객체.getPriority()
//쓰레드의 상태
//생성(New Thread) : create -> 실행 대기 (New Runnable) : Wait 
// -> 실행(start(), run()) : Running -> 선점 (blocking=preemption) 
// -> 대기(sleep()): Wake -> 재실행(run()) - Wake Up 
// -> 정상 종료 (Interrupt) : Terminated
public class ThreadEx2 {
	public static void main(String[] args) {
		Thread th0 = new Thread(new ThreadWithRunnable());
		Thread th1 = new Thread(new ThreadWithRunnable());
		
		//01100110010101101010
		//쓰레드의 우선순위 변경 : 먼저 처리 되기 위해서
		th1.setPriority(10); //10011010010101101001
		
		th0.start();
		th1.start();
		
		System.out.println("th1의 우선순위 : "+th0.getPriority());
		System.out.println("th2의 우선순위 : "+th1.getPriority());
	}
}
