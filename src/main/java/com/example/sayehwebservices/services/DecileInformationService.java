package com.example.sayehwebservices.services;

import com.example.sayehwebservices.Config.exception.DecileInfoCodedException;
import com.example.sayehwebservices.domain.DecileInfo;
import com.example.sayehwebservices.repository.DecileInformationRepository;
import com.example.sayehwebservices.services.dto.DecileInfoResponseDto;
import com.github.mfathi91.time.PersianDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class DecileInformationService {

    @Autowired
    DecileInformationRepository decileInformationRepository;

    public DecileInfoResponseDto getForNationalCode(String nationalCode) throws DecileInfoCodedException {
        Optional<DecileInfo> byId = decileInformationRepository.findFirstByResSsn(nationalCode);
        PersianDateTime timestamp = PersianDateTime.fromGregorian(LocalDateTime.now());
        if (byId.isPresent()) {
            DecileInfo decileInfo = byId.get();
            String decileMessage = getDecileRange(decileInfo.getDecile());
            if (decileInfo.getHazfghadim() != 0) {
                return new DecileInfoResponseDto(timestamp.toString(), " حذف قدیم ", 2, decileMessage);
            } else if (decileInfo.getHazfjadid() != 0) {
                return new DecileInfoResponseDto(timestamp.toString(), " حذف جدید ", 3, decileMessage);
            } else if (decileInfo.getMashmool() != 0) {
                return new DecileInfoResponseDto(timestamp.toString(), " مشمول ", 1, decileMessage);
            }
        }
        return new DecileInfoResponseDto(timestamp.toString(),
                "این کد ملی سرپرست برای هیچ خانواری در سازمان هدفمندی یارانه ها تعریف نشده است",
                4, " بازه دهک مشخص نیست ");
    }

    private String getDecileRange(int decile) {
        if (decile < 4) {
            return "دهک ۱ تا ۳ ";
        } else if (decile <= 9) {
            return "دهک ۴ تا ۹ ";
        } else {
            return " دهک ۱۰ ";
        }
    }

}
