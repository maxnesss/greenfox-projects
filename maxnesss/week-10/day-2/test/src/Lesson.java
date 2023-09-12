public class Lesson {
    private Integer id;
    private String name;
    private String description;
    private String video;
    private String code;
    private Integer courseId;

    public Lesson(Integer id, String name, String description, String video, String code, Integer courseId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.video = video;
        this.code = code;
        this.courseId = courseId;
    }

    public Lesson(String name, String description, String video, String code, Integer courseId) {
        this.name = name;
        this.description = description;
        this.video = video;
        this.code = code;
        this.courseId = courseId;
    }

    public Lesson() {
    }

    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", video='" + video + '\'' +
                ", code='" + code + '\'' +
                ", courseId=" + courseId +
                '}';
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}