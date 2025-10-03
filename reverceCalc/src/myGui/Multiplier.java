package myGui;

import java.util.Stack;

public class Multiplier extends Operator {
	public Multiplier (ResultPresenter rp,Stack<Float> st) {
		super(rp,st);
	}
	public void operate(){
		if (st.size()>1)  st.push(st.pop() * st.pop());
		else if (st.size()==1 ) rp.error("Eiparxei mono enas arithmos sthn stoiba den mporei na ginei h praxh");
		else rp.error("Stack Empty");
	}

}
