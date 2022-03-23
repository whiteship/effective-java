package me.whiteship.chapter01.item01;

public enum ActionEnum {
    ACTION_1(new App())
    , ACTION_2(new App());

    private final App action;

    ActionEnum(App action) {this.action = action;}

}