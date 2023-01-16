package com.rapidtech.rapidproject.service;

import com.rapidtech.rapidproject.dto.RequestAssetReqDto;
import com.rapidtech.rapidproject.dto.RequestAssetResDto;

import java.util.List;

public interface RequestAssetService {
    RequestAssetResDto insertRequest(RequestAssetReqDto requestAssetReqDto);
}
