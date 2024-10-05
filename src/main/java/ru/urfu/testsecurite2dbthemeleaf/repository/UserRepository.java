package ru.urfu.testsecurite2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.testsecurite2dbthemeleaf.entity.User;
public interface UserRepository extends JpaRepository<User, Long>{

    User findByEmail(String email);
}
