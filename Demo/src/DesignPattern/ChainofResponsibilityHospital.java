package DesignPattern;

enum Specialties {
	Heart, Lungs, Oesophagus, Chest, Veins, Arteries, Head, Neck, Voice, Ear, Nose, Kidney, Bladder
}

class SurgicalRequest {
	private String firstname;
	private String lastname;
	private Specialties specialty;

	public SurgicalRequest(String firstname, String lastname, Specialties specialty) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.specialty = specialty;
	}

	public String getFirstname() {
		return firstname;
	}

	public Specialties getSpecialty() {
		return specialty;
	}

	public String getLastname() {
		return lastname;
	}
}

abstract class Surgeon {

	protected Surgeon nextSurgeon;

	public void setNext(Surgeon next) {
		this.nextSurgeon = next;
	}

	public abstract void operate(SurgicalRequest request);
}

class VascularSurgeon extends Surgeon {
	@Override
	public void operate(SurgicalRequest request) {
		Specialties specialty = request.getSpecialty();
		if (specialty == Specialties.Arteries || specialty == Specialties.Veins) {
			System.out.println(String.format("The %s will operate on %s %s. Request approved",
					this.getClass().getSimpleName(), request.getFirstname(), request.getLastname()));
		} else {
			if (nextSurgeon != null) {
				System.out.println(String.format("%s cannot operate on patient %s %s. Passing request to %s...",
						this.getClass().getSimpleName(), request.getFirstname(), request.getLastname(),
						nextSurgeon.getClass().getSimpleName()));

				nextSurgeon.operate(request);
			} else {
				System.out.println(String.format("Could not find a surgeon who specializes in %s. Request rejected.",
						request.getSpecialty()));
			}
		}

	}
}

class CardiothoracicSurgeon extends Surgeon {
	@Override
	public void operate(SurgicalRequest request) {
		Specialties specialty = request.getSpecialty();
		if (specialty == Specialties.Heart || specialty == Specialties.Lungs || specialty == Specialties.Chest
				|| specialty == Specialties.Oesophagus) {
			System.out.println(String.format("The %s will operate on %s %s. Request approved",
					this.getClass().getSimpleName(), request.getFirstname(), request.getLastname()));
		} else {
			if (nextSurgeon != null) {
				System.out.println(String.format("%s cannot operate on patient %s %s. Passing request to %s...",
						this.getClass().getSimpleName(), request.getFirstname(), request.getLastname(),
						nextSurgeon.getClass().getSimpleName()));

				nextSurgeon.operate(request);
			} else {
				System.out.println(String.format("Could not find a surgeon who specializes in %s. Request rejected.",
						request.getSpecialty()));
			}
		}

	}
}

class OtolaryngologySurgeon extends Surgeon {
	@Override
	public void operate(SurgicalRequest request) {
		Specialties specialty = request.getSpecialty();
		if (specialty == Specialties.Head || specialty == Specialties.Neck || specialty == Specialties.Voice
				|| specialty == Specialties.Ear || specialty == Specialties.Nose) {
			System.out.println(String.format("The %s will operate on %s %s. Request approved",
					this.getClass().getSimpleName(), request.getFirstname(), request.getLastname()));
		} else {
			if (nextSurgeon != null) {
				System.out.println(String.format("%s cannot operate on patient %s %s. Passing request to %s...",
						this.getClass().getSimpleName(), request.getFirstname(), request.getLastname(),
						nextSurgeon.getClass().getSimpleName()));

				nextSurgeon.operate(request);
			} else {
				System.out.println(String.format("Could not find a surgeon who specializes in %s. Request rejected.",
						request.getSpecialty()));
			}
		}
	}
}

public class ChainofResponsibilityHospital {
	public static void main(String[] args) {

		OtolaryngologySurgeon otolarynS = new OtolaryngologySurgeon();
		VascularSurgeon vacularS = new VascularSurgeon();
		CardiothoracicSurgeon cardioS = new CardiothoracicSurgeon();

		// chain
		otolarynS.setNext(vacularS);
		vacularS.setNext(cardioS);

		SurgicalRequest heartRequest = new SurgicalRequest("Jackie", "Chan", Specialties.Heart);

		System.out.println("\n-----heart request-----");
		otolarynS.operate(heartRequest);

		SurgicalRequest bladderRequest = new SurgicalRequest("Jet", "Lee", Specialties.Bladder);

		System.out.println("\n-----bladder request-----");
		otolarynS.operate(bladderRequest);

	}
}



//This simply means that each object in the chain behaves as an object-oriented version of an if-condition. 
//When a request comes in the chain, if it cannot be handled by the first object, 
//it gets passed on to the next object and so forth until it’s handled or rejected if no object can handle it.
//Each object contains specific logic on what level or type of request they can handle. 
//Each object must have a way to add the next processing object to the chain. When an object has no next object, 
//that is an indicator that you’ve reached the end of the chain.
