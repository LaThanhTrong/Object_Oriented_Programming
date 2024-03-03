import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class App {

	private JFrame frame;
	private JTextField ms;
	private JTextField td;
	private JTextArea ketqua;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 857, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quan Ly Hoa Don");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(311, 10, 293, 71);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ma so hoa don");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(25, 87, 136, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		ms = new JTextField();
		ms.setBounds(171, 92, 96, 19);
		frame.getContentPane().add(ms);
		ms.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tieu de");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(25, 132, 77, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		td = new JTextField();
		td.setBounds(171, 137, 96, 19);
		frame.getContentPane().add(td);
		td.setColumns(10);
		
		JButton btnNewButton = new JButton("Tao hoa don");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mso = ms.getText();
				String tde = td.getText();
				
				HoaDon h = new HoaDon(mso,tde);
				ketqua.setText(h.getMS() + ", "+h.getTD()+ "\n" +ketqua.getText() );
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(144, 179, 123, 27);
		frame.getContentPane().add(btnNewButton);
		
		ketqua = new JTextArea();
		ketqua.setBounds(27, 220, 806, 266);
		frame.getContentPane().add(ketqua);
	}
}
