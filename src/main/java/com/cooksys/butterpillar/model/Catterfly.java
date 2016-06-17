package com.cooksys.butterpillar.model;

public class Catterfly {
	
	// any instance fields should be private
	private double wingspan;
	private double weight;
	
	public double getWingspan() {
		return wingspan; // to be implemented
	}

	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;	// to be implemented
	}

	public double getWeight() {
		return weight; // TODO: to be implemented
	}

	public void setWeight(double weight) {
		this.weight = weight;	// TODO: to be implemented
	}
	
	public boolean equals(Catterfly c) {
		boolean check = (c.weight == c.getWeight() && c.wingspan == c.getWingspan());
		return check; // TODO: to be implemented
	}
	
	@Override
	public String toString() {
		return null; // TODO: to be implemented
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Catterfly) {
			return this.equals((Catterfly) o);
		} else {
			return false;
		}
	}

}
