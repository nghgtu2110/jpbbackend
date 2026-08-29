package vn.test.jpbbackend.dto.request;

import java.io.Serializable;
import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TraceType implements Serializable {
    @JsonProperty("from")
    private String from;

    @JsonProperty("to")
    private String to;

    @JsonProperty("userName")
    private String userName;
    
    @JsonProperty("cid")
    private String cid;

    @JsonProperty("sid")
    private String sid;

    @JsonProperty("cts")
    private BigInteger cts;

    @JsonProperty("sts")
    private BigInteger sts;
}
