package week5.hw8.sort.directedgraph;

import week5.hw8.sort.directedgraph.initializers.DefaultNodeLinksInitializer;

import static week5.hw8.sort.directedgraph.IDGraph.maxNodeValue;
import static week5.hw8.sort.directedgraph.IDGraph.minNodeValue;

public class DGRunner {
    public static void main(String[] args) {
        IDGraph dGraph = new DGraph().create(minNodeValue, maxNodeValue);
        dGraph.initNodeLinks(new DefaultNodeLinksInitializer());
        dGraph.setTop(dGraph.getNode(4));
        System.out.println(dGraph.checkForLoop());
        System.out.println(dGraph.traverse());
    }
}
