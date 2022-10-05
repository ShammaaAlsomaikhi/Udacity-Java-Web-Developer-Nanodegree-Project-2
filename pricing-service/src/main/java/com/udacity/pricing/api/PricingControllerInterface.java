package com.udacity.pricing.api;

import com.udacity.pricing.domain.price.Price;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="pricing-service")
public interface PricingControllerInterface {

    @GetMapping
    Price get(@RequestParam Long vehicleId);
}
