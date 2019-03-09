package sample.ui;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import sample.data.Company;
import sample.data.IUserData;
import sample.data.ShoppingChain;
import sample.ui.model.ChainItem;


import javax.swing.tree.DefaultTreeModel;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;

public class Controller implements Initializable, ListChangeListener {
    @FXML
    TreeView treeView;
    @FXML
    TabPane tabPane;

    @FXML
    Tab companyTab;

    ChainItem chainItem;
    Set<String> strings = new TreeSet<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        chainItem = new ChainItem(null, new ShoppingChain("Vika", "Slavytych"));
        chainItem.addSon(new Company("ABC", "Vasya", 12));
        strings.add("мама");
        TreeItem root = new TreeItem("father");
        treeView.setRoot(chainItem.getUserDataTreeItem());
        root.getChildren().add(new TreeItem(strings));
        treeView.getSelectionModel().getSelectedItems().addListener(this::onChanged);
    }

    @Override
    public void onChanged(Change c) {
        TreeItem treeItem = (TreeItem) treeView.getSelectionModel().getSelectedItem();
        chainItem.addSon(new Company("AB", "Vova", 120));
        strings.add("byby");
        System.out.println(treeItem.getValue().toString());

    }



    protected void onRestore() {
    }

    private void createRoot() {

    }

    private void addNodeTree(IUserData newElement) {
    }

    private void removeNode() {

    }

    private void editNode() {

    }


    public void save(ActionEvent actionEvent) {
//        System.out.println(treeView.getSelectionModel().getSelectedItem().getValue());
    }

}
