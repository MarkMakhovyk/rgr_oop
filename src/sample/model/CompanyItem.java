package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.data.IUserData;

import java.util.Arrays;

public class CompanyItem extends AnyNode {
private ProviderItem[] providers = new ProviderItem[3];
private int count = 0;
    public CompanyItem(IUserData userObject) {
        super(userObject);
    }

    @Override
    public ObservableList<INode> getItems() {
        return FXCollections.observableArrayList(Arrays.copyOf(providers,count));
    }

    @Override
    public INode createAndAddChild(IUserData obj) {
        ProviderItem providerItem = new ProviderItem(obj);
        if (providers.length == count)
            providers = Arrays.copyOf(providers, count + count / 2);
        providers[count++] = providerItem;
        Arrays.sort(providers, 0, count - 1);
        return providerItem;
    }
}
