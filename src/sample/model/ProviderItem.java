package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.data.IUserData;

public class ProviderItem extends AnyNode {
    ProductItem firsProduct = null;

    public ProviderItem(IUserData userObject) {
        super(userObject);
    }

    @Override
    public ObservableList<INode> getItems() {
        if (firsProduct == null) {
            return null;
        }
        ObservableList<INode> list = FXCollections.observableArrayList();
        ProductItem current  = firsProduct;
        while (current.getBrother() != null ) {
            list.add(current);
            current = current.getBrother();
        }
        return list;
    }

    @Override
    public INode createAndAddChild(IUserData obj) {
        ProductItem child = new ProductItem(obj);
        if (firsProduct == null) {
            firsProduct = child;
            return child;
        }

        if (child.compareTo(firsProduct) < 0) {
            child.setBrother(firsProduct);
            firsProduct  = child;
            return  child;
        }

        ProductItem current  = firsProduct;
        while (current.getBrother() != null &&
                child.compareTo(current.getBrother()) >= 0) {
            current = current.getBrother();
        }

        child.setBrother(current.getBrother());
        current.setBrother(child);

        return child;
    }
}
