package com.giftCorner.giftCenter.service;

import com.giftCorner.giftCenter.entity.Giftcorner;

import java.util.List;

public interface GiftcornerService {
    Giftcorner saveGiftcorner(Giftcorner giftcorner);
    List<Giftcorner> fetchGiftcornerlist();
    Giftcorner updateGiftcorner(Giftcorner giftcorner,Long giftId);
    void delateGiftcornerById(Long giftId);

}
