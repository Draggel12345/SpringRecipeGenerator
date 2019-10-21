package se.lexicon.anton.springRecipeGenerator.models;

import java.util.Objects;

public class MeasuredIngredient {

	private int id;
	
	private Ingredient ingredient;
	
	private Recipe recipe;
	
	private Measurement measurement;
	double amount;
	
	public MeasuredIngredient(int id, Ingredient ingredient, Recipe recipe, Measurement measurement, double amount) {
		this.id = id;
		this.ingredient = ingredient;
		this.recipe = recipe;
		this.measurement = measurement;
		this.amount = amount;
	}

	public MeasuredIngredient(Ingredient ingredient, Measurement measurement, double amount) {
		setIngredient(ingredient);
		setMeasurement(measurement);
		setAmount(amount);
	}

	public MeasuredIngredient() {}
	
	public Ingredient getIngredient() {
		return ingredient;
	}
	
	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
	
	public Recipe getRecipe() {
		return recipe;
	}
	
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	
	public Measurement getMeasurement() {
		return measurement;
	}
	
	public void setMeasurement(Measurement measurement) {
		this.measurement = measurement;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, id, measurement);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MeasuredIngredient other = (MeasuredIngredient) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount) && id == other.id
				&& measurement == other.measurement;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeasuredIngredient [id=");
		builder.append(id);
		builder.append(", ingredient=");
		builder.append(ingredient);
		builder.append(", measurement=");
		builder.append(measurement);
		builder.append(", amount=");
		builder.append(amount);
		builder.append("]");
		return builder.toString();
	}
}
