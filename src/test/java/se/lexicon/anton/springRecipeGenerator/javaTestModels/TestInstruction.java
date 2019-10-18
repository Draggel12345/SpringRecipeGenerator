package se.lexicon.anton.springRecipeGenerator.javaTestModels;

import se.lexicon.anton.springRecipeGenerator.models.Instruction;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestInstruction {

	private Instruction testObject;
	
	@Before
	public void setUp() {
		testObject = new Instruction(1, "testing");
	}
	
	@Test
	public void test_created_success() {
		assertEquals(1, testObject.getId());
		assertEquals("testing", testObject.getTextContent());
	}
	
	@Test
	public void test_hashCode_and_equals() {
		Instruction copy = new Instruction(1, "testing");
		assertTrue(copy.equals(testObject));
		assertEquals(copy.hashCode(), testObject.hashCode());
	}
	
	
	public void test_toString_contains_correct_information() {
		String toString = testObject.toString();
		assertTrue(
				toString.contains("1") &&
				toString.contains("testing")
				);
	}
}
