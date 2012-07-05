package com.clouway.appengineupload.upload.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.clouway.appengineupload.upload.client.UploadService;

public class UploadServiceImpl extends RemoteServiceServlet implements UploadService {
  // Implementation of sample interface method
  public String getMessage(String msg) {
    return "Client said: \"" + msg + "\"< br>Server answered: \"Hi!\"";
  }
}