/**
 *
 * @author albertosanmartinmartinez
 */

package SimpleFactories;
import Common.DependencyException;
import Implementations.*;
import Simple.SimpleFactory;

public class FactoryA implements SimpleFactory {

    @Override
    public ImplementationA create(Object... param) throws DependencyException {
        
        InterfaceB b = null;
        InterfaceC c = null;
        
        try {
            if (param[0] instanceof InterfaceB) {
                b = (InterfaceB) param[0];
                
            }
            else if (param[0] instanceof InterfaceC) {
                c = (InterfaceC) param[0];
            }
        }
        catch (ClassCastException | ArrayIndexOutOfBoundsException ex) {
            throw new DependencyException(ex);
        }
        return new ImplementationA(b, c);
    }  
}
