package se.lexicon.anton.springRecipeGenerator.models;

import java.util.Objects;

public class Instruction {

	private int id;
	private String textContent;
	
	public Instruction(int id, String textContent) {
		this.id = id;
		this.textContent = textContent;
	}

	public String getTextContent() {
		return textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
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
