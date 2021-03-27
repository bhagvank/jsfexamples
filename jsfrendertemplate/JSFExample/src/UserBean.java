

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserBean {

	public String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String name) {
		this.username = name;
	}

	public String getUser() {
		String response = "";
		if(username != null) {
			response = "The user is " + username +".";
		}
		return response;
	}
}