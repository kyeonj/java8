package sec2;

public class AccountEx {

		public static void main(String[] args) {	
			Account acc1 = new Account();	//클래스명의 변수지정후 새로운값을 만들어줌.
			//acc1.setBalance(0);
			acc1.setAccount("212-12-465897");	//Acconut 에서 셋어카운트해서 계좌번호를입력해줌
			acc1.setOwner("김기태");
			acc1.runDeposit(150000); //입금 : 150000
			acc1.runWithdraw(90000); //출금 : 90000
			System.out.println("잔액조회 : "+acc1.runBlance()); //잔액조회
			acc1.runDeposit(200000); //입금 : 200000
			acc1.printAccount(); //계좌정보보기 (저장된프린트문이 나옴)
			
		}
}
