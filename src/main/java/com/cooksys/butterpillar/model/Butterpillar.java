package com.cooksys.butterpillar.model;

public class Butterpillar {
	
	// any instance fields should be private

	private double length;
	private double leavesEaten;
	
	public double getLength() {
		return length; // TODO: to be implemented
	}

	public void setLength(double length) {
		this.length = length;	// TODO: to be implemented
	}

	public double getLeavesEaten() {
		return leavesEaten; // TODO: to be implemented
	}

	public void setLeavesEaten(double leavesEaten) {
		this.leavesEaten = leavesEaten;	// TODO: to be implemented
	}
	
	public boolean equals(Butterpillar b) {
		boolean check = b.leavesEaten == b.getLeavesEaten() && b.length == b.getLength();
		return check; // TODO: to be implemented
	}
	
	@Override
	public String toString() {
		return null; // TODO: to be implemented
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Butterpillar) {
			return this.equals((Butterpillar) o);
		} else {
			return false;
		}
	}
	
	

}

