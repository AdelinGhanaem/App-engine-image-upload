package com.clouway.appengineupload.upload.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface UploadServiceAsync {
  void getMessage(String msg, AsyncCallback<String> async);
}
