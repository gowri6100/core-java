package com.xworkz.movies;

import com.xworkz.movies.dao.Moviesdao;
import com.xworkz.movies.dto.Moviesdto;

public class MoviesRunner {

	public static void main(String[] args) {
		Moviesdao obj = new Moviesdao();

		Moviesdto obj1 = new Moviesdto("sapta sagara dache ello", "rakshit", "action", 6000, 7000000, "rishab");
		Moviesdto obj2 = new Moviesdto("rehna hai tere dil me", "madav", "discent movie", 8000, 50000000, "rishi");
		Moviesdto obj3 = new Moviesdto("titanic","leonardo dicaprio","love story",200000,60000000,"james camron");
		

		 obj.savemovie(obj1);
		 obj.savemovie(obj2);
		 obj.savemovie(obj3);

		

		Moviesdto[] kal = obj.allmovies();
		for (int j = 0; j < kal.length; j++) {
			if (kal[j] != null) {
				System.out.println(kal[j]);
			}

		}
	}

}
