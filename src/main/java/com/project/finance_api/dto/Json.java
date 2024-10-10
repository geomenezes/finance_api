package com.project.finance_api.dto;

import java.util.List;
import java.util.Map;

public class Json {
    private Map<String, Object> response;
    private String message;
    private List<Object> erros;

    public Json(Map<String, Object> response, String message) {
        this.response = response;
        this.message = message;
    }

    public Json(Map<String, Object> response, String message, List<Object> erros) {
        this(response, message);
        this.erros = erros;
    }

}
