package ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class Fenetre extends JFrame implements Runnable,ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Registration registration;
	private MainPage mainpage;
	private Profil profil;
	private Muscu muscu;
	private Jogging jogging;
	private Apnee apnee;
	private Natation natation;
	private Arc arc;
	private Golf golf;
	private Progres progres;
	private Activity activity;
	
	// Provisoire //
	private static boolean apneetf=false, joggingtf=true, muscutf=true;
	
	public Fenetre(){
	    this.setTitle("FitnessArt");
	    this.setSize(1300, 800);
	    this.setLocationRelativeTo(null);
	    
	    registration = new Registration();
	    registration.getRegis().addActionListener(new ActivityFunction());
	    registration.getBack().addActionListener(new MainpageFunction());
	    
	    mainpage = new MainPage();
	    mainpage.getRegisButton().addActionListener(new RegistrationFunction());
	    mainpage.getConnectButton().addActionListener(new ActivityFunction());
	    
	    profil = new Profil();
	    profil.getBack().addActionListener(new ActivityFunction());
	    
	    apnee = new Apnee();
	    apnee.getBackButton().addActionListener(new ActivityFunction());
	    apnee.getProgresButton().addActionListener(new ProgresFunction());
	    apnee.getProfilButton().addActionListener(new ProfilFunction());
	    
	    muscu = new Muscu();
	    muscu.getBackButton().addActionListener(new ActivityFunction());
	    muscu.getProfilButton().addActionListener(new ProfilFunction());
	    
	    jogging = new Jogging();
	    jogging.getBackButton().addActionListener(new ActivityFunction());
	    jogging.getProfilButton().addActionListener(new ProfilFunction());
	    
	    natation = new Natation();
	    natation.getBackButton().addActionListener(new ActivityFunction());
	    natation.getProfilButton().addActionListener(new ProfilFunction());
	    
	    arc = new Arc();
	    arc.getBackButton().addActionListener(new ActivityFunction());
	    arc.getProfilButton().addActionListener(new ProfilFunction());
	    
	    golf = new Golf();
	    golf.getBackButton().addActionListener(new ActivityFunction());
	    golf.getProfilButton().addActionListener(new ProfilFunction());
	    
	    progres = new Progres();
	    progres.getBackButton().addActionListener(new ActivityFunction());
	    
	    activity = new Activity();
	    activity.getBtnProfil().addActionListener(new ProfilFunction());
	    activity.getBtnBack().addActionListener(new MainpageFunction());
	    activity.getBtnApnee().addActionListener(new ApneeFunction());
	    activity.getBtnDevcouche().addActionListener(new MuscuFunction());
	    activity.getBtnJogging().addActionListener(new JoggingFunction());
	    activity.getBtnNatation().addActionListener(new NatationFunction());
	    activity.getBtnArc().addActionListener(new ArcFunction());
	    activity.getBtnGolf().addActionListener(new GolfFunction());
	    
	    this.setContentPane(mainpage);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);
	  }
	
	
	
public Registration getRegistration() {
		return registration;
	}



	public void setRegistration(Registration registration) {
		this.registration = registration;
	}



	public MainPage getMainpage() {
		return mainpage;
	}



	public void setMainpage(MainPage mainpage) {
		this.mainpage = mainpage;
	}



	public Jogging getJogging() {
		return jogging;
	}



	public void setJogging(Jogging jogging) {
		this.jogging = jogging;
	}



	public Apnee getApnee() {
		return apnee;
	}



	public void setApnee(Apnee apnee) {
		this.apnee = apnee;
	}



	public Progres getProgres() {
		return progres;
	}



	public void setProgres(Progres progres) {
		this.progres = progres;
	}



	public Activity getActivity() {
		return activity;
	}



	public void setActivity(Activity activity) {
		this.activity = activity;
	}



	// Registration Page	
	public void registration() {
		this.setContentPane(registration);
		this.revalidate();
	}
	
	public void activity() {
		this.setContentPane(activity);
		this.revalidate();
	}
	
	public void profil() {
		this.setContentPane(profil);
		this.revalidate();
	}
	
	public void progres() {
		this.setContentPane(progres);
		this.revalidate();
	}
	
	public void apnee() {
		this.setContentPane(apnee);
		this.revalidate();
	}
	
	public void muscu() {
		this.setContentPane(muscu);
		this.revalidate();
	}
	
	public void jogging() {
		this.setContentPane(jogging);
		this.revalidate();
	}
	
	public void natation() {
		this.setContentPane(natation);
		this.revalidate();
	}
	
	public void arc() {
		this.setContentPane(arc);
		this.revalidate();
	}
	
	public void golf() {
		this.setContentPane(golf);
		this.revalidate();
	}
	
	public void mainpage() {
		this.setContentPane(mainpage);
		this.revalidate();
	}
	
	
	public class RegistrationFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			Fenetre.this.registration();			
		}		
	}
	
	public class MainpageFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			Fenetre.this.mainpage();			
		}		
	}
	
	public class ActivityFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			Fenetre.this.activity();			
		}		
	}
	
	public class ProfilFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			Fenetre.this.profil();			
		}		
	}
	
	public class ProgresFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			Fenetre.this.progres();			
		}		
	}
	
	public class ApneeFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			if (Fenetre.apneetf == true) {
				Fenetre.this.apnee();
			}
			else {
				new AccessForbidden(Fenetre.this);
			}
		}		
	}
	
	public class MuscuFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			if (Fenetre.muscutf == true) {
				Fenetre.this.muscu();
			}
			else {
				new AccessForbidden(Fenetre.this);
			}
		}		
	}
	
	public class JoggingFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			if (Fenetre.joggingtf == true) {
				Fenetre.this.jogging();
			}
			else {
				new AccessForbidden(Fenetre.this);
			}
		}		
	}
	
	public class NatationFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			Fenetre.this.natation();			
		}		
	}
	
	public class ArcFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			Fenetre.this.arc();			
		}		
	}
	
	public class GolfFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			Fenetre.this.golf();			
		}		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
