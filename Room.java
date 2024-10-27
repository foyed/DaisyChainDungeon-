/*
 * Rooms class
 */
public class Room implements InteractableObjects{

	private int data;
	private Room next;
	private Room prev;
	
	public Room() {
		
		data = 0;
		next = null;
		prev = null;
		
	}
	
	public Room(int data, Room next, Room prev) {
	    this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
	public int getData() {
		return data;
		
	}
	
	public void Play(Hunter user) {
        System.out.println("You are entering Greed Island!");
    }
	
	public Room getNext() {
		return next;
	}
	
	public Room getPrev() {
		return prev;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setNext(Room next) {
		this.next = next;
	}

	public void setPrev(Room prev) {
		this.prev = prev;
	}
	
	
	
	
}
