package GUI;

import java.awt.Point;

public class GUIForm {

	public static Login login = new Login();
	public static Menu menu = new Menu();
	public static AddAsset addInvestment = new AddAsset();
	public static AddCommodity addcommodity = new AddCommodity();
	public static AddStock addstock = new AddStock();
	public static AddCash addcash = new AddCash();
	public static DisplayList displaylist = new DisplayList();
	public static DepositAcc depositacc = new DepositAcc();
	public static WithdrawAcc withdraw = new WithdrawAcc();

	public static void UpdateDisplay() {

		if (displaylist.isVisible()) {
			Point O = displaylist.getLocation();
			displaylist.dispose();
			displaylist = new DisplayList();
			displaylist.setVisible(true);
			displaylist.setLocation(O);
			;
		}

		else {
			displaylist = new DisplayList();
		}

	}

}
