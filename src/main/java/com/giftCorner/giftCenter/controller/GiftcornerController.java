package com.giftCorner.giftCenter.controller;

import com.giftCorner.giftCenter.entity.Giftcorner;
import com.giftCorner.giftCenter.service.GiftcornerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GiftcornerController {
@Autowired
    private GiftcornerService giftcornerService;
//save operation
@PostMapping("/giftcorner")
    public Giftcorner saveGiftcorner(
        @Validated @RequestBody Giftcorner giftcorner){
    return giftcornerService.saveGiftcorner(giftcorner);
}
//read operation
@GetMapping("/giftcorner")
public List<Giftcorner> fetchGiftcornerList()
{
    return giftcornerService.fetchGiftcornerlist();
}

    // Update operation
    @PutMapping("/giftcorner/{id}")
    public Giftcorner
    updateGiftcorner(@RequestBody Giftcorner giftcorner,
                     @PathVariable("id") Long giftId)
    {
        return giftcornerService.updateGiftcorner(
                giftcorner, giftId);
    }
    // Delete operation
    @DeleteMapping("/giftcorner/{id}")
    public String deleteGiftcornerById(@PathVariable("id")
                                       Long giftId)
    {
        giftcornerService.delateGiftcornerById(
                giftId);
        return "Deleted Successfully";
    }

}
