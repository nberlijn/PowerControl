package nl.nberlijn.powercontrol.views;

import nl.nberlijn.powercontrol.models.CommandModel;

public class CommandView {

    public void print(CommandModel commandModel) {
        System.out.println(commandModel.getName());
        System.out.println(commandModel.getHost());
        System.out.println(commandModel.getUser());
        System.out.println(commandModel.getPassword());
        System.out.println(commandModel.getPort());
        System.out.println(commandModel.getTimeout());
        System.out.println(commandModel.getCommand());
    }

}
