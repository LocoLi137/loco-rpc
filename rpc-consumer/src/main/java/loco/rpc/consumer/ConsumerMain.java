package loco.rpc.consumer;

import loco.rpc.common.model.User;
import loco.rpc.common.service.UserService;
import rpc.loco.simple.registry.LocalRegistry;

/**
 * description:
 * author: Loco.Li
 */
public class ConsumerMain {
    public static void main(String[] args) {
        UserService userService = new UserServiceProxy();
        User user = new User();
        user.setName("loco");

        //调用
        User newUser  = userService.getUser(user);

        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
