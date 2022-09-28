package sec2;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Smartphone extends Dmbphone {
	String appName;
	
	public void appStart (String appName){
		System.out.println(appName+"을 시작합니다.");
	}
	public void appEnd (String appName){
		System.out.println(appName+"을 종료합니다.");
	}
}
