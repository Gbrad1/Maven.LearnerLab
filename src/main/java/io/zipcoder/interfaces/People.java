package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person> implements Iterable<E>{
    List<E> personList = new ArrayList<>();

    public void add(E newPerson) {
        personList.add(newPerson);
    }

    public E findById(long idToFind) {
        for (E element : personList) {
            if (element.getId().equals(idToFind)) {
                return element;
            }
        }
        return null;
    }

    public boolean checkListForPerson(E personToCheck) {
        return personList.contains(personToCheck);
    }

    public void removePerson(E personToRemove) {
        personList.remove(personToRemove);
    }

    public void removePersonById(long id) {
        E personToRemove = findById(id);
        personList.remove(personToRemove);
    }

    public List<E> getPersonList() {
        return personList;
    }

    public void clearList() {
        personList.clear();
    }

    public int getListSize() {
        return personList.size();
    }

    public abstract E[] listToArray();

    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
