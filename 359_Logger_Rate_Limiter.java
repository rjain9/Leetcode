public class Logger {

    private Map<String, Integer> messageTimestamps;

    public Logger() {
        messageTimestamps = new HashMap<>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.*/
    public boolean printMessage(final int timestamp, final String message) {
        Integer lastTimestamp = messageTimestamps.getOrDefault(message, null);
        if (lastTimestamp != null && timestamp - lastTimestamp < 10) {
            return false;
        } else {
            lastTimestamp = timestamp;
            messageTimestamps.put(message, lastTimestamp);
            return true;
        }
    }
}
