// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package org.cef.browser;

import org.cef.handler.CefClientHandler;

/**
 * Creates a new instance of CefBrowser according the passed values
 */
public class CefBrowserFactory {
    public static CefBrowser create(CefClientHandler clientHandler,
                                    String url,
                                    boolean isOffscreenRendered,
                                    boolean isTransparent,
                                    CefRequestContext context) {
        if (isOffscreenRendered)
            return new CefBrowserOsr(clientHandler, url, isTransparent, context);
        return new CefBrowserWr(clientHandler, url, context);
    }
}
