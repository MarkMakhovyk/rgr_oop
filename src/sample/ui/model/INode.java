package sample.ui.model;

import javafx.scene.control.TreeItem;
import sample.data.IUserData;

import java.io.Serializable;
import java.util.Iterator;

public interface INode extends Serializable, Comparable<INode>, Iterable<INode> {
    public void setUserObject(IUserData object);

    public IUserData getUserObject();

    public void addSon(IUserData obj);

    public void removeSon(INode son);

    public void removeFromParent();

    public Iterator<INode> subTreeIterator();
    public INode getParentNode();
}
