package ru.hh.backend.homework.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "resumes")
public class ResumeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CreationTimestamp
    @Column(name = "creation_date")
    private Date creationDate;

    @UpdateTimestamp
    @Column(name = "modification_date")
    private Date modificationDate;

    @Column(name = "title")
    private String title;

    @Column(name = "work_experience")
    private String workExperience;

    @Column(name = "contacts")
    private String contacts;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity applicant;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public UserEntity getApplicant() {
        return applicant;
    }

    public void setApplicant(UserEntity applicant) {
        this.applicant = applicant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResumeEntity resumeEntity = (ResumeEntity) o;
        return id.equals(resumeEntity.id) &&
                creationDate.equals(resumeEntity.creationDate) &&
                modificationDate.equals(resumeEntity.modificationDate) &&
                title.equals(resumeEntity.title) &&
                workExperience.equals(resumeEntity.workExperience) &&
                contacts.equals(resumeEntity.contacts) &&
                applicant.equals(resumeEntity.applicant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, creationDate, modificationDate, title, workExperience, contacts, applicant);
    }
}
