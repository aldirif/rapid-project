package com.rapidtech.rapidproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestAssetResDto {
    private Long id;
    private String picName;
    private String address;
    private String specification;
    private Boolean approvalStatus;
    private String reason;
}
