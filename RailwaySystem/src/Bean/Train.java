package Bean;

public class Train {

	
	private String trainName;
	private String arrTime;
	private String waitStatus;
	
	public Train()
	{}
	public Train(String trainName, String arrTime) {
		super();
		this.trainName = trainName;
		this.arrTime = arrTime;
		this.waitStatus="false";
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getArrTime() {
		return arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}
	public String getWaitStatus() {
		return waitStatus;
	}
	public void setWaitStatus(String waitStatus) {
		this.waitStatus = waitStatus;
	}
	
	
}
