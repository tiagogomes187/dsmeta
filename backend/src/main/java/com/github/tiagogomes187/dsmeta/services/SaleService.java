package com.github.tiagogomes187.dsmeta.services;

import com.github.tiagogomes187.dsmeta.entities.Sale;
import com.github.tiagogomes187.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    private final SaleRepository repository;

    public SaleService(SaleRepository repository) {
        this.repository = repository;
    }

    public List<Sale> findSales() {
        return repository.findAll();
    }
}
