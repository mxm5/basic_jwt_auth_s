package com.example.sayehwebservices.services;

import com.example.sayehwebservices.services.dto.ChaparReqDto;
import com.example.sayehwebservices.services.dto.ChaparResponseDto;
import org.springframework.stereotype.Service;

@Service
public class ChaparService {
    public ChaparResponseDto getChaparFor(ChaparReqDto chaparReqDto) {

        return new ChaparResponseDto(
                chaparReqDto.getMessage(), chaparReqDto.getNationalCode(),
                "در خواست شما در سرویس چاپار برای کد ملی"+chaparReqDto.getNationalCode() + "  با موفقیت ثبت شد "
        );
    }
}
