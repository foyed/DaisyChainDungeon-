
public class ExitCard extends Room implements InteractableObjects{
	
	GreedIsland island = new GreedIsland();
	public void Play(int h) {
		System.out.println("You have now exited Greed Island");
		island.makeDungeon(h);
	}

}
