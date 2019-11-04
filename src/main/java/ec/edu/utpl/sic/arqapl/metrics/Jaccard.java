package ec.edu.utpl.sic.arqapl.metrics;

import smile.math.distance.JaccardDistance;

public class Jaccard implements Similaritable {
    @Override
    public double similarity(String text1, String text2) {
        JaccardDistance jaccard = new JaccardDistance<String>();
        double similarity = 1.0 - jaccard.d(text1.split("\\s"),
                text2.split("\\s"));

        return similarity;
    }
}
