import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author nghui
 *
 */
class ProfileCollectionTest {

	private ProfileCollection pc; // variables created
	private Profile p1;
	private Profile p2;
	private Profile p3;
	private final int PROFILE_COLLECTION_SIZE = 3;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		// Arrange
		pc = new ProfileCollection();
		p1 = new Profile("firstname1", "lastname1", "gender1");
		p2 = new Profile("firstname2", "lastname2", "gender2");
		p3 = new Profile("firstname3", "lastname3", "gender3");

		pc.addProfile(p1); // adding data into list
		pc.addProfile(p2);
		pc.addProfile(p3);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddProfile() { // testing function ; test the create function , the add profile function
		List<Profile> testPc = pc.getProfiles(); // create a list and retrieve and put in list
		assertEquals(testPc.size(), PROFILE_COLLECTION_SIZE);

		pc.addProfile(p1); // add profile 1

		assertEquals(pc.getProfiles().size(), PROFILE_COLLECTION_SIZE + 1); // increase the total count by 1
	}

	@Test
	void testGetProfile() {
		List<Profile> testPc = pc.getProfiles(); // make list ; retrieve ; put into list
		assertEquals(testPc.size(), 3); // retrieve 3 items
	}

	@Test
	void testUpdateProfile() {
		List<Profile> testPc = pc.getProfiles();
		assertEquals(testPc.size(), PROFILE_COLLECTION_SIZE);

		pc.updateProfile(p1); // update profile 1

		assertEquals(p1.firstname, "Updated the First Name."); // update the first name of profile 1
	}

	@Test
	void testDeleteProfile() {
		List<Profile> testPc = pc.getProfiles();
		assertEquals(testPc.size(), PROFILE_COLLECTION_SIZE);
		pc.deleteProfile(p1); //delete p1
		assertEquals(pc.getProfiles().size(), PROFILE_COLLECTION_SIZE - 1); //reduce total count by 1 
	}

}