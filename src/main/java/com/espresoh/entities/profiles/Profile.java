package com.espresoh.entities.profiles;

import com.espresoh.entities.data.RawData;
import java.util.Date;

public class Profile {

     private int concilioId;
     private String email;
     private Date birthDate;
     private String firstName;
     private String lastName;
     private String phone;
     private String profilePhoto;
     private String companyName;
     private Date createdDate;
     private Date lastModifiedDate;
     private Date lastMergeDate;
     private Date unmergeDate;
     private Address address;

    public Profile(RawData rawData) {
        this.email = rawData.getEmail();
        this.firstName = rawData.getFirstName();
        this.lastName = rawData.getLastName();
        this.address = new Address(rawData);
    }

    public int getConcilioId() {
        return concilioId;
    }

    public void setConcilioId(int concilioId) {
        this.concilioId = concilioId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Date getLastMergeDate() {
        return lastMergeDate;
    }

    public void setLastMergeDate(Date lastMergeDate) {
        this.lastMergeDate = lastMergeDate;
    }

    public Date getUnmergeDate() {
        return unmergeDate;
    }

    public void setUnmergeDate(Date unmergeDate) {
        this.unmergeDate = unmergeDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "concilioId=" + concilioId +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", profilePhoto='" + profilePhoto + '\'' +
                ", companyName='" + companyName + '\'' +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", lastMergeDate=" + lastMergeDate +
                ", unmergeDate=" + unmergeDate +
                ", address=" + address +
                '}';
    }
}
