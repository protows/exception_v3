package exception.v2;

public class LimitException extends RuntimeException{
    private int attempts=0;
    
    LimitException(final String message, int attempts){
        super(message);
        this.attempts =attempts;
    }
    
    public int getAttempts() {
        return attempts;
    }
}
