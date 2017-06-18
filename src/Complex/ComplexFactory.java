/**
 *
 * @author albertosanmartinmartinez
 */

package Complex;

import Common.DependencyException;

public interface ComplexFactory<E> {

    E create (Object... parameters) throws DependencyException;
}
