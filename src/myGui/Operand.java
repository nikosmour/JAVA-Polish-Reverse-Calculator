package myGui;

import java.util.Stack;

public class Operand {
	/*private int number = 0, number2 = 0;
	private  Boolean b = Boolean.TRUE;
	private ResultPresenter rp;
	public Operand(ResultPresenter rp){
		this.rp =rp;
	}
	public void addDigit(char c){
		if ( c!='.' && b)
			{number = number*10 + (int)c - (int)'0';rp.operate(number);}
		else if (c!='.' && b==Boolean.FALSE){
			number2 = number2*10 + (int)c - (int)'0';
			ResultPresenter.error(number + "." + number2);}
		else if (c=='.' && b) {b=Boolean.FALSE; ResultPresenter.error(number + "." + number2);}
		else ResultPresenter.error("error deyterh teleia ksnaprospathise");
		//rp.operate(number + "." + number2);
		
	}
	*/
	private int number = 0;
	private ResultPresenter rp;
	private Stack<Integer> st;
	public Operand(ResultPresenter rp ,Stack<Integer> st) {
		this.rp=rp; this.st=st;
	}
	public void addDigit(char c)
			{number = number*10 + (int)c - (int)'0';
			rp.operate(number);}
		
		
	
	public void deleteLastDigit(){
		number = (number - number % 10)/10;
		rp.operate(number);

	}
	public void complete(){
		st.push(number);
		number=0;
		rp.operate(0);
		
	}
	public void reset(){
		number=0;
		st.removeAllElements();
		rp.operate(0);
	}
}

