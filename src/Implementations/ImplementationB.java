/**
 *
 * @author albertosanmartinmartinez
 */

package Implementations;

public class ImplementationB implements InterfaceB {
    
    private InterfaceD d;
    
    public ImplementationB(InterfaceD d) {
        this.d = d;
    }
    /*
    public InterfaceD getInterface() {
        return this.d;
    }
    */
}
