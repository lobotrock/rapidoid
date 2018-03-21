package org.rapidoid.reverseproxy;

import org.rapidoid.http.Req;
import org.rapidoid.http.Resp;
import org.rapidoid.log.LogLevel;

public interface OnErrorCallback {

    boolean handleError(Req req, Resp resp, Throwable error, ProxyMapping mapping, LogLevel logLevel);
}
