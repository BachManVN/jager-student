package com.jager.student.reporsitory;

import com.jager.student.entity.StudentInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInfoRepo extends JpaRepository<StudentInfoEntity, Integer> {
}
