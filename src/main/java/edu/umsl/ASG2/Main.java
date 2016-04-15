package edu.umsl.ASG2;

import java.awt.EventQueue;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class Main {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		/*
		 * int q1 = 6; int q2 = 6; int q3 = 6; int q4 = 6; String comments = "";
		 * double teamAvg = 0;; TeamManager tm = new TeamManager();
		 * tm.updateTeam(1, q1, q2, q3, q4, comments, teamAvg);
		 */

		/*
		 * TeamManager tm = new TeamManager(); tm.addTeams();
		 */
		// HibernateUtil.shutdown();
	}

}