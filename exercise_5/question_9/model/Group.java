package exercise_5.question_9.model;

import java.time.LocalDate;
import java.util.List;

public class Group {
    private long groupID;
    private String groupName;
    private List<String> account_name;
    private LocalDate createDate;

    public Group(long groupID, String groupName, List<String> account_name, LocalDate createDate) {
        this.groupID = groupID;
        this.groupName = groupName;
        this.account_name = account_name;
        this.createDate = createDate;
    }

    public long getGroupID() {
        return groupID;
    }

    public void setGroupID(long groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<String> getAccount_name() {
        return account_name;
    }

    public void setAccount_name(List<String> account_name) {
        this.account_name = account_name;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
