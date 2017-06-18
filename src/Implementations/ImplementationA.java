/**
 *
 * @author albertosanmartinmartinez
 */

package Implementations;

import java.util.ArrayList;

public class ImplementationA implements InterfaceA {
    
    private InterfaceB b;
    private InterfaceC c;
    
    public ImplementationA (InterfaceB b, InterfaceC c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public Object[] getAtribute() {
        //ArrayList<Interface> array = new ArraayList<Interface>();
        return null;
    }
}
