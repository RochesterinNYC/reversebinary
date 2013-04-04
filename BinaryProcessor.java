
public class BinaryProcessor {
	private int query;
	private int[] binaryArray;
	int maxPower;
	public BinaryProcessor (int query) {
		this.query = query;
		this.maxPower = 0;
	}
	public void checkMaxPower() {
		while (Math.pow(2,maxPower) <= query) {
			maxPower++;
		}//highest power of 2 that's part of query
	}
	public void formBinary() {
		binaryArray = new int[maxPower];
		int twoPower = 0;
		for (int i = maxPower - 1; i >= 0; i--) {
			twoPower = (int) Math.pow(2,i);
			if(query - twoPower >= 0){
				binaryArray[i] = 1;
				query -= twoPower;
			}
			if(i == 0 && query == 1) {
				binaryArray[i] = 1;
			}
		}
	}
	public int reversedBinary() {
		int binaryReverse = 0;
		int twoPower = 0;
		for(int k = binaryArray.length-1; k >= 0; k--){
			if (binaryArray[k] == 1) {
				binaryReverse += Math.pow(2,twoPower);
			}
			twoPower++;
		}
		return binaryReverse;
	}
	
}
