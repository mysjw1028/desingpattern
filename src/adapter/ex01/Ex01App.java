package adapter.ex01;

import adapter.lib.Email;

public class Ex01App {

	public static void main(String[] args) {
		CustomerService cs = new CustomerService(new Email());
		// Email만 갈아서 만들면 된다. 메세지 통신이나 다른것으로 갈아 끼운다
		cs.acceptClaim("맘에 안들어");
	}
}
