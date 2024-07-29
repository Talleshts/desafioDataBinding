/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafioswitchbindingdata.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author talle
 */
public class Observavel {
     private List<Observer> observers;

    public Observavel() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificaObservers(Object objeto) {
        for (Observer observer : observers) {
            observer.update(objeto);
        }
    }
}
