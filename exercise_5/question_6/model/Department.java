package exercise_5.question_6.model;

import java.time.LocalDate;

public class Department {
    private long id;
    private String name;
    private String description;
    private LocalDate created_at;
    private LocalDate updated_at;

    public Department(long id, String name, String description, LocalDate created_at, LocalDate updated_at) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
