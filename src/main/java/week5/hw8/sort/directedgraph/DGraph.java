package week5.hw8.sort.directedgraph;

import lombok.Data;
import week5.hw8.sort.directedgraph.initializers.NodeLinksInitializer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Data
public class DGraph implements IDGraph, NodeLinksInitializer {
    private Set<DGNode> graphSet;
    private DGNode top;
    private DGNode loopNode;


    @Override
    public DGraph create(int minNodeValue, int maxNodeValue) {
        graphSet = IntStream.range(minNodeValue, maxNodeValue + 1)
                .mapToObj(
                        i -> new DGNode(new NodeValue(i))
                ).collect(Collectors.toCollection(HashSet::new));
        return this;
    }

    @Override
    public void initNodeLinks(NodeLinksInitializer initializer) {
        initializer.initNodeLinks(this);
    }

    @Override
    public DGNode getNode(int value) {
        return graphSet.stream().filter(
                n -> n.equals(new DGNode(new NodeValue(value)))
        ).findFirst().orElse(null);
    }

    @Override
    public String checkForLoop(){
        return hasLoop() ?  "hasLoop at=" + loopNode : "No loop found";
    }

    @Override
    public boolean hasLoop() {
        return hasLoopOrder(top, new HashSet<>());
    }

    private boolean hasLoopOrder(DGNode node, Set<DGNode> set) {
        boolean loopExists = false;
        if (!set.contains(node)) {
            set.add(node);
            List<DGNode> list = node.getChilds();
            if (!list.isEmpty()) {
                for (DGNode dgNode : list) {
                    if (loopExists = hasLoopOrder(dgNode, set)) {
                        loopNode = loopNode == null ? dgNode: loopNode;
                        break;
                    }
                }
            }
            return loopExists;
        }
        return true;
    }

    @Override
    public List<DGNode> traverse() {
        List<DGNode> arr = new ArrayList<>();
        traverseOrder(top, arr);
        return arr;
    }

    private void traverseOrder(DGNode node, List<DGNode> arr) {
        arr.add(node);
        List<DGNode> list = node.getChilds();
        if (!list.isEmpty()) {
            for (DGNode dgNode : list) {
                traverseOrder(dgNode, arr);
            }
        }
    }


}
