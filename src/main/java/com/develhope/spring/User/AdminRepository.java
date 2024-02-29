package com.develhope.spring.User;

import com.develhope.spring.User.corrette.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<User,Long> {
}
