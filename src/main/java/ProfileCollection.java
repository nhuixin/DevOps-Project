import java.util.*;

public class ProfileCollection {

	private ArrayList<Profile> profiles = new ArrayList<>();
	private int capacity;

	public ProfileCollection() {

		this.capacity = 20;
	}

	public ProfileCollection(int capacity) {
		this.capacity = capacity;
	}

	public List<Profile> getProfiles() {
		return profiles;
	}

	public void addProfile(Profile profile) {
		if (profiles.size() != capacity) {
			profiles.add(profile);
		}
	}

	public void updateProfile(Profile profile) {
		profile.firstname = "Updated the First Name.";
	}

	public void deleteProfile(Profile profile) {
		if (profiles.size() != capacity) {
			profiles.remove(profile);
		}
	}
}

