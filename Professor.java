public abstract class Professor extends GenerateSyllabus {

	private SyllabusBuilder  syllabusBuilder ;

	private ProfesssorSyllabus professsorSyllabus;

	public abstract void addModules(String title, String description);

	public abstract void addPersonalInformation(String email, float officeHoursStart, float officeHoursEnd);

	public abstract void viewCurrentSyllabus();

}
