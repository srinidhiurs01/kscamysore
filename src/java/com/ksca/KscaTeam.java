/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ksca;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Urs
 */
@Entity
@Table(name = "KSCA_TEAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KscaTeam.findAll", query = "SELECT k FROM KscaTeam k"),
    @NamedQuery(name = "KscaTeam.findByRecordId", query = "SELECT k FROM KscaTeam k WHERE k.recordId = :recordId"),
    @NamedQuery(name = "KscaTeam.findByTeamName", query = "SELECT k FROM KscaTeam k WHERE k.teamName = :teamName"),
    @NamedQuery(name = "KscaTeam.findByTeamId", query = "SELECT k FROM KscaTeam k WHERE k.teamId = :teamId"),
    @NamedQuery(name = "KscaTeam.findByDivisionVarchar", query = "SELECT k FROM KscaTeam k WHERE k.divisionVarchar = :divisionVarchar")})
public class KscaTeam implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "RECORD_ID")
    private BigDecimal recordId;
    @Size(max = 400)
    @Column(name = "TEAM_NAME")
    private String teamName;
    @Size(max = 4000)
    @Column(name = "TEAM_ID")
    private String teamId;
    @Size(max = 50)
    @Column(name = "DIVISION VARCHAR")
    private String divisionVarchar;

    public KscaTeam() {
    }

    public KscaTeam(BigDecimal recordId) {
        this.recordId = recordId;
    }

    public BigDecimal getRecordId() {
        return recordId;
    }

    public void setRecordId(BigDecimal recordId) {
        this.recordId = recordId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getDivisionVarchar() {
        return divisionVarchar;
    }

    public void setDivisionVarchar(String divisionVarchar) {
        this.divisionVarchar = divisionVarchar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recordId != null ? recordId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KscaTeam)) {
            return false;
        }
        KscaTeam other = (KscaTeam) object;
        if ((this.recordId == null && other.recordId != null) || (this.recordId != null && !this.recordId.equals(other.recordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ksca.KscaTeam[ recordId=" + recordId + " ]";
    }
    
}
