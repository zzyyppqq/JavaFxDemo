package sample.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.model.Person;

public class ListData {

    private ObservableList<Person> personData = FXCollections.observableArrayList();

    public void create(){
        personData.add(new Person("Hans","Muster"));
        personData.add(new Person("Hans","Muster"));
        personData.add(new Person("Hans","Muster"));
        personData.add(new Person("Hans","Muster"));
        personData.add(new Person("Hans","Muster"));
        personData.add(new Person("Hans","Muster"));
        personData.add(new Person("Hans","Muster"));
    }

    public ObservableList<Person> getPersonData() {
        return personData;
    }
}
