package se.lexicon.anton.springRecipeGenerator.javaTestModels;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import se.lexicon.anton.springRecipeGenerator.models.Ingredient;
import se.lexicon.anton.springRecipeGenerator.models.MeasuredIngredient;
import se.lexicon.anton.springRecipeGenerator.models.Measurement;
import se.lexicon.anton.springRecipeGenerator.models.Recipe;

public class TestMeasuredIngredient {

	private MeasuredIngredient testObject;
	private Ingredient ingredient;
	
	@Before
	public void setUp() {
		ingredient = new Ingredient("Spam");
		Recipe recipe = new Recipe("test recipe", "testing");
		testObject = new MeasuredIngredient(ingredient, Measurement.KG, 2);
		recipe.addIngredient(testObject);
	}
	
	@Test
	public void testObject_created_success() {
		assertEquals(0, testObject.getId());
		assertEquals(Measurement.KG, testObject.getMeasurement());
		assertEquals(2, testObject.getAmount(), 0);
		assertNotNull(testObject.getIngredient());
		assertNotNull(testObject.getRecipe());
	}
	
	@Test
	public void test_hashCode_and_equals() {
		Ingredient ingredient = new Ingredient("Spam");
		Recipe recipe = new Recipe("test recipe", "testing");
		MeasuredIngredient copy = new MeasuredIngredient(ingredient, Measurement.KG, 2);
		recipe.addIngredient(copy);
		
		assertTrue(copy.equals(testObject));
		assertEquals(copy.hashCode(), testObject.hashCode());
	}
	
	@Test
	public void test_toString_contains_right_information() {
		String toString = testObject.toString();
		assertTrue(
				toString.contains("0") &&
				toString.contains("Spam") &&
				toString.contains(Measurement.KG.name()) &&
				toString.contains("2.0")
				);
	}
	
}
