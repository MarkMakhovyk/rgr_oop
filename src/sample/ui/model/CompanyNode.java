package sample.ui.model;

import sample.data.IUserData;

import java.util.Iterator;

public class CompanyNode extends AnyNode {

    public CompanyNode(AnyNode parent, IUserData userObject) {
        super(parent, userObject);
    }

    @Override
    public void addSon(IUserData obj) {

    }

    @Override
    public Iterator<INode> iterator() {
        return null;
    }
}
