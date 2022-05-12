package com.example.sayehwebservices.services;

import com.example.sayehwebservices.domain.Vehicle;
import com.example.sayehwebservices.services.dto.EcoInfoResponseDto;
import com.example.sayehwebservices.services.dto.VehicleDto;
import com.github.mfathi91.time.PersianDate;
import com.github.mfathi91.time.PersianMonth;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class EconomicInfoService {


    public EcoInfoResponseDto getByPersonNationalCode(String nationalCode) {
        Random r = new Random();
        int low =20485932 ;
        int high =89845122 ;
        int result = getResult(r, high, low);
        int resultb = getResult(r, high, low);
        return new EcoInfoResponseDto(
                " شش ماهه اول 1400  "+getResult(r, high, low)+" ریال ",
                " شش ماهه اول 1400  "+getResult(r, high, low)+" ریال ",
                " شش ماهه اول 1400  "+getResult(r, high, low)+" ریال ",
                List.of(
                        new VehicleDto(
                                "پژو 405"," مدل 90 دوگانه سوز", 1390,
                                3598521L
                        ),
                        new VehicleDto(
                                "پراید"," مدل 90 دوگانه سوز", 1390,
                                3598521L
                        )
                )

        );
    }

    private int getResult(Random r, int high, int low) {
        return r.nextInt(high - low) + low;
    }
}
