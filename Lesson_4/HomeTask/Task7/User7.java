package Lesson_4.HomeTask.Task7;

public class User7 {
    private final int USER_ID = 0;
    private static int userCount;
    private String userName;

    static {
        userCount = 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User7() {
    }

    public User7(String userName) {
        this.userName = userName;
        count();
        userCount = getUserCount();
    }

    private static void count() {
        userCount += 1;
    }

    public static int getUserCount() {
        return userCount;
    }
}
