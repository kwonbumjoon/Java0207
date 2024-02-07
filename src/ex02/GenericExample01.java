package ex02;

public class GenericExample01 {
	public static void main(String[] args) {
		// 변수 선언시 동일한 타입으로 호출하고 싶다면 
		// 생성자 호출 시 생성자에는 타입을 명시하지 않고<>만 붙일 수 있다.

		// Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요.";
		String str = box1.content;
		System.out.println(str);
		// Box를 생성할 때 타입 파라미터 T 대신 String으로 대체
		
		// Box<Integer> box2 = new Box<Integer>();
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
		// Box를 생성할 때 타입 파라미터 T 대신 Integer로 대체
	}
}

class Box<T>{
	public T content;
}
