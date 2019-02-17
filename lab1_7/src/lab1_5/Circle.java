package lab1_5;

public class Circle {
	// private형인 변수 radius 생성
	private int radius;

	// 반지름을 1로 초기화하는 생성자 생성
	public Circle() {
		this.radius = 1;
	}

	// 반지름을 매개변수로 받아 초기화하는 생성자 생성
	public Circle(int radius) {
		this.radius = radius;
	}

	// 반지름 getter/setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 면적을 구하는 메소드
	public double area() {
		return radius * radius * 3.14;
	}

	// 반지름 정보를 문자열로 리턴
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_5 : 정형일\n");
		// 반지름을 2로 초기화 하는circle1과 1과 4사이의 어떤 정수를 반지름으로 초기화 하는 circle2 생성
		Circle circle1 = new Circle(2);
		Circle circle2 = new Circle((int) (Math.random() * 4) + 1);
		// 두 원의 반지름 출력
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		// 두 원의 반지름이 동일한지의 여부 출력
		System.out.println(circle1.equals(circle2));
		// 두 원의 hashCode 출력
		System.out.println(circle1.hashCode());
		System.out.println(circle2.hashCode());
		// 두 원의 면적 출력
		System.out.println(circle1.area());
		System.out.println(circle2.area());

	}

	// equals/hashCode 오버라이드 - 반지름이 동일하면 동일한 객체로 간주
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}

}
