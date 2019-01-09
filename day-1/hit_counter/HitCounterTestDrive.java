public class HitCounterTestDrive {
	public static void main(String[] args) {
		HitCounter counter = new HitCounter();
		counter.hit(1);
		counter.hit(1);
		counter.hit(2);
		counter.hit(2);
		//counter.printStat();
		System.out.println("Total hit count at :: "+counter.getHits(301));
		counter.hit(3);
		counter.hit(3);
		counter.hit(3);
		counter.hit(299);
		System.out.println("Total hit count at :: "+counter.getHits(302));
	}
}