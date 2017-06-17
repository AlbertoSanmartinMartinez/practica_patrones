/**
 *
 * @author albertosanmartinmartinez
 */

package Simple;

public interface SimpleInjector {
    
    // asocia el nombre al valor, 
    void registerConstat (String nane, Object value) throws DependencyException;
    
    // 
    void registerFactory (String name, Factory creator, String parameters) throws DependencyException;
    
    // devuelve o crea un objeto nuevo asociado con el nombre
    Object getObject (String name) throws DependencyException;
}
