package com.rapidtech.rapidproject.service.impl;

import com.rapidtech.rapidproject.dto.RequestAssetReqDto;
import com.rapidtech.rapidproject.dto.RequestAssetResDto;
import com.rapidtech.rapidproject.model.RequestAsset;
import com.rapidtech.rapidproject.repository.RequestAssetRepository;
import com.rapidtech.rapidproject.service.RequestAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestAssetServiceImpl implements RequestAssetService {

    @Autowired
    private RequestAssetRepository requestAssetRepository;


    @Override
    public RequestAssetResDto insertRequest(RequestAssetReqDto requestAssetReqDto) {
        RequestAsset newRequestAsset = RequestAsset.builder()
                .picName(requestAssetReqDto.getPicName())
                .address(requestAssetReqDto.getAddress())
                .specification(requestAssetReqDto.getSpecification()).build();
        RequestAsset result = requestAssetRepository.save(newRequestAsset);
        return RequestAssetResDto.builder()
                .id(result.getId())
                .picName(result.getPicName())
                .address(result.getAddress())
                .specification(result.getSpecification())
                .approvalStatus(result.getApprovalStatus())
                .reason(result.getReason()).build();
    }
}