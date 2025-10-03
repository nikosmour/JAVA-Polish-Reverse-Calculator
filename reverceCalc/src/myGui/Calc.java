package myGui;
import java.util.*;

public class Calc {
	
	public Calc() {
		// TODO Auto-generated method stub
		Stack<Float> st= new Stack<Float>();
		ResultPresenter rp = new ResultPresenter(st);
		Operand op = new Operand(rp,st);
		Adder add =new Adder(rp,st);
		Subtracter sub = new Subtracter(rp,st);
		Multiplier mul = new Multiplier(rp,st);
		Divider div = new  Divider(rp,st);
		 new MyCalculatorGui(op,add ,sub,mul,div,rp);//MyCalculatorGui cg =new MyCalculatorGui(op,add ,sub,mul,div,rp)
		
	}
}
