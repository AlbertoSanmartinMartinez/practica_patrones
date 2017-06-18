/**
 *
 * @author albertosanmartinmartinez
 */

package SimpleFactories;
import Common.DependencyException;
import Implementations.ImplementationC;
import Simple.SimpleFactory;

public class FactoryC implements SimpleFactory {

    @Override
    public ImplementationC create(Object[] param) throws DependencyException {
        String s;
        try {
            s = (String) param[0];
        }
        catch (ClassCastException | ArrayIndexOutOfBoundsException ex) {
            throw new DependencyException(ex);
        }
        return new ImplementationC(s);
    }
}
