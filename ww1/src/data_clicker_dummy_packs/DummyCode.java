package data_clicker_dummy_packs;
//möpseeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
public class DummyCode {
	
	private final int initialcost = 50 ;
	private int currentcost = initialcost;
	private double costIncrease = 1.15;  //115%
	//private int visibilityAmount = 100;
	
	//unstaged?
	public DummyCode () {
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
	}

}
