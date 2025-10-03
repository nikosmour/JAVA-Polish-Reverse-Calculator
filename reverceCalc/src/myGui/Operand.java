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
	private String number = "";
	private  Boolean isInteger = Boolean.TRUE;
	private ResultPresenter rp;
	private Stack<Float> st;
	public Operand(ResultPresenter rp ,Stack<Float> st) {
		this.rp=rp; this.st=st;
	}
	public void addDigit(char c)
		{
			if ( c!='.'){
				number=number+ c;
				rp.operate(number);

			}
			else if ( isInteger){
				number=number+ c;
				rp.operate(number);
				isInteger=Boolean.FALSE;
			}
			else {
				rp.error("error deyterh teleia ksnaprospathise");
			}
			//number = number*10 + (int)c - (int)'0';
		}
		
		
	
	public void deleteLastDigit(){
		number = (number == null || number.length() == 0)
      ? "" 
      : (number.substring(0, number.length() - 1));
		rp.operate(number);

	}
	public void complete(){
	  //System.out.println("complete");
		st.push(Float.valueOf(number));
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

