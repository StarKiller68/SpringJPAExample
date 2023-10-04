package com.hbreck.SpringJPAExample.Repository;

import com.hbreck.SpringJPAExample.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
