public abstract class GenerateSyllabusDecorator extends GenerateSyllabus {

	private GenerateSyllabus generateSyllabus;

	public abstract void addModules(String title, String description);

	public abstract void addPersonalInformation(String email, float officeHoursStart, float officeHoursEnd);

	public abstract void viewCurrentSyllabus();

}
