package ex01;

/*
 * 이 코드 문제점(?)
 * 1. 이 박스에는 사과, 오랜지만 담고싶은데.. 다른것이 담겨도 제어 불가
 * 2. get할 때 형변환 해야한다.(다운케스팅을 해야한다.)
 * */

/* Generic
 * 1. 제네릭을 사용하면 잘못된 타입이 들어올 수 있는 것을 컴파일 단계에서 방지할 수 있다.
 * 2. 클래스 외부에서 타입을 지정해주기 때문에 따로 타입을 체크하고 변환해줄 필요가 없다. 즉, 관리하기가 편하다
 * 3. 비슷한 기능을 지원하는 경우 코드의 재사용성이 높아진다.*/
public class FruitBoxEx01{
	public static void main(String[] args) {	
		Box<Apple> abox = new Box();
		Box<Orange> bbox = new Box();
		
		abox.setObj(new Apple());	// 사과 담음
		bbox.setObj(new Orange());	// 오랜지 담음
		
		Apple ap = abox.getObj();
		Orange op = bbox.getObj();	
		
		System.out.println(ap);
		System.out.println(op);
		
		Box<Integer> cbox = new Box();
		cbox.setObj(10);
		System.out.println(cbox);
	}
}

class Apple {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	public String toString() {
		return "I am an Orange.";
	}
}

class Box<T> {
	private T obj;
	
	void setObj(T obj) {
		this.obj = obj;
	}
	T getObj() {
		return obj;
	}
}


