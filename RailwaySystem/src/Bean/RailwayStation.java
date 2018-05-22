package Bean;

public class RailwayStation {
private String statName;
private int platCount;
boolean waitStatus=false;

public RailwayStation(){}


public RailwayStation(String statName, int platCount) {
	this.statName = statName;
	this.platCount = platCount;
}
public String getStatName() {
	return statName;
}
public void setStatName(String statName) {
	this.statName = statName;
}
public int getPlatCount() {
	return platCount;
}
public void setPlatCount(int platCount) {
	this.platCount = platCount;
}



}
