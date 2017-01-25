package org.tester.app;

import io.swagger.api.DirectoriesApi

public class App {
	
	static BaseUrl https(String p) {
		return new BaseUrl("https://"+p)
	}
	
	static BaseUrl http(String p) {
		return new BaseUrl("http://"+p)
	}
	
	static void main(String[] args) {
		def stdErrorClosure = {status,reson -> System.err.print "($status): $reson"}
		def sessionId = "TESTSESSION"
		def httpPath = "http://localhost:4567"
		def http_s_Path = "https://localhost:4567"
		def ip = "192.168.1.18"
		
		DirectoriesApi dir = new DirectoriesApi()
		dir.basePath = http ip port 4567
		dir.versionPath = ""
		dir.filesPathListFolderContentGet("/", false, sessionId,{ print it},stdErrorClosure)
		dir.filesPathCreateDirectoryPut("/", sessionId, { print it}, stdErrorClosure)
		dir.filesPathCreateDirectoryPut("/home", sessionId, { print it}, stdErrorClosure)
		dir.filesPathCreateDirectoryPut("/another", sessionId, { print it}, stdErrorClosure)
		dir.filesPathCreateDirectoryPut("/another/subdir", sessionId, { print it}, stdErrorClosure)
		dir.filesPathListFolderContentGet("/", false, sessionId,{ print it},stdErrorClosure)
		dir.filesPathListFolderContentGet("/another", false, sessionId,{ print it},stdErrorClosure)
		dir.filesPathListFolderContentGet("/", true, sessionId,{ print it},stdErrorClosure)
	}
}


class BaseUrl {
	String baseUrl;
	
	BaseUrl(String path) {
		baseUrl = path
	}
	
	String port(int p) {
		return baseUrl+":"+p;
	}
}