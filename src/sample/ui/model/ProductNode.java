package sample.ui.model;

import sample.data.IUserData;

import java.util.Iterator;

public class ProductNode extends AnyNode {
    private ProductNode brother;

    public ProductNode(AnyNode parent, IUserData userObject) {
        super(parent, userObject);
    }

    public ProductNode getBrother() {
        return brother;
    }

    public void setBrother(ProductNode brother) {
        this.brother = brother;
    }

    @Override
    public boolean getAllowsChildren() {
        return false;
    }

    @Override
    public void addSon(IUserData obj) {

    }

    @Override
    public Iterator<INode> iterator() {
        return new Iterator<INode>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public INode next() {
                return null;
            }
        };
    }
}
