package com.ihm;

import javax.swing.JPanel;



import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class Jogging extends Thread {
	
	private JPanel panel;
	
	private JButton changerButton;
	private JButton progresButton;
	private JButton profilButton;
	private JButton startButton;
	private JButton clearButton;
	
	private JLabel title;
	
	private JComboBox<String>comboBox;
	
	private JLabel pointLabel1;
    private JLabel pointLabel2;
    
    private JLabel hourValue;
    private JLabel minuteValue;
    private JLabel secondValue;
    
    
    private static final int CHRONO_SPEED = 1000;
	private static final long serialVersionUID = 1L;
	private boolean stoper = true;
	
	private Jogging instance = this;

	/**
	 * Create the panel.
	 */
	public Jogging() {
		
		panel = new JPanel();
		panel.setLayout(null);
		
		Font font = new Font("Tahoma", Font.BOLD, 50);
		
		changerButton = new JButton("Changer");
		changerButton.setBounds(600, 800, 150, 60);
		panel.add(changerButton);
		
		progresButton = new JButton("Progres");
		progresButton.setBounds(850, 800, 150, 60);
		panel.add(progresButton);
		
		profilButton = new JButton("Profil");
		profilButton.setBounds(1100, 800, 150, 60);
		panel.add(profilButton);
		
		title = new JLabel("Jogging");
		title.setFont(font);
		title.setBounds(850, 10, 400, 100);
		panel.add(title);
		
		startButton = new JButton("Start");
		startButton.addActionListener(new StartStopAction());
		startButton.setBounds(775, 500, 150, 60);
		panel.add(startButton);
		
		clearButton = new JButton("Clear");
		
		clearButton.setBounds(975, 500, 150, 60);
		panel.add(clearButton);
		
		comboBox = new JComboBox();
		comboBox.setBounds(33, 321, 97, 26);
		panel.add(comboBox);
		//***************
		
		
		
		pointLabel1 = new JLabel(":");
		panel.add(pointLabel1);
		pointLabel1.setBounds(850, 150, 5, 80);
    	pointLabel1.setFont(font);
    	
        pointLabel2 = new JLabel(":");
        panel.add(pointLabel2);
        pointLabel2.setBounds(960, 150, 5, 80);
        pointLabel2.setFont(font);
        
        hourValue = new JLabel("00");
        panel.add(hourValue);
        hourValue.setBounds(750, 150, 80, 80);
        hourValue.setFont(font);
        
        minuteValue = new JLabel("00");
        panel.add(minuteValue);
        minuteValue.setBounds(860, 150, 80, 80);
        minuteValue.setFont(font);
        
        secondValue = new JLabel("00");
        panel.add(secondValue);
        secondValue.setBounds(970, 150, 80, 80);
        secondValue.setFont(font);

	}
	
	

	public JLabel getPointLabel1() {
		return pointLabel1;
	}



	public void setPointLabel1(JLabel pointLabel1) {
		this.pointLabel1 = pointLabel1;
	}



	public JLabel getPointLabel2() {
		return pointLabel2;
	}



	public void setPointLabel2(JLabel pointLabel2) {
		this.pointLabel2 = pointLabel2;
	}



	public JLabel getHourValue() {
		return hourValue;
	}



	public void setHourValue(JLabel hourValue) {
		this.hourValue = hourValue;
	}



	public JLabel getMinuteValue() {
		return minuteValue;
	}



	public void setMinuteValue(JLabel minuteValue) {
		this.minuteValue = minuteValue;
	}



	public JLabel getSecondValue() {
		return secondValue;
	}



	public void setSecondValue(JLabel secondValue) {
		this.secondValue = secondValue;
	}



	



	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JButton getChangerButton() {
		return changerButton;
	}

	public void setChangerButton(JButton changerButton) {
		this.changerButton = changerButton;
	}

	public JButton getProgresButton() {
		return progresButton;
	}

	public void setProgresButton(JButton progresButton) {
		this.progresButton = progresButton;
	}

	public JButton getProfilButton() {
		return profilButton;
	}

	public void setProfilButton(JButton profilButton) {
		this.profilButton = profilButton;
	}

	public JButton getStartButton() {
		return startButton;
	}

	public void setStartButton(JButton startButton) {
		this.startButton = startButton;
	}

	public JButton getClearButton() {
		return clearButton;
	}

	public void setClearButton(JButton clearButton) {
		this.clearButton = clearButton;
	}

	public JLabel getTitle() {
		return title;
	}

	public void setTitle(JLabel title) {
		this.title = title;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}
	
	
	
	
	
	private class StartStopAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (!stoper) {
				stoper = true;
				startButton.setText(" Start ");
			} else {
				stoper = false;
				startButton.setText(" Pause ");
				Thread chronoThread = new Thread(instance);
				chronoThread.start();
			}
		}
	}
	
	

	public static void main(String[] args) {
		new Jogging();
	}
	
}

