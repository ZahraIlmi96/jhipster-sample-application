package sn.zim.cursus.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.zim.cursus.service.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
