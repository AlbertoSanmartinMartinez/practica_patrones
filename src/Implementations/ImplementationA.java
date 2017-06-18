/**
 *
 * @author albertosanmartinmartinez
 */

package Implementations;

import java.util.ArrayList;

public class ImplementationA implements InterfaceA {
    
    public InterfaceB b;
    public InterfaceC c;
    
    public ImplementationA (InterfaceB b, InterfaceC c) {
        this.b = b;
        this.c = c;
    }
}
