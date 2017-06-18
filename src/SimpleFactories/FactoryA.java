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
        
        InterfaceB b;
        InterfaceC c;
        
        try {
            b = (InterfaceB) param[0];
            c = (InterfaceC) param[1];
        }
        catch (ClassCastException | ArrayIndexOutOfBoundsException ex) {
            throw new DependencyException(ex);
        }
        return new ImplementationA(b, c);
    }  
}
