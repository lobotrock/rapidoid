package org.rapidoid.http.handler;

/*
 * #%L
 * rapidoid-http-fast
 * %%
 * Copyright (C) 2014 - 2016 Nikolche Mihajlovski and contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.Since;
import org.rapidoid.commons.MediaType;
import org.rapidoid.http.FastHttp;
import org.rapidoid.http.HttpWrapper;
import org.rapidoid.http.Req;
import org.rapidoid.net.abstracts.Channel;

@Authors("Nikolche Mihajlovski")
@Since("4.3.0")
public abstract class FastParamsAwareHttpHandler extends AbstractAsyncHttpHandler {

	public FastParamsAwareHttpHandler(FastHttp http, MediaType contentType, HttpWrapper[] wrappers) {
		super(http, contentType, wrappers);
	}

	@Override
	protected Object handleReq(Channel channel, boolean isKeepAlive, Req req, Object extra) throws Exception {
		return doHandle(channel, isKeepAlive, req, extra);
	}

	protected abstract Object doHandle(Channel channel, boolean isKeepAlive, Req req, Object extra) throws Exception;

	@Override
	public boolean needsParams() {
		return true;
	}

}
