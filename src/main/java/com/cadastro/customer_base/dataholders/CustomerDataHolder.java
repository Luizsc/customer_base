package com.cadastro.customer_base.dataholders;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDataHolder implements DataHolder {

    private Object data;

    public CustomerDataHolder(Object data) {
        this.data = data;
    }

    public CustomerDataHolder() {
    }
}
