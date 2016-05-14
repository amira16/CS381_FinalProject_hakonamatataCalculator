
//package P;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Shadow;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
//import pproject.calc.show.Stack;
import javafx.scene.layout.Pane;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.text.AttributeSet.CharacterAttribute;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.util.Stack;

import javafx.scene.layout.StackPane;
import javax.script.ScriptEngine;

public class ourproject extends Application
{
	
String num=" ";
TextField tfName = new TextField(" ");


/*  in this function we have number of panes that we use to create our project:
 *  1-pane2->stackpane  (that contains pane1(borderpane)and pane4(stackpane))
 *  2-pane4->stackpane (only have one button(btt))
 *  3-pane1->borderpane
 *  ->in ceneter contains pane(gridpane)
 *  ->in top contains hBox(HBox)and the last contains textfield
 *  4-pane->girdpane
 *  that contains all calaulator button
 *  
 *  
 * @see javafx.application.Application#start(javafx.stage.Stage)
 */
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
// Create a pane and set its properties
StackPane pane2 = new StackPane();
Button btt = new Button("welcom to our calculator");
primaryStage.setFullScreen(false);
primaryStage.setFullScreenExitHint("");;
BorderPane pane1 = new BorderPane();
pane1.setStyle("-fx-background-color: DarkTurquoise;");
GridPane pane = new GridPane();
pane1.setCenter(pane);
HBox hBox = new HBox(15);

tfName.setPrefWidth(280);
tfName.setPrefHeight(50);
tfName.setStyle("-fx-background-color: AliceBlue;");
//tfName.textProperty().bind(Bindings.format("%.0f", value));
hBox.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
hBox.getChildren().add(tfName);
pane1.setTop(hBox);
pane.setPadding(new Insets(0, 12.5, 13.5, 14.5));
pane.setHgap(5.5);
pane.setVgap(5.5);
hBox. requestFocus();
// Place nodes in the pane
Button bt7 = new Button("7");
bt7.setPrefWidth(40);
bt7.setPrefHeight(10);
pane.add(bt7, 0, 1);
bt7.setOnAction(e->
{
num+=7;
tfName.setText(num);
}
);
Button bt4 = new Button("4");
bt4.setPrefWidth(40);
bt4.setPrefHeight(10);
pane.add(bt4, 0, 2);
bt4.setOnAction(e->
{
num+=4;
tfName.setText(num);
}
);




Button bt1 = new Button("1");
bt1.setPrefWidth(40);
bt1.setPrefHeight(10);
pane.add(bt1, 0, 3);
bt1.setOnAction(e->
{
num+=1;
tfName.setText(num);
}
);
Button bt0 = new Button(" 0");
bt0.setPrefWidth(40);
bt0.setPrefHeight(10);
pane.add(bt0, 0, 4);
bt0.setOnAction(e->
{
num+=0;
tfName.setText(num);
}
);
Button btπ= new Button("PI");
btπ.setPrefWidth(40);
btπ.setPrefHeight(10);
btπ.setStyle("-fx-base:DarkViolet;");
pane.add(btπ, 0, 5);
btπ.setOnAction(e->
{
num+="PI";
tfName.setText(num);
}
);
Button bt8 = new Button("8");
bt8.setPrefWidth(40);
bt8.setPrefHeight(10);
pane.add(bt8, 1, 1);
bt8.setOnAction(e->
{
num+="8";
tfName.setText(num);
}
);
Button bt5 = new Button("5");
bt5.setPrefWidth(40);
bt5.setPrefHeight(10);
pane.add(bt5, 1, 2);
bt5.setOnAction(e->
{
num+="5";
tfName.setText(num);
}
);
Button bt2 = new Button("2");
bt2.setPrefWidth(40);
bt2.setPrefHeight(10);
pane.add(bt2, 1, 3);
bt2.setOnAction(e->
{
num+="2";
tfName.setText(num);
}
);
Button btpo = new Button(".");
btpo.setPrefWidth(40);
btpo.setPrefHeight(10);
pane.add(btpo, 1, 4);
btpo.setOnAction(e->
{
num+=".";
tfName.setText(num);
}
);
Button btlo = new Button("log");
btlo.setPrefWidth(40);
btlo.setPrefHeight(10);
btlo.setStyle("-fx-base:DarkViolet;");
pane.add(btlo, 1, 5);
btlo.setOnAction(e->
{
	num+="log( ";
	tfName.setText(num);
}
);
Button bt9 = new Button("9");
bt9.setPrefWidth(40);
bt9.setPrefHeight(10);
pane.add(bt9, 2, 1);
bt9.setOnAction(e->
{
num+="9";
tfName.setText(num);
}
);
Button bt6 = new Button("6");
bt6.setPrefWidth(40);
bt6.setPrefHeight(10);
pane.add(bt6, 2, 2);
bt6.setOnAction(e->
{
num+="6";
tfName.setText(num);
}
);
Button bt3 = new Button("3");
bt3.setPrefWidth(40);
bt3.setPrefHeight(10);
pane.add(bt3, 2, 3);
bt3.setOnAction(e->
{
num+="3";
tfName.setText(num);
}
);
Button bt= new Button("%");
bt.setPrefWidth(40);
bt.setPrefHeight(10);
bt.setStyle("-fx-base:DeepPink;");
pane.add(bt, 2, 4);
bt.setOnAction(e->
{
num+=" % ";
tfName.setText(num);
}
);
Button btl = new Button("1/x");
btl.setPrefWidth(40);
btl.setPrefHeight(10);
btl.setStyle("-fx-base:DarkViolet;");
pane.add(btl, 2, 5);
btl.setOnAction(e->
{
	calculate(num);
double c2= 1/new Double(tfName.getText());
tfName.setText(""+c2);}

);
Button btx = new Button("/");
btx.setPrefWidth(40);
btx.setPrefHeight(10);
btx.setStyle("-fx-base:DeepPink;");
pane.add(btx, 3, 1);
btx.setOnAction(e->
{

num+=" / ";
tfName.setText(num);

}
);
Button btM = new Button("*");
btM.setPrefWidth(40);
btM.setPrefHeight(10);
btM.setStyle("-fx-base:DeepPink;");
pane.add(btM, 3, 2);
btM.setOnAction(e->
{
num+=" * ";
tfName.setText(num);
}
);
Button bts = new Button("-");
bts.setPrefWidth(40);
bts.setPrefHeight(10);
bts.setStyle("-fx-base:DeepPink;");
pane.add(bts, 3, 3);
bts.setOnAction(e->
{
num+=" - ";
tfName.setText(num);
}
);
Button btp= new Button("+");
btp.setPrefWidth(40);
btp.setPrefHeight(10);
btp.setStyle("-fx-base:DeepPink;");
pane.add(btp, 3, 4);
btp.setOnAction(e->
{
num+=" + ";
tfName.setText(num);
}
);
Button btsi = new Button("sin");
btsi.setPrefWidth(40);
btsi.setPrefHeight(10);
btsi.setStyle("-fx-base:DarkViolet;");
pane.add(btsi, 3, 5);
btsi.setOnAction(e->
{
	num+="sin( ";
	tfName.setText(num);
}
);
Button btd = new Button("<-");
btd.setPrefWidth(40);
btd.setPrefHeight(10);
btd.setStyle("-fx-base:DeepPink;");
pane.add(btd, 4, 1);
btd.setOnAction(e->
{
num= num.substring(0,num.length()-1);
tfName.setText(num);
}
);
Button btb = new Button("(");
btb.setPrefWidth(40);
btb.setPrefHeight(10);
btb.setStyle("-fx-base:DeepPink;");
pane.add(btb, 4, 2);
btb.setOnAction(e->
{
num+=" ( ";
tfName.setText(num);
}
);
Button bta = new Button("x^2");
bta.setPrefWidth(40);
bta.setPrefHeight(10);
bta.setStyle("-fx-base:DeepPink;");
pane.add(bta, 4, 3);
bta.setOnAction(e->{
	num+=" )^2";
	tfName.setText(num);
}
);
Button bte= new Button("=");
bte.setPrefWidth(40);
bte.setPrefHeight(10);
bte.setStyle("-fx-base:DeepPink;");
pane.add(bte, 4, 4);
bte.setOnAction(e->{
	 calculate(num);num=" ";
});	
	Button btco = new Button("cos");
btco.setPrefWidth(40);
btco.setPrefHeight(10);
btco.setStyle("-fx-base:DarkViolet;");
pane.add(btco, 4, 5);
btco.setOnAction(e->
{
	num+="cos( ";
	tfName.setText(num);
}
);
Button btde = new Button("c");
btde.setPrefWidth(40);
btde.setPrefHeight(10);
btde.setStyle("-fx-base:DeepPink;");
pane.add(btde, 5, 1);
btde.setOnAction(e->
{
num=" ";
tfName.setText(num);
}
);
Button btbs = new Button(")");
btbs.setPrefWidth(40);
btbs.setPrefHeight(10);
btbs.setStyle("-fx-base:DeepPink;");
pane.add(btbs, 5, 2);
btbs.setOnAction(e->
{
num+=" ) ";
tfName.setText(num);
}
);
Button btsq = new Button("√");
btsq.setPrefWidth(40);
btsq.setPrefHeight(10);
btsq.setStyle("-fx-base:DeepPink;");
pane.add(btsq, 5, 3);
btsq.setOnAction(e->
{
	num+="sqrt( ";
	tfName.setText(num);
}
);
Button btf= new Button("n!");
btf.setPrefWidth(40);
btf.setPrefHeight(10);
btf.setStyle("-fx-base:DeepPink;");
pane.add(btf, 5, 4);
btf.setOnAction(e->
{
	num+=" )!";
	tfName.setText(num);
}
);
Button btta = new Button("tan");
btta.setPrefWidth(40);
btta.setPrefHeight(10);
btta.setStyle("-fx-base:DarkViolet;");
pane.add(btta, 5, 5);
btta.setOnAction(e->
{
	num+="tan( ";
	tfName.setText(num);
}
);
pane2.getChildren().add(pane1);
StackPane pane4 = new StackPane();
btt.setPrefWidth(150);
btt.setPrefHeight(10);
btt.setAlignment(Pos.CENTER);
pane4.getChildren().add(btt);
btt.setStyle("-fx-base:DarkViolet;");
pane4.setStyle(
 "-fx-border-color: red; -fx-background-color: DeepPink;");
pane2.getChildren().add(pane4);
//removing stackPane
btt.setOnAction(e ->
{
	pane2.getChildren().remove(pane4);
	
}
);

// Create a scene and place it in the stage
Scene scene = new Scene(pane2);
primaryStage.setTitle("Calculator"); // Set the stage title
primaryStage.setScene(scene); // Place the scene in the stage
primaryStage.show(); // Display the stage
}

/**
 * spacifiy the kide of operation (log operation,sum,mul,.....etc)
 * return type:void
 */
private void calculate(String exp)
{
	double cal = 0;
	exp = exp.replaceAll("PI", ""+Math.PI);
	@SuppressWarnings("rawtypes")
	Stack<Comparable> st = new Stack<Comparable>();
	st.push('(');
	try
	{
		for(int i=0;i<exp.length();i++)
		{
			if(exp.charAt(i)==')') 
			{
				String s = ")";
				while(!st.peek().equals('('))
					s = st.pop() + s;
				s = st.pop() + s;
				if(st.peek().equals('t')) 			//sqrt()
				{
					while(!st.peek().equals('s')) 
						st.pop();st.pop();
					st.push(Math.sqrt(evaluateExp(s)));						
				}
				else if(st.peek().equals('g'))    //log() or lg()
				{
					st.pop();
					if(st.peek().equals('o'))    // log()
					{
						st.pop();st.pop();
						st.push(Math.log10(evaluateExp(s)));	
					}
					else    					//lg()
					{
						st.pop();
						st.push(Math.log10(evaluateExp(s))/Math.log10(2));
					}
				}
				
				else if(st.peek().equals('n'))     //sin or  tan
				{
					st.pop();st.pop();
					if(st.peek().equals('s'))   	//sin
					{
						st.pop();
						st.push(Math.sin(evaluateExp(s)));	
					}
					else if(st.peek().equals('t'))   //tan
					{
						st.pop();
						st.push(Math.tan(evaluateExp(s)));	
					}
				}
				else if(st.peek().equals('s'))   // cos
				{
					st.pop();st.pop();st.pop();
					st.push(Math.cos(evaluateExp(s)));
				}
				else if(exp.charAt(i+1)=='^')    // ()^2
				{
					st.push(Math.pow(evaluateExp(s),2));
					i+=2;
				}
				else if(exp.charAt(i+1)=='!')    // ()!
				{
					BigInteger factorial = new BigInteger("1");
					long last_num = (long) evaluateExp(s);
					for(long k=1; k<= last_num;k++)
						factorial=factorial.multiply(new BigInteger(""+k));
					st.push(factorial);
					i++;
				}
				else
					st.push(evaluateExp(s)); //( + * - / )
			}
			else
				st.push(exp.charAt(i));
		}
	String s = " ) ";
	while(!st.isEmpty())
		s = st.pop() + s;
    cal = evaluateExp(s);
	}
	catch(Exception e)
	{
		tfName.setText("Error");return ;
	}
	if(new Double(cal).isInfinite())
		{tfName.setText(" Infinity");}
	else
		{tfName.setText(" "+cal);}
}


/**
 * take parameter of string type
 * used to idintifiy the piriority of ()
 * 
 * @return
 */
private double evaluateExp(String exp)
{
	boolean contain_operand = true;
	exp = exp.replace("(", "");
   	exp = exp.replace(")", "");
	while(contain_operand)
	{
	 	char last;
	   	double op1=0,op2=0;
	   	exp = exp.replaceAll("  ", " ");
	   	contain_operand = exp.contains(" + ") || exp.contains(" - ") ||
			exp.contains(" * ") || exp.contains(" / ") ||exp.contains(" % ");
	   	if(contain_operand)
	   	{
		   	String[] op = exp.split(" ");
		   	if(op[1].equals("-"))
		   	{
		   		exp = exp.replace(" ", "");
		   		return new Double(exp.substring(0));
		   	}
		   	//handle the first operation
		   	op1 = new Double(op[1]);
		   	last = op[2].charAt(0);
		   	op2 = new Double(op[3]);
		   	//handle and calculate the next operation
		   	for(int i = 4;i<op.length;i++)
		   	{
		   		if(op[i].charAt(0)=='+' || op[i].charAt(0)=='-')
		   		{
		 			switch(last)
		   			{
		   				case'+':op1 += op2; break;
		   				case'-':op1 -= op2; break;
		   				case'*':op1 *= op2; break;
		   				case'/':op1 /= op2; break;
		   				case'%':op1 %= op2; break;
		   			}
		   			op2 = new Double(op[i+1]);
		   			last = op[i].charAt(0);
		   		}
		   		else if(op[i].charAt(0)=='*' || op[i].charAt(0)=='/' || op[i].charAt(0)=='%')
		   		{
		   			if(op[i].charAt(0) == '*')
		   				op2 *= new Double(op[i+1]);
		   			else if(op[i].charAt(0) == '/')
		   				op2 /= new Double(op[i+1]);
		   			else 
		   				op2 %= new Double(op[i+1]);
		   		}
		   	}		    	
		   	//calculate the last operation in priority
		   	switch(last)
			{
				case'+':op1 += op2; break;
				case'-':op1 -= op2; break;
				case'*':op1 *= op2; break;
				case'/':op1 /= op2; break;
				case'%':op1 %= op2; break;
			}		    	
		   	exp = ""+op1;	
		   	}
	     }
		return new Double(exp);
	}


public static void main(String[] args)
{
launch(args);
}

 }