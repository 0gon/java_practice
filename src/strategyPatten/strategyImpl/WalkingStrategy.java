package strategyPatten.strategyImpl;

import strategyPatten.strategy.MovingStrategy;

public class WalkingStrategy implements MovingStrategy{

	@Override
	public void move() {
		System.out.println("I can only walk");
	}

}
