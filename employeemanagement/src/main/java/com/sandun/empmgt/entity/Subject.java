/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sandun.empmgt.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sandun
 */
@Entity
@Table(name = "subject")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subject.findAll", query = "SELECT s FROM Subject s")
    , @NamedQuery(name = "Subject.findBySubectId", query = "SELECT s FROM Subject s WHERE s.subectId = :subectId")
    , @NamedQuery(name = "Subject.findByName", query = "SELECT s FROM Subject s WHERE s.name = :name")})
public class Subject implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "subect_id")
    private Integer subectId;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy = "subjectList", fetch = FetchType.EAGER)
    private List<Student> studentList;

    public Subject() {
    }

    public Subject(Integer subectId) {
        this.subectId = subectId;
    }

    public Integer getSubectId() {
        return subectId;
    }

    public void setSubectId(Integer subectId) {
        this.subectId = subectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subectId != null ? subectId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subject)) {
            return false;
        }
        Subject other = (Subject) object;
        if ((this.subectId == null && other.subectId != null) || (this.subectId != null && !this.subectId.equals(other.subectId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sandun.empmgt.entity.Subject[ subectId=" + subectId + " ]";
    }
    
}
