package pms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Run {
	
	static ObjectInputStream ois;
	
	static ObjectOutputStream oos;

	static ArrayList<Details> detailsList ;
	
	static ArrayList<Details> deletedList;
	
	
	static WelcomeWindow ww;
	static VehicleInOut vio;
	static VehicleDetails vd;
	static VehicleOut vo;
	static DriverDetails dd;
	static Login l;
	static AdminWindow aw;
	static TotalCollectedAmount tca;
	static ShowDetails sd;
	static ExitWindow ew;
	static ListOfParkedVehicles lpv;
	static ListOfExitedVehicles lev;
	static DetailsOfSearchedVehicles dsv;
	static Search srch;
	
	static Details tempDetails;
	
	public static void main(String[] args) {
		
		ww = new WelcomeWindow();
		vio = new VehicleInOut();
		vo = new VehicleOut();
		vd = new VehicleDetails();
		dd = new DriverDetails();
		aw = new AdminWindow();
		ew = new ExitWindow();
		sd = new ShowDetails();
		l = new Login();
		tca = new TotalCollectedAmount();
		lpv = new ListOfParkedVehicles();
		lev = new ListOfExitedVehicles();
		dsv = new DetailsOfSearchedVehicles();
		srch = new Search();

		ww.setVisible(true);

		 detailsList = new ArrayList<>();
		 deletedList = new ArrayList<>();
		
	}
}
