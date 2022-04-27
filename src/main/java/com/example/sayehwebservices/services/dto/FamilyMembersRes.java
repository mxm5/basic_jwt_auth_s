package com.example.sayehwebservices.services.dto;

import com.example.sayehwebservices.domain.khanevar;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FamilyMembersRes {

    List<khanevar> familyMembers;
    Integer total;

    public FamilyMembersRes(List<khanevar> byResSsn) {
        familyMembers = byResSsn;
        total = byResSsn.size();
    }
}
