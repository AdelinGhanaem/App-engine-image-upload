package com.clouway.appengineupload.upload.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class Upload implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
//    final Button button = new Button("Click me");
//    final Label label = new Label();
//
//    button.addClickHandler(new ClickHandler() {
//      public void onClick(ClickEvent event) {
//        if (label.getText().equals("")) {
//          UploadService.App.getInstance().getMessage("Hello, World!", new MyAsyncCallback(label));
//        } else {
//          label.setText("");
//        }
//      }
//    });
//
//    // Assume that the host HTML has elements defined whose
//    // IDs are "slot1", "slot2".  In a real app, you probably would not want
//    // to hard-code IDs.  Instead, you could, for example, search for all
//    // elements with a particular CSS class and replace them with widgets.
//    //
//    RootPanel.get("slot1").add(button);
//    RootPanel.get("slot2").add(label);
//  }
//
//  private static class MyAsyncCallback implements AsyncCallback<String> {
//    private Label label;
//
//    public MyAsyncCallback(Label label) {
//      this.label = label;
//    }
//
//    public void onSuccess(String result) {
//      label.getElement().setInnerHTML(result);
//    }
//
//    public void onFailure(Throwable throwable) {
//      label.setText("Failed to receive answer from server!");
//    }
    GWT.log("1111111111111111111111111111111111111111111111111"+GWT.getModuleBaseURL());
  }
}
