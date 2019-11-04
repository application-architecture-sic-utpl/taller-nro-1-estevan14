package ec.edu.utpl.sic.arqapl;


import ec.edu.utpl.sic.arqapl.metrics.Cosine;
import ec.edu.utpl.sic.arqapl.metrics.Jaccard;
import ec.edu.utpl.sic.arqapl.metrics.Jaro;
import ec.edu.utpl.sic.arqapl.metrics.Similaritable;

public class TweetSimilarity {
      private Similaritable algJ, algC, algJA;

    public TweetSimilarity() {
        algJ = new Jaccard();
        algC = new Cosine();
        algJA = new Jaro();
    }

    public TweetSimilarity(Similaritable algorithm) {
        this.algJ = algorithm;
        this.algC = algorithm;
        this.algJA = algorithm;
    }

    public double similarityJaccard(String tweet1, String tweet2) {
       // System.out.println("Algoritmo Jaccard");
        return algJ.similarity(tweet1, tweet2);
    }

    public double similarityCosine(String tweet1, String tweet2) {
        //System.out.println("Algoritmo Cosine");
        return algC.similarity(tweet1, tweet2);
    }

    public double similarityJaron(String tweet1, String tweet2) {
       // System.out.println("Algoritmo Jaron Winkel");
        return algJA.similarity(tweet1, tweet2);
    }
}
