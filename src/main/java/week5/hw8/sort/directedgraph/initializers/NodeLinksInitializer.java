package week5.hw8.sort.directedgraph.initializers;

import week5.hw8.sort.directedgraph.DGraph;

public interface NodeLinksInitializer {

    default void initNodeLinks(DGraph dGraph) {
        dGraph.getNode(4).setChilds(dGraph, 6, 16, 7);

        dGraph.getNode(6).setChilds(dGraph, 2, 9, 3);

//        loop
//        dGraph.getNode(9).setChilds(dGraph, 5);

        dGraph.getNode(3).setChilds(dGraph, 5, 1);

        dGraph.getNode(7).setChilds(dGraph, 12, 8);

        dGraph.getNode(12).setChilds(dGraph, 14, 13, 17);

//        loop
//        dGraph.getNode(17).setChilds(dGraph, 22);

        dGraph.getNode(8).setChilds(dGraph, 15);

        dGraph.getNode(15).setChilds(dGraph, 22, 10);
    }

}
