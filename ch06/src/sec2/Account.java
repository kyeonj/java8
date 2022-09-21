package sec2;

public class Account {
	//게터세터는 private을 써야함
	private String account; //계좌번호   문자
	private String owner; //계좌주  문자
	private int balance; //잔액  숫자
	private int money;	//입출금액  숫자
	
	//게터세터 만들어줌(private은 간접접근으로 겟,셋이 필요함
	//모든 멤버 필드는 게터/세터를 갖는다.
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	
	//사용자 정의 메서드
	public void setBalance(int balance) {
		this.balance = balance; 
	}
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void runDeposit(int money){
		this.balance+=money;	//입출금액을 입력받아 입금작업을 진행하여 해당 계좌에 잔액이 증가된다.
	}
	public void runWithdraw(int money){
		if(this.balance-money>0){
			this.balance-=money; 
			//입출금액을 입력받아 출금작업을 진행하여 해당 계좌에 잔액이 감소된다.
			//※ 다만, 잔액은 음수(-)일 수 없음
		} else {
			System.out.println("잔액 부족 - 출금액이 잔액을 초과합니다.");
		}
	}
	public int runBlance(){
		return balance; // 해당 계좌에 잔액을 조회하여 반환한다.
	}
	public void printAccount(){
		System.out.println("계좌번호 : "+account);
		System.out.println("예금주 : "+owner);
		System.out.println("잔액 : "+balance); //해당 계좌의 계좌번호, 계좌주, 잔액 을 출력하도록 한다.
	}	
}
