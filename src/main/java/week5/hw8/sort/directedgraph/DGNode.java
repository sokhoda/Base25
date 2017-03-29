package week5.hw8.sort.directedgraph;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@Data
@AllArgsConstructor
public class DGNode implements IDGNode {
    private List<DGNode> parents = new ArrayList<>();
    private List<DGNode> childs = new ArrayList<>();
    private NodeValue value;


    public DGNode(NodeValue value) {
        this.value = value;
    }

    public DGNode setChilds(DGraph dgraph, int... childs){
        this.childs =  IntStream.of(childs).mapToObj(dgraph::getNode)
                .collect(Collectors.toList());

        IntStream.of(childs).mapToObj(dgraph::getNode).forEach(node -> node.parents.add(this));
        return this;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null || obj.getClass() != getClass()) return false;
        if (this == obj) return true;

        DGNode other = (DGNode) obj;

        return value != null ? value.equals(other.value) : other.value == null;
    }

    @Override
    public int hashCode() {
        int result = parents != null ? parents.size() : 0;
        result = 31 * result + (childs != null ? childs.size() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return  value.toString();
    }
}
