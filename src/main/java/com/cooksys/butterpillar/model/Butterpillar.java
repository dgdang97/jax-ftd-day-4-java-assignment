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
		return "Butterpillar [length=" + length + ", leavesEaten=" + leavesEaten + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(leavesEaten);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Butterpillar other = (Butterpillar) obj;
		if (Double.doubleToLongBits(leavesEaten) != Double.doubleToLongBits(other.leavesEaten))
			return false;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		return true;
	}
	
	

}

