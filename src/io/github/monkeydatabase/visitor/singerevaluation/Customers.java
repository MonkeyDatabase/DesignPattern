package io.github.monkeydatabase.visitor.singerevaluation;

import io.github.monkeydatabase.visitor.singerevaluation.action.Action;
import io.github.monkeydatabase.visitor.singerevaluation.customer.Customer;

import java.util.LinkedList;
import java.util.List;

public class Customers {
    //维护了一个集合
    private List<Customer> customers=new LinkedList<>();

    public void attach(Customer customer){
        customers.add(customer);
    }

    public void dettach(Customer customer){
        customers.remove(customer);
    }

    //显示测评情况
    public void display(Action action){
        for (Customer customer:customers){
            customer.accept(action);
        }
    }
}
