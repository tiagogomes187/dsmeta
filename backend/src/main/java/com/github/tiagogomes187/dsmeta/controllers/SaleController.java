package com.github.tiagogomes187.dsmeta.controllers;

import com.github.tiagogomes187.dsmeta.entities.Sale;
import com.github.tiagogomes187.dsmeta.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    private final SaleService services;

    public SaleController(SaleService services) {
        this.services = services;
    }

    @GetMapping
    public List<Sale> findSales(){
        return services.findSales();
    }
}
