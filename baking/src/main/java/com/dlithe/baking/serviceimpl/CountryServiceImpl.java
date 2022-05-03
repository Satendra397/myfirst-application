package com.dlithe.baking.serviceimpl;


import com.dlithe.baking.dto.CountryDetail;
import com.dlithe.baking.dto.StateDetail;
import com.dlithe.baking.entity.Country;
import com.dlithe.baking.repository.CountryDAO;
import com.dlithe.baking.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryServiceImpl  implements CountryService {


    @Autowired
    private CountryDAO countryDAO;

    @Override
    public CountryDetail fetchCountryDetailBasedOnName(String countryName) {


        Country country =countryDAO.findByName(countryName);
        CountryDetail countryDetail=new CountryDetail();


        countryDetail.setId(country.getId());
        countryDetail.setName(country.getName());
        countryDetail.setCapital(country.getCapital());
        countryDetail.setNumOfState(country.getNumOfState());

        List<StateDetail> stateDetails=new ArrayList<>();

        StateDetail stateDetail=new StateDetail();

        stateDetail.setName("MP");
        stateDetail.setCapital("bhopal");
        stateDetail.setLanguage("hindi");
        stateDetails.add(stateDetail);

        StateDetail stateDetail1=new StateDetail();

        stateDetail1.setName("UP");
        stateDetail1.setCapital("lucknow");
        stateDetail1.setLanguage("hindi");
        stateDetails.add(stateDetail1);

        StateDetail stateDetail2=new StateDetail();

        stateDetail2.setName("rajasthan");
        stateDetail2.setCapital("jaipur");
        stateDetail2.setLanguage("hindi");
        stateDetails.add(stateDetail2);

        StateDetail stateDetail3=new StateDetail();

        stateDetail3.setName("haryana");
        stateDetail3.setCapital("chandigarh");
        stateDetail3.setLanguage("hindi");
        stateDetails.add(stateDetail3);

        countryDetail.setStateDetailList(stateDetails);





        return countryDetail;

    }
}
