package fcu.iecs.oop.pokemon;

public class Pokemon {
		private String name=new String();
		private PokemonType type;
		private int cp;
		public String getName() {
			return name;
		}
		public PokemonType getType() {
			return type;
		}
		public int getCp() {
			return cp;
		}
		public void setCp(int cp) {
			this.cp = cp;
		}
		Pokemon(String a,PokemonType b,int c)
		{
			this.name=a;
			this.type=b;
			this.cp=c;
		}
}
