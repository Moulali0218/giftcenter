package com.giftCorner.giftCenter.repository;

import com.giftCorner.giftCenter.entity.Giftcorner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftcornerRepository extends CrudRepository<Giftcorner,Long> {
}
