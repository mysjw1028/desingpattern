package adapter;

public class AmericanoAdapter implements Coffee {

	private Americano americano;

	public AmericanoAdapter(Americano americano) {
		this.americano = americano;
	}

	@Override
	public String make() {// 아메리카노의 make가 실행이 되야한다
		System.out.println("시럽추가");
		return americano.make();
	}

}
