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

    @Override
    public InterfaceD getAtribute() {
        return this.d;
    }
}
