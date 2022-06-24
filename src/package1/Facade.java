/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import package2.C;
import package3.E;
import package5.G;

public class Facade {

    A a = new A();
    B b = new B();
    C c = new C();
    E e = new E();
    G g;

    public Facade(G g) {

        this.g = g;

    }

    public void Process() {

        b.n(a.getI());
        c.p();
        e.getFile();
        g.Start();

    }

}
