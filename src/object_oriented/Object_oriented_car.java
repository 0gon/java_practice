package object_oriented;

import java.lang.reflect.Constructor;

public class Object_oriented_car {
	public static void main(String[] args) {
		
		//일반적인 코딩
		Car car = new Car();
		car.setVelocity(10);
		
		//속도가 10보다 낮으면 속도 20으로 증가시키기
		if(car.getVelocity()<10) {
			car.setVelocity(20);
		}
		
		//객체지향적인 코딩
		//속도가 10보다 낮으면 20으로 증가시키는 메소드를 생성
		Car_oriented car2 = new Car_oriented(5);
		car2.levelUpVelocity();
		
		// 이렇게 함으로써 객체 내부의 변수값을 노출시키지 않을 수 있음 
		
		
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
		return "현재 차 속도: "+this.velocity;
	}
	
}