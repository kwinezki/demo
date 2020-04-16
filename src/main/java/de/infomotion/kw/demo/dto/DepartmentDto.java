package de.infomotion.kw.demo.dto;


import de.infomotion.kw.demo.model.kwdb.Country;
import de.infomotion.kw.demo.model.kwdb.Department;
import de.infomotion.kw.demo.model.summerwine.SummerwineDepartment;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDto {

    private List<SummerwineDepartment> summerwineDepartmentList;
    private List<Department> departmentList = new ArrayList<>();

    public DepartmentDto(List<SummerwineDepartment> summerwineDepartmentList) {
        this.summerwineDepartmentList = summerwineDepartmentList;
    }

    public void transferObject() {
        summerwineDepartmentList.forEach(summerwineDepartment -> {
            Department department = new Department();
            department.setDepartmentNumber(summerwineDepartment.getDepartmentNumber());
            department.setDepartmentName(summerwineDepartment.getDepartmentName());
            department.setCostCenter(summerwineDepartment.getCostCenter());


            departmentList.add(department);
        });
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

}


