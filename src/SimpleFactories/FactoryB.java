/**
 *
 * @author albertosanmartinmartinez
 */

package SimpleFactories;
import Common.DependencyException;
import Implementations.*;
import Simple.SimpleFactory;

public class FactoryB implements SimpleFactory {

    @Override
    public ImplementationB create(Object[] param) throws DependencyException {
        
        InterfaceD d;
        
        try {
            d = (InterfaceD) param[0];
        }
        catch (ClassCastException | ArrayIndexOutOfBoundsException ex) {
            throw new DependencyException(ex);
        }
        return new ImplementationB(d);
    }  
}
