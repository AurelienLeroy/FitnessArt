package ihm;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import java.awt.Font;
import java.awt.Graphics;

public class Activity extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image apnee;
	private Image natation;
	private Image jogging;
	private Image devcouche;
	private Image golf;
	private Image tir;
	
	private JButton btnProfil;
	private JButton btnBack;
	
	private JLabel labActivity;
	
	private JButton btnApnee;
	private JButton btnNatation;
	private JButton btnJogging;
	private JButton btnDevcouche;
	private JButton btnGolf;
	private JButton btnArc;


	/**
	 * Create the panel.
	 */
	public Activity() {
		
		try {
			this.apnee = ImageIO.read(new File("pictures/apne.jpg"));
			this.natation = ImageIO.read(new File("pictures/devcoucher.jpg"));
			this.jogging = ImageIO.read(new File("pictures/joggin.jpg"));
			this.devcouche = ImageIO.read(new File("pictures/natation.jpg"));
			this.golf = ImageIO.read(new File("pictures/golf.jpg"));
			this.tir = ImageIO.read(new File("pictures/tir.jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		setLayout(null);
		
		Font font = new Font("Tahoma", Font.BOLD, 50);
		
	//************************************************************//	
		btnProfil = new JButton("Profil");
		btnProfil.setBounds(580, 600, 150, 50);
		add(btnProfil);
		
		btnBack = new JButton("Retour");
		btnBack.setBounds(580, 660, 150, 50);
		add(btnBack);
		
		labActivity = new JLabel("Activités");
		labActivity.setFont(font);
		labActivity.setBounds(550, 10, 312, 50);
		add(labActivity);
	//*******************************************************************//	
		
		btnApnee = new JButton("Apnée");
		btnApnee.setBounds(150, 160, 150, 50);
		add(btnApnee);
		
		btnDevcouche = new JButton("Muscu");
		btnDevcouche.setBounds(580, 160, 150, 50);
		add(btnDevcouche);
		
		btnJogging = new JButton("Jogging");
		btnJogging.setBounds(1000, 160, 150, 50);
		add(btnJogging);
		
		btnNatation = new JButton("Natation");
		btnNatation.setBounds(150, 410, 150, 50);
		add(btnNatation);
		
		btnArc = new JButton("Tir à l'arc");
		btnArc.setBounds(580, 410, 150, 50);
		add(btnArc);
		
		btnGolf = new JButton("Golf");
		btnGolf.setBounds(1000, 410, 150, 50);
		add(btnGolf);

	}
	
	
	
	public JButton getBtnArc() {
		return btnArc;
	}



	public void setBtnArc(JButton btnArc) {
		this.btnArc = btnArc;
	}



	public Image getApnee() {
		return apnee;
	}



	public void setApnee(Image apnee) {
		this.apnee = apnee;
	}



	public Image getNatation() {
		return natation;
	}



	public void setNatation(Image natation) {
		this.natation = natation;
	}



	public Image getJogging() {
		return jogging;
	}



	public void setJogging(Image jogging) {
		this.jogging = jogging;
	}



	public Image getDevcouche() {
		return devcouche;
	}



	public void setDevcouche(Image devcouche) {
		this.devcouche = devcouche;
	}



	public Image getGolf() {
		return golf;
	}



	public void setGolf(Image golf) {
		this.golf = golf;
	}



	public Image getTir() {
		return tir;
	}



	public void setTir(Image tir) {
		this.tir = tir;
	}



	public JButton getBtnProfil() {
		return btnProfil;
	}



	public void setBtnProfil(JButton btnProfil) {
		this.btnProfil = btnProfil;
	}



	public JButton getBtnBack() {
		return btnBack;
	}



	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}



	public JLabel getLabActivity() {
		return labActivity;
	}



	public void setLabActivity(JLabel labActivity) {
		this.labActivity = labActivity;
	}



	public JButton getBtnApnee() {
		return btnApnee;
	}



	public void setBtnApnee(JButton btnApnee) {
		this.btnApnee = btnApnee;
	}



	public JButton getBtnNatation() {
		return btnNatation;
	}



	public void setBtnNatation(JButton btnNatation) {
		this.btnNatation = btnNatation;
	}



	public JButton getBtnJogging() {
		return btnJogging;
	}



	public void setBtnJogging(JButton btnJogging) {
		this.btnJogging = btnJogging;
	}



	public JButton getBtnDevcouche() {
		return btnDevcouche;
	}



	public void setBtnDevcouche(JButton btnDevcouche) {
		this.btnDevcouche = btnDevcouche;
	}



	public JButton getBtnGolf() {
		return btnGolf;
	}



	public void setBtnGolf(JButton btnGolf) {
		this.btnGolf = btnGolf;
	}



	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(apnee, 0, 60, 433,250, this);
		g.drawImage(natation, 433, 60, 433,250, this);
		g.drawImage(jogging, 866, 60, 433,250, this);
		g.drawImage(devcouche, 0, 310, 433,250, this);
		g.drawImage(tir, 433, 310, 433,250, this);
		g.drawImage(golf, 866, 310, 433,250, this);
	}
}
