package ihm;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AccessForbidden extends JDialog{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton ok;
	
	public AccessForbidden(JFrame owner) {
		super(owner, "Accés Refusé", true);
		setSize(300,80);
		setLocationRelativeTo(null);
		this.setLayout(new FlowLayout());
		JLabel msg = new JLabel("Vous n'avez pas accés à cet élément");
		add(msg);
		
		ok = new JButton("Ok");
		ok.addActionListener(new OkListener(this));
		add(ok);
		
	
		setVisible(true);
	}
	
	public class OkListener implements ActionListener{
		
		JDialog dialog;
		
		public OkListener(JDialog dialog) {
			this.dialog=dialog;
		}
		public void actionPerformed(ActionEvent e) {
			dialog.dispose();
		}		
	}

}
