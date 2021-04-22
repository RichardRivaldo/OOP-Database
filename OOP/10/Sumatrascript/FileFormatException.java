public class FileFormatException extends Exception {
    private String errorMessage;

    public FileFormatException() {
        this.errorMessage = "Format salah";
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}