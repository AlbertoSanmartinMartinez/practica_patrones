/**
 *
 * @author albertosanmartinmartinez
 */

package Simple;
import Common.*;

public interface SimpleInjector {
    
    // asocia el nombre al valor, 
    void registerConstat (String name, Object value) throws DependencyException;
    
    // 
    void registerFactory (String name, SimpleFactory creator, String... parameters) throws DependencyException;
    
    // devuelve o crea un objeto nuevo asociado con el nombre
    Object getObject (String name) throws DependencyException;
}
