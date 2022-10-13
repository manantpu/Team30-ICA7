interface  SyllabusBuilder  {

	Professor professor = null;

	public  void setCourseTitle(String title);

	public  abstract void setClasstimeStart(float time) ;

	public  void setClasstimeEnd(float time) ;

	public  void setOfficeHourStart(float time);

	public  void setOfficeHourEnd(float time) ;

	public  void setProfessorName(String name) ;

	public  void setPhoneNumber(int phone) ;

	/**
	 *
	 */
	public  void setEmail(String email) ;

	public  void setGradingScale(Image image);

	public  Syllabus create();

}
