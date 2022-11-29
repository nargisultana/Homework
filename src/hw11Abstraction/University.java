package hw11Abstraction;

public interface University extends College, Hospital{
	// Interface can't have constructor

	/*
	 * public University() {
	 * 
	 * }
	 */

	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {

	}

	public static void library() {

	}

//  We can not create constructor inside interface.
// Only we can declare by static final.

	/*
	 * Extends keyword is used for the inheritance in Interface. 
	 * Interface can't inherit regular class by extends key word. 
	 * Interface can inherit other Interface by extends key word.
	 * Interface can inherit multiple Interfaces by extends key word.
	 * Interface can't inherit abstract class by extends key word.
	 */
}