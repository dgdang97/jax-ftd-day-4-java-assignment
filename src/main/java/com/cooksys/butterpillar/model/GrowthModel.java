package com.cooksys.butterpillar.model;

public class GrowthModel {

	// any instance fields should be private
	private double lengthToWingspan;
	private double leavesEatenToWeight;
	
	public double getLengthToWingspan() {
		return lengthToWingspan; // to be implemented
	}

	public void setLengthToWingspan(double lengthToWingspan) {
		this.lengthToWingspan = lengthToWingspan;	// to be implemented
	}

	public double getLeavesEatenToWeight() {
		return leavesEatenToWeight; // to be implemented
	}

	public void setLeavesEatenToWeight(double leavesEatenToWeight) {
		this.leavesEatenToWeight = leavesEatenToWeight;	// to be implemented
	}

	public Catterfly butterpillarToCatterfly(Butterpillar butterpillar) {
		Catterfly catterfly = new Catterfly();
		catterfly.setWingspan(butterpillar.getLength() * getLengthToWingspan());
		catterfly.setWeight(butterpillar.getLeavesEaten() * getLeavesEatenToWeight());
		return catterfly; // to be implemented
	}

	public Butterpillar catterflyToButterpillar(Catterfly catterfly) {
		Butterpillar butterpillar = new Butterpillar();
		butterpillar.setLength(catterfly.getWingspan() / getLengthToWingspan());
		butterpillar.setLeavesEaten(catterfly.getWeight() / getLeavesEatenToWeight());
		return butterpillar; // to be implemented
	}
	
	public boolean equals(GrowthModel g) {
		boolean check = (g.lengthToWingspan == g.getLengthToWingspan() && g.leavesEatenToWeight == g.getLeavesEatenToWeight());
		return check; // TODO: to be implemented
	}
	
	@Override
	public String toString() {
		return "GrowthModel [lengthToWingspan=" + lengthToWingspan + ", leavesEatenToWeight=" + leavesEatenToWeight
				+ "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(leavesEatenToWeight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lengthToWingspan);
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
		GrowthModel other = (GrowthModel) obj;
		if (Double.doubleToLongBits(leavesEatenToWeight) != Double.doubleToLongBits(other.leavesEatenToWeight))
			return false;
		if (Double.doubleToLongBits(lengthToWingspan) != Double.doubleToLongBits(other.lengthToWingspan))
			return false;
		return true;
	}

}
