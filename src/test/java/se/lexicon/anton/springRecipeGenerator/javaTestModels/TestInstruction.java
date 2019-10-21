package se.lexicon.anton.springRecipeGenerator.javaTestModels;

import se.lexicon.anton.springRecipeGenerator.models.Instruction;
import se.lexicon.anton.springRecipeGenerator.models.Recipe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestInstruction {

	private Instruction testObject;
	
	@Before
	public void setUp() {
		testObject = new Instruction("testing");
		Recipe recipe = new Recipe("test recipe", "recipe testing");
		recipe.addInstruction(testObject);
	}
	
	@Test
	public void test_created_success() {
		assertEquals(0, testObject.getId());
		assertEquals("testing", testObject.getTextContent());
		assertNotNull(testObject.getRecipe());
	}
	
	@Test
	public void test_hashCode_and_equals() {
		Instruction copy = new Instruction("testing");
		Recipe recipe = new Recipe("test recipe", "recipe testing");
		recipe.addInstruction(copy);
		
		assertTrue(copy.equals(testObject));
		assertEquals(copy.hashCode(), testObject.hashCode());
	}
	
	@Test
	public void test_toString_contains_correct_information() {
		String toString = testObject.toString();
		assertTrue(
				toString.contains("0") &&
				toString.contains("testing")
				);
	}
}
