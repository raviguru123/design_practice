public class HitCounter {
	int[] hitCount;
	int[] timestampArray;
	public HitCounter() {
		this.hitCount = new int[300];
		this.timestampArray = new int[300];
		
	}

	public void hit(int timestamp) {
		int index = timestamp % 300;
		if(timestampArray[index] != timestamp) {
			this.hitCount[index] = 1;
			this.timestampArray[index] = timestamp;
		}
		else {
			this.hitCount[index] += 1;
		}
	}

	public int getHits(int timestamp) {
		int count = 0;
		int index = 0;
		for(int val : this.timestampArray) {
			if(timestamp - val < 300) {
				count += this.hitCount[index];
			}
			index += 1;
		}
		return count;
	}

	public void printStat() {
		for(int val : this.hitCount) {
			System.out.print(val+ " ");
		}
		
		System.out.println("");
		for(int val : this.timestampArray) {
			System.out.print(val+" ");
		}
		
	}
}