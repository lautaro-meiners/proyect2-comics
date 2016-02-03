package com.globant.academy.proyect2_comics;

public class Loans {
	private int loanId;
	private Comics comics;
	private People people;
	private String loanSituation;
	
	public Loans(int loanId, Comics comics, People people, String loanSituation){
		this.loanId = loanId;
		this.comics = comics;
		this.people = people;
		this.loanSituation = loanSituation;
	}
	
	public String toString(){
		return "Loan Id:" + loanId + "Comics" + comics + "People" + people + "Loan Situation:" + loanSituation;
	}
	
	public Comics getComics(){
		return this.comics;
	}
	
	public People getPeople(){
		return this.people;
	}
	
	
	
	
}
