
public class MAIN {

	public static void main(String[] args) {
		 
		User user = new User();
		user.setId(1);
		user.setName("denemeAd");
		user.setSurname("denemeSoyad");
		user.setIdentityNumber("12543765678");
		
		UserManager userManager = new UserManager();
		userManager.Add(user);
		
		
		Student student = new Student();
		student.setId(2);
		student.setName("Student_Ad");
		student.setSurname("Student_Soyad");
		student.setIdentityNumber("493047603439");
		student.setStudentNumber("56456");
		student.setCourseName("Java");
		
		StudentManager studentManager = new StudentManager();
		studentManager.Add(student);
		
		Instructor instructor = new Instructor();
		instructor.setId(3);
		instructor.setName("instructor_Ad");
		instructor.setSurname("instructor_Soyad");
		instructor.setIdentityNumber("75564564745");
		instructor.setInstructorNumber("6794565878");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(instructor);
		
	}

}
