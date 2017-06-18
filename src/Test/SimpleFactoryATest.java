/**
 *
 * @author albertosanmartinmartinez
 */

package Test;

import Common.DependencyException;
import Implementations.ImplementationA;
import Implementations.InterfaceA;
import Simple.SimpleContainer;
import Simple.SimpleInjector;
import SimpleFactories.FactoryA;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class SimpleFactoryATest {
    @Test
    public void simple_factory_a () throws DependencyException {
        SimpleInjector injector = new SimpleContainer();
        injector.registerConstat("IF2", 42); //revisar el 42
        injector.registerFactory("A", new FactoryA(), "IF2");
        InterfaceA a = (InterfaceA) injector.getObject("A");
        assertThat(a, is(instanceOf(ImplementationA.class)));
        ImplementationA a1 = (ImplementationA) a;
        assertThat(a1.b, is(42));
        //assertThat(a1.c, is(42));
        System.out.println("Test A Ok");
    }
    
    public static void main(String[] args) throws DependencyException {
        SimpleFactoryATest simple_factory_a = new SimpleFactoryATest();
        simple_factory_a.simple_factory_a();
    }
}
