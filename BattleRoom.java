
public class BattleRoom extends Room implements InteractableObjects{
	
	private Villains villain;

    public BattleRoom(Villains villain) {
        this.villain = villain;
    }

    
    public void Play(Hunter h) {
		villain.battleVillain(h);
}

}