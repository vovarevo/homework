package com.solvd.solvdTasks.hospital.models.interfaces.functionalinterfaces;

@FunctionalInterface
public interface ICalculate<T,N> {
	 N calculate(T type);
}
