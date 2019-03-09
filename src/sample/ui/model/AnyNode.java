package sample.ui.model;

import javafx.scene.control.TreeItem;
import sample.data.IUserData;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public abstract class AnyNode extends TreeItem<INode> implements INode {
    private IUserData userObject;
    private INode parent;
    private TreeItem<IUserData> userDataTreeItem;

    public INode getParentNode() {
        return parent;
    }

    public AnyNode(AnyNode parent, IUserData userObject) {
        super();
        this.userObject = userObject;
        this.parent = parent;

    }

    public TreeItem<IUserData> getUserDataTreeItem() {
        return userDataTreeItem;
    }

    @Override
    public IUserData getUserObject() {
        return userObject;
    }

    @Override
    public void setUserObject(IUserData userObject) {
        this.userObject = userObject;
    }

    @Override
    public int compareTo(INode o) {
        return userObject.compareTo(o.getUserObject());
    }

    public Enumeration<INode> children() {
        return new Enumeration<INode>() {
            Iterator<INode> itr = iterator();
            @Override
            public boolean hasMoreElements() {
                return itr.hasNext();
            }

            @Override
            public INode nextElement() {
                return itr.next();
            }
        };
    }

    public boolean getAllowsChildren() {
        return true;
    }

    public int getIndex(AnyNode node) {
        int index = 0;
//        for (AnyNode n : this) {
//
//        }
    return index;
    }


    public boolean isLeft() {
        return getChildCount() == 0;
    }

    private int getChildCount() {
        int count = 0;
        return count;
    }

    @Override
    public void removeSon(INode son) {
        Iterator<INode> itr = iterator();
        while (itr.hasNext()) {
            if (itr.next() == son) {
                itr.remove();
                return;
            }
        }
    }

    @Override
    public void removeFromParent() {
        if (parent != null) {
            this.parent.getParentNode().removeSon(this);
        }
    }

    public void toList(List<INode> list) {
        list.add(this);
        for (INode node : this) {
            ((AnyNode) node).toList(list);
        }
    }

    @Override
    public Iterator<INode> subTreeIterator() {
        return new SubTreeIterator(this);
    }

    @Override
    public String toString() {
        return userObject.toString();
    }
}
