package com.example.sayehwebservices.domain;

import javax.persistence.*;


@Entity
@Table(name = "VW_NEWYARANEH", schema = "SAYEH", catalog = "")
public class DecileInfo {
    @Id
    @Basic
    @Column(name = "RES_SSN", nullable = true, length = 10)
    private String resSsn;
    @Basic
    @Column(name = "SSN", nullable = true, length = 10)
    private String ssn;
    @Basic
    @Column(name = "DECILE", nullable = true, precision = 0)
    private Integer decile;
    @Basic
    @Column(name = "HAZFJADID", nullable = true, precision = 0)
    private Integer hazfjadid;
    @Basic
    @Column(name = "HAZFGHADIM", nullable = true, precision = 0)
    private Integer hazfghadim;
    @Basic
    @Column(name = "MASHMOOL", nullable = true, precision = 0)
    private Integer mashmool;

    public String getResSsn() {
        return resSsn;
    }

    public void setResSsn(String resSsn) {
        this.resSsn = resSsn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getDecile() {
        return decile;
    }

    public void setDecile(int decile) {
        this.decile = decile;
    }

    public int getHazfjadid() {
        return hazfjadid;
    }

    public void setHazfjadid(int hazfjadid) {
        this.hazfjadid = hazfjadid;
    }

    public int getHazfghadim() {
        return hazfghadim;
    }

    public void setHazfghadim(int hazfghadim) {
        this.hazfghadim = hazfghadim;
    }

    public int getMashmool() {
        return mashmool;
    }

    public void setMashmool(int mashmool) {
        this.mashmool = mashmool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DecileInfo that = (DecileInfo) o;

        if (resSsn != null ? !resSsn.equals(that.resSsn) : that.resSsn != null) return false;
        if (ssn != null ? !ssn.equals(that.ssn) : that.ssn != null) return false;
        if (decile != null ? !decile.equals(that.decile) : that.decile != null) return false;
        if (hazfjadid != null ? !hazfjadid.equals(that.hazfjadid) : that.hazfjadid != null) return false;
        if (hazfghadim != null ? !hazfghadim.equals(that.hazfghadim) : that.hazfghadim != null) return false;
        if (mashmool != null ? !mashmool.equals(that.mashmool) : that.mashmool != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = resSsn != null ? resSsn.hashCode() : 0;
        result = 31 * result + (ssn != null ? ssn.hashCode() : 0);
        result = 31 * result + (decile != null ? decile.hashCode() : 0);
        result = 31 * result + (hazfjadid != null ? hazfjadid.hashCode() : 0);
        result = 31 * result + (hazfghadim != null ? hazfghadim.hashCode() : 0);
        result = 31 * result + (mashmool != null ? mashmool.hashCode() : 0);
        return result;
    }
}
