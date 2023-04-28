package com.xworkz.movies.dao;

import com.xworkz.movies.dto.Moviesdto;

public class Moviesdao {
	Moviesdto[] rak = new Moviesdto[10];

	public boolean savemovie(Moviesdto movi) {
		if (movi != null && movi.getMovieName()!=null && movi.getHeroName()!=null) {
			if (movi.getMovieName().length() > 3 && movi.getHeroName().length() > 3) {
				System.out.println("The Given Value valid");

				for (int i = 0; i <= rak.length - 1; i++) {
					if (rak[i] == null) {
						rak[i] = movi;
						System.out.println("movie script added");
						return true;
					}

				}
				System.out.println("movie script not added");
				return false;

			}
			System.out.println("length is not valid");

			return false;

		}
		System.out.println("movie name is null hero name is null");
		return false;
	}

	public Moviesdto[] allmovies() {
		return rak;

	}

}
