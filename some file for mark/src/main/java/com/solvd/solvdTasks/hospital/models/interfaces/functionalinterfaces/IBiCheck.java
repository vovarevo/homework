package com.solvd.solvdTasks.hospital.models.interfaces.functionalinterfaces;

@FunctionalInterface
public interface IBiCheck<T,U> {
	boolean check(T t, U u);
}
