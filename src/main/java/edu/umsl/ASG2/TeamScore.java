package edu.umsl.ASG2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEAMS")
public class TeamScore {
	@Id
	@Column(name = "TeamName")
	String teamname;

	@Column(name = "Technical")
	int q1;

	@Column(name = "Useful")
	int q2;

	@Column(name = "Clarity")
	int q3;

	@Column(name = "Overall")
	int q4;

	@Column(name = "Comments")
	String comments;

	@Column(name = "Average")
	double teamavg;

//	public TeamScore(String string, int i, int j, int k, int l, String string2, int m) {
//		// TODO Auto-generated constructor stub
//		this.teamname = string;
//		this.q1 = i;
//		this.q2 = j;
//		this.q3 = k;
//		this.q4 = l;
//		this.comments = string2;
//		this.teamavg = m;
//	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public int getQ1() {
		return q1;
	}

	public void setQ1(int q1) {
		this.q1 = q1;
	}

	public int getQ2() {
		return q2;
	}

	public void setQ2(int q2) {
		this.q2 = q2;
	}

	public int getQ3() {
		return q3;
	}

	public void setQ3(int q3) {
		this.q3 = q3;
	}

	public int getQ4() {
		return q4;
	}

	public void setQ4(int q4) {
		this.q4 = q4;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public double getTeamavg() {
		return teamavg;
	}

	public void setTeamavg(double teamavg) {
		this.teamavg = teamavg;
	}

}
