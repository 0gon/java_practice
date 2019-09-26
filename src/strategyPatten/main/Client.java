package strategyPatten.main;

import strategyPatten.model.Atom;
import strategyPatten.model.TaekwonV;
import strategyPatten.strategyImpl.FlyingStrategy;
import strategyPatten.strategyImpl.MissileStrategy;
import strategyPatten.strategyImpl.PunchStrategy;
import strategyPatten.strategyImpl.WalkingStrategy;

public class Client {
	public static void main(String[] args) {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		
		taekwonV.setMovingStrategy(new WalkingStrategy());
		taekwonV.setAttackStrategy(new MissileStrategy());
		
		atom.setMovingStrategy(new FlyingStrategy());
		atom.setAttackStrategy(new PunchStrategy());
		
		System.out.println("my name is "+taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();
		
		System.out.println();
		
		System.out.println("my name is "+ atom.getName());
		atom.move();
		atom.attack();
		
		
	}
}

