
package ec.edu.utpl.sic.arqapl.metrics;

import org.apache.commons.text.similarity.JaroWinklerDistance;
public class Jaro  implements Similaritable{
    
    
    @Override
    public double similarity(String text1, String text2) {

    JaroWinklerDistance jaro1= new JaroWinklerDistance();
    double similarity= 1.0 - jaro1.apply(text1,text2);
        return similarity;

    }
}
