package com.example.onlineplatform.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseWrapperComment {
    private int count;
    private List<AdsDto> results;
}
