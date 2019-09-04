
public class 己利 {

	String name;
	String address;
	double math;
	double english;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	
	public double getTotal() {
		return math+english;
	}
	
	public double getAverage() {
		return getTotal()/2;
	}
	
	@Override
	public String toString() {
		return "己利 [name=" + name + ", address=" + address +
				", math=" + math + ", english=" + english +
				", total= "+ getTotal() +", average= " + getAverage() + "]";
	}
	
}
