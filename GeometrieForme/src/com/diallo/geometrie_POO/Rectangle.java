package com.diallo.geometrie_POO;

public class Rectangle extends Forme implements Moveable {
	
	private double longueur;
	private double largeur;
	

	/**
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {

		this.longueur = longueur;
		this.largeur = largeur;
	}

	
	@Override
	public void move(int dx, int dy) {
		
		this.x = 10 * dx;
		this.y = 10 * dy;

	}

	@Override
	public double superficie() {
		
		return this.longueur * this.largeur;
	}

	@Override
	public double perimetre() {
		
		return 2.00 * (this.largeur + this.longueur);
	}

}
