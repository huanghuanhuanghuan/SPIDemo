package com.example.functionb;

import com.example.api.IFunction;
import com.google.auto.service.AutoService;

@AutoService(IFunction.class)
public class FunctionB implements IFunction {
    @Override
    public String getName() {
        return "FunctionB";
    }

    @Override
    public void doFunction() {

    }
}
