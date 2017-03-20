package com.emp.Entity;

/**
 * Created by KXR8957 on 2/27/2017.
 */
public class Contractor {

    private  int cont_id;
    private  String cont_name;
    private  String cont_salary;

    public Contractor(int cont_id, String cont_name, String cont_salary){
        this.cont_id = cont_id;
        this.cont_name= cont_name;
        this.cont_salary = cont_salary;
    }

    public Contractor() {
    }

    public int getCont_id() {
        return cont_id;
    }

    public void setCont_id(int cont_id) {
        this.cont_id = cont_id;
    }

    public String getCont_name() {
        return cont_name;
    }

    public void setCont_name(String cont_name) {
        this.cont_name = cont_name;
    }

    public String getCont_salary() {
        return cont_salary;
    }

    public void setCont_salary(String cont_salary) {
        this.cont_salary = cont_salary;
    }
}
