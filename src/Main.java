import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.jvnet.substance.skin.SubstanceBusinessBlueSteelLookAndFeel;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		try {
			UIManager.setLookAndFeel(new SubstanceBusinessBlueSteelLookAndFeel());
		} catch (Exception e) {
			System.out.println("Substance Raven Graphite failed to initialize");
		}
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
//				MianShaFrame w = new MianShaFrame();
//				w.setVisible(true);
				
				LoginFrame loginFrame = new LoginFrame();
				loginFrame.setVisible(true);
				
			}
		});
	}

}
