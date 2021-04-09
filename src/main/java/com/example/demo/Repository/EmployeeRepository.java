package com.example.demo.Repository;



import com.example.demo.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

   // int pageNumber = 1;
    //int pageSize = 5;
   // Pageable pageable = PageRequest.of(pageNumber, pageSize);

    //Page<Employee> page = repository.findAll

}
