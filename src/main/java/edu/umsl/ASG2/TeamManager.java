package edu.umsl.ASG2;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TeamManager {

	public void menu() {

		addTeams();

	}

	public void addTeams() {
		for (int i = 1; i < 11; i++) {
			String teamNumber = "Team" + i;
			addTeamHibernate(teamNumber, 6, 6, 6, 6, "", 6);
		}
//		TeamScore ts1 = new TeamScore("Team1", 6, 6, 6, 6, "", 6);
	}

	public void addTeamHibernate(String team, int score1, int score2, int score3, int score4, String comm,
			double avg){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;


		tx = session.beginTransaction();

		// Add Initial Team Objects
		TeamScore ts = new TeamScore();
		ts.setTeamname(team);
		ts.setQ1(score1);
		ts.setQ2(score2);
		ts.setQ3(score3);
		ts.setQ4(score4);
		ts.setComments(comm);

		// Save in database
		session.save(ts);

		// Commit the save
		tx.commit();
		session.close();

	}

}
