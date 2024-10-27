import java.util.Random;
import java.util.Scanner;
/*
 * GreedIsland is the Dungeon/DaisyChain/CLL
 * 
 */
public class GreedIsland {
	
	private Room head;
	private Room tail;
	private int size;
	
	
	public GreedIsland() {
		head = new Room();
		size = 0;
		
	}


	public GreedIsland(Room Top, Room Back, int theSize) {
		Top = head;
		Back = tail;
		theSize = size;
	}
	
	public Room getHead() {
		return head;
	}
	
	public Room tail() {
		return tail;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setHead(Room head) {
		this.head = head;
	}


	public void setTail(Room tail) {
		this.tail = tail;
	}


	public void setSize(int size) {
		this.size = size;
	}

	public void addFront(String value) {
		Room newRoom = new Room(size, tail, head);
        if (head == null) {
            head = newRoom;
            newRoom.setNext(head);
            newRoom.setPrev(head);
        } else {
            Room tail = head.getPrev(); 
            newRoom.setNext(head); 
            newRoom.setPrev(tail);
            tail.setNext(newRoom); 
            head.setPrev(newRoom); 
            head = newRoom; 
        }
        size++;
		
	}
	
	public void addEnd(Room value) {
        Room newBox = new Room(size, value, null);
        if (head == null) {
            head = newBox;
            newBox.setNext(head);
            newBox.setPrev(head);
        } else {
            Room tail = head.getPrev(); 
            tail.setNext(newBox); 
            newBox.setPrev(tail); 
            newBox.setNext(head); 
            head.setPrev(newBox); 
        }
        size++;
    }
	
	public void addAtIndex(int index, String value) {
        if(index < 0) {
        	System.out.println("Index has to be above 0");
        }
        if (index == 0) {
            addFront(value);
            return;
        }
        Room newRoom = new Room(index, tail, head);
        Room temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }
        newRoom.setNext(temp.getNext()); 
        newRoom.setPrev(temp);
        temp.setNext(newRoom); 
        newRoom.getNext().setPrev(newRoom); 
        size++;
    }
	
	
	public int removeFront() {
		
        if (head == null) {
            System.out.println("There is nothing to remove.");
            return 0;
        }
        int removedData = head.getData();
        if (head.getNext() == head) { 
            head = null;
        } else {
            Room tail = head.getPrev(); 
            head = head.getNext(); 
            tail.setNext(head); 
            head.setPrev(tail); 
        }
        size--;
        return removedData;
    }
	
	public int removeEnd() {
		
        if (head == null) {
            System.out.println("There is nothing to remove");
            return 0;
        }
        
        int removedData;
        if (head.getNext() == head) { 
            removedData = head.getData();
            head = null; 
        } else {
            Room tail = head.getPrev(); 
            removedData = tail.getData();
            tail.getPrev().setNext(head); 
            head.setPrev(tail.getPrev()); 
        }
        size--;
        return removedData;
    }
	
	public int removeAtIndex(int index) {
		
        if (index < 0) {
            System.out.println("The index doesn't exist");
            return 0;
        }
        if (index == 0) {
            return removeFront();
        }
        Room curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        int removedData = curr.getData();
        curr.getPrev().setNext(curr.getNext()); 
        curr.getNext().setPrev(curr.getPrev()); 
        if (curr == head) {
            head = curr.getNext();
        }
        size--;
        return removedData;
    }
	
	public boolean replace(int index, int newValue) {
        if (index < 0) {
            return false;
        }
        Room curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        curr.setData(newValue); 
        return true;
    }
	
	public void clear() {
		head = null;
		size = 0;
			
	}
	
	public Room get(int index) {
        if (index < 0) {
            return null;
        }
        Room curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        return curr;
    }
	
	public boolean contains(int check) {
	    Room curr = head;
	    if (curr == null) {
	    	return false; 
	    }
	    while (curr != null) {
	        if (curr.getData() == (check)) {
	            return true; 
	        }
	    }
	    return false; 
	}
	
	public void makeDungeon(int roomAmount) {
		
		Random ran = new Random();
		Room firstRoom = new ExitCard();
		head = firstRoom;
		Room currRoom = firstRoom;
		
		
		for(int i = 0; i < roomAmount; i++) {
			Room newRooms = null;
			Villains newVillain = null;
			int randomRoom = ran.nextInt(7);
			
			if(randomRoom == 0) {
				newRooms = new TrapCards(ran.nextInt(8) + 1, ran.nextInt(5) + 1, ran.nextInt(5) + 1, ran.nextInt(5) +1);
			}
			if(randomRoom == 1) {
				newRooms = new ItemCards(ran.nextInt(8) + 1, ran.nextInt(5) + 1, ran.nextInt(5) + 1, ran.nextInt(5) +1);
			}
			if(randomRoom == 2) {
				newVillain = new Chrollo();
				newRooms = new BattleRoom(newVillain);
			}
			if(randomRoom == 3) {
				newVillain = new Hisoka();
				newRooms = new BattleRoom(newVillain);
			}
			if(randomRoom == 4) {
				newVillain = new Muerem();
				newRooms = new BattleRoom(newVillain);
			}
			if(randomRoom == 5) {
				newVillain = new Grunt();
				newRooms = new BattleRoom(newVillain);
			}
			if(randomRoom == 6) {
				newRooms = new ExitCard();
			}
			
			if(newRooms != null) {
				currRoom.setNext(newRooms);
				currRoom = newRooms;
			}
			
		}	
		
	}
	
	
	
	public void run() {
		Scanner sc = new Scanner(System.in);
	    Random ran = new Random();
	    GreedIsland island = new GreedIsland();
	    Hunter hunter = new Hunter();
	    int roomAmount = ran.nextInt(5) + 5;
	    
	    makeDungeon(roomAmount); 

	    Room currentRoom = head; 
	    while (currentRoom != null && hunter.health()) {
	       
	        currentRoom.Play(hunter);
	        System.out.println("What do you want to do?");
	        System.out.println("1. Go to the next room");
	        System.out.println("2. Check your stats");
	        System.out.println("3. Exit the game");

	        int choice = sc.nextInt();
	        if (choice == 1) {
	            currentRoom = currentRoom.getNext(); 
	            if (currentRoom == null) {
	                System.out.println("You've reached the end of Greed Island!");
	            }
	        } else if (choice == 2) {
	            System.out.println("Health: " + hunter.getHP());
	            System.out.println("Attack: " + hunter.getAttack());
	            System.out.println("Defense: " + hunter.getDefense());
	            System.out.println("Speed: " + hunter.getSpeed());
	        } else if (choice == 3) {
	            System.out.println("You have Quit the game...");
	            sc.close();
	            return;
	        } else {
	            System.out.println("You have not selected one of the 3 choices. Please pick choice 1, 2, or 3.");
	        }
	        if (currentRoom instanceof ExitCard) {
	            System.out.println("You have now exited Greed Island");
	            island.makeDungeon(roomAmount);
	            break; 
	        }
	        if (!hunter.health()) {
		        System.out.println("You have been defeated. Game over!");
		    }
	    }

	    if (!hunter.health()) {
	        System.out.println("You have been defeated. Game over!");
	    }
	}

}
