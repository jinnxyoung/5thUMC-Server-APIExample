package com.umc.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.umc.spring.domain.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
