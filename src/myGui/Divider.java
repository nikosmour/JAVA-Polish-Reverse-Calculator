package myGui;

import java.util.Stack;
import java.util.EmptyStackException;
public class Divider extends Operator {
	public Divider(ResultPresenter rp,Stack<Float> st) {
		super(rp,st);
	}
	public void operate(){
		try {
			Float n = st.pop();
			if (n!=0 && st.size() > 0) {st.push( st.pop()/n);}
			else if (n == 0){rp.error("error dia 0,'to  0 diagrafike apo thn stoiba ksnaprospathise"); }//
			else {
				st.push(n);
				rp.error("Eiparxei mono enas arithmos sthn stoiba den mporei na ginei h praxh");
			}
		} catch ( EmptyStackException e) {rp.error("Stack Empty");}
		
	}

}
