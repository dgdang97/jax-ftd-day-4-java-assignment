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
		return "Catterfly [wingspan-" + wingspan + ", weight-" + weight + "]"; // TODO: to be implemented
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(wingspan);
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
		Catterfly other = (Catterfly) obj;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(wingspan) != Double.doubleToLongBits(other.wingspan))
			return false;
		return true;
	}

}
