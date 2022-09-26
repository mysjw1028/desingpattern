package singleton;

public class President {

	private static President instance = new President("윤석열");// heap에 뜬거

	public static President getInstance() {// heap에 접근도 못해서 static을 붙인다.
		return instance;
	}

	private String name;// heap에 뜸

	private President(String name) {// 컨트롤스페이스->생성자
		this.name = name;
	}
	// 변수는 static 공간에 뜨고 name은 heap에뜨고
	// static이 안 붙은거는 heap이다
	// 변수는 다 private
}
