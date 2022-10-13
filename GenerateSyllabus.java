public abstract class GenerateSyllabus implements SyllabusBuilder {

	private String Email;

	private float OfficeHourStart;

	private float ClasstimeStart;

	private Image GradingScale;

	private String ProfessorName;

	private float OfficeHourEnd;

	private int PhoneNumber;

	private float ClasstimeEnd;

	private String CourseTitle;

	private GenerateSyllabusDecorator generateSyllabusDecorator;

	private Timer Timer;


	private ControllerClass controllerClass;

	/**
	 *  
	 */
	public void viewPreviousSyllabus(String subject) {

	}

	public void importPreviousSyllabus(String subject) {

	}

	/**
	 *  
	 */
	public void importSyllabusTemplate(String department) {

	}

	public abstract void addModules(String title, String description);

	public abstract void addPersonalInformation(String email, float officeHoursStart, float officeHoursEnd);

	public abstract void viewCurrentSyllabus();

	public void setProfessorName(String name) {}

	public void setOfficeHourStart(float time){}

	public  void setOfficeHourEnd(float time) {}

	public Syllabus create() {
		return null;
	}

	public void setEmail(String email) {
	}

	public void setClasstimeStart(float time) {
		System.out.println("Time has been set to "+time);
	}


	public void setGradingScale(Image image) {

	}

	public void setClasstimeEnd(float time) {

	}

	public void setPhoneNumber(int phone) {}

	public void setCourseTitle(String title){}

	public void updatePolicies() {
		Timer timerObj = Timer.getInstance();
		timerObj.checkTimeAndUpdate();
	}

}
