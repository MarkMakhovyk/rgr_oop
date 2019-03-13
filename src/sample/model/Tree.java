package sample.model;
import java.util.Arrays;
import java.util.List;

import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import sample.data.IUserData;
import sample.data.ShoppingChain;

import static java.util.stream.Collectors.toList;

public class Tree {

    private final List<Class<? extends AnyNode>> itemTypes = Arrays.asList(
            ChainItem.class, CompanyItem.class, ProviderItem.class, ProductItem.class
    );

//    public Tree(ObservableList<CompanyItem> chainItems) {
//        treeView = new TreeView<>();
//        ChainItem root = new ChainItem(new ShoppingChain("atb", "moskow);"));
//
//        root.setCompanies(chainItems);
//        TreeItem<INode> treeRoot = createItem(root);
//
//        treeView.setRoot(treeRoot);
//        treeView.setShowRoot(true);
//    }

    public TreeItem createRootItem() {
        ChainItem root = new ChainItem(new ShoppingChain("atb", "moskow);"));
        TreeItem<INode> treeRoot = createItem(root);
        return treeRoot;
    }



    public void addChild(TreeItem<INode> parent, IUserData obj) {
        createItem(parent.getValue().createAndAddChild(obj));
        parent.getChildren().setAll(parent.getValue().getItems().stream().map(this::createItem).collect(toList()));
    }

    public TreeItem<INode> createItem(INode object) {
        TreeItem<INode> item = new TreeItem<>(object);
        item.setExpanded(true);
        return item ;
    }
}
