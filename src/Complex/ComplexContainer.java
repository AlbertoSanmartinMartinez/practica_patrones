/**
 *
 * @author albertosanmartinmartinez
 */

package Complex;
import Common.DependencyException;
import java.util.HashMap;
import java.util.Map;

public class ComplexContainer implements ComplexInjector {

    private Map<Object, Object> map_constant;
    private Map<String, Object> map_factory;
    
    public ComplexContainer () {
        this.map_constant = new HashMap<Object, Object>();
        this.map_factory = new HashMap<String, Object>();
    }
    
    @Override
    public <E> void registerConstant(Class<E> name, E value) throws DependencyException {
        if (map_constant.containsKey(name)) {
            throw new DependencyException("El nombre ya está registrado.");
        }
        else {
            if (value instanceof Integer) {
                map_constant.put(name, (Integer) value);
            }
            else if (value instanceof String) {
                map_constant.put(name, (String) value);
            }

            else {
                map_constant.put(name, value);
            }
        }
    }

    @Override
    public <E> void registerFactory(Class<E> name, ComplexFactory<? extends E> creator, Class<?>... parameters) throws DependencyException {
        
    }

    @Override
    public <E> E getObject(Class<E> name) throws DependencyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
