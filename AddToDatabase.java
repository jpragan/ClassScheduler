import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AddToDatabase {

	private JFrame frame;
	private JTextField txtClassName;
	private JTextField txtBuilding;
	private JTextField txtInstructor;
	private JTextField txtRoom;
	private JTextField txtStartTime;
	private JTextField txtCredits;
	private JTextField txtEndTime;
	private JTextField txtClassId;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddToDatabase window = new AddToDatabase();
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
	public AddToDatabase() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 723, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
		
				
			}
		});
		btnSubmit.setBounds(6, 368, 192, 58);
		frame.getContentPane().add(btnSubmit);
		
		txtClassName = new JTextField();
		txtClassName.setForeground(Color.LIGHT_GRAY);
		txtClassName.setText("Class Name");
		txtClassName.setToolTipText("Class Name");
		txtClassName.setBounds(24, 49, 134, 28);
		frame.getContentPane().add(txtClassName);
		txtClassName.setColumns(10);
		
		JLabel lblAddClass = new JLabel("Add Classes:");
		lblAddClass.setBounds(24, 21, 153, 16);
		frame.getContentPane().add(lblAddClass);
		
		txtBuilding = new JTextField();
		txtBuilding.setToolTipText("Class Name");
		txtBuilding.setText("Building");
		txtBuilding.setForeground(Color.LIGHT_GRAY);
		txtBuilding.setColumns(10);
		txtBuilding.setBounds(170, 89, 134, 28);
		frame.getContentPane().add(txtBuilding);
		
		txtInstructor = new JTextField();
		txtInstructor.setToolTipText("Class Name");
		txtInstructor.setText("Instructor");
		txtInstructor.setForeground(Color.LIGHT_GRAY);
		txtInstructor.setColumns(10);
		txtInstructor.setBounds(170, 49, 134, 28);
		frame.getContentPane().add(txtInstructor);
		
		txtRoom = new JTextField();
		txtRoom.setToolTipText("Class Name");
		txtRoom.setText("Room #");
		txtRoom.setForeground(Color.LIGHT_GRAY);
		txtRoom.setColumns(10);
		txtRoom.setBounds(316, 89, 134, 28);
		frame.getContentPane().add(txtRoom);
		
		txtStartTime = new JTextField();
		txtStartTime.setToolTipText("Class Name");
		txtStartTime.setText("Start Time");
		txtStartTime.setForeground(Color.LIGHT_GRAY);
		txtStartTime.setColumns(10);
		txtStartTime.setBounds(316, 49, 134, 28);
		frame.getContentPane().add(txtStartTime);
		
		txtCredits = new JTextField();
		txtCredits.setToolTipText("Class Name");
		txtCredits.setText("Credits");
		txtCredits.setForeground(Color.LIGHT_GRAY);
		txtCredits.setColumns(10);
		txtCredits.setBounds(462, 89, 134, 28);
		frame.getContentPane().add(txtCredits);
		
		txtEndTime = new JTextField();
		txtEndTime.setToolTipText("Class Name");
		txtEndTime.setText("End Time");
		txtEndTime.setForeground(Color.LIGHT_GRAY);
		txtEndTime.setColumns(10);
		txtEndTime.setBounds(462, 49, 134, 28);
		frame.getContentPane().add(txtEndTime);
		
		txtClassId = new JTextField();
		txtClassId.setToolTipText("Class Name");
		txtClassId.setText("Class ID");
		txtClassId.setForeground(Color.LIGHT_GRAY);
		txtClassId.setColumns(10);
		txtClassId.setBounds(24, 89, 134, 28);
		frame.getContentPane().add(txtClassId);
	}
}
