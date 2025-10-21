package phong_airline.demo.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonProperty(JsonInclude.Include.NON_NULL)
public class Response<T> {

    private int statusCode;

    private String message;

    private T data;
}