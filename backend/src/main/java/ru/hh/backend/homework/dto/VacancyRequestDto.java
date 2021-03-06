package ru.hh.backend.homework.dto;

public class VacancyRequestDto {
    private String title;
    private Integer companyId;
    private Integer salary;
    private String description;
    private String contacts;

    public VacancyRequestDto() {
    }

    public VacancyRequestDto(String title, Integer companyId, Integer salary, String description, String contacts) {
        this.title = title;
        this.companyId = companyId;
        this.salary = salary;
        this.description = description;
        this.contacts = contacts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
}
