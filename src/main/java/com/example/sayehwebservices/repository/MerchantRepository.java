package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.Merchant;
import com.example.sayehwebservices.domain.MerchantCompositePKID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, MerchantCompositePKID> {
}
