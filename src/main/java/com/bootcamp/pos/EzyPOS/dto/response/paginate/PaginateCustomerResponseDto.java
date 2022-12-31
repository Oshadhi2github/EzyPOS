package com.bootcamp.pos.EzyPOS.dto.response.paginate;

import com.bootcamp.pos.EzyPOS.dto.response.CustomerResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginateCustomerResponseDto {
    private long dataCount;
    private List<CustomerResponseDto> dataList;
}
