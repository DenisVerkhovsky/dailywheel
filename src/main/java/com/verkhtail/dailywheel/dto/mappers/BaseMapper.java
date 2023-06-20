package com.verkhtail.dailywheel.dto.mappers;

import java.util.List;

/**
 * Base interface of mappers
 *
 * @param <E> Entity class
 * @param <D> DTO class
 */
public interface BaseMapper<E, D> {

    /**
     * Converts DTO object to Entity
     *
     * @param dto - source DTO
     * @return Converted Entity
     */
    E toEntity(D dto);

    /**
     * Converts list of Entities to list of DTOs
     *
     * @param dtos - source DTO list
     * @return Converted DTO list
     */
    List<E> toEntity(List<D> dtos);

    /**
     * Converts Entity object to DTO
     *
     * @param entity - source entity
     * @return Converted DTO
     */
    D toDto(E entity);

    /**
     * Converts list of Entities to list of DTOs
     *
     * @param entities - source Entity list
     * @return Converted DTO list
     */
    List<D> toDto(List<E> entities);
}

