package com.team3.docuweb.auth;

import com.github.scribejava.core.builder.api.DefaultApi20;

public class NaverAPI20 extends DefaultApi20 implements NaverLoginUrls{
	// 싱글톤이여야 함
	public NaverAPI20() {
	}
	
	private static class InstanceHolder{
		private static final NaverAPI20 INSTANCE = new NaverAPI20();
	}
	public static NaverAPI20 instance() {
		return InstanceHolder.INSTANCE;
	}
	
	@Override
	public String getAccessTokenEndpoint() {
		return NAVER_ACCESS_TOKEN;
	}
	
	@Override
	protected String getAuthorizationBaseUrl() {
		return NAVER_AUTH;
	}

}
