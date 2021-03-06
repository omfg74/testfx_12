package sample.interfaces.impls;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Objects.Person;
import sample.interfaces.AddressBook;

public class CollectionAddressBook implements AddressBook{
private ObservableList<Person> personList = FXCollections.observableArrayList();


    @Override
    public void add(Person person) {
        personList.add(person);

    }

    @Override
    public void update(Person person) {

    }
    public void print(){
        int number = 0;
        System.out.println();
        for (Person person :personList
                ) {number++;
            System.out.println(number+") fio = "+person.getFio() +" phone  = "+person.getPhone());

        }
    }
    public void fillTestData(){
        personList.add(new Person("Andrew", "321321321"));
        personList.add(new Person("Муся","323213"));
        personList.add(new Person("Дуся","39293293"));
        personList.add(new Person("Туся","323213"));
        personList.add(new Person("Гуся","3323232332"));
        personList.add(new Person("Вуся","44545454545"));

    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }
}
