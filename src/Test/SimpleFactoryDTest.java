/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Common.DependencyException;
import Implementations.ImplementationD;
import Implementations.InterfaceD;
import SimpleFactories.FactoryD;
import Simple.SimpleContainer;
import Simple.SimpleInjector;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class SimpleFactoryDTest {

    @Test
    public void simple_factory_d () throws DependencyException {
        SimpleInjector injector = new SimpleContainer();
        injector.registerConstat("I", 42);
        injector.registerFactory("D", new FactoryD(), "I");
        InterfaceD d = (InterfaceD) injector.getObject("D");
        assertThat(d, is(instanceOf(ImplementationD.class)));
        ImplementationD d1 = (ImplementationD) d;
        assertThat(d1.i, is(42));
        System.out.println("Test D Ok");
    }
    
    public static void main(String[] args) throws DependencyException {
        SimpleFactoryDTest simple_factory_d = new SimpleFactoryDTest();
        simple_factory_d.simple_factory_d();
    }
}
