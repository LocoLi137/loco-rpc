package loco.rpc.provider;

import loco.rpc.common.service.UserService;
import rpc.loco.simple.registry.LocalRegistry;
import rpc.loco.simple.server.VertxHttpServer;

/**
 * description:
 * author: Loco.Li
 */
public class ProviderMain {
    public static void main(String[] args) {
        //register
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
        //start server
        VertxHttpServer server = new VertxHttpServer();
        server.doStart(18080);
    }
}
