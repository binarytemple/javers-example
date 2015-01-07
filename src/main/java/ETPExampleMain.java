import com.metadave.etp.ETP;
import com.metadave.etp.rep.ETPTerm;
import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.MappingStyle;
import org.javers.core.diff.Diff;

import java.io.IOException;
import java.io.InputStream;

public class ETPExampleMain {
    public static void main(String[] args) throws IOException, ETP.ParseException {

        ETPTerm parse = getEtpTerm("app.config");
        ETPTerm parse2 = getEtpTerm("app-modified.config");


        System.err.println(parse);
        System.err.println(parse2);




        Javers javers = JaversBuilder.javers()

                .withMappingStyle(MappingStyle.BEAN)
                .build();

        Diff compare = javers.compare(parse, parse2);
        System.err.println(compare);


    }

    private static ETPTerm getEtpTerm(String path) throws IOException, ETP.ParseException {
        InputStream stream = ETPExampleMain.class.getResourceAsStream(path);
        return ETP.parse(stream);
    }
}
