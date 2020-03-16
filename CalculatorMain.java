package calculator;
/*
 * Name:		Tyler Blanchard
 * Date:		9/21/2018
 * 
 * Description:		This program uses a model view controller to implement a
 * 					calculator that adds, subtracts, multiples, and divides numbers.
 * 					It also can tell if you divided by a zero.
 */
public class CalculatorMain {

	public static void main(String[] args) {
		// create a model, view, and controller
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		new CalculatorController(model, view);
		

	}

}
