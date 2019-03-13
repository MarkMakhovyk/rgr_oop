package sample.model;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;
import sample.data.IUserData;

public abstract class AnyNode implements INode {
    private IUserData userObject;
    public  ListChangeListener listener;

    @Override
    public void setListener(ListChangeListener listener) {
        this.listener = listener;
    }

    @Override
    public ListChangeListener getListener() {
        return listener;
    }

    public AnyNode(IUserData userObject) {
        super();
        this.userObject = userObject;
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


    @Override
    public String toString() {
        return userObject.toString();
    }


    public abstract ObservableList<INode> getItems();

    public abstract INode createAndAddChild(IUserData obj);
    
}
