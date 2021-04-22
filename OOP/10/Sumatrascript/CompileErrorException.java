import java.util.ArrayList;

public class CompileErrorException extends Exception {
    private ArrayList<Integer> errorLocations = new ArrayList<Integer>();

    public CompileErrorException(ArrayList<Integer> errors) {
        errorLocations = errors;
    }

    public void showErrors() {
        for (Integer errors : this.errorLocations) {
            System.out.println("Error di baris : " + errors.toString());
        }
    }
}