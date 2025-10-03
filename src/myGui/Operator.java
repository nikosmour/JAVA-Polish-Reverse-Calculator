package myGui;
import java.util.Stack;

public abstract class Operator implements Praxeis{
	protected Stack<Float> st;
	protected ResultPresenter rp; 
	public Operator(ResultPresenter rp,Stack<Float> st2 ){
		this.st= st2;
		this.rp=rp;
	}
}
