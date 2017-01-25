package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.FolderMetadata
import io.swagger.model.User

import java.util.*;

@Mixin(ApiUtils)
class UsersApi {
    String basePath = "http://localhost:4567"
    String versionPath = "/api/v1"

    def usersAccessGet ( String authorization, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/access"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
    def usersCreateUserPost ( User user, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/create_user"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (user == null) {
            throw new RuntimeException("missing required params user")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    FolderMetadata.class )
                    
    }
}
