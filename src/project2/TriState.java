package project2;

public class TriState extends NonResident{

    private String state;

    /**
     * This is a constructor that takes in 5 parameters for a student.
     *
     * @param first
     * @param last
     * @param birth
     * @param m
     * @param credits
     * @author David Harianto, Joban Singh
     */
    public TriState(String first, String last, String birth, String m, double credits, String state) {
        super(first, last, birth, m, credits);
        this.state = state.toUpperCase();
    }

    public boolean validState() {
        return (state.equals("NY") || state.equals("CT"));

    }

    @Override
    public String toString() {
        return super.toString() + " (non-resident) (tri-state:" + state + ")";
    }
}
