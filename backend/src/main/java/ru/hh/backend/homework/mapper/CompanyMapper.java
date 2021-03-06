package ru.hh.backend.homework.mapper;

import ru.hh.backend.homework.dto.CompanyRequestDto;
import ru.hh.backend.homework.dto.CompanyResponseDto;
import ru.hh.backend.homework.entity.CompanyEntity;
import ru.hh.backend.homework.entity.UserEntity;
import ru.hh.backend.homework.service.CompanyService;
import ru.hh.backend.homework.service.UserService;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class CompanyMapper {
    private final UserService userService;

    @Inject
    public CompanyMapper(UserService userService) {
        this.userService = userService;
    }

    public CompanyEntity map(CompanyRequestDto companyRequestDto) {
        return new CompanyEntity(companyRequestDto.getName(), userService.get(companyRequestDto.getUserId()));
    }

    public CompanyResponseDto map(CompanyEntity companyEntity) {
        return new CompanyResponseDto(companyEntity.getCompanyId(), companyEntity.getName());
    }
}
