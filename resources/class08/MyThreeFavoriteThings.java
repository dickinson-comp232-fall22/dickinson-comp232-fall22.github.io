import java.util.ArrayList;

/**
 * This class is intended as practice for converting a non-generic class into a
 * generic class. An instance of MyThreeFavoriteThings is intended to store a
 * list of three things in one category, which are someone's favorite things in
 * that category. For example, this could be used to store someone's three
 * favorite integers (i.e. their lucky numbers). Or it could be used to store
 * someone's three favorite colors, in which case the objects stored should be
 * strings.
 * 
 * Because we don't know what kind of things should be stored, the code below is
 * written using Object as the datatype of things to store. But this could allow
 * the unfortunate mistake of storing different kinds of things in the list of
 * favorites (e.g. an integer, a string, and a date). When we convert this from
 * a non-generic class to a generic class, this mistake will be prevented. There
 * are numerous other advantages too.
 * 
 * @author jmac
 * @date September 2021
 *
 */
public class MyThreeFavoriteThings {

	// This array stores the 3 favorite things and it should contain exactly 3
	// elements.
	ArrayList favourites;

	/**
	 * Construct a new object to store a list of someone's three favorite things in
	 * one category.
	 * 
	 * @param thing1 The most favorite thing
	 * @param thing2 The second most favorite thing
	 * @param thing3 The third most favorite thing
	 */
	MyThreeFavoriteThings(Object thing1, Object thing2, Object thing3) {
		favourites = new ArrayList();
		favourites.add(thing1);
		favourites.add(thing2);
		favourites.add(thing3);
	}

	/**
	 * Return the most favorite thing
	 * 
	 * @return The most favorite thing
	 */
	Object getFavorite() {
		return favourites.get(0);
	}

	/**
	 * Determine whether or not a given thing is one of the favorite things.
	 * 
	 * @param thing The thing we are asking about -- is it one of the favorites?
	 * @return true if thing is a favorite, false otherwise.
	 */
	boolean isAFavourite(Object thing) {
		for (int i = 0; i < favourites.size(); i++) {
			if (thing.equals(favourites.get(i))) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		MyThreeFavoriteThings faves = new MyThreeFavoriteThings(72, 11, 64);
		System.out.println(faves.getFavorite());
		System.out.println(faves.isAFavourite(11));
		System.out.println(faves.isAFavourite(67));
		System.out.println(faves.isAFavourite("green"));
	}
}
