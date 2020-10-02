package seedu.duke.data.exception;

/**
 * Signals the different type of possible exceptions.
 */
public class SystemException extends Exception {
    /** Types of exception. */
    public enum ExceptionType {
        EXCEPTION_MISSING_DESCRIPTION("Missing description");

        /** The exception message. */
        private final String exceptionMessage;

        /**
         * Constructor of an ExceptionType.
         *
         * @param exceptionMessage The exception message.
         */
        ExceptionType(String exceptionMessage) {
            this.exceptionMessage = exceptionMessage;
        }

        /**
         * Overrides the parent toString method.
         *
         * @return The exception message.
         */
        @Override
        public String toString() {
            return exceptionMessage;
        }
    }

    public SystemException(ExceptionType exceptionType) {
        super(exceptionType.toString());
    }
}