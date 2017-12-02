package garaix.cit360;

import javax.persistence.Entity;
import javax.persistence.Id;


// This is the Model class that hibernate will need to process

@Entity // Tells Java that this class will be an Entity class.
		// It will look in the list of the annotated entities property in the XML
public class UserDetails {
	@Id // This tells Java that userId is the primary key
	private int userId;
	private String userName;
	
	// Getters and Setters
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
