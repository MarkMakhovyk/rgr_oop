package sample.ui.model;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class SubTreeIterator implements Iterator<INode> {
    List<INode> list = new Vector<>();
    int index = 0;

    public SubTreeIterator(INode node) {
        ((AnyNode)node).toList(list);
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public INode next() {
        return list.get(index++);
    }

    @Override
    public void remove() {
        INode delNode = list.get(--index);
        Iterator<INode> itr = new SubTreeIterator(delNode);
        while (itr.hasNext()) {
            list.remove(itr.next());
        }
        if (delNode.getParentNode() != null) {
            delNode.removeFromParent();
        } else
            delNode = null;
    }
}
