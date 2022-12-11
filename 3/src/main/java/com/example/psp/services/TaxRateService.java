package com.example.psp.services;

import com.example.psp.dto.ApplyTaxRateToCategoryDTO;
import com.example.psp.dto.AssignTaxRateToItemDTO;
import com.example.psp.dto.TaxRate;
import com.example.psp.dto.TaxRateDto;
import com.example.psp.security.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxRateService {

    public void taxRateApplyTaxRateToCategoryPost(ApplyTaxRateToCategoryDTO applyTaxRateToCategoryDTO, User user)  {
    }

    public void taxRateAssignTaxRateToItemPost(AssignTaxRateToItemDTO assignTaxRateToItemDTO, User user)  {
    }

    public void taxRateIdDelete(Integer id, User user)  {
    }

    public TaxRate taxRateIdGet(Integer id, User user)  {return null;}

    public void taxRateIdPut(Integer id, TaxRateDto taxRateDto, User user)  {
    }

    public List<TaxRate> taxRatePageSizePageNumberGet(Integer pageSize, Integer pageNumber, User user)  {return null;}

    public void taxRatePost(TaxRateDto taxRateDto, User user)  {
    }
}
