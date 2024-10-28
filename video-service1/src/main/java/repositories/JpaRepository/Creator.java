package repositories.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository<Creator> extends JpaRepository<Creator, Long> { }