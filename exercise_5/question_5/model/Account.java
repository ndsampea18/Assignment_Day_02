package exercise_5.question_5.model;

import java.util.Date;

public class Account {
    private long accountID;
    private String email;
    private String username;
    private String fullname;
    private String departmentID;
    private String positionID;
    private Date createDate;

    public Account(long accountID, String email, String username, String fullname, String departmentID, String positionID, Date createDate) {
        this.accountID = accountID;
        this.email = email;
        this.username = username;
        this.fullname = fullname;
        this.departmentID = departmentID;
        this.positionID = positionID;
        this.createDate = createDate;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public void setPositionID(String positionID) {
        this.positionID = positionID;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public long getAccountID() {
        return accountID;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getFullname() {
        return fullname;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public String getPositionID() {
        return positionID;
    }

    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullname='" + fullname + '\'' +
                ", departmentID='" + departmentID + '\'' +
                ", positionID='" + positionID + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}