package mockito;

import java.util.Date;

public class F1Car {
	
	private String name;
	private int rpm;
	private String team;
	private Date foundedDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRpm() {
		return rpm;
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Date getFoundedDate() {
		return foundedDate;
	}
	public void setFoundedDate(Date foundedDate) {
		this.foundedDate = foundedDate;
	}
	
	@Override
	public String toString() {
		return "F1Car [name=" + name + ", rpm=" + rpm + ", team=" + team + ", foundedDate=" + foundedDate + "]";
	}

}
