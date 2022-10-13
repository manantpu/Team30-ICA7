public abstract class AdjunctProfessorDecorator extends GenerateSyllabusDecorator {

	/**
	 *  
	 */
	public void viewPreviousSyllabus(String subject) {

	}

	/**
	 *  
	 */
	public void importSyllabusTemplate(String department) {

	}

	public abstract void addModules(String title, String description);

	public abstract void addPersonalInformation(String email, float officeHoursStart, float officeHoursEnd);

	public abstract void viewCurrentSyllabus();

}
