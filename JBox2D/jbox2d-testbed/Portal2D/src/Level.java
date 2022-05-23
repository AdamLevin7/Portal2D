package Portal2D.src;

import java.util.ArrayList;

public class Level {

	/* levelNumber is the int variable.
	 * levelNumber represents the level the game player is on; 
	 * the levelNumber will be from level 1-10
	 */                           
	private int levelNumber;
	ArrayList<Wall> walls;
	
	// This constructor initializes the private instance variable "levelNumber" which is of type int, and is listed and described above                   
	public Level(int levelNumber)                                                                                     
	{
		this.levelNumber = levelNumber;                             
		resetWalls();
	} 

	// this method updates the levelNumber as the level increases
	public void setLevel(int levelNumber)
	{
		this.levelNumber = levelNumber;            
	}                                                                                                                                                                      

	// return walls
	public ArrayList<Wall>getWalls()
	{
		return walls;            
	}                                                                                                                                                                      
	
	//this method increases the level by calling "setLevel" if the game is won
	public int levelUp(boolean isOne)
	{
		if(isOne == true)
		{                 
			 levelNumber+=1;
		}
		return levelNumber;
	}

	public void resetWalls()
	{
		//double percent = 1.0 - ((levelNumber - 1) * 0.1);
		walls = new ArrayList<>();
		//walls.add(new Wall(200, 400, (int) (1000*percent), (int) (500*percent), true, 0)); // middle bottom
		walls.add(new Wall(200, 400, 1000, 500, true, 0)); // middle bottom
		walls.add(new Wall(0, 200, 250, 400, true, 1)); // left center
		walls.add(new Wall(500, 200, 1000, 400, true, 2)); // right bottom
		walls.add(new Wall(600, 0, 650, 400, false, 3)); // chimney wall
		walls.add(new Wall(0, 0, 2000, 10, false, 4));  //top wall
	}

	public void reset()
	{
		this.levelNumber = 1;
		resetWalls();
	}
}
