package se.lexicon.anton.springRecipeGenerator.models;

public enum Measurement {

	ML("ml"),
	CL("cl"),
	DL("dl"),
	L("l"),
	G("g"),
	HG("hg"),
	KG("kg"),
	KRM("krm"),
	TSK("tsk"),
	MSK("msk"),
	ST("st"),
	PINCH("pinch");
	
	private String measurement;

	private Measurement(String measurement) {
		this.measurement = measurement;
	}
	
	public String getMeasurement() {
		return measurement;
	}		
	
}
