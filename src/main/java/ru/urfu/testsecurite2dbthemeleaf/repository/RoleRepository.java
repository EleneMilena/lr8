package ru.urfu.testsecurite2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.testsecurite2dbthemeleaf.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
