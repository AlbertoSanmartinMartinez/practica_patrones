/**
 *
 * @author albertosanmartinmartinez
 */

package Implementations;

public class ImplementationA implements InterfaceA {
    
    private InterfaceB b;
    private InterfaceC c;
    
    public ImplementationA (InterfaceB b, InterfaceC c) {
        this.b = b;
        this.c = c;
    }
}
