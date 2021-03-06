package application;

public class Player {
	
	String name;
	boolean turn;
	int points;
	
	/**
	 * Der Spieler Name wird festgehalten und ob er am Zug ist.
	 * 
	 * @param playerName=Spieler Name
	 * @param isTurn=Wenn der Spieler dran ist, dann ist Wahr
	 */
	public Player(String playerName, boolean isTurn){
		turn=isTurn;
		name=playerName;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isTurn() {
		return turn;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}
	/**
	 * Die derzeitig erhaltenen Punkte, werden gesetzt.
	 */
	public void setPoint(){
		points++;
	}
	public int getPoints(){
		return points;
	}

}
