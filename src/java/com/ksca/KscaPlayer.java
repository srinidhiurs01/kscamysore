/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ksca;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Urs
 */
@Entity
@Table(name = "KSCA_PLAYER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KscaPlayer.findAll", query = "SELECT k FROM KscaPlayer k"),
    @NamedQuery(name = "KscaPlayer.findByRecordId", query = "SELECT k FROM KscaPlayer k WHERE k.recordId = :recordId"),
    @NamedQuery(name = "KscaPlayer.findByFirstName", query = "SELECT k FROM KscaPlayer k WHERE k.firstName = :firstName"),
    @NamedQuery(name = "KscaPlayer.findByLastName", query = "SELECT k FROM KscaPlayer k WHERE k.lastName = :lastName"),
    @NamedQuery(name = "KscaPlayer.findByContactNumber", query = "SELECT k FROM KscaPlayer k WHERE k.contactNumber = :contactNumber"),
    @NamedQuery(name = "KscaPlayer.findByEmailId", query = "SELECT k FROM KscaPlayer k WHERE k.emailId = :emailId"),
    @NamedQuery(name = "KscaPlayer.findByState", query = "SELECT k FROM KscaPlayer k WHERE k.state = :state"),
    @NamedQuery(name = "KscaPlayer.findByCity", query = "SELECT k FROM KscaPlayer k WHERE k.city = :city"),
    @NamedQuery(name = "KscaPlayer.findByPincode", query = "SELECT k FROM KscaPlayer k WHERE k.pincode = :pincode"),
    @NamedQuery(name = "KscaPlayer.findByStreet", query = "SELECT k FROM KscaPlayer k WHERE k.street = :street"),
    @NamedQuery(name = "KscaPlayer.findByFkTeamId", query = "SELECT k FROM KscaPlayer k WHERE k.fkTeamId = :fkTeamId")})
public class KscaPlayer implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "RECORD_ID")
    private BigDecimal recordId;
    @Size(max = 4000)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Size(max = 4000)
    @Column(name = "LAST_NAME")
    private String lastName;
    @Size(max = 4000)
    @Column(name = "CONTACT_NUMBER")
    private String contactNumber;
    @Size(max = 4000)
    @Column(name = "EMAIL_ID")
    private String emailId;
    @Size(max = 4000)
    @Column(name = "STATE")
    private String state;
    @Size(max = 4000)
    @Column(name = "CITY")
    private String city;
    @Size(max = 4000)
    @Column(name = "PINCODE")
    private String pincode;
    @Size(max = 4000)
    @Column(name = "STREET")
    private String street;
    @Column(name = "FK_TEAM_ID")
    private BigInteger fkTeamId;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "kscaPlayer1")
    private KscaPlayer kscaPlayer;
    @JoinColumn(name = "RECORD_ID", referencedColumnName = "RECORD_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private KscaPlayer kscaPlayer1;

    public KscaPlayer() {
    }

    public KscaPlayer(BigDecimal recordId) {
        this.recordId = recordId;
    }

    public BigDecimal getRecordId() {
        return recordId;
    }

    public void setRecordId(BigDecimal recordId) {
        this.recordId = recordId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public BigInteger getFkTeamId() {
        return fkTeamId;
    }

    public void setFkTeamId(BigInteger fkTeamId) {
        this.fkTeamId = fkTeamId;
    }

    public KscaPlayer getKscaPlayer() {
        return kscaPlayer;
    }

    public void setKscaPlayer(KscaPlayer kscaPlayer) {
        this.kscaPlayer = kscaPlayer;
    }

    public KscaPlayer getKscaPlayer1() {
        return kscaPlayer1;
    }

    public void setKscaPlayer1(KscaPlayer kscaPlayer1) {
        this.kscaPlayer1 = kscaPlayer1;
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
        if (!(object instanceof KscaPlayer)) {
            return false;
        }
        KscaPlayer other = (KscaPlayer) object;
        if ((this.recordId == null && other.recordId != null) || (this.recordId != null && !this.recordId.equals(other.recordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ksca.KscaPlayer[ recordId=" + recordId + " ]";
    }
    
}
