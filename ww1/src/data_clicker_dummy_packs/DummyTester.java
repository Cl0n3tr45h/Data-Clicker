package data_clicker_dummy_packs;

public class DummyTester {
	
	public static int dataAmount = 50;

	public static void main(String[] args) {
		
		DummyCode dummyUpgrade = new DummyCode();
		
		System.out.println(dummyUpgrade.getCurrentcost());
		dummyUpgrade.increaseCurrentCost();
		System.out.println(dummyUpgrade.getCurrentcost());
	}

}
