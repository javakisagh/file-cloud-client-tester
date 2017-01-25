package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class FileMetadata {

  /* id of the resouce */
  Long fileId = null

  /* printable name of this folder */
  String name = null

  /* path to this resource */
  String pathLower = null

  /* printable version of path to this resource */
  String pathDisplay = null

  /* id of the folder directly containing this file */
  Long enclosingFolderId = null

  /* file size in bytes */
  Long size = null

  /* format=\"%Y-%m-%dT%H:%M:%SZ\" date and time of creation of the file in the server side see https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14 */
  String serverCreatedAt = null

  /* format=\"%Y-%m-%dT%H:%M:%SZ\" date and time of last modification of the file in the server side see https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14 */
  String serverChangedAt = null
  

}

