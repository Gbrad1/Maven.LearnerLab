package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    private static final Students INSTANCE;

    static{
        try {
            INSTANCE = new Students();
        } catch(Exception e) {
            throw new RuntimeException("error");
        }
    }

    private Students() {
        Student giles = new Student(1L, "Giles");
        Student jimmy = new Student(2L, "Jimmy");
        Student chris = new Student(3L, "Chris");

        add(giles);
        add(jimmy);
        add(chris);
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    @Override
    public Student[] listToArray() {
        return getPersonList().toArray(new Student[0]);
    }
}