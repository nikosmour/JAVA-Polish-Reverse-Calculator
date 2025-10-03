package myGui;
import java.util.Stack;

public abstract class Operator implements Praxeis{
	protected Stack<Integer> st;
	protected ResultPresenter rp; 
	public Operator(ResultPresenter rp,Stack<Integer> st2 ){
		this.st= st2;
		this.rp=rp;
	}
}
