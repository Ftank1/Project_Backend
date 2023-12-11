package com.project.modulo4.mapper;

import com.project.modulo4.models.club.dto.ClubDTO;
import com.project.modulo4.models.club.model.ClubModel;
import com.project.modulo4.models.nation.dto.NationDTO;
import com.project.modulo4.models.nation.model.NationModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface NationMapper {
    NationDTO toDTO(NationModel nationModel);

    NationModel toModel(NationDTO nationDTO);
}

