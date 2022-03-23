package me.whiteship.chapter01.item07.listener;

import org.junit.jupiter.api.Test;

import java.lang.ref.WeakReference;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChatRoomTest {

    @Test
    void charRoom() throws InterruptedException {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User();
        User user2 = new User();

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

        chatRoom.sendMessage("hello");

        user1 = null;

        System.gc();

        Thread.sleep(5000L);

        List<WeakReference<User>> users = chatRoom.getUsers();
        assertTrue(users.size() == 1);
    }

}