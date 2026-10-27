package criacionais.singlenton;

public class LogService {
    private static LogService INSTANCE;
    private LogService() {}

    public static LogService getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new LogService();
        }
        return INSTANCE;
    }

    public void registrarLog(String log) {
        System.out.println("LOG: " + log);
    }
}
