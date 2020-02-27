package ihm;

import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jfree.chart.ChartPanel;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Jogging extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton backButton;
	private JButton progresButton;
	private JButton profilButton;
	private JLabel title;
	private JTextField jtfTemps, jtfDistance;
	
	static ArrayList<Float> data, data2, data3;

	/**
	 * Create the panel.
	 */
	public Jogging() {
		
		setLayout(null);
		
		Font font = new Font("Tahoma", Font.BOLD, 50);
		Font font2 = new Font("Tahoma", Font.BOLD, 30);
		
		JLabel labelDonnees = new JLabel("Nouvelles données");
		labelDonnees.setFont(font2);
		labelDonnees.setBounds(125, 200, 300, 50);
		add(labelDonnees);
		
		JLabel labelTemps = new JLabel("Temps");
		labelTemps.setBounds(125, 300, 100, 20);
		add(labelTemps);
		jtfTemps = new JTextField(4);
		jtfTemps.setBounds(200, 300, 150, 25);
		add(jtfTemps);
		
		JLabel labelDistance = new JLabel("Distance");
		labelDistance.setBounds(125, 350, 100, 20);
		add(labelDistance);
		jtfDistance = new JTextField(4);
		jtfDistance.setBounds(200, 350, 150, 25);
		add(jtfDistance);
		
		backButton = new JButton("Retour");
		backButton.setBounds(300, 650, 150, 60);
		add(backButton);
		
		progresButton = new JButton("Progres");
		progresButton.setBounds(550, 650, 150, 60);
		add(progresButton);
		
		profilButton = new JButton("Profil");
		profilButton.setBounds(800, 650, 150, 60);
		add(profilButton);
		
		title = new JLabel("Jogging");
		title.setFont(font);
		title.setBounds(550, 10, 400, 100);
		add(title);
		
		/* Faudra remplacer ça avec la BDD  */
		data = new ArrayList<Float>();
		data.add((float) 2);
		data.add((float) 8.1);
		data.add((float) 4.4);
		
		data2 = new ArrayList<Float>();
		data2.add((float) 5);
		data2.add((float) 1);
		data2.add((float) 3.7);
		/**********************************/
		
		Histogramme histo = new Histogramme("Jogging","Séance","Distance (en km)");
		ChartPanel histoPanel = histo.getChartPanel();
		
		histoPanel.setBounds(750, 125, 450, 450);
		add(histoPanel);
	}

	public JButton getBackButton() {
		return backButton;
	}

	public void setBackButton(JButton changerButton) {
		this.backButton = changerButton;
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

	public JLabel getTitle() {
		return title;
	}

	public void setTitle(JLabel title) {
		this.title = title;
	}

	public static void main(String[] args) {
		new Jogging();
	}
	
}