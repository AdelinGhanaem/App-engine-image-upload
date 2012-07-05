package com.clouway.appengineupload.upload.server;

import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Adelin Ghanayem adelin.ghanaem@clouway.com
 */
public class ImageServer extends HttpServlet {

  BlobstoreService service = BlobstoreServiceFactory.getBlobstoreService();


  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    BlobKey blobKey = new BlobKey(request.getParameter("blob-key"));
    service.serve(blobKey, response);
  }


}
