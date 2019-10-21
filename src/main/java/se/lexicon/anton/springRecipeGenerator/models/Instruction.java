package se.lexicon.anton.springRecipeGenerator.models;

import java.util.Objects;

public class Instruction {

	private int id;
	private String textContent;
	
	private Recipe owner;
	
	public Instruction(int id, String textContent, Recipe owner) {
		this.id = id;
		this.textContent = textContent;
		this.owner = owner;
	}

	public Instruction(String textContent) {
		setTextContent(textContent);
	}
	
	public Instruction() {}
	
	public String getTextContent() {
		return textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}
	
	public Recipe getRecipe() {
		return owner;
	}

	public void setRecipe(Recipe owner) {
		this.owner = owner;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, textContent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instruction other = (Instruction) obj;
		return id == other.id && Objects.equals(textContent, other.textContent);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Instruction [id=");
		builder.append(id);
		builder.append(", textContent=");
		builder.append(textContent);
		builder.append("]");
		return builder.toString();
	}
}
