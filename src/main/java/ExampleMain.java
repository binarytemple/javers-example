import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Change;
import org.javers.core.diff.Diff;

import java.util.Arrays;


public class ExampleMain {
    public static void main(String[] args) {
        Foo one = new Foo("head", Arrays.asList(new Foo("onechild")));
        Foo two = new Foo("head", Arrays.asList(new Foo("onechild"), new Foo("twochild1"), new Foo("twochild2")));

//        Javers javers = JaversBuilder.javers().registerValueObject(Foo.class).typeSafeValues().build();
       Javers javers = JaversBuilder.javers().build();

        Diff compare = javers.compare(one, two);
        System.err.println(compare);

        java.util.List<Change> changes = compare. getChanges();

        for (Change next : changes) {
            if (next.getCommitMetadata().isPresent()) {
                System.err.println(
                        next.getCommitMetadata().get()
                );
                System.err.println(
                        next.getAffectedGlobalId()
                );
            }
            System.err.println(
                    next.getAffectedCdo()
            );
        }

        System.err.print(compare.getChanges());
        System.err.print(compare.changesSummary());

    }
}