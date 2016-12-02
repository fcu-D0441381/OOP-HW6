package fcu.iecs.oop.pokemon;

public class GYM 
{
	public static Player fight(Player...players)
	{
		int[] wins={0,0};
		int i=0,s=0;
		for(i=0;i<3;i++)
		{
			if(players[0].getPokemon()[i].getType()==PokemonType.FIRE&&players[1].getPokemon()[i].getType()==PokemonType.GRASS)
			{
				wins[0]++;
			}
			else if(players[0].getPokemon()[i].getType()==PokemonType.GRASS&&players[1].getPokemon()[i].getType()==PokemonType.WATER)
			{
				wins[0]++;
			}
			else if(players[0].getPokemon()[i].getType()==PokemonType.WATER&&players[1].getPokemon()[i].getType()==PokemonType.FIRE)
			{
				wins[0]++;
			}
			else if(players[1].getPokemon()[i].getType()==PokemonType.FIRE&&players[0].getPokemon()[i].getType()==PokemonType.GRASS)
			{
				wins[1]++;
			}
			else if(players[1].getPokemon()[i].getType()==PokemonType.GRASS&&players[0].getPokemon()[i].getType()==PokemonType.WATER)
			{
				wins[1]++;
			}
			else if(players[1].getPokemon()[i].getType()==PokemonType.WATER&&players[0].getPokemon()[i].getType()==PokemonType.FIRE)
			{
				wins[1]++;
			}
			else				//兩兩相同時
			{
				if(players[0].getPokemon()[i].getCp()>players[1].getPokemon()[i].getCp())
				{
					wins[0]++;
				}
				else if(players[0].getPokemon()[i].getCp()<players[1].getPokemon()[i].getCp())
				{
					wins[1]++;
				}
				else
				{
					s=(int)(Math.random()*10);
					if(s>=5)
					{
						wins[0]++;
					}
					else
					{
						wins[1]++;
					}
				}
			}
		}
		if(wins[0]>wins[1])
		{
		players[0].setLevel(players[0].getLevel()+1);
		System.out.println("Winner is ["+players[0].getPlayerName()+"], and his/her level becomes ["+players[0].getLevel()+"].");
		return players[0];
		}
		else
		{
		players[1].setLevel(players[1].getLevel()+1);
		System.out.println("Winner is ["+players[1].getPlayerName()+"], and his/her level becomes ["+players[1].getLevel()+"].");
		return players[1];
		}
	}
	
}
