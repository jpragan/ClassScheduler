import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.UIManager;


public class Home {

	private JFrame frmStudentAcademicPlanner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmStudentAcademicPlanner.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentAcademicPlanner = new JFrame();
		frmStudentAcademicPlanner.setTitle("Student Academic Planner");
		frmStudentAcademicPlanner.setBounds(100, 100, 601, 600);
		frmStudentAcademicPlanner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentAcademicPlanner.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 458, 589, 12);
		frmStudentAcademicPlanner.getContentPane().add(separator);
		
		JLabel lblFacultyUse = new JLabel("Faculty Use:");
		lblFacultyUse.setBounds(389, 482, 104, 16);
		frmStudentAcademicPlanner.getContentPane().add(lblFacultyUse);
		
		JButton btnAddClass = new JButton("Add Class To Database");
		btnAddClass.setForeground(Color.BLACK);
		btnAddClass.setBackground(Color.ORANGE);
		btnAddClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddToDatabase nw = new AddToDatabase();
				nw.NewScreen();
		
			}
		});
		btnAddClass.setBounds(389, 510, 206, 62);
		frmStudentAcademicPlanner.getContentPane().add(btnAddClass);
		
		JButton btnAddClassTo = new JButton("Add Class To Schedule");
		btnAddClassTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DatabaseOfClasses add = new DatabaseOfClasses();
				add.NewScreen();
				
			}
		});
		btnAddClassTo.setBackground(UIManager.getColor("desktop"));
		btnAddClassTo.setBounds(6, 383, 206, 62);
		frmStudentAcademicPlanner.getContentPane().add(btnAddClassTo);
		
		JLabel lblCurrentSchedule = new JLabel("Current Schedule:");
		lblCurrentSchedule.setBounds(6, 6, 137, 24);
		frmStudentAcademicPlanner.getContentPane().add(lblCurrentSchedule);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(96, 169, 1, 16);
		frmStudentAcademicPlanner.getContentPane().add(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(580, 37, 15, 334);
		frmStudentAcademicPlanner.getContentPane().add(scrollBar);
		
		JList list_2 = new JList();
		list_2.setBounds(6, 37, 589, 334);
		frmStudentAcademicPlanner.getContentPane().add(list_2);
	}
}
