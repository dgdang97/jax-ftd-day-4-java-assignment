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
		return null; // TODO: to be implemented
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof GrowthModel) {
			return this.equals((GrowthModel) o);
		} else {
			return false;
		}
	}

}
