/**
 *  @author  Yunxiang He
 *  @date    Nov 25, 2017 1:34:52 AM
 */
package design_pattern.creational.singleton;

// Best approach
// Support auto seralization, protect from multiple instantiation
public class _07_Singleton_Enum {

    public static void main(String[] args) {
        Sgt.SINGLETON.whateverMethod();
    }
}

enum Sgt {

    SINGLETON;

    private int field;

    public void whateverMethod() {

    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

}
