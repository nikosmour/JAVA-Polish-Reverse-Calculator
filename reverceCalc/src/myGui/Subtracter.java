package myGui;

import java.util.Stack;

public class Subtracter implements Praxeis {
	private Stack <Integer> st;
	public Subtracter(Stack <Integer> st) {
		this.st=st;
		
	}
	
	public void operate(){
		if (st.size()>1){
			st.push(0-st.pop() + st.pop());
			//CalculatorGui.display.setText(new String(""+Calc.st.peek()));
		}
	}

}
