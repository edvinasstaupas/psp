package com.example.psp.repositories;

import com.example.psp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findEmployeeById(Integer id);
    Employee findEmployeeByUserId(Integer id);

    @Override
    void deleteById(Integer id);
}
