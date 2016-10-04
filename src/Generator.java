public class Generator {
    public static String generate(String startingWord, String[] sentenceSpec, Corpus graph)
    {


        string searchWord= startingWord;


        graph.getWord2Prob(searchWord)


        return "";
    }



    public static void dfs(String startingWord, String[] sentenceSpec, Corpus graph, int counter, ArrayList<String> curRes, ArrayList<String> finalRes double curProb, double[] finalProb){

        // counter fisrt is 0
        // end of a successful search, compare curProb with finalProb, if curProb < finalProb, update finalRes to curRes
        if (counter + 1 = sentenceSpec.length){

            if(curProb > finalProb[0]){
                finalRes=curRes;
                finalProb[0] = curProb;
            }
            return;
        }

        String[][] subnodes = graph.getWord2Prob(startingWord, sentenceSpec[counter], sentenceSpec[counter+1]);
        if (subnodes.length ==0) {
            return;
        }

        for(int i =0; i< subnodes.length; i++){

            curRes.add(subnodes[i][0]);
            dfs( subnodes[i][0], sentenceSpec, graph, counter+1,  curRes, finalRes , curProb*Double.parseDouble(subnodes[i][1]), finalProb);
            curRes.remove(curRes.size()-1);

        }
        return;
    }


    public static void bfs(String startingWord, String[] sentenceSpec, Corpus graph){

        String[][] subnodes = graph.getWord2Prob(startingWord, sentenceSpec[counter], sentenceSpec[counter+1]);
        if (subnodes.length ==0) {
            return;
        }

        for(int i =0; i< subnodes.length; i++){

        

        Queue<node> queue = new LinkedList<>();
        ArrayList<node> explored = new ArrayList<>();
        queue.add(this.startNode);
        explored.add(startNode);

        while(!queue.isEmpty()){
            Node current = queue.remove();

       
                if(current.getChildren().isEmpty())
                    return false;
                else
                    queue.addAll(current.getChildren());
           
            explored.add(current);
        }

        return false;

    }





    }


    public static void astar(String startingWord, String[] sentenceSpec, Corpus graph){



        
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
