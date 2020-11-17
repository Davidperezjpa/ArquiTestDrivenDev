import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.*;


public class TestsDev {
	// -------------------------------------------------------
	// -------- We need to get the size of the list ----------
	// -------------------------------------------------------
	@Test
	public void getSizeList() {
		List<Integer> testList = new ArrayList<>();
		testList.add(0);
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);

		assertEquals(5, testList.size());
	}

	@Test
	public void getSizeEmptyList(){
		List<Integer> testList = new ArrayList<>();

		assertEquals(0, testList.size());
	}

	@Test(expected = NullPointerException.class)
	public void getSizeNullList() {
		List<Integer> testList = null;
		testList.size();
	}

	// -------------------------------------------------------
	// ------------- We need to clear the list ---------------
	// -------------------------------------------------------
	@Test
	public void getSizeClearList() {
		List<Integer> testList = new ArrayList<>();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(4);

		testList.clear();

		assertEquals(0, testList.size());
	}

	@Test (expected = NullPointerException.class)
	public void clearNullList() {
		List<Integer> testList = null;
		testList.clear();
	}

	@Test
	public void  clearList(){
		List<Integer> testList = new ArrayList<>();
		testList.clear();
		assertEquals(0, testList.size());
	}
	// -------------------------------------------------------
	// ---------------- We need to add Items -----------------
	// -------------------------------------------------------

	@Test
	public void addMultipleItems() {
		List<Integer> testList = new ArrayList<>();
		testList.add(0);
		testList.add(1);
		testList.add(2);
		testList.add(3);
		assertTrue(testList.contains(0));
		assertTrue(testList.contains(1));
		assertTrue(testList.contains(2));
		assertTrue(testList.contains(3));
	}

	@Test
	public void addItemsMultipleSize() {
		List<Integer> testList = new ArrayList<>();
		testList.add(0);
		testList.add(1);
		assertEquals(2,testList.size());
		testList.add(2);
		assertEquals(3,testList.size());
	}

	@Test
	public void addSameItemsList() {
		List<Integer> testList = new ArrayList<>();
		testList.add(0);
		testList.add(0);
		testList.add(0);
		testList.add(0);
		assertTrue(testList.contains(0));
	}

	// -------------------------------------------------------
	// ---- We need to be able to check if an item exists ----
	// -------------------------------------------------------
	@Test
	public void itemDoesNotExist() {
		List<Integer> testList = new ArrayList<>();
		testList.add(0);
		testList.add(1);
		assertFalse(testList.contains(2));

	}

	@Test
	public void ContainsEmptyList() {
		List<Integer> testList = new ArrayList<>();
		assertFalse(testList.contains(0));
	}

	@Test (expected = NullPointerException.class)
	public void ContainsNullList() {
		List<Integer> testList = null;
		testList.contains(0);
	}

	// -------------------------------------------------------
	// ---------- We need to get elements by index -----------
	// -------------------------------------------------------
	@Test
	public void getElementByIndex() {
		List<Integer> testList = new ArrayList<>();
		testList.add(0);
		testList.add(1);
		assertEquals(1,testList.get(1).intValue());
	}

	@Test (expected = IndexOutOfBoundsException.class)
	public void indexOutOfBoundsEx() {
		List<Integer> testList = new ArrayList<>();
		testList.add(0);
		testList.add(1);
		testList.get(3);
	}

	@Test
	public void indexDisplacement() {
		List<Integer> testList = new ArrayList<>();
		testList.add(0);
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.remove(0);
		assertEquals(1,testList.get(0).intValue());
	}

	// -------------------------------------------------------
	// ------ We need to search the index of an object -------
	// -------------------------------------------------------
	@Test
	public void searchIndexOfObject() {
		List<Integer> testList = new ArrayList<>();
		testList.add(0);
		testList.add(1);
		testList.add(2);
		assertEquals(2,testList.indexOf(2));
	}

	@Test (expected = NullPointerException.class)
	public void searchIndexOfNull() {
		List<Integer> testList = null;
		testList.indexOf(2);
	}

	@Test
	public void searchIndexOfDisplacement() {
		List<Integer> testList = new ArrayList<>();
		testList.add(0);
		testList.add(1);
		testList.add(2);
		testList.add(3);

		testList.remove(1);

		assertEquals(1,testList.indexOf(2));
	}

	// -------------------------------------------------------
	// --------- We need to remove an item by index ----------
	// -------------------------------------------------------
	@Test
	public void removeItemByIndex() {
		List<Integer> testList = new ArrayList<>();
		testList.add(0);
		testList.add(1);
		testList.add(2);

		testList.remove(1);
		assertEquals(2,testList.size());
	}

	@Test (expected = NullPointerException.class)
	public void removeItemNullList() {
		List<Integer> testList = null;
		testList.remove(1);
	}

	@Test (expected = IndexOutOfBoundsException.class)
	public void removeIndexOutOfBounds() {
		List<Integer> testList = new ArrayList<>();
		testList.add(0);
		testList.add(1);
		testList.add(2);
		testList.remove(4);
	}
}
