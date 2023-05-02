class User{
	private Integer id;
	private String userName;
	private String password;
	
	public User(Integer id, String userName, String password) {
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	
	
	public User() {
		
	}
	
	
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}



 class UserBo{
     public User[] getUser() {
    	 
    	 User[] user = new User[5];
    	 
    	 user[0] = new User(1,"mahi","BCDE");
    	 user[1] = new User(2,"yash","576fgf");
    	 user[2] = new User(3,"vinu","bkhg787");
    	 user[3] = new User(4,"abhi","jggut6");
    	 user[4] = new User(5,"gire","yi66vjm");
    	 
    	 return user;
     }
     
     
     private String encryptPasswod(String password) {
    	 
    	 String res = "";
    	 
    	 for(int i=0; i<password.length(); i++) {
    		res = res + (char) (password.charAt(i)+1);
    	 }
    	 
    	 return res;
     }
     
     
 
	public boolean validate (String userName, String password) {
    	 
    	 User[] user = getUser();
    	 
    	 for(int i=0; i<user.length; i++) {
    		String un = user[i].getUserName();
    		String pw = user[i].getPassword();
    		if(un.equals(userName)==true && pw.equals(encryptPasswod(password))) {
    			return true;
    			
    		}else {
    			return false;
    		}
    	 }
    	 
    	 return false;
     }
     
     
}


public class UserPassword {

	public static void main(String[] args) {
		
		UserBo u = new UserBo();
		System.out.println(u.validate("mahi","ABCD"));
		
	}

}
