package p1;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Desktop.Action;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public abstract class AwtControl extends Frame implements ActionListener{
	 
Label l1,l2,l3,l4,l5,l6,l7; 
TextField t1 , t2, t3, t4;
Choice ch1;
Checkbox cb1 , cb2;
CheckboxGroup cbg;
List It;
Button b1, b2; 
Panel p1;
TextArea ta;

@SuppressWarnings("deprecation")
public AwtControl() {
	

setLayout(new GridLayout( 12, 2));
ta = new TextArea(10,20);
l1 = new Label("Student ID ");
l2= new Label ("Name ");
l3 = new Label("College");
l4 = new Label("Department");
l5 = new Label("Gender ");
l6 = new Label("Extra activities");
t1 = new TextField(20);
t2 = new TextField(20);
t3 = new TextField(20);
ch1 = new Choice();
ch1.addItem("CSE");
ch1.addItem("IT");
ch1 .addItem("MCA");
ch1 .addItem("ECE"); 
cbg = new CheckboxGroup();
cb1 = new Checkbox("Male", cbg, true);
cb2 = new Checkbox("Female", cbg, true);
p1 = new Panel();
p1 .add(cb1); 
p1 .add(cb2);
It = new List();
It.addItem("Sports");
It.addItem ("Graph ics");
It.addItem("Mobile Technology");
b1 = new Button("Show");
b1.addActionListener(this);
b2 = new Button("Exit");
b2.addActionListener(this);
add(l1);
add(t1);
add(l2);
add(t2);
add(l3); 
add(t3);
add(l4);
add(ch1); 
add(l5);
add(p1);
add(l6);
add(It);
add(b1);
add(b2);
add(ta);
}

public void actionPerformed(Action e) {
	if(e.getSource()==b2) {
		System.exit(0);
	}
	
	ta.setText("");
	ta.append(t1.getText()+"/n");
	ta.append(t2.getText()+"/n");
	ta.append(t3.getText()+"/n");
	ta.append(ch1.getSelectedItem()+"/n");
	ta.append(cbg.getSelectedCheckbox().getLabel()+"/n");
	ta.append(It.getSelectedItem()+"/n");
	
}
public void windowClosing(WindowEvent e)
{
	dispose();
	System.exit(0);
	
}
public static void main(String[] args) {
	AwtControl control=new AwtControl();
	control.setSize(600,600);
	control.setVisible(true);
}

}