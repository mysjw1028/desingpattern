package adapter.ex01;

//고객의 클레임이 들어오면, 
//사과 이메일 보내기,
//이메일 답장을 DB 저장하기

public class CustomerService {

	private EmailSend email;//추상적인것에 의존하게 되었다
		
	public CustomerService(EmailSend email) {
		this.email = email;
	}

	// 부모를 걸어준다
	// 라이브러리가 필요하다 -> mock 가짜 어뎁터 자바에서는 가짜 객체라고 한다.

	public void acceptClaim(String msg) {
		String acceptMsg = msg;
		System.out.println("클레임 내용 : " + acceptMsg);
		sendEmail();
	}// 코드는 나눠서 적어야함 -> 나중에 복잡해질수가 있기 때문에

	public void sendEmail() {// 페이커 어뎁터를 만들어야함
		 String result = email.send();
		 inserResultEmail(result);
	}

	public void inserResultEmail(String result) {
		System.out.println("답장을 디비에 저장했습니다. : 고맙습니다.");
	}
}
