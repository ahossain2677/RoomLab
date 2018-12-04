package Rooms;

import Game.Runner;
import People.Person;

public class TrapRoom extends Room
{

	public TrapRoom(int x, int y) {
		super(x, y);

	}

	@Override
	public void enterRoom(Person x) {

		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You entered a trap room: instant loss");
		Runner.gameOff();
	}
	

}
