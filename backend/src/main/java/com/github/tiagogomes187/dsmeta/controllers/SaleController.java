package com.github.tiagogomes187.dsmeta.controllers;

import com.github.tiagogomes187.dsmeta.entities.Sale;
import com.github.tiagogomes187.dsmeta.services.SaleService;
import com.github.tiagogomes187.dsmeta.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    private final SaleService services;
    private final SmsService smsService;

    public SaleController(SaleService services, SmsService smsService) {
        this.services = services;
        this.smsService = smsService;
    }

    @GetMapping
    public Page<Sale> findSales(
            @RequestParam(value = "minDate", defaultValue = "") String minDate,
            @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
            Pageable pageable){
        return services.findSales(minDate, maxDate, pageable);
    }

    @GetMapping("/{id}/notification")
    public void notifySms(@PathVariable Long id){
        smsService.sendSms(id);
    }
}
