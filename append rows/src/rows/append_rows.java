package rows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class append_rows {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=-10,19
	 */
	private final JPanel panel = new JPanel();
	/**
	 * @wbp.nonvisual location=-10,19
	 */
	private final JPanel panel_1 = new JPanel();
	/**
	 * @wbp.nonvisual location=-10,19
	 */
	private final JPanel panel_2 = new JPanel();
	/**
	 * @wbp.nonvisual location=-10,19
	 */
	private final JPanel panel_3 = new JPanel();
	private JTextField slno;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField city;
	private JTextField country;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					append_rows window = new append_rows();
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
	public append_rows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 773, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   Sl No");
		lblNewLabel.setBounds(61, 109, 65, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("   First Name");
		lblFirstName.setBounds(61, 147, 65, 27);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("   Last Name");
		lblLastName.setBounds(61, 180, 65, 27);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblCity = new JLabel("   City");
		lblCity.setBounds(61, 218, 65, 27);
		frame.getContentPane().add(lblCity);
		
		JLabel lblCountry = new JLabel("   Country");
		lblCountry.setBounds(61, 252, 65, 27);
		frame.getContentPane().add(lblCountry);
		
		slno = new JTextField();
		slno.setBounds(136, 109, 135, 27);
		frame.getContentPane().add(slno);
		slno.setColumns(10);
		
		firstname = new JTextField();
		firstname.setColumns(10);
		firstname.setBounds(136, 143, 135, 27);
		frame.getContentPane().add(firstname);
		
		lastname = new JTextField();
		lastname.setColumns(10);
		lastname.setBounds(136, 180, 135, 27);
		frame.getContentPane().add(lastname);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(136, 214, 135, 27);
		frame.getContentPane().add(city);
		
		country = new JTextField();
		country.setColumns(10);
		country.setBounds(136, 248, 135, 27);
		frame.getContentPane().add(country);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(306, 11, 394, 406);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(144, 238, 144));
		model=new DefaultTableModel();
		Object[] column = {"Sl No","First Name","Last Name","City","Country"};
		Object[] row = new Object[5];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Add New Row");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				row[0] = slno.getText();
				row[1] = firstname.getText();
				row[2] = lastname.getText();
				row[3] = city.getText();
				row[4] = country.getText();
				model.addRow(row);
				
				slno.setText("");
				firstname.setText("");
				lastname.setText("");
				city.setText("");
				country.setText("");
				
			}
		});
		btnNewButton.setBounds(146, 301, 107, 35);
		frame.getContentPane().add(btnNewButton);
	}
}
