package com.procourier.model.repository;

import com.procourier.model.Order;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    Optional<T> findByName(Long id);
    List<T> getAll();
    Long put(T item);
    List<Long> putAll(List<T> items);
}
