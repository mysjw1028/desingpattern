package proxy;

public class PeoxyApp {

	public static void main(String[] args) {
		// BlogServer s = new BlogServer();
		ProxyServer ps = new ProxyServer(new BlogServer());
		ps.request();
	}
//코드는 같지만 보는 방향이다름 
//	프록시를 보고 타겟이 다르다
}
