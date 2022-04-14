import bot.NotifyBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import utils.PropertiesProvider;

public class Main {

    public static void main(String[] args) {

        PropertiesProvider.setup();

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new NotifyBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
