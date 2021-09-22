import java.util.ArrayList;

public class MyThreeFavoriteThingsGeneric<T> {

	// This array stores the 3 favorite things and it should contain exactly 3
	// elements.
	ArrayList<T> favourites;

	/**
	 * Construct a new object to store a list of someone's three favorite things in
	 * one category.
	 * 
	 * @param thing1 The most favorite thing
	 * @param thing2 The second most favorite thing
	 * @param thing3 The third most favorite thing
	 */
	MyThreeFavoriteThingsGeneric(T thing1, T thing2, T thing3) {
		favourites = new ArrayList<T>();
		favourites.add(thing1);
		favourites.add(thing2);
		favourites.add(thing3);
	}

	/**
	 * Return the most favorite thing
	 * 
	 * @return The most favorite thing
	 */
	T getFavorite() {
		return favourites.get(0);
	}

	/**
	 * Determine whether or not a given thing is one of the favorite things.
	 * 
	 * @param thing The thing we are asking about -- is it one of the favorites?
	 * @return true if thing is a favorite, false otherwise.
	 */
	boolean isAFavourite(T thing) {
		for (int i = 0; i < favourites.size(); i++) {
			if (thing.equals(favourites.get(i))) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		MyThreeFavoriteThingsGeneric<Integer> faves = new MyThreeFavoriteThingsGeneric<>(72, 11, 64);
		System.out.println(faves.getFavorite());
		System.out.println(faves.isAFavourite(11));
		System.out.println(faves.isAFavourite(67));
//		System.out.println(faves.isAFavourite("green"));
	}
}
