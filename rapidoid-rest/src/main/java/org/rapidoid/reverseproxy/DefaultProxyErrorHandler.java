package org.rapidoid.reverseproxy;

import org.rapidoid.http.Req;
import org.rapidoid.http.Resp;
import org.rapidoid.http.impl.lowlevel.HttpIO;
import org.rapidoid.log.LogLevel;
import org.rapidoid.u.U;

import java.io.IOException;
import java.net.ConnectException;

public class DefaultProxyErrorHandler implements OnErrorCallback {

    @Override
    public boolean handleError(Req req, Resp resp, Throwable error, ProxyMapping mapping, LogLevel logLevel) {
        return false;
    }
}
