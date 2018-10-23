package design_pattern.creational.singleton;

public class _04_Singleton_Eager_Instantiation {
    
    // Eagerly
	private static _04_Singleton_Eager_Instantiation uniqueInstance = new _04_Singleton_Eager_Instantiation();
 
	private _04_Singleton_Eager_Instantiation() {}
 
	public static _04_Singleton_Eager_Instantiation getInstance() {
		return uniqueInstance;
	}
}
