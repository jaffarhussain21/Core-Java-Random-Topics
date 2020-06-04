package SortingBasics;

//user defined class
public class Player implements Comparable<Player> {
	private int ranking;
	private String name;
	private int age;

	public Player(int ranking, String name, int age) {
		// TODO Auto-generated constructor stub
		this.ranking = ranking;
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the ranking
	 */
	public int getRanking() {
		return ranking;
	}

	/**
	 * @param ranking the ranking to set
	 */
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " : " + age + " : " + ranking + " : ";
	}
	// constructor, getters, setters

	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return (this.getRanking() - o.getRanking()); // 0 , -1 , +1
	}

	// to compare Strings use below method
	/*
	 * @Override public int compareTo(Player o) { // TODO Auto-generated method stub
	 * return (this.getName()).compareTo(o.getName()); // 0 , -1 , +1 }
	 */

}
