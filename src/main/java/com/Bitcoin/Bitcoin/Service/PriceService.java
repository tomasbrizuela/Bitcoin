package com.Bitcoin.Bitcoin.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Bitcoin.Bitcoin.Model.ApiResponse;
import com.Bitcoin.Bitcoin.Model.Bitcoin;
import com.Bitcoin.Bitcoin.Model.Usdt;

@Service
public class PriceService {
    private static final String BitcoinURL = "https://criptoya.com/api/lemoncash/btc/ars/0.1";
    // private static final String TEST = "https://api.github.com/";
    private static final String UsdtURL = "https://criptoya.com/api/lemoncash/usdt/ars/0.1";

    private final RestTemplate restTemplate;

    public PriceService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ApiResponse getPrice() {
        Bitcoin response = restTemplate.getForObject(BitcoinURL, Bitcoin.class);
        BigDecimal btcArs = response.getAsk();

        Usdt response2 = restTemplate.getForObject(UsdtURL, Usdt.class);
        BigDecimal usdt = response2.getAsk();

        BigDecimal price = btcArs.divide(usdt, RoundingMode.HALF_UP);

        ApiResponse apiRes = new ApiResponse("Bitcon...", price);

        return apiRes;
    };

}
