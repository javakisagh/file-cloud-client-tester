package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class FolderMetadata {

  /* id of the resouce */
  Long folderId = null

  /* printable name of this folder */
  String name = null

  /* path to this resource */
  String pathLower = null

  /* printable version of path to this resource */
  String pathDisplay = null

  /* id of the parent folder */
  Long parentFolderId = null

  /* format=\"%Y-%m-%dT%H:%M:%SZ\" date and time of creation of the file in the server side see https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14 */
  String serverCreatedAt = null
  

}

