package com.emp.Controller;

import com.emp.Entity.Contractor;
import com.emp.Entity.Employee;
import com.emp.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * Created by KXR8957 on 2/26/2017.
 */
@RestController
@RequestMapping("/employee")

public class EmpController {

    @Autowired
    @Resource(name = "empService")
    private EmpService empService;
    @RequestMapping(method = RequestMethod.GET)
    public  Collection<Employee> getAllEmployees() {
        return empService.getAllEmployees();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/AllContractors")
    public Stream<Contractor> getAllContractors() {
        return empService.getAllContractors();
    }

    @RequestMapping(value = "/Contractors/{cont_id}",method = RequestMethod.GET)
    public Contractor getContractor(@PathVariable int cont_id){
        return empService.getContractor(cont_id);
    }

    @RequestMapping(value = "/putContractors/{cont_id}",method = RequestMethod.PUT)
    public Contractor putContractor(@PathVariable int cont_id){
        return empService.putContractor(cont_id);
    }

}
