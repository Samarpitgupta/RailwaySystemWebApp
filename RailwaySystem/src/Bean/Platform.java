package Bean;

public class Platform {
private int platNo;
private String currTrain;
private String allottedStatus;
public int getPlatNo() {
	return platNo;
}
public Platform(){}

public void setPlatNo(int platNo) {
	this.platNo = platNo;
}

public String getCurrTrain() {
	return currTrain;
}

public void setCurrTrain(String currTrain) {
	this.currTrain = currTrain;
}

public String getAllottedStatus() {
	return allottedStatus;
}

public void setAllottedStatus(String allottedStatus) {
	this.allottedStatus = allottedStatus;
}

public Platform(int platNo) {
	allottedStatus="false";
	this.platNo = platNo;
	currTrain=null;
}
//public void setPlatformNumber(int int1) {
//	
//	
//}


}