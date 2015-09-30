package characters;

import sports.PoolSport;
import sports.RunningSport;
import exceptions.DrowningException;

public class Peach extends SharedCharacterBehaviour implements PoolSport, RunningSport{

	public Peach() {
	}
	
	public void swim() {
		throw new DrowningException();
	}
	
	public void getWet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void performRun() {
		// TODO Auto-generated method stub
		
	}
}
