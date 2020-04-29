package com.diallo.geometrie_POO;

public class Cercle extends Forme implements Moveable{
	
	private double rayon;
	
	
	/**
	 * one 
	 * @param rayon
	 */
	public Cercle(int x, int y, double rayon) {
		
		//super(x, y); est ce possible
		
		this.x = x;
		this.y = y;
		this.rayon = rayon;
	}

	/**
	 * two
	 */
	public Cercle() {
		
		// call and itialysing first constructor
		this(5, 5, 10.00);
	}

	/**
	 * three
	 * @param rayon
	 */
	public Cercle(double rayon) {
	
		// call and initialysing first Constructor
		this(14, 20, rayon);
	}

	@Override
	public double superficie() {
		
		return Math.PI * (this.rayon * this.rayon);
	}

	@Override
	public double perimetre() {
		
		return (2 * Math.PI) * this.rayon;
	}

	@Override
	public void move(int dx, int dy) {
		
		this.x = 2 * dx;
		this.y = 2 * dy;
		
	}

	
}
