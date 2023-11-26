package com.example.umc_study.apiPayload.exception.handler;

import com.example.umc_study.apiPayload.code.BaseErrorCode;
import com.example.umc_study.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {
    public TempHandler(BaseErrorCode code) {
        super(code);
    }
}
