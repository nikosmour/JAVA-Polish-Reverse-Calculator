package myGui;

import java.util.Stack;

public class Subtracter extends Operator {
	public Subtracter(ResultPresenter rp,Stack<Integer> st) {
		super(rp,st);
	}
	
	public void operate(){
		if (st.size()>1) st.push(0-st.pop() + st.pop());
		else if (st.size()==1 ) rp.error("Eiparxei mono enas arithmos sthn stoiba den mporei na ginei h praxh");
		else rp.error("Stack Empty");
	}

}
