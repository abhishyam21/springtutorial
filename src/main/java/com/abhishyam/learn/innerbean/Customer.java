package com.abhishyam.learn.innerbean;

/**
 * Created by Rachana Rao on 7/2/2017.
 */
public class Customer {

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Customer{");
        sb.append("person=").append(person);
        sb.append('}');
        return sb.toString();
    }
}
