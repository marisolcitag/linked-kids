package model;

import java.util.Comparator;

public class Kid implements Comparator<Kid>{
	private String name;
	private int age;
	
	private Kid previousKid;
	private Kid nextKid;
	
	public Kid(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Kid getPreviousKid() {
		return previousKid;
	}

	public Kid getNextKid() {
		return nextKid;
	}

	public void setPreviousKid(Kid previousKid) {
		this.previousKid = previousKid;
	}

	public void setNextKid(Kid nextKid) {
		this.nextKid = nextKid;
	}
	
	@Override
	public int compare(Kid k1, Kid k2) {
		if(k1.age<k2.age) {
			return -1;
		}
		if(k1.age>k2.age) {
			return 1;
		}
		return 0;
	}
}
