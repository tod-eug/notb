package bot.commands;

import bot.Constants;
import org.telegram.telegrambots.extensions.bots.commandbot.commands.IBotCommand;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.bots.AbsSender;

public class StartCommand implements IBotCommand {
    @Override
    public String getCommandIdentifier() {
        return "start";
    }

    @Override
    public String getDescription() {
        return "start";
    }

    @Override
    public void processMessage(AbsSender absSender, Message message, String[] arguments) {
        MessageProcessor mp = new MessageProcessor();

        String response = Constants.START_REPLY;
        SendMessage sm = new SendMessage();
        sm.setChatId(message.getChatId().toString());
        sm.setText(response);
        mp.sendMsg(absSender, sm);
    }
}
