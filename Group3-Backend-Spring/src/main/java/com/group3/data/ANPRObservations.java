package KB;
import java.time.LocalDateTime;

public class ANPRObservations {

	private Integer ANPRPointId;
	private LocalDateTime timeStamp;

	public ANPRObservations(Integer aNPRPointId, LocalDateTime timeStamp) {
		super();
		ANPRPointId = aNPRPointId;
		this.timeStamp = timeStamp;
	}

	public ANPRObservations() {

	}

	public Integer getANPRPointId() {
		return ANPRPointId;
	}

	public void setANPRPointId(Integer aNPRPointId) {
		ANPRPointId = aNPRPointId;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

}
