
import org.javers.core.metamodel.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class Foo {

    public Foo(String name) {
        this.name = name;
    }

    public Foo(String name, List<Foo> children) {
        this.name = name;
        this.children = children;
    }

    public Foo() {
    }

    @Id
    public String name = "";
    public List<Foo> children = new ArrayList<Foo>();


    @Override
    public String toString() {
        return "Foo{" +
                "name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
