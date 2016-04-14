package edu.umsl.ASG2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import javax.swing.JTextPane;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DropMode;
import java.awt.Color;

public class GUI {

	private JFrame frame;
	private JTextField textComments;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 500, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(190, 28, 200, 20);
		frame.getContentPane().add(comboBox);
		
		JSlider technicalSlider = new JSlider();
		technicalSlider.setSnapToTicks(true);
		technicalSlider.setPaintTicks(true);
		technicalSlider.setPaintLabels(true);
		technicalSlider.setMaximum(8);
		technicalSlider.setMajorTickSpacing(1);
		technicalSlider.setBounds(190, 74, 239, 45);
		frame.getContentPane().add(technicalSlider);
		
		JSlider usefulSlider = new JSlider();
		usefulSlider.setSnapToTicks(true);
		usefulSlider.setPaintTicks(true);
		usefulSlider.setPaintLabels(true);
		usefulSlider.setMaximum(8);
		usefulSlider.setMajorTickSpacing(1);
		usefulSlider.setBounds(190, 130, 239, 45);
		frame.getContentPane().add(usefulSlider);
		
		JSlider claritySlider = new JSlider();
		claritySlider.setSnapToTicks(true);
		claritySlider.setPaintTicks(true);
		claritySlider.setPaintLabels(true);
		claritySlider.setMaximum(8);
		claritySlider.setMajorTickSpacing(1);
		claritySlider.setBounds(190, 186, 239, 45);
		frame.getContentPane().add(claritySlider);
		
		JSlider overallSlider = new JSlider();
		overallSlider.setSnapToTicks(true);
		overallSlider.setMaximum(8);
		overallSlider.setPaintLabels(true);
		overallSlider.setMajorTickSpacing(1);
		overallSlider.setPaintTicks(true);
		overallSlider.setBounds(190, 242, 239, 45);
		frame.getContentPane().add(overallSlider);
		
		textComments = new JTextField();
		textComments.setBounds(190, 326, 239, 66);
		frame.getContentPane().add(textComments);
		textComments.setColumns(10);
		
		JTextPane textAverageScore = new JTextPane();
		textAverageScore.setEditable(false);
		textAverageScore.setBackground(Color.WHITE);
		textAverageScore.setBounds(301, 436, 110, 23);
		frame.getContentPane().add(textAverageScore);
		
		JLabel lblNewLabel = new JLabel("Technical");
		lblNewLabel.setBounds(74, 87, 49, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUseful = new JLabel("Useful");
		lblUseful.setBounds(74, 140, 49, 14);
		frame.getContentPane().add(lblUseful);
		
		JLabel lblClarity = new JLabel("Clarity");
		lblClarity.setBounds(74, 198, 49, 14);
		frame.getContentPane().add(lblClarity);
		
		JLabel lblOverall = new JLabel("Overall");
		lblOverall.setBounds(74, 254, 49, 14);
		frame.getContentPane().add(lblOverall);
		
		JLabel lblTeam = new JLabel("Team");
		lblTeam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTeam.setBounds(74, 29, 49, 14);
		frame.getContentPane().add(lblTeam);
		
		JLabel lblComments = new JLabel("Comments");
		lblComments.setBounds(74, 329, 64, 14);
		frame.getContentPane().add(lblComments);
		
		JButton btnCalculateAverageScore = new JButton("Calculate Average Score");
		btnCalculateAverageScore.setBounds(111, 436, 151, 23);
		frame.getContentPane().add(btnCalculateAverageScore);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(111, 486, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(301, 486, 89, 23);
		frame.getContentPane().add(btnClear);
	}
}
