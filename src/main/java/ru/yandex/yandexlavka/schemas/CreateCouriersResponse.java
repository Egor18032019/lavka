package ru.yandex.yandexlavka.schemas;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


public class CreateCouriersResponse {
    private List<CreateCourierDto> couriers;

    public CreateCouriersResponse() {
    }

    public CreateCouriersResponse(List<CreateCourierDto> couriers) {
        this.couriers = couriers;
    }

    public List<CreateCourierDto> getCouriers() {
        return couriers;
    }

    public void setCouriers(List<CreateCourierDto> couriers) {
        this.couriers = couriers;
    }
}
