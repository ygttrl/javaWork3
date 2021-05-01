
public class StudentManager extends UserManager {

		public void Add(Student student) 
		{
			System.out.println(
						"id :"+student.getId()+
						"\nStudent"+student.getName()+
						"\nStudent"+student.getSurname()+
						"\nStudent"+student.getIdentityNumber()+
						"\nStudent"+student.getStudentNumber()+
						"\nStudent"+student.getCourseName()
					);
		}
		
		public void AddMultiple(Student[] students) 
		{
			for (Student student : students) 
			{
				Add(student);
			}
		}
    }
