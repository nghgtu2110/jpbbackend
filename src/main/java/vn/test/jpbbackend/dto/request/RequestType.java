package vn.test.jpbbackend.dto.request;

import java.io.Serializable;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestType<T> implements Serializable {

    @JsonProperty("trace")
    private TraceType trace;

    @JsonProperty("data")
    private T data;

    public RequestType<T> setData(T data) {
        this.data = data;
        return this;
    }
}
