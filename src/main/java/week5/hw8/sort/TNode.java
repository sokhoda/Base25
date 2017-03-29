package week5.hw8.sort;

import lombok.Data;

@Data
public class TNode {
	private int value;
	private TNode left;
	private TNode right;

	public TNode(int value) {
		this.value = value;
	}
}
