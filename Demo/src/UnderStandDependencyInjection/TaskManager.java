package UnderStandDependencyInjection;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.concurrent.CompletableFuture;

@Singleton

// High level classes
public class TaskManager {
    private final Logger logger;

    @Inject
    public TaskManager(Logger logger) {
        this.logger = logger;
    }

    public CompletableFuture<Void> execute() {
        final String[] sentence = "This is a tutorial on Dependency Injection!".split(" ");
        for (final String word : sentence) {
            logger.write(word);
        }
        return logger.flushAsync()
                .whenComplete((__, throwable) -> {
                    if (throwable != null) {
                        throwable.printStackTrace();
                    } else {
                        logger.close();
                    }
                });
    }
}