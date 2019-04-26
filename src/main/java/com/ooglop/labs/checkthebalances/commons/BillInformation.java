package com.ooglop.labs.checkthebalances.commons;

import com.ooglop.labs.checkthebalances.commons.enums.CongressType;
import lombok.Data;

@Data
public class BillInformation {
    String name;
    int id;
    CongressType congressType;
}
