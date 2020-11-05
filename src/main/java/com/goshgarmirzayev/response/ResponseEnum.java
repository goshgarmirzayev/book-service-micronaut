package com.goshgarmirzayev.response;

public enum ResponseEnum {
    SUCCESS(new ResponseDTO(200, "Əməliyyat uğurla tamamlandı", "Operation finished successfully")),
    FAILED(new ResponseDTO(2001, "Əməliyyat uğursuz oldu", "Operation failed")),
    NOT_FOUND(new ResponseDTO(404, "Paramaterlərə uyğun məlumat tapılmadı", "No Data found"));
    private ResponseDTO responseDTO;

    public ResponseDTO getResponseDTO() {
        return responseDTO;
    }

    ResponseEnum(ResponseDTO responseDTO) {
        this.responseDTO = responseDTO;
    }

}
