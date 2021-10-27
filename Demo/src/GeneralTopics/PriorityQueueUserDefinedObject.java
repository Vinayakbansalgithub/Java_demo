package GeneralTopics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Plane {
	private String name;
	private int landingtime;
	private boolean isEmergency;

	public Plane(String name, int landingtime, boolean isEmergency) {
		super();
		this.name = name;
		this.landingtime = landingtime;
		this.isEmergency = isEmergency;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isEmergency ? 1231 : 1237);
		result = prime * result + landingtime;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		if (isEmergency != other.isEmergency)
			return false;
		if (landingtime != other.landingtime)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLandingtime() {
		return landingtime;
	}

	public void setLandingtime(int landingtime) {
		this.landingtime = landingtime;
	}

	public boolean isEmergency() {
		return isEmergency;
	}

	public void setEmergency(boolean isEmergency) {
		this.isEmergency = isEmergency;
	}

	@Override
	public String toString() {
		return "Plane [name=" + name + ", landingtime=" + landingtime + ", isEmergency=" + isEmergency + "]";
	}

}

//public int compareTo(Person other) {
//    int i = firstName.compareTo(other.firstName);
//    if (i != 0) return i;
//
//    i = lastName.compareTo(other.lastName);
//    if (i != 0) return i;
//
//    return Integer.compare(age, other.age);
//}

public class PriorityQueueUserDefinedObject {
	public static void main(String[] args) {

		List<Plane> list = new ArrayList<Plane>();

		// Add items to the Priority Queue
		list.add(new Plane("Rajeev", 376, false));
		list.add(new Plane("Chris", 676, true));
		list.add(new Plane("Andrea", 756, true));
		list.add(new Plane("Jack", 753, false));

		List<Plane> result = list.stream().sorted(Comparator.comparing(Plane::isEmergency).reversed())
				.collect(Collectors.toList());

		//result = result.stream().sorted(Comparator.comparing(Plane::getLandingtime)).collect(Collectors.toList());

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));

		}
	}
}
