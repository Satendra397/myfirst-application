package com.dlithe.baking.service;


import com.dlithe.baking.dto.CountryDetail;
import org.springframework.stereotype.Component;

@Component
public interface CountryService {
    CountryDetail fetchCountryDetailBasedOnName(String countryName);//
}
