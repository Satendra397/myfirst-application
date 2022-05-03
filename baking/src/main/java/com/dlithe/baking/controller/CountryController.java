package com.dlithe.baking.controller;


import com.dlithe.baking.dto.CountryDetail;
import com.dlithe.baking.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {


    @Autowired
    private CountryService countryService;



    @GetMapping("fetch-country-detail-with-state-detail/{countryName}")
    public CountryDetail fetchCountryDetail(@PathVariable String countryName)
    {
        return countryService.fetchCountryDetailBasedOnName(countryName);
    }
}
