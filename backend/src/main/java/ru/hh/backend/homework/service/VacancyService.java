package ru.hh.backend.homework.service;

import org.springframework.transaction.annotation.Transactional;
import ru.hh.backend.homework.dao.VacancyDao;
import ru.hh.backend.homework.entity.VacancyEntity;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class VacancyService {
    private final VacancyDao vacancyDao;

    @Inject
    public VacancyService(VacancyDao vacancyDao) {
        this.vacancyDao = vacancyDao;
    }

    @Transactional
    public VacancyEntity save(VacancyEntity vacancyEntity) {
        return vacancyDao.save(vacancyEntity);
    }

    @Transactional
    public VacancyEntity get(Integer id) {
        return vacancyDao.get(id);
    }

    @Transactional
    public List<VacancyEntity> getAll() {
        return vacancyDao.getAll();
    }
}
