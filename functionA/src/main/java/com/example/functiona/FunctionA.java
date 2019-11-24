package com.example.functiona;

import com.example.api.IFunction;
import com.google.auto.service.AutoService;

@AutoService(IFunction.class)
public class FunctionA implements IFunction {
    @Override
    public String getName() {
        return "FunctionA";
    }

    @Override
    public void doFunction() {

    }
}
