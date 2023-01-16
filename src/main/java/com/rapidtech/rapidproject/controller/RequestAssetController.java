package com.rapidtech.rapidproject.controller;

import com.rapidtech.rapidproject.dto.RequestAssetReqDto;
import com.rapidtech.rapidproject.dto.RequestAssetResDto;
import com.rapidtech.rapidproject.service.RequestAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/requestAsset")
@RestController
public class RequestAssetController {
    @Autowired
    private RequestAssetService requestAssetService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RequestAssetResDto insertRequest(@RequestBody RequestAssetReqDto requestAssetReqDto) {
        return requestAssetService.insertRequest(requestAssetReqDto);
    }
}
