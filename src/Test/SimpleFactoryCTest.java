/**
 *
 * @author albertosanmartinmartinez
 */

package Test;

import Common.DependencyException;
import Implementations.ImplementationC;
import Implementations.InterfaceC;
import SimpleFactories.FactoryC;
import Simple.SimpleContainer;
import Simple.SimpleInjector;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class SimpleFactoryCTest {

    @Test
    public void simple_factory_c () throws DependencyException {
        SimpleInjector injector = new SimpleContainer();
        injector.registerConstat("S", 42);
        injector.registerFactory("C", new FactoryC(), "S");
        InterfaceC c = (InterfaceC) injector.getObject("C");
        assertThat(c, is(instanceOf(ImplementationC.class)));
        ImplementationC c1 = (ImplementationC) c;
        assertThat(c1.s, is(42));
        System.out.println("Test C Ok");
    }
    
    public static void main(String[] args) throws DependencyException {
        SimpleFactoryCTest simple_factory_c = new SimpleFactoryCTest();
        simple_factory_c.simple_factory_c();
    } 
}
