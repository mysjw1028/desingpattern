package proxy;

public class ProxyServer implements Server {

	private BlogServer server;// 본코드가 아니라서 크게 신경을 안써도 된다.

	public ProxyServer(BlogServer server) {
		this.server = server;
	}

	@Override
	public void request() {
		System.out.println("json을 자바 오브젝트로");
		server.request();//내부적으로 심어져 있다 -> 다만 안보인다.
		System.out.println("자바오브젝트를 json으로");
	}

}
