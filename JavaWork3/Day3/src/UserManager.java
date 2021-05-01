
public class UserManager {
	
	public void Add(User user) 
	{
		System.out.println("id :"+user.getId()
							+"\nAd :"+user.getName()
							+"\nSoyad :"+user.getSurname()
							+"\nTckn :"+user.getIdentityNumber()
							);
	}
	
	public void AddMultiple(User[] users) 
	{
		 for (User user : users) {
			Add(user);
		}
	}
	
}
