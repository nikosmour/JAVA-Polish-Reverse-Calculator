package myGui;

import java.util.Stack;

public class Multiplier implements Praxeis {
	private Stack <Integer> st;
	public Multiplier(Stack <Integer> st) {
		this.st=st;
		
	}
	public void operate(){
		if (st.size()>1){
			st.push(st.pop() * st.pop());
			//CalculatorGui.display.setText(new String(""+Calc.st.peek()));
		}
	}

}
