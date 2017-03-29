package week5.hw8.sort.directedgraph;

import week5.hw8.sort.directedgraph.initializers.NodeLinksInitializer;

import java.util.List;

public interface IDGraph {
     int minNodeValue = 0;
     int maxNodeValue = 22;

    DGraph create(int minNodeValue, int maxNodeValue);

    void initNodeLinks(NodeLinksInitializer initializer);

    DGNode getNode(int value);

    String checkForLoop();

    boolean hasLoop();

    List<DGNode> traverse();

    void setTop(DGNode top);
}
