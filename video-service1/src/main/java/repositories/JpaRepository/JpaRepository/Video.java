package repositories.JpaRepository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

interface VideoRepository<Video> extends JpaRepository<Video, Long> { }