import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
class calculator{
	String sin, value, sout, input, choice;
	int i, output;
	
		calculator(){
		Frame mainWindow = new Frame("MyCalculator");
		Panel panel = new Panel();
		GridLayout grid= new GridLayout(4,4,10,20);
		TextField display= new TextField(20);
		panel.setLayout(grid);
		
		mainWindow.setSize(300,300);  
		mainWindow.setLayout(new FlowLayout());  
		mainWindow.setVisible(true);
		
		Button b0 = new Button("0");
		b0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sin = display.getText();
				value = "0";
				sout = sin+value;
				display.setText(sout);
			}
		});
		Button b1 = new Button("1");
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sin = display.getText();
				value = "1";
				sout = sin+value;
				display.setText(sout);
			}
		});
		Button b2 = new Button("2");
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sin = display.getText();
				value = "2";
				sout = sin+value;
				display.setText(sout);
			}
		});
		Button b3 = new Button("3");
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sin = display.getText();
				value = "3";
				sout = sin+value;
				display.setText(sout);
			}
		});
		Button b4 = new Button("4");
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sin = display.getText();
				value = "4";
				sout = sin+value;
				display.setText(sout);
			}
		});
		Button b5 = new Button("5");
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sin = display.getText();
				value = "5";
				sout = sin+value;
				display.setText(sout);
			}
		});
		Button b6 = new Button("6");
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sin = display.getText();
				value = "6";
				sout = sin+value;
				display.setText(sout);
			}
		});
		Button b7 = new Button("7");
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sin = display.getText();
				value = "7";
				sout = sin+value;
				display.setText(sout);
			}
		});
		Button b8 = new Button("8");
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sin = display.getText();
				value = "8";
				sout = sin+value;
				display.setText(sout);
			}
		});
		Button b9 = new Button("9");
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sin = display.getText();
				value = "9";
				sout = sin+value;
				display.setText(sout);
			}
		});
		Button bAdd = new Button("+");
		bAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sin = display.getText();
				value = "+";
				sout = sin+value;
				display.setText(sout);
				choice = "+";
			}
		});
		Button bSub = new Button("-");
		bSub.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sin = display.getText();
				value = "-";
				sout = sin+value;
				display.setText(sout);
				choice = "-";
			}
		});
		Button bMul = new Button("*");
		bMul.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sin = display.getText();
				value = "*";
				sout = sin+value;
				display.setText(sout);
				choice = "*";
			}
		});
		Button bDiv = new Button("/");
		bDiv.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sin = display.getText();
				value = "/";
				sout = sin+value;
				display.setText(sout);
				choice = "/";
			}
		});
		Button bEqual = new Button("=");
		bEqual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				input = display.getText();
				//List<Integer> arr= new ArrayList<Integer>();
				int arr[]=new int[2];
				Pattern p=Pattern.compile("\\d+");
				Matcher m= p.matcher(input);
				for(int i=0;m.find();i++){
					arr[i]=Integer.valueOf(m.group());
				}
				
				if(choice=="+")
				{
					/*
					for(int i: arr){
						output = output+i;
					}
					*/
					output=arr[0]+arr[1];
					display.setText(Integer.toString(output));
				}
				if(choice=="-")
				{
					/*
					for(int i: arr){
						output = output-i;
						display.setText(Integer.toString(i));
					}
					*/
					output=arr[0]-arr[1];
					display.setText(Integer.toString(output));
				}
				if(choice=="*")
				{
					/*
					for(int i: arr){
						output = output*i;
					}
					*/
					output=arr[0]*arr[1];
					display.setText(Integer.toString(output));
				}
				if(choice=="/")
				{
					/*
					for(int i: arr){
						output = output/i;
					}
					*/
					output=arr[0]/arr[1];
					display.setText(Integer.toString(output));
				}
			}
		});
		
		
		panel.add(b0);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(bAdd);
		panel.add(bSub);
		panel.add(bMul);
		panel.add(bDiv);
		panel.add(bEqual);
		
		mainWindow.add(display);
		mainWindow.add(panel);
		
		mainWindow.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public static void main(String args[]){
	calculator cal = new calculator();
	}
}