package designpatternsday04facasepattern;

import package1.Facade;
import package5.G;

public class Test {

    public static void main(String[] args) {

        int x = 500;

        G g = new G();
        g.x = x;
        Facade f = new Facade(g);
        f.Process();

    }

}
