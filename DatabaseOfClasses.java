import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;


public class DatabaseOfClasses {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatabaseOfClasses window = new DatabaseOfClasses();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DatabaseOfClasses() {
		initialize();  
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 714, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(27, 57, 580, 244);
		frame.getContentPane().add(list);
		
		JLabel lblListOfAvailable = new JLabel("List of Available Classes:");
		lblListOfAvailable.setBounds(25, 29, 157, 16);
		frame.getContentPane().add(lblListOfAvailable);
		
		JButton btnAddSelectedClasses = new JButton("Add Selected Classes");
		btnAddSelectedClasses.setBounds(25, 323, 206, 63);
		frame.getContentPane().add(btnAddSelectedClasses);
	}
}
