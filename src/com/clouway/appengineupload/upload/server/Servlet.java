package com.clouway.appengineupload.upload.server;

import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author Adelin Ghanayem adelin.ghanaem@clouway.com
 */
public class Servlet extends HttpServlet {


  private BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    Map<String, List<BlobKey>> blobKeyMap = blobstoreService.getUploads(request);

    List<BlobKey> keys = blobKeyMap.get("myFile");

    if (keys == null) {
      response.sendRedirect("/");
    } else {
      response.sendRedirect("/imageServer?blob-key=" + keys.get(0).getKeyString());
    }

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}
