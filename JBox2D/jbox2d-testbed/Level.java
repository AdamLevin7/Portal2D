
public class Level {

	/* levelNumber is the int variable.
	 * levelNumber represents the level the game player is on; 
	 * the levelNumber will be from level 1-10
	 */                           
	private int levelNumber;                                                                                                                                                                                                                    
	
	// This constructor initializes the private instance variable "levelNumber" which is of type int, and is listed and described above                   
	public Level(int levelNumber)                                                                                     
	{
		this.levelNumber = levelNumber;                             
	} 

	// this method updates the levelNumber as the level increases
	public void setLevel(int levelNumber)
	{
		levelNumber=levelNumber+0;            
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
}
