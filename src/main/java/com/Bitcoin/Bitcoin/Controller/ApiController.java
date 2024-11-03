package com.Bitcoin.Bitcoin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bitcoin.Bitcoin.Model.ApiResponse;
import com.Bitcoin.Bitcoin.Service.PriceService;

@RestController
@RequestMapping("/bitcoin")
public class ApiController {

    @Autowired
    PriceService priceService;

    @GetMapping("/price")
    public ResponseEntity<ApiResponse> getBitcoinPrice() {
        try {
            return ResponseEntity.ok().body(priceService.getPrice());
        } catch (Exception e) {
            ApiResponse apiRes = new ApiResponse("Error en el servidor", null);
            return ResponseEntity.ok().body(apiRes);
        }
    }

}
