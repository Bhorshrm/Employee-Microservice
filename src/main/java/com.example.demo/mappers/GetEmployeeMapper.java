package com.example.demo.mappers;

import com.example.demo.common.EmployeeCurrentStatus;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class GetEmployeeMapper {

    private final EmployeeRepository employeeRepository;

    public GetEmployeeMapper(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDTO GetEmployeeMapper(Employee employee, EmployeeDTO employeeDTO){
        employeeDTO.setEmpId(employee.getEmpId());
        employeeDTO.setEmpName(employee.getEmpName());
        employeeDTO.setEmailId(employee.getEmailId());
        employeeDTO.setCurrentStatus(EmployeeCurrentStatus.valueOf(employee.getCurrentStatus()));
        employeeDTO.setActive(employee.isActive());
        employeeDTO.setOrgId(employee.getOrg().getOrgId());
        return employeeDTO;
    }


}
