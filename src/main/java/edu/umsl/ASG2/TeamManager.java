package edu.umsl.ASG2;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class TeamManager {
	private static SessionFactory factory;

	public void menu() {

		addTeams();

	}

	public void addTeams() {
		for (int i = 1; i < 9; i++) {
			String teamNumber = "Team" + (i + 1);
			updateTeam(i, 6, 6, 6, 6, "", 6);
		}
		// TeamScore ts1 = new TeamScore("Team1", 6, 6, 6, 6, "", 6);
	}

	public void addTeamHibernate(String team, int score1, int score2, int score3, int score4, String comm, double avg) {
		Session session = HibernateUtil.buildSessionFactory().openSession();
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

	public void updateTeam(Integer ID, int score1, int score2, int score3, int score4, String comm, double avg) {

		Session session = HibernateUtil.buildSessionFactory().openSession();

		Transaction tx = null;
		tx = session.beginTransaction();
		TeamScore ts = (TeamScore) session.get(TeamScore.class, ID);
		ts.setQ1(score1);
		ts.setQ2(score2);
		ts.setQ3(score3);
		ts.setQ4(score4);
		ts.setComments(comm);
		ts.setTeamavg(avg);

		// Save the Update
		session.update(ts);

		// Commit the save
		tx.commit();
		session.close();
	}

}
