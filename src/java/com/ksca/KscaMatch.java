/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ksca;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Urs
 */
@Entity
@Table(name = "KSCA_MATCH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KscaMatch.findAll", query = "SELECT k FROM KscaMatch k"),
    @NamedQuery(name = "KscaMatch.findByRecordId", query = "SELECT k FROM KscaMatch k WHERE k.recordId = :recordId"),
    @NamedQuery(name = "KscaMatch.findByDate", query = "SELECT k FROM KscaMatch k WHERE k.date = :date"),
    @NamedQuery(name = "KscaMatch.findByGround", query = "SELECT k FROM KscaMatch k WHERE k.ground = :ground"),
    @NamedQuery(name = "KscaMatch.findByTeam1", query = "SELECT k FROM KscaMatch k WHERE k.team1 = :team1"),
    @NamedQuery(name = "KscaMatch.findByTeam2", query = "SELECT k FROM KscaMatch k WHERE k.team2 = :team2"),
    @NamedQuery(name = "KscaMatch.findByUmpire1", query = "SELECT k FROM KscaMatch k WHERE k.umpire1 = :umpire1"),
    @NamedQuery(name = "KscaMatch.findByUmpire2", query = "SELECT k FROM KscaMatch k WHERE k.umpire2 = :umpire2"),
    @NamedQuery(name = "KscaMatch.findByScorer", query = "SELECT k FROM KscaMatch k WHERE k.scorer = :scorer"),
    @NamedQuery(name = "KscaMatch.findByTournamentType", query = "SELECT k FROM KscaMatch k WHERE k.tournamentType = :tournamentType"),
    @NamedQuery(name = "KscaMatch.findByTossWon", query = "SELECT k FROM KscaMatch k WHERE k.tossWon = :tossWon"),
    @NamedQuery(name = "KscaMatch.findByMatchWon", query = "SELECT k FROM KscaMatch k WHERE k.matchWon = :matchWon"),
    @NamedQuery(name = "KscaMatch.findByRunsOrWkts", query = "SELECT k FROM KscaMatch k WHERE k.runsOrWkts = :runsOrWkts"),
    @NamedQuery(name = "KscaMatch.findByRunsOrWktsFlag", query = "SELECT k FROM KscaMatch k WHERE k.runsOrWktsFlag = :runsOrWktsFlag")})
public class KscaMatch implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "RECORD_ID")
    private BigDecimal recordId;
    @Column(name = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Size(max = 4000)
    @Column(name = "GROUND")
    private String ground;
    @Column(name = "TEAM1")
    private BigInteger team1;
    @Size(max = 4000)
    @Column(name = "TEAM2")
    private String team2;
    @Size(max = 4000)
    @Column(name = "UMPIRE1")
    private String umpire1;
    @Size(max = 4000)
    @Column(name = "UMPIRE2")
    private String umpire2;
    @Size(max = 4000)
    @Column(name = "SCORER")
    private String scorer;
    @Size(max = 4000)
    @Column(name = "TOURNAMENT_TYPE")
    private String tournamentType;
    @Column(name = "TOSS_WON")
    private BigInteger tossWon;
    @Column(name = "MATCH_WON")
    private BigInteger matchWon;
    @Size(max = 4000)
    @Column(name = "RUNS_OR_WKTS")
    private String runsOrWkts;
    @Size(max = 4000)
    @Column(name = "RUNS_OR_WKTS_FLAG")
    private String runsOrWktsFlag;

    public KscaMatch() {
    }

    public KscaMatch(BigDecimal recordId) {
        this.recordId = recordId;
    }

    public BigDecimal getRecordId() {
        return recordId;
    }

    public void setRecordId(BigDecimal recordId) {
        this.recordId = recordId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGround() {
        return ground;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }

    public BigInteger getTeam1() {
        return team1;
    }

    public void setTeam1(BigInteger team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getUmpire1() {
        return umpire1;
    }

    public void setUmpire1(String umpire1) {
        this.umpire1 = umpire1;
    }

    public String getUmpire2() {
        return umpire2;
    }

    public void setUmpire2(String umpire2) {
        this.umpire2 = umpire2;
    }

    public String getScorer() {
        return scorer;
    }

    public void setScorer(String scorer) {
        this.scorer = scorer;
    }

    public String getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(String tournamentType) {
        this.tournamentType = tournamentType;
    }

    public BigInteger getTossWon() {
        return tossWon;
    }

    public void setTossWon(BigInteger tossWon) {
        this.tossWon = tossWon;
    }

    public BigInteger getMatchWon() {
        return matchWon;
    }

    public void setMatchWon(BigInteger matchWon) {
        this.matchWon = matchWon;
    }

    public String getRunsOrWkts() {
        return runsOrWkts;
    }

    public void setRunsOrWkts(String runsOrWkts) {
        this.runsOrWkts = runsOrWkts;
    }

    public String getRunsOrWktsFlag() {
        return runsOrWktsFlag;
    }

    public void setRunsOrWktsFlag(String runsOrWktsFlag) {
        this.runsOrWktsFlag = runsOrWktsFlag;
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
        if (!(object instanceof KscaMatch)) {
            return false;
        }
        KscaMatch other = (KscaMatch) object;
        if ((this.recordId == null && other.recordId != null) || (this.recordId != null && !this.recordId.equals(other.recordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ksca.KscaMatch[ recordId=" + recordId + " ]";
    }
    
}
