package com.giftCorner.giftCenter.service;

import com.giftCorner.giftCenter.entity.Giftcorner;
import com.giftCorner.giftCenter.repository.GiftcornerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class GiftcornerServiceImpl implements GiftcornerService{
    @Autowired
    private GiftcornerRepository giftcornerRepository;
    @Override
    public Giftcorner saveGiftcorner(Giftcorner giftcorner) {
        return giftcornerRepository.save(giftcorner);
    }

    @Override
    public List<Giftcorner> fetchGiftcornerlist() {
        return (List<Giftcorner>)
                giftcornerRepository.findAll();
    }

    @Override
    public Giftcorner updateGiftcorner(Giftcorner giftcorner, Long giftId) {
        Giftcorner giftDB
                = giftcornerRepository.findById(giftId)
                .get();

        if (Objects.nonNull(giftcorner.getGiftName())
                && !"".equalsIgnoreCase(
                giftcorner.getGiftName())) {
            giftDB.setGiftName(
                    giftcorner.getGiftName());
        }

        if (Objects.nonNull(
                giftcorner.getGiftAddress())
                && !"".equalsIgnoreCase(
                giftcorner.getGiftAddress())) {
            giftDB.setGiftAddress(
                    giftcorner.getGiftAddress());
        }

        if (Objects.nonNull(giftcorner.getGiftCode())
                && !"".equalsIgnoreCase(
                giftcorner.getGiftCode())) {
            giftDB.setGiftCode(
                    giftcorner.getGiftCode());
        }

        return giftcornerRepository.save(giftDB);
    }

    @Override
    public void delateGiftcornerById(Long giftId) {


            giftcornerRepository.deleteById(giftId);
        }


}
