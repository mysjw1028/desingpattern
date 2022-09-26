package strategy;

public class CafeLatte implements Coffee  {

	private final String NAME = "카페라떼"; // fianl로 한거는 이름 을 대문자로만 해야한다.

	@Override
	public String make() {
		return NAME;
	}
}
