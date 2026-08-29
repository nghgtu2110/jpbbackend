package vn.test.jpbbackend.dto.request;

import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductOfferingDetailsRequest {
    private Long productOfferingId;
    private List<Long> productDetailIds;
}