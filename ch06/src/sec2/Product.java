package sec2;

public class Product {
	//멤버필드 특정개쳉에 속성값지정하기위해
	//접근제한자/데이터타입/변수명
	
	private String pid;
	private String pname;
	private int amount;
	private int price;
	private String img;
	
	//
	public Product () { }
	public Product (String pid, String pname){ 
		//(String pid, String pname)에  (this.pid = pid;this.pname = pname)값을넣기위해
		this.pid = pid;	
		this.pname = pname;
	}

	public Product(String pid, String pname, int amount, int price) {
		this.pid = pid;
		this.pname = pname;
		this.amount = amount;
		this.price = price;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public int calcMoney(){
		return amount*price;
	}
	public String calcRank(){
		//String grade = "";
		if(price>=100000) return "고가"; 		//리턴대신 grade = "고가";
		else if(price>=50000) return "중저가";	 //		grade="중저가";
		else return "저가";					//else grade = "저가";
											//return grade;
	}
	public void printImg(){
		System.out.println("이미지 : "+img);
	}
	public void PrintProduct(){
		System.out.println("제품아이디 : "+pid);
		System.out.println("제품이름 : "+pname);
		System.out.println("제품수량 : "+amount);
		System.out.println("제품가격 : "+price);
		System.out.println("이미지 : "+img);
	}
}
