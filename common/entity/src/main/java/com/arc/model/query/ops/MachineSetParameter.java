package com.arc.model.query.ops;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MachineSetParameter {

    private List<Integer> dateList;

    private String frontData;

    private Integer isAble;

    private String offTime;

    private String onTime;

    private Integer type;


}
