package myGui;
import java.awt.*;
import java.awt.event.*;


public class MyCalculatorGui extends Frame {
	//public Button button0;
	private Button_numberrpn []button_number;
	//private Button_numberrpn button_dot;
	private Button_enter_reset_back button_enter,button_back,button_c,button_ce;
	//private Rectangle [] rec;
	private Button_praxeis button_sum,button_div,button_mul,button_sub,button_ison;
	private TextField display;
	
	public MyCalculatorGui(Operand op,Adder add ,Subtracter sub,Multiplier mul,Divider div,ResultPresenter rp){
		
		
		super("JAVA Polish Reverse Calculator by me");
		final long serialVersionUID = 1L;
		
		this.setLayout(null);
		this.setFont(new Font("Arial Bold", Font.PLAIN, 12) );// To set the font of this container.
		this.setBackground(Color.CYAN); //To set the background color of this component.
		this.setSize(new Dimension(283,297)); //- w=283, h=297
		//To resize this component so that it has width d.width and height d.height.
		this.setLocation(50, 100);// - x = 50, y =100
		//Moves this component to a new location. The top-left corner of the new location is
		//specified by the x and y parameters in the coordinate space of this component's parent.
		this.setVisible(true);//boolean b
		//To show this Window
		this.toFront();
		//If this Window is visible, brings this Window to the front and may make it the focused Window.
		this.setResizable(false);//boolean resizable
		//Sets whether this frame is resizable by the user.
		
		
		button_number=new Button_numberrpn [10];
		button_number[0]=new Button_numberrpn(this,(char) (0 +'0'),op,new Rectangle(65 + 40 , 232 + 33, 35, 28),rp);
		for(int i =1 ;i<button_number.length;i++){
			button_number[i]=new Button_numberrpn(this,(char) (i +'0'),op,new Rectangle(65 + 40 * ((i-1) %3), 232- 33 *((int)((i-1) /3)), 35, 28),rp);
		}
		//button_dot =new Button_numberrpn(this,'.',op,new Rectangle(144, 265, 35, 28 ),rp);
		
		button_enter=new Button_enter_reset_back(this,"enter",op,new Rectangle(204, 100, 56, 28 ),rp);
		button_back=new Button_enter_reset_back(this,"backspace",op,new Rectangle(64, 100, 75, 28 ),rp);
		button_c=new Button_enter_reset_back(this,"C",op,new Rectangle(144, 100, 35, 28  ),rp);
		button_ce=new Button_enter_reset_back(this,"CE",op,new Rectangle(144, 133, 35, 28  ),rp);
		
		button_sum = new Button_praxeis(this,"+",new Rectangle(195, 265,35,28  ),add);
		button_div = new Button_praxeis(this,"/",new Rectangle(195,166, 35, 28 ),div);
		button_mul = new Button_praxeis(this,"*",new Rectangle(195,199, 35, 28  ),mul);
		button_sub = new Button_praxeis(this,"-",new Rectangle(195,232,35,28 ),sub);
		button_ison = new Button_praxeis(this,"=",new Rectangle(235,265, 35, 28  ),rp);
		display = new TextField("0",14);
		this.add(display);
		display.setEditable(false);
		display.setBounds(new Rectangle(13, 55, 257, 30));
		rp.set_display(display);
		
		this.addWindowListener(new CloseWindowAndExit());
	}
}
class CloseWindowAndExit extends WindowAdapter {
	public void windowClosing (WindowEvent closeWindowAndExit){
			System.exit(0);
	}
}

class Button_numberrpn extends Button{
		
	 public Button_numberrpn(Frame frame,char ch,Operand op,Rectangle rec,ResultPresenter rp){
		 	super(new String("" + ch));
			frame.add(this);
			this.setBounds(rec);
			this.setFont(new Font("Arial Bold", Font.PLAIN, 14));
			this.setForeground(Color.red);
			this.setBackground(Color.green);
			this.addActionListener(new ButtonHandlernumber(frame,ch,op,rp));
	 }
}



class Button_enter_reset_back extends Button{
	
	 public Button_enter_reset_back(Frame frame,String str,Operand op,Rectangle rec,ResultPresenter rp){
		 	super(str);
			frame.add(this);
			this.setBounds(rec);
			this.setFont(new Font("Arial Bold", Font.PLAIN, 14));
			this.setForeground(Color.red);
			this.setBackground(Color.green);
			this.addActionListener(new ButtonHandler_enter_reset_back(frame,str,op,rp));
	 }
}

class Button_praxeis extends Button{
	
	 public Button_praxeis(Frame frame,String str,Rectangle rec,Praxeis pr){
		 	super(str);
			frame.add(this);
			this.setBounds(rec);
			this.setFont(new Font("Arial Bold", Font.PLAIN, 14));
			this.setForeground(Color.red);
			this.setBackground(Color.green);
			this.addActionListener(new ButtonHandler_praxeis(frame,pr));
	 }
}

class ButtonHandlernumber implements ActionListener
{	
	Frame frame;
	char x1;
	Operand oper;
	ResultPresenter rpr;
	public ButtonHandlernumber(Frame f,char x,Operand op,ResultPresenter rp)
	{ frame=f; x1=x;oper = op;rpr=rp;}

	public void actionPerformed(ActionEvent pushingButton0)
	{ oper.addDigit(x1);}
}
class ButtonHandler_enter_reset_back implements ActionListener
{	
	Frame frame;
	String str;
	Operand oper;
	ResultPresenter rpr;
	public ButtonHandler_enter_reset_back(Frame f,String str,Operand op,ResultPresenter rp)
	{ frame=f;this.str = str;oper = op;rpr=rp;}

	public void actionPerformed(ActionEvent pushingButton0)
	{ 	if (str == "enter"){
			oper.complete();
		}else if (str == "backspace"){
			oper.deleteLastDigit();
		}else if (str == "C" || str == "CE" ){
			oper.reset();
		}
	}
}

class ButtonHandler_praxeis implements ActionListener
{	
	Frame frame;
	Praxeis pr;
	public ButtonHandler_praxeis(Frame f,Praxeis pr )
	{ frame=f;this.pr = pr;}

	public void actionPerformed(ActionEvent pushingButton0)
	{ 	pr.operate();}
}