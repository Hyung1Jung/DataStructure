package lab1_5;

public class Circle {
	// private���� ���� radius ����
	private int radius;

	// �������� 1�� �ʱ�ȭ�ϴ� ������ ����
	public Circle() {
		this.radius = 1;
	}

	// �������� �Ű������� �޾� �ʱ�ȭ�ϴ� ������ ����
	public Circle(int radius) {
		this.radius = radius;
	}

	// ������ getter/setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// ������ ���ϴ� �޼ҵ�
	public double area() {
		return radius * radius * 3.14;
	}

	// ������ ������ ���ڿ��� ����
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_5 : ������\n");
		// �������� 2�� �ʱ�ȭ �ϴ�circle1�� 1�� 4������ � ������ ���������� �ʱ�ȭ �ϴ� circle2 ����
		Circle circle1 = new Circle(2);
		Circle circle2 = new Circle((int) (Math.random() * 4) + 1);
		// �� ���� ������ ���
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		// �� ���� �������� ���������� ���� ���
		System.out.println(circle1.equals(circle2));
		// �� ���� hashCode ���
		System.out.println(circle1.hashCode());
		System.out.println(circle2.hashCode());
		// �� ���� ���� ���
		System.out.println(circle1.area());
		System.out.println(circle2.area());

	}

	// equals/hashCode �������̵� - �������� �����ϸ� ������ ��ü�� ����
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
