import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class horno extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JTextField textField_1;
	private JTextField textField_2;
    private int columna = 180;
    private int temp = 50;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					horno frame = new horno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public horno() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText(String.valueOf(50));
		textField.setBounds(158, 12, 64, 57);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("Temperatura");
		lblNewLabel.setBounds(40, 16, 100, 57);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  if (columna > 80)
				columna=columna-20;  
			  temp -= 10;
			  repaint();
			}
			});
		btnNewButton.setBounds(74, 168, 82, 34);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton(">>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 if (columna < 280)	
			    columna=columna+20;
			 temp += 10;
			 repaint();
			}
			});
		button.setBounds(202, 168, 82, 34);
		contentPane.add(button);
		
		JButton btnNewButton_1 = new JButton("Calefaccionar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 String texto=(String)textField_1.getText();		 
			 if (temp <= 50 && texto.equals("Recinto 1")){	
				 textField_2.setText("Correcto");}
			 else if (temp <= 80 && texto.equals("Recinto 2")){	
				 textField_2.setText("Correcto");}
			 else if (texto.equals("Recinto 3")){	
				 textField_2.setText("Correcto");}
			 else textField_2.setText("Incorrecto");
			  
			}
			});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 11));
		btnNewButton_1.setBounds(27, 227, 129, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnInicializar = new JButton("Inicializar");
		btnInicializar.setFont(new Font("Dialog", Font.BOLD, 11));
		btnInicializar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText(" ");
				textField_2.setText(" ");
				temp = 0;
				columna = 80;
				repaint();
			}
		});
		btnInicializar.setBounds(199, 227, 129, 34);
		contentPane.add(btnInicializar);
		
		JLabel lblRecintos = new JLabel("Recintos");
		lblRecintos.setBounds(432, 0, 200, 34);
		contentPane.add(lblRecintos);
		
		JButton btnNewButton_2 = new JButton("Recinto 1");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("Recinto 1");
			}
		});
		btnNewButton_2.setBounds(394, 35, 176, 34);
		contentPane.add(btnNewButton_2);
		
		JButton btnRecinto = new JButton("Recinto 2");
		btnRecinto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("Recinto 2");
			}
		});
		btnRecinto.setBounds(394, 81, 176, 34);
		contentPane.add(btnRecinto);
		
		JButton btnRecinto_1 = new JButton("Recinto 3");
		btnRecinto_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("Recinto 3");
			}
		});
		btnRecinto_1.setBounds(394, 127, 176, 34);
		contentPane.add(btnRecinto_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(394, 169, 176, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		textField_2.setBounds(394, 225, 176, 50);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setBounds(76, 148, 64, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("20");
		label.setBounds(106, 148, 64, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("40");
		label_1.setBounds(152, 148, 64, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("60");
		label_2.setBounds(189, 148, 64, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("80");
		label_3.setBounds(233, 148, 64, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("100");
		label_4.setBounds(265, 148, 64, 15);
		contentPane.add(label_4);
	}
	public void paint (Graphics g)
	{
	   super.paint(g);
	   textField.setText(String.valueOf(temp));
	   g.setColor (Color.black);
	  // g.drawLine (0, 70, 100, 70);
	   g.drawRect (80,110, 200, 60);
	   g.drawRect (20,30, 320, 320);
	   g.drawRect (370,30, 230, 320);
	   g.setColor (Color.red);
	   //g.fillRect (50, 70, 50, 70);   
	   g.drawLine (columna, 110, columna, 170);
	 
	}
}
