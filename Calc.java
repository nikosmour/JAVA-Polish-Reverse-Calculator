package myGui;
import java.util.*;;

public class Calc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st= new Stack<Integer>();
		ResultPresenter rp = new ResultPresenter(st);
		Operand op = new Operand(rp,st);
		Adder add =new Adder(rp,st);
		Subtracter sub = new Subtracter(rp,st);
		Multiplier mul = new Multiplier(rp,st);
		Divider div = new  Divider(rp,st);
		 new MyCalculatorGui(op,add ,sub,mul,div,rp);//MyCalculatorGui cg =new MyCalculatorGui(op,add ,sub,mul,div,rp)
		
	}
}
