
public class InstructorManager extends UserManager {
	
	 public void Add(Instructor instructor) 
	 {
		 System.out.println(
				 	"id :"+ instructor.getId()+
				 	"\nAd :"+ instructor.getName()+
				 	"\nSoyad :"+ instructor.getSurname()+
				 	"\nidentityNumber :"+ instructor.getIdentityNumber()+
				 	"\nidentityNumber :"+ instructor.getInstructorNumber()
				 );
	 }
	 
	 public void AddMultiple(Instructor[] instructors) 
	 {
		 for (Instructor instructor : instructors) {
			Add(instructor);
		}
	 }
}
