package object_oriented;

import java.lang.reflect.Constructor;

public class Object_oriented_car {
	public static void main(String[] args) {
		
		//�Ϲ����� �ڵ�
		Car car = new Car();
		car.setVelocity(10);
		
		//�ӵ��� 10���� ������ �ӵ� 20���� ������Ű��
		if(car.getVelocity()<10) {
			car.setVelocity(20);
		}
		
		//��ü�������� �ڵ�
		//�ӵ��� 10���� ������ 20���� ������Ű�� �޼ҵ带 ����
		Car_oriented car2 = new Car_oriented(5);
		car2.levelUpVelocity();
		
		// �̷��� �����ν� ��ü ������ �������� �����Ű�� ���� �� ���� 
		
		
	}
}

class Car {
	private int velocity;

	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	
}

class Car_oriented{

	private int velocity;
	
	public Car_oriented(int velocity) {
		this.velocity=velocity;
	}
	
	public void levelUpVelocity() {
		if(this.velocity<10) {
			this.velocity=20;
		}
	}
	
	@Override
	public String toString() {
		return "���� �� �ӵ�: "+this.velocity;
	}
	
}