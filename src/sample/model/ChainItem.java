package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.data.IUserData;

import java.util.Set;
import java.util.TreeSet;

public class ChainItem extends AnyNode {
    private Set<CompanyItem> companies = new TreeSet<>();


    public void setCompanies(ObservableList<CompanyItem> chainItems) {
        for (CompanyItem c : chainItems)
        createAndAddChild(c.getUserObject());
    }

    public ChainItem(IUserData userObject) {
        super(userObject);
    }

    @Override
    public ObservableList<INode> getItems() {
        return  FXCollections.observableArrayList(companies);
    }

    @Override
    public INode createAndAddChild(IUserData obj) {
        CompanyItem companyItem = new CompanyItem(obj);
        companies.add(companyItem);
        return companyItem;
    }
}
