package com.Ejdzyn.Shop.mapper;

@FunctionalInterface
public interface Converter<T, F> {
    T convert(F from);
}
