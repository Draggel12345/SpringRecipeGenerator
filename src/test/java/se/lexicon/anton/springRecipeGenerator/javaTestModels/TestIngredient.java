package se.lexicon.anton.springRecipeGenerator.javaTestModels;

import se.lexicon.anton.springRecipeGenerator.models.Ingredient;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestIngredient {

	private Ingredient testObject;
	
	@Before
	public void setUp() {
		testObject = new Ingredient(1, "Spam");
	}
	
	@Test
	public void test_created_success() {
		assertNotNull(testObject);
		assertEquals(1, testObject.getId());
		assertEquals("Spam", testObject.getName());
	}
	
	@Test
	public void test_hashCode_and_equals() {
		Ingredient copy = new Ingredient(1, "Spam");
		assertTrue(copy.equals(testObject));
		assertEquals(copy.hashCode(), testObject.hashCode());
	}
	
	@Test
	public void test_toString_contains_correct_information() {
		String toString = testObject.toString();
		assertTrue(
				toString.contains("1") &&
				toString.contains("Spam")
				);
	}
}
