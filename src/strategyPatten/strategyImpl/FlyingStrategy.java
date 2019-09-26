package strategyPatten.strategyImpl;

import strategyPatten.strategy.MovingStrategy;

public class FlyingStrategy implements MovingStrategy{
	@Override
	public void move() {
		System.out.println("I can fly.");
	}

}
