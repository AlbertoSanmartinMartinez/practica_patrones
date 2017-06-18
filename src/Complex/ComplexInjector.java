/**
 *
 * @author albertosanmartinmartinez
 */

package Complex;
import Common.DependencyException;

public interface ComplexInjector {

    <E> void registerConstant (Class<E> name, E value) throws DependencyException;
    
    <E> void registerFactory (Class <E> name, ComplexFactory<? extends E> creator, Class<?>... parameters) throws DependencyException;
    
    <E> E getObject (Class<E> name) throws DependencyException;
}
