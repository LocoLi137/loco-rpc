package loco.rpc.provider;

import loco.rpc.common.model.User;
import loco.rpc.common.service.UserService;

/**
 * description:
 * author: Loco.Li
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println(user.getName());
        return user;
    }
}
