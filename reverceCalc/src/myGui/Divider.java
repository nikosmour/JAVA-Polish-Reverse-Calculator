package myGui;

import java.util.Stack;

public class Divider implements Praxeis {
	private Stack <Integer> st;
	public Divider(Stack <Integer> st) {
		this.st=st;
		
	}
	public void operate(){
		Integer n = st.pop();
		if (n!=0 && st.size() > 0) {st.push( st.pop()/n);}
		else if (n == 0){}//ResultPresenter.error("error dia 0,to 0 sbistike ksnaprospathise"); }
		else st.push(n);
		//CalculatorGui.display.setText(new String(""+Calc.st.peek()));
	}

}
