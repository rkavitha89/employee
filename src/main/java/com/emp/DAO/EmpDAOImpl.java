package com.emp.DAO;

import com.emp.Entity.Contractor;
import com.emp.Entity.Employee;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by KXR8957 on 2/26/2017.
 */

@Repository
public class EmpDAOImpl {

   // private static HashMap<Integer, Employee> employees = new HashMap<Integer, Employee>();
     private static Map<Integer, Employee> employees;

      static {
          employees = new HashMap<Integer, Employee>(){
              {
                  put(1, new Employee(1, "Anna", "750000"));
                  put(1, new Employee(2, "Marie", "30000"));
                  put(1, new Employee(3, "Mellie", "50000"));

              }
          };
      }

      private List<Contractor> contractors = Arrays.asList(
        new Contractor(11,"Anna_C","57457"),
              new Contractor(12,"Marie_C","46544"),
              new Contractor(13,"Mellie_C","88878")
      );

    public Collection<Employee> getAllEmployees() {
        return this.employees.values();
    }

    public Stream<Contractor> getAllContractors() {
        return this.contractors.stream();
    }

    public Contractor getContractor(int cont_id){
        return contractors.stream().filter(contractor -> contractor.getCont_id()==cont_id).findFirst().get();
    }

    public Contractor putContractor(int cont_id) {
        return contractors.stream().filter(contractor -> contractor.getCont_id()==cont_id).findFirst().get();
    }
}
