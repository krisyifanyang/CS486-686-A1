public class Generator {
    public String generate(String startingWord, String[] sentenceSpec, String graph)
    {

        return "";
    }

    public static void main(String[] args) {
        String t = "was/VBD//store/NN//0.0035714285714285713\n" +
                "was/VBD//not/RB//0.04642857142857143\n" +
                "was/VBD//most/RB//0.0035714285714285713\n" +
                "was/VBD//placed/VBN//0.0035714285714285713\n" +
                "was/VBD//charming/JJ//0.0035714285714285713";
        Corpus corpus = new Corpus(t);
        System.out.println(corpus.getWord2Prob("was","VBD","RB")[0][0]);
        System.out.println(corpus.getWord2Prob("was","VBD","RB")[0][1]);
        System.out.println(corpus.getWord2Prob("was","VBD","RB")[1][0]);
        System.out.println(corpus.getWord2Prob("was","VBD","RB")[1][1]);

    }
}
