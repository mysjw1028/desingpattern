package adapter;

public class App {

	public static void main(String[] args) {
		CoffeeMachine m = new CoffeeMachine();
		m.brew(new Americano());
		m.brew(new CafeLatte());//캡슐이 생기면 생길수록 계속 생성이 된다.
		m.brew(new Espresso());
		m.brew(new AmericanoAdapter(new Americano()));//데코레이트 패턴이라고 한다
	}
}
