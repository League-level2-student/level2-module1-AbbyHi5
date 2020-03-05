package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {

	static GuestBook guestbook = new GuestBook();
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton add = new JButton("Add guest");
	static JButton view = new JButton("Veiw guests");
	String name = "";
	ArrayList<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		frame.setVisible(true);
		frame.setSize(200,110);
		panel.add(add);
		panel.add(view);
		frame.add(panel);
		guestbook.run();

		
	}
	
	public void run() {
		add.addActionListener(this);
		view.addActionListener(this);
		
	}


	public void actionPerformed(ActionEvent e) {
		
			String button = ((JButton) e.getSource()).getText();
		
			if(button.equals("Add guest")) {
				
				name = "";
				name = JOptionPane.showInputDialog("Add guests name:");
				list.add(name);
				
			}
			else {
				for (int i = 0; i < list.size(); i++) {
					
					System.out.println("Guest #" + (i + 1) + " : " + list.get(i));	
					
				}
			}
		
		
	}
}




















