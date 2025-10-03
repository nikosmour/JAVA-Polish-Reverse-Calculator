package myGui;
import java.util.*;

public class Calc {
	
	public Calc() {
		// TODO Auto-generated method stub
		Stack<Integer> st= new Stack<Integer>();
		ResultPresenter rp = new ResultPresenter(st);
		Operand op = new Operand(rp,st);
		Adder add =new Adder(st);
		Subtracter sub = new Subtracter(st);
		Multiplier mul = new Multiplier(st);
		Divider div = new  Divider(st);
		 new MyCalculatorGui(op,add ,sub,mul,div,rp);//MyCalculatorGui cg =new MyCalculatorGui(op,add ,sub,mul,div,rp)
		
	}
}
