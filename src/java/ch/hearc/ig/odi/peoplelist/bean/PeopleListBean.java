/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.bean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author sebastie.quiquere
 */
@Named(value = "peopleListBean")
@Dependent
@RequestScoped
public class PeopleListBean {

    /**
     * Creates a new instance of PeopleListBean
     */
    public PeopleListBean() {
    }
    
}
