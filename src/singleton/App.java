package singleton;

public class App {

	public static void main(String[] args) {
		President p1 = President.getInstance();//기존의 스테이틱이 뜨고 나머지 안뜨게 하는거 -> 싱글톤
		//System.out.println(p1.getName);
		//getter만들어서 테스트
	}

}
