package loco.rpc.provider;

import rpc.loco.simple.registry.LocalRegistry;
import rpc.loco.simple.server.VertxHttpServer;

/**
 * description:
 * author: Loco.Li
 */
public class ProviderMain {
    public static void main(String[] args) {
        //register
        LocalRegistry.register("getUser", UserServiceImpl.class);
        //start server
        VertxHttpServer server = new VertxHttpServer();
        server.doStart(18080);
    }
}
