package fcu.iecs.oop.pokemon;

public class Player {
	private String playerName=new String();
	private Pokemon pokemon[];
	private int level=1;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}	
	public Pokemon[] getPokemon() {
		return pokemon;
	}
	public void setPokemon(Pokemon[] pokemon) {
		this.pokemon = pokemon;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	Player(String a)
	{
	 this.playerName=a;
	}
}
