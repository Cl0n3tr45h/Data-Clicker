package data_clicker_dummy_packs;
//mopseeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
public class DummyCode {
	
	private final int initialcost = 50 ;
	private int currentcost = initialcost;
	private double costIncrease = 1.15;  //115%
	//private int visibilityAmount = 100;
	//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	//BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
	//unstaged? 
	//test UwU lol
	public DummyCode (int cost) {
		this.initialcost=cost; 
	}
	
	
	public double getCostIncrease() {
		return costIncrease;
	}


	public void setCostIncrease(double costIncrease) {
		this.costIncrease = costIncrease;
	}


	public void setCurrentcost(int currentcost) {
		this.currentcost = currentcost;
	}


	public int getInitialcost() {
		return initialcost;
	}

	public int getCurrentcost() {
		return currentcost;
	}

	public void increaseCurrentCost() {
		int currentcost = getCurrentcost();
		if(costIncrease<1.00) costIncrease+=1.00;
		currentcost = (int) (currentcost*costIncrease);
		this.currentcost = currentcost;

		// hallo ihr nuggets
	}

}
