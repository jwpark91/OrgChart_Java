package com.systemsinmotion.orgchart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systemsinmotion.orgchart.dao.DepartmentDAO;
import com.systemsinmotion.orgchart.entity.Department;

@Service("departmentService")
public class DepartmentService {

	@Autowired
	DepartmentDAO departmentDAO;

	public Department findDepartmentByID(Integer departmentId) {

		return this.departmentDAO.findById(departmentId);
	}

	public void setDepartmentDAO(DepartmentDAO mockDepartmentDAO) {
		this.departmentDAO = mockDepartmentDAO;
	}

	public List<Department> findAllDepartments() {
		return this.departmentDAO.findAll();

	}

	public Integer storeDepartment(Department department) {
		return this.departmentDAO.save(department);
	}

	public void removeDepartment(Department department) {
		this.departmentDAO.delete(department);
	}

}
