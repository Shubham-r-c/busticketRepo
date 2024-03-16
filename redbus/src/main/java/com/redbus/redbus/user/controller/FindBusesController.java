package com.redbus.redbus.user.controller;

import com.redbus.redbus.operator.entity.BusOperator;
import com.redbus.redbus.user.payload.BusListDto;
import com.redbus.redbus.user.service.SearchBusesService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class FindBusesController {

    private SearchBusesService searchBusesService;

    public FindBusesController(SearchBusesService searchBusesService) {
        this.searchBusesService = searchBusesService;
    }

    //http://localhost:8080/api/user/searchBuses?departureCity=City A&arrivalCity=City B&departureDate=15-12-2023

 @GetMapping("/searchBuses")
 public List<BusListDto> searchBuses(
         @RequestParam("departureCity")String departureCity,
         @RequestParam("arrivalCity") String arrivalCity,
         @RequestParam("departureDate")  @DateTimeFormat(pattern = "yyyy-MM-dd") Date departureDate)
 {
     List<BusListDto> busListDtos = searchBusesService.searchBusBy(departureCity, arrivalCity, departureDate);
     return busListDtos;
 }

}
