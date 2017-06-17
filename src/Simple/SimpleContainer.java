/**
 *
 * @author albertosanmartinmartinez
 */

package Simple;

//clase que implementa la interfaz SimpleInjector
public class SimpleContainer implements SimpleInjector{

    @Override
    public void registerConstat(String nane, Object value) throws DependencyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registerFactory(String name, Factory creator, String parameters) throws DependencyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getObject(String name) throws DependencyException {
        
        //
        SimpleFactory simple_factory = null;
        return simple_factory.create(name);
    }
    
}
