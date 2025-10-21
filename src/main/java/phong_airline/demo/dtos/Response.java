package phong_airline.demo.dtos;

@Data
@Builder
@JsonProperty(JsonInclude.Include.NON_NULL)
public class Response<T> {

    private int statusCode;

    private String message;

    private T data;

}
