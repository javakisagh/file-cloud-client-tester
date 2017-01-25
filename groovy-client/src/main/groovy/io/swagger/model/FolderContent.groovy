package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import io.swagger.model.FileMetadata;
import io.swagger.model.FolderMetadata;
import java.util.List;
@Canonical
class FolderContent {

  /* Metadata of folders included */
  List<FolderMetadata> folders = new ArrayList<FolderMetadata>()

  /* Metadata of files included */
  List<FileMetadata> files = new ArrayList<FileMetadata>()
  

}

