/**
 *
 * @author albertosanmartinmartinez
 */

package SimpleFactories;
import Implementations.ImplementationD;
import Common.DependencyException;
import Simple.SimpleFactory;

public class FactoryD implements SimpleFactory {

    @Override
    public ImplementationD create(Object... param) throws DependencyException {
        
        int i;
        try {
            i = (int) param[0];
        }
        catch (ClassCastException | ArrayIndexOutOfBoundsException ex) {
            throw new DependencyException(ex);
        }
        return new ImplementationD(i);
    }    
}
