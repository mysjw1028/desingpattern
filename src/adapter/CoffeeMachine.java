package adapter;

public class CoffeeMachine {
	
	public void brew(Coffee coffee) {
		System.out.println(coffee.make());
	}
	
	//1 상속하는 방법 // 다형성이 성립이 안되서 안함
	//2 컴퍼지션 -> 생성자로 주입을 받음 / 지금은 메소드로 받을거임
	
	//brew는 coffee한테 의존한다 -> 전체적으로 커피머신은 커피한테 의존하고 있다.
	// 의존하는 것은 타겟이 2개가 아닌 1개에 의존하는 것이다 
	//구체적인것을 의존하지 않고 추상적인것 1개에 의존한다 -> ocp에 의존하고 DIP 솔리드에 있는거
}
