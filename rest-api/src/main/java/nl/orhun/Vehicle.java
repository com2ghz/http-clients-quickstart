package nl.orhun;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@EqualsAndHashCode
@ToString
@Getter
public class Vehicle {
    private final String brand;
    private final String model;
    private final String year;
}
