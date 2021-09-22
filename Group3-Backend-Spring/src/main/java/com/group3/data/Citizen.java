package KB;

public class Citizen {

	private Long citizenID;
	private String placeOfBirth;

	public Citizen(Long citizenID, String placeOfBirth) {
		super();
		this.citizenID = citizenID;
		this.placeOfBirth = placeOfBirth;
	}

	public Citizen() {

	}

	public Long getCitizenID() {
		return citizenID;
	}

	public void setCitizenID(Long citizenID) {
		this.citizenID = citizenID;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

}
