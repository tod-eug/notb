package bot;

import bot.commands.StartCommand;
import org.telegram.telegrambots.extensions.bots.commandbot.TelegramLongPollingCommandBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import utils.PropertiesProvider;

import java.util.List;

public class NotifyBot extends TelegramLongPollingCommandBot {

    public NotifyBot() {
        super();
        register(new StartCommand());
    }

    @Override
    public void processNonCommandUpdate(Update update) {

    }

    @Override
    public void onUpdatesReceived(List<Update> updates) {
        super.onUpdatesReceived(updates);
    }

    @Override
    public void onRegister() {
        super.onRegister();
    }

    @Override
    public String getBotUsername() {
        return PropertiesProvider.configurationProperties.get("BotName");
    }

    @Override
    public String getBotToken() {
        return PropertiesProvider.configurationProperties.get("Token");
    }
}
