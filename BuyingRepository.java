package com.repository;

import com.model.Buying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BuyingRepository extends JpaRepository<Buying, Long> {

}
