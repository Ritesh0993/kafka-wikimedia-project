package com.ritesh.kafka.consumer.repository;

import com.ritesh.kafka.consumer.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaRepository extends JpaRepository<WikimediaData, Long> {
}
