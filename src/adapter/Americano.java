package adapter;

public class Americano implements Coffee {

	private final String NAME = "아메리카노"; // fianl로 한거는 이름 을 대문자로만 해야한다.

	@Override
	public String make() {// 재정의가 된거
		//System.out.println("시럽추가");
		return NAME;
	}
}
