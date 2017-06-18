/**
 *
 * @author albertosanmartinmartinez
 */

package Simple;
import Common.*;

public interface SimpleInjector {
    
    void registerConstat (String name, Object value) throws DependencyException;
    
    void registerFactory (String name, SimpleFactory creator, String... parameters) throws DependencyException;
    
    Object getObject (String name) throws DependencyException;
}
