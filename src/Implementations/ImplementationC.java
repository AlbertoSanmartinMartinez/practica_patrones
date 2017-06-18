/**
 *
 * @author albertosanmartinmartinez
 */

package Implementations;

public class ImplementationC implements InterfaceC {
    
    public String s;
    
    public ImplementationC (String s) {
        this.s = s;
    }

    @Override
    public String getAtribute() {
        return this.s;
    }
}
