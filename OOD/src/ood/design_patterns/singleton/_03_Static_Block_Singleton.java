/**
 *  @author Yunxiang He
 *  @date   12/02/2018
 */

package ood.design_patterns.singleton;

import java.io.File;
import java.io.IOException;

public class _03_Static_Block_Singleton {

    private static _03_Static_Block_Singleton instance;

    private _03_Static_Block_Singleton() throws IOException {
        System.out.println("Singleton is initializing");
        File.createTempFile(".", ".");
        instance = new _03_Static_Block_Singleton();
    }

    static {
        try {
            instance = new _03_Static_Block_Singleton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static _03_Static_Block_Singleton getInstance() {
        return instance;
    }

}
