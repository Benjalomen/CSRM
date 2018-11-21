import java.io.Serializable;
import java.util.ArrayList;

public class Element implements Serializable {
	private ArrayList<String> capabilities;
	private ArrayList<String> requirements;
	
	public Element(ArrayList<String> capabilities, ArrayList<String> requirements) {
		super();
		this.capabilities = capabilities;
		this.requirements = requirements;
	}
	
	public ArrayList<String> getCapabilities() {
		return capabilities;
	}
	
	public void setCapabilities(ArrayList<String> capabilities) {
		this.capabilities = capabilities;
	}
	
	public ArrayList<String> getRequirements() {
		return requirements;
	}
	
	public void setRequirements(ArrayList<String> requirements) {
		this.requirements = requirements;
	}
	
	@Override
	public String toString() {
		return "Element [capabilities=" + capabilities + ", requirements=" + requirements + "]";
	}
}
