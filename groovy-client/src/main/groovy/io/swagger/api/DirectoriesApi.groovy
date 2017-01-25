package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.FileMetadata
import io.swagger.model.FolderContent
import io.swagger.model.FolderMetadata

import java.util.*;

@Mixin(ApiUtils)
class DirectoriesApi {
    String basePath = "http://localhost:4567"
    String versionPath = "/api/v1"

    def filesPathCreateDirectoryPut ( String path, String JSESSIONID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/files/{path}/create_directory"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }

        
        headerParams.put("JSESSIONID", JSESSIONID)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    FolderMetadata.class )
                    
    }
    def filesPathDeleteDelete ( String path, String JSESSIONID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/files/{path}/delete"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }

        
        headerParams.put("JSESSIONID", JSESSIONID)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def filesPathGetMetaDataGet ( String path, String JSESSIONID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/files/{path}/get_meta_data"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }

        
        headerParams.put("JSESSIONID", JSESSIONID)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    FileMetadata.class )
                    
    }
    def filesPathListFolderContentGet ( String path, Boolean recursive, String JSESSIONID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/files/{path}/list_folder_content"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }
        // verify required params are set
        if (recursive == null) {
            throw new RuntimeException("missing required params recursive")
        }

        if (!"null".equals(String.valueOf(recursive)))
            queryParams.put("recursive", String.valueOf(recursive))

        headerParams.put("JSESSIONID", JSESSIONID)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    FolderContent.class )
                    
    }
    def filesPathMovePut ( String path, String newPath, String JSESSIONID, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/files/{path}/move"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }
        // verify required params are set
        if (newPath == null) {
            throw new RuntimeException("missing required params newPath")
        }

        if (!"null".equals(String.valueOf(newPath)))
            queryParams.put("newPath", String.valueOf(newPath))

        headerParams.put("JSESSIONID", JSESSIONID)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    FileMetadata.class )
                    
    }
}
