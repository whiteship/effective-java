package me.whiteship.chapter01.item07.optional;

import java.util.Optional;
import java.util.OptionalLong;

public class Channel {

    private int numOfSubscribers;

    public Optional<MemberShip> defaultMemberShip() {
        if (this.numOfSubscribers < 2000) {
            return Optional.empty();
        } else {
            return Optional.of(new MemberShip());
        }
    }
}
