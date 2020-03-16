package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	
	CalculatorModel model;
	CalculatorView view;
	
	// constructor for view and the model and recognizes button clicks
	public CalculatorController(CalculatorModel model, CalculatorView view) {
		
		this.model = model;
		this.view = view;
		
		// listener for addition button
		view.getAddBtn().addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				
				// set the A's and the B's values
				model.setA( Double.parseDouble( view.getInputTF1().getText() ));
				model.setB( Double.parseDouble( view.getInputTF2().getText() ));
				
				// shows the results of adding
				view.setText(model.sum(model.getA(), model.getB()));
			}
		});
		
		// listener for division button
		view.getDiviBtn().addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				
				// set the A's and the B's values
				model.setA( Double.parseDouble( view.getInputTF1().getText() ));
				model.setB( Double.parseDouble( view.getInputTF2().getText() ));
				
				// shows the results of dividing
				view.setText(model.div(model.getA(), model.getB()));
				
				// if dividing by 0 make it equal -1
				if (model.getB() == 0.0) {
					view.setText(-1);
				}
			}
		});
		
		// listener for multiplication button
		view.getMultBtn().addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				
				// set the A's and the B's values
				model.setA( Double.parseDouble( view.getInputTF1().getText() ));
				model.setB( Double.parseDouble( view.getInputTF2().getText() ));
				
				// shows the results of multiplying
				view.setText(model.mul(model.getA(), model.getB()));
			}
		});

		// listener for subtraction button
		view.getSubtBtn().addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e) {
				
				// set the A's and the B's values
				model.setA( Double.parseDouble( view.getInputTF1().getText() ));
				model.setB( Double.parseDouble( view.getInputTF2().getText() ));
				
				// shows the results of subtracting
				view.setText(model.sub(model.getA(), model.getB()));
			}
		} );
	}

}
