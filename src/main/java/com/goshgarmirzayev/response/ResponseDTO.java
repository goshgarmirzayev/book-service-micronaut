package com.goshgarmirzayev.response;

public class ResponseDTO {
    private Integer code;
    private String messageAZ;
    private String messageEN;

    public ResponseDTO(Integer code, String messageAZ, String messageEN) {
        this.code = code;
        this.messageAZ = messageAZ;
        this.messageEN = messageEN;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessageAZ() {
        return messageAZ;
    }

    public void setMessageAZ(String messageAZ) {
        this.messageAZ = messageAZ;
    }

    public String getMessageEN() {
        return messageEN;
    }

    public void setMessageEN(String messageEN) {
        this.messageEN = messageEN;
    }
}
