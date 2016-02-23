package shoe.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import shoe.controller.TwoDController;



public class TwoDPanel extends JPanel
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
		
		this.add(currentShoe);
		this.add(shoeTable);
		this.add(columnField);
		this.add(rowField);
		this.add(editField);
		this.add(changeButton);
		this.setLayout(baseLayout);
	}
	
	private void setuptLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, changeButton, -62, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, changeButton, -43, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, currentShoe, 53, SpringLayout.SOUTH, editField);
		baseLayout.putConstraint(SpringLayout.WEST, currentShoe, 30, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, editField, 84, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, editField, -162, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, columnField, 22, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 97, SpringLayout.EAST, rowField);
		
		
	}
	
	private void setupListeners()
	{
		
	}
	
	}


