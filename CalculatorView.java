package calculator;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class CalculatorView extends Frame {
	private TextField inputTF1;	// you will have to check the values of these text field
	private TextField inputTF2;	// and use them with the model
	private Label resultLabel;		// update this to update the result shown
	
	// buttons as variables
	private Button addBtn;
	private Button subtBtn;
	private Button multBtn;
	private Button diviBtn;

	// setting up button implementations
	public CalculatorView() {

		// Setup Frame
		setSize(300,200);	// size of window
		setLayout(null);	// no layout is required for this
		setVisible(true);	// a visible window

		// Text Field Labels
		Label opLabel1 = new Label("Op 1:");	// a label, which just present text
		opLabel1.setBounds(25,50,50,25);		// the location and size of the label (x, y, size_x, size_y)

		Label opLabel2 = new Label("Op 2:");
		opLabel2.setBounds(25,75,50,25);

		Label resultTextLabel = new Label("Result:");
		resultTextLabel.setBounds(25,125,50,25);

		resultLabel = new Label("Press the operation buttons to calculate.");
		resultLabel.setBounds(25,150,250,25);

		// Text Field (a TextField takes in user input)
		inputTF1 = new TextField();			// operand 1
		inputTF1.setBounds(75, 50, 100, 25);
		inputTF2 = new TextField();			// operand 2
		inputTF2.setBounds(75, 75, 100, 25);

		// Display the Buttons at certain points
		addBtn = new Button("+");
		addBtn.setBounds(200,50,50,25);
		subtBtn = new Button("-");
		subtBtn.setBounds(250,50,50,25);
		multBtn = new Button("*");
		multBtn.setBounds(200,100,50,25);
		diviBtn = new Button("/");
		diviBtn.setBounds(250,100,50,25);
		
		// Add to Frame (if you do not add them to the frame, they will not appear)
		add(opLabel1);
		add(opLabel2);
		add(resultTextLabel);
		add(resultLabel);
		add(inputTF1);
		add(inputTF2);
		add(addBtn);
		add(subtBtn);
		add(multBtn);
		add(diviBtn);
	}
	
	// uses the resultLabel to show the calculation
	void setText(double value) {
	
		resultLabel.setText(Double.toString(value));
	}

	// get addition button
	public Button getAddBtn() {
		return addBtn;
	}

	// get subtraction button
	public Button getSubtBtn() {
		return subtBtn;
	}

	// get multiplication button
	public Button getMultBtn() {
		return multBtn;
	}

	// get division button
	public Button getDiviBtn() {
		return diviBtn;
	}

	// get the inputTF1
	public TextField getInputTF1() {
		return inputTF1;
	}

	// get the inputTF1
	public TextField getInputTF2() {
		return inputTF2;
	}
	
	
	

}
