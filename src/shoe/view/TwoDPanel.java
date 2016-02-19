package shoe.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import shoe.controller.TwoDController;



public class TwoDPanel
{

	private TwoDController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentShoe;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	
	private JTable shoeTable;
	
	public TwoDPanel(TwoDController baseController)
	{
	this.baseController = baseController;
	baseLayout = new SpringLayout();
	
	rowField = new JTextField(5);
	columnField = new JTextField(5);
	editField = new JTextField(20);
	currentShoe = new JLabel("the current shoe");
	changeButton = new JButton("change the indicated shoe");
	displayButton = new JButton("Display the indicated shoe");
	
	
	setupPanel();
	setupLayout();
	setupListeners();
	setupTable();
	}
	
	/**
	 *  Helper method to load information from the model into the GUI as a 2D array.
	 */
	
	private void setupTable()
	{
		String [] columnHeaders = {"Column 1", "Column 1", "Column 2"};
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyShoes(), columnHeaders);
		shoeTable = new JTable(tableModel);
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(currentShoe);
		this.add(shoeTable);
		this.add(columnField);
		this.add(rowField);
		this.add(editField);
		this.add(changeButton);
	}
	
	private void setuptLayout()
	{
		
		
		
		
		
		
	}
	
	private void setupListeners()
	{
		
	}
	
	}


