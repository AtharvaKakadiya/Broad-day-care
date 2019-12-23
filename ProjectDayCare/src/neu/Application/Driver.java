package neu.Application;

import javax.swing.SwingUtilities;

import edu.neu.csye6200.daycare.controller.DayCareController;
import edu.neu.csye6200.daycare.views.LoginPage;
import edu.neu.csye6200.daycare.views.MainPage; 
public class Driver {

	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    createAndShowGUI();
	                } catch (Exception e) {
	                	e.printStackTrace();
	                						}
	            	}
		});
}
	
	public static void createAndShowGUI() throws Exception {
		LoginPage LP = new LoginPage();
        LP.setVisible(true);
    }