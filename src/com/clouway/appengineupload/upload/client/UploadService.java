package com.clouway.appengineupload.upload.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("UploadService")
public interface UploadService extends RemoteService {
  // Sample interface method of remote interface
  String getMessage(String msg);

  /**
   * Utility/Convenience class.
   * Use UploadService.App.getInstance() to access static instance of UploadServiceAsync
   */
  public static class App {
    private static UploadServiceAsync ourInstance = GWT.create(UploadService.class);

    public static synchronized UploadServiceAsync getInstance() {
      return ourInstance;
    }
  }
}
