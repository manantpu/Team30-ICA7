public class Timer {

	private static Timer singleObj = new Timer();

	private GenerateSyllabus[] generateSyllabus;

	private Webscraper webscraper;


	private Timer() {}

	public static Timer getInstance() {
		return singleObj;
	}

	public String checkTimeAndUpdate() {
		System.out.println("Time has been checked. Policies have been updated.");
		return null;
	}

}
