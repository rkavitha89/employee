package com.emp.Service;

import com.emp.DAO.EmpDAOImpl;
import com.emp.Entity.Contractor;
import com.emp.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Stream;

/**
 * Created by KXR8957 on 2/26/2017.
 */
@Service("empService")
public class EmpService {
    private EmpDAOImpl empDAO;

    public EmpService(EmpDAOImpl empDAO) {
        this.empDAO = empDAO;
    }

    public  Collection<Employee> getAllEmployees() {
        return empDAO.getAllEmployees();
    }

    public Stream<Contractor> getAllContractors() {
        return empDAO.getAllContractors();
    }

    public Contractor getContractor(int cont_id){
        return empDAO.getContractor(cont_id);
    }

    public Contractor putContractor(int cont_id) {
        return empDAO.putContractor(cont_id);
    }
}
