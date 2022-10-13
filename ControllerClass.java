public class ControllerClass {

	private SyllabusFascade syllabusFascade;

	private GenerateSyllabus generateSyllabus;

	public void main() {
		GenerateSyllabus genObj = new GenerateSyllabus() {
			@Override
			public void addModules(String title, String description) {

			}

			@Override
			public void addPersonalInformation(String email, float officeHoursStart, float officeHoursEnd) {

			}

			@Override
			public void viewCurrentSyllabus() {

			}

		};
		genObj.updatePolicies();

		syllabusFascade = new SyllabusFascade();
		syllabusFascade.display_syllabus();

		genObj.setClasstimeStart(10.30f);



	}
}


