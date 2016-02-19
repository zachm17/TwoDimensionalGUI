package shoe.view;

import javax.swing.JFrame;

import shoe.controller.TwoDController;



public class TwoDFrame extends JFrame
{
	private TwoDController baseController;
	private TwoDPanel basePanel;
	
	public TwoDFrame(TwoDController baseController)
	{
		this.baseController = baseController;
		basePanel = new TwoDPanel(baseController);
		setupFrame;
	}

	
	private void setupFrame()
	{
		this.setSize(500, 500);
		this.setContentPane(basePanel);
		this.setTitle("HAHAH");
		this.setVisible(true);
		this.setResizable(false);
		
	}
}
