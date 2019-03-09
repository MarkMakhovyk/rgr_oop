package sample.ui.model;

import javafx.scene.control.TreeItem;
import sample.data.Company;
import sample.data.IUserData;
import sample.data.ShoppingChain;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ChainItem extends AnyNode {
    private Set<INode> companies = new TreeSet<>();

    public ChainItem(AnyNode parent, IUserData userObject) {
        super(parent, userObject);
    }

    @Override
    public void addSon(IUserData obj) {
        CompanyNode node = new CompanyNode(this,  obj);
        companies.add(node);
    }

    @Override
    public Iterator<INode> iterator() {
        return companies.iterator();
    }
}
