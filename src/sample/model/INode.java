package sample.model;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import sample.data.IUserData;

import java.io.Serializable;

public interface INode extends Serializable, Comparable<INode> {
    public ObservableList<INode> getItems();

    public abstract INode createAndAddChild(IUserData userObject);
    public IUserData getUserObject();
    public void setUserObject(IUserData userObject);

    public void setListener(ListChangeListener listener);
    public ListChangeListener getListener();
}
