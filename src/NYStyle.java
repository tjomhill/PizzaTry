
public class NYStyle extends Pizza {
		
	String crustType = "thin";
	
	void serve() {
		System.out.println("Here's your " + size + " inch " + crustType + " crust pizza");
	}
	
	public String getCrustType() {
		return this.crustType;
	}
	
	public void setCrustType(String crustType) {
		this.crustType = crustType;
}
	
}