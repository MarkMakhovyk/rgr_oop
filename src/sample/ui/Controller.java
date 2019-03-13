package sample.ui;

import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import sample.data.*;
import sample.model.ChainItem;
import sample.model.CompanyItem;
import sample.model.INode;
import sample.model.Tree;


import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;

public class Controller implements Initializable, ListChangeListener {
    @FXML
    TreeView<INode> treeView;
    @FXML
    TabPane tabPane;

    @FXML
    Tab companyTab;

    Tree tree = new Tree();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        treeView.setRoot(tree.createRootItem());
        treeView.getSelectionModel().getSelectedItems().addListener(this::onChanged);
    }

    @Override
    public void onChanged(Change c) {

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


    public void save(ActionEvent actionEvent){
        TreeItem<INode> selected = treeView
                .getSelectionModel()
                .getSelectedItem();
        if (selected != null) {
            switch (treeView.getSelectionModel().getSelectedIndex()) {
                case  0:tree.addChild(selected,new Company(Math.random()*10 +"fdfdd","ss",10));
                break;
                case 1: tree.addChild(selected,new Provider(Math.random()*10 +"fdfdd","ss","vfvffv"));
                break;
                case 2: tree.addChild(selected,new Product(Math.random()*10 +"fdfdd",10,500));
                    break;
            }


        }
    }

}
