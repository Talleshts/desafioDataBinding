/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafioswitchbindingdata.databinding;

import com.mycompany.desafioswitchbindingdata.observer.Observavel;
import com.mycompany.desafioswitchbindingdata.observer.Observer;

/**
 *
 * @author talle
 */
public class DataBinding {
     private Observavel observavel;
    private Object model;
    private Object view;

    public DataBinding(Object model, Object view) {
        this.model = model;
        this.view = view;
        this.observavel = new Observavel();
    }

    public void configureOneWayBinding(boolean modelToView) {
        observavel.addObserver(new Observer() {
            @Override
            public void update(Object objeto) {
                if (modelToView) {
                    view = objeto;
                } else {
                    model = objeto;
                }
            }
        });
    }

    public void configureTwoWayBinding() {
        observavel.addObserver(new Observer() {
            @Override
            public void update(Object objeto) {
                view = objeto;
            }
        });
        observavel.addObserver(new Observer() {
            @Override
            public void update(Object objeto) {
                model = objeto;
            }
        });
    }

    public void updateModel(Object novoModel) {
        model = novoModel;
        observavel.notificaObservers(model);
    }

    public void updateView(Object novaView) {
        view = novaView;
        observavel.notificaObservers(view);
    }
}
