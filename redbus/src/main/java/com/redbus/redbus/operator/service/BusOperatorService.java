package com.redbus.redbus.operator.service;

import com.redbus.redbus.operator.entity.BusOperator;
import com.redbus.redbus.operator.payload.BusOperatorDto;
import org.springframework.web.bind.annotation.RequestBody;

public interface BusOperatorService {
    BusOperatorDto scheduleBus(@RequestBody BusOperatorDto busOperatorDto);
}
