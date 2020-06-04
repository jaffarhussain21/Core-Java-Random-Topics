package polymorphism;

public class Car {
	
	private String model;
	private int engineNumber;
	
	public Car() {
		System.out.println("!!! Car Constructor Called !!!");
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the engineNumber
	 */
	public int getEngineNumber() {
		return engineNumber;
	}

	/**
	 * @param engineNumber the engineNumber to set
	 */
	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}
	

}
