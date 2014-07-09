package com.dbolshak.prototype.server;

import com.dbolshak.prototype.client.GreetingService;
import com.dbolshak.prototype.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {

    public String greetServer(String input) throws IllegalArgumentException {
        return "";
    }
}
