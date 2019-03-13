package sample.model;

import javafx.collections.ObservableList;
import sample.data.IUserData;

public class ProductItem extends AnyNode {
    ProductItem brother = null;

    public ProductItem getBrother() {
        return brother;
    }

    public void setBrother(ProductItem brother) {
        this.brother = brother;
    }

    public ProductItem(IUserData userObject) {
        super(userObject);
    }

    @Override
    public ObservableList<INode> getItems() {
        return null;
    }

    @Override
    public INode createAndAddChild(IUserData obj) {
        return null;
    }
}
