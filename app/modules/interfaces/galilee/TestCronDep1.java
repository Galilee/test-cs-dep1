package modules.interfaces.galilee;

import com.censhare.server.kernel.Command;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCronDep1 {
    private Command command;
    private Logger logger;

    public TestCronDep1(Command command) {
        this.command = command;
        this.logger = command.getLogger();
    }

    /**
     * @throws Exception
     */
    public void execute() throws Exception {
        this.logger.log(Level.INFO, "DEBUG - Start Test Cron");

        this.logger.log(Level.INFO, "DEBUG - End B2B cron");
    }
}