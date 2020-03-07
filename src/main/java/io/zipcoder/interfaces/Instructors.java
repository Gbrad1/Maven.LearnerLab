package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE;

    static{
        try {
            INSTANCE = new Instructors();
        } catch(Exception e) {
            throw new RuntimeException("error");
        }
    }

    private Instructors() {
        Instructor dolio = new Instructor(1L, "Dolio");
        Instructor nobles = new Instructor(2L, "Nobles");
        Instructor roberto = new Instructor(3L, "Roberto");
        Instructor froilan = new Instructor(4L, "Froilan");
        Instructor sian = new Instructor(5L, "Sian");

        add(dolio);
        add(nobles);
        add(roberto);
        add(froilan);
        add(sian);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    @Override
    public Instructor[] listToArray() {
        return getPersonList().toArray(new Instructor[0]);
    }
}
