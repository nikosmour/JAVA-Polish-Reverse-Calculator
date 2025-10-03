package myGui;

import java.util.Stack;

public class Operand {
	private String number = "";
	private ResultPresenter rp;
	private Stack<Integer> st;
	public Operand(ResultPresenter rp ,Stack<Integer> st) {
		this.rp=rp; this.st=st;
	}
	public void addDigit(char c)
			{
			number=number+ c;
			//number = number*10 + (int)c - (int)'0';
			rp.operate(number);}
		
		
	
	public void deleteLastDigit(){
		number = (number == null || number.length() == 0)
      ? "" 
      : (number.substring(0, number.length() - 1));
		rp.operate(number);

	}
	public void complete(){
	  //System.out.println("complete");
		st.push(Integer.valueOf(number));
		this.clear();
		
	}
	public void clear(){
	  //System.out.println("clear");
		number="";
		rp.operate("0");
		
	}
	
	public void reset(){
	  //System.out.println("reset");
		st.removeAllElements();
		this.clear();
	}
}

