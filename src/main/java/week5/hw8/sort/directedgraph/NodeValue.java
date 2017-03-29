package week5.hw8.sort.directedgraph;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NodeValue {
    private int val;

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) return false;
        if (this == obj) return true;
        NodeValue other = (NodeValue) obj;

        return val == other.val;
    }

    @Override
    public int hashCode(){
        return val;
    }

    @Override
    public String toString() {
        return  String.valueOf(val);
    }
}
