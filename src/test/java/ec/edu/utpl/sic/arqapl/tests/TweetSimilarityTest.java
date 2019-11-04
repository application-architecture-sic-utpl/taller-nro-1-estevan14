package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import static org.junit.Assert.*;
import org.junit.Test;

public class TweetSimilarityTest {
    public TweetSimilarityTest() {
    }
   @Test
    // ejecucion del algoritmo jaccard
    public void similarJaccard() {
        String tweet1 = "Hola mundo java";
        String tweet2 = "Hola mundo";
        TweetSimilarity ts = new TweetSimilarity();
        assertEquals(1.0,
                ts.similarityJaccard(tweet1, tweet2), 0.1);

    }

    
      @Test
    //ejecucion del algoritmo cosine
    public void similarCosine() {
        String tweet1 = "Hola mundo java";
        String tweet2 = "Hola mundo";
       TweetSimilarity ts = new TweetSimilarity();
        assertEquals(1.0, ts.similarityCosine(tweet1, tweet2), 0.1);
    }


    @Test
    //ejecucion del algoritmo jaro winkel distance
    public void similarJaro() {
        String tweet1 = "Hola mundo java";
        String tweet2 = "Hola mundo";
        TweetSimilarity ts = new TweetSimilarity();
        assertEquals(1.0, ts.similarityJaron(tweet1, tweet2),0.1);
    }
}
