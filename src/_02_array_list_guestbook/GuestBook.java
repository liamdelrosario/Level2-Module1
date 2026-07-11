package _02_array_list_guestbook;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import _01_array_list_visualizer.data.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class GuestBook implements ActionListener {
	JButton addName; 
	JButton viewNames; 
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList<String> list = new ArrayList<String>();
	
	JPanel panel = new JPanel();
	public void run() {
		
		JFrame frame = new JFrame("");
		frame.add(panel);
		frame.setSize(580, 420);
		addName =new JButton("Add Name");
		viewNames = new JButton("View Names");
		panel.add(addName);
		panel.add(viewNames);
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GuestBook().run();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton buttonPressed = (JButton) e.getSource();	
		if(addName==buttonPressed) {
			System.out.println("Yeah I did wrote it in Github");
			String input = JOptionPane.showInputDialog("Enter a new input");
			list.add(input);
		
		}
		if(viewNames==buttonPressed) {
			System.out.println("this works");	
			for(int i=0; i<list.size(); i++) {
				String s= list.get(i);
				int o =i+1;
				System.out.println("Guest #"+o+": "+s);
			}
		}
	}
}
