package shoe.controller;

import shoe.model.Shoe;
import shoe.view.TwoDFrame;
import java.awt.Color;

public class TwoDController
{
	private TwoDFrame baseFrame;
	private Shoe [][] myShoes;
	
	public TwoDController()
	{
		myShoes = new Shoe[2][2];
		setupArray();
		baseFrame = new TwoDFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void setupArray()
	{
		for(int row = 0; row < myShoes.length; row++)
		{
			for(int col = 0; col < myShoes[0].length; col++)
			{
				myShoes[row][col] = new Shoe();
				if(col % 2 == 0)
				{
					myShoes[row][col].setSizeOfShoes(col + 5);
				}
				else
				{
					myShoes[row][col].setShoeColor(Color.WHITE);
				}
			}
		}
	}
	
	public Shoe [][] getMyShoes()
	{
		return myShoes;
	}
	
	
}
