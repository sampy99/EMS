package com.example.employeems.service;

import com.example.employeems.dto.EmployeeDTO;
import com.example.employeems.repo.EmployeeRepo;
import com.example.employeems.util.VarList;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;
    public String saveEmployee(EmployeeDTO employeeDTO){
        if(employeeRepo.existsById(employeeDTO.getEmpID())){
            return VarList.RSP_DUPLICATED;
        }else {
            employeeRepo.save(employeeDTO);
        }
    }
}
