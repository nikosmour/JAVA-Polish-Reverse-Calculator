package myGui;
import java.awt.TextField;
import java.util.*;
public class ResultPresenter implements Praxeis {
	private Stack <Integer> st;
	private TextField display;
	public ResultPresenter(Stack <Integer> st) {
		this.st=st;
		
	}
	void error(String x){
		display.setText(x);
	}
	public void operate(){
		//System.out.println(Calc.st.peek().toString());
		if (st.isEmpty()==false)
			{display.setText(st.peek().toString());}
		else {operate(0);}
	}
	public void operate(int number){
		//System.out.println(""+number);
		display.setText(""+number);
	}
	public void set_display(TextField new_display){
		//System.out.println(""+number);
		display= new_display;
	}
}
