package com.perenc.xh.lsp.entity.miniapp;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * {"session_key":"nzoqhc3OnwHzeTxJs+inbQ==","expires_in":2592000,"openid":"oVBkZ0aYgDMDIywRdgPW8-joxXc4"}
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WxMaJscode2SessionResult implements Serializable {
  private static final long serialVersionUID = -1060216618475607933L;

  @SerializedName("session_key")
  private String sessionKey;

  @SerializedName("expires_in")
  private Integer expiresin;

  @SerializedName("openid")
  private String openid;

  @SerializedName("unionid")
  private String unionid;



  public static WxMaJscode2SessionResult fromJson(String json) {
    Gson gson = new Gson();
    return gson.fromJson(json, WxMaJscode2SessionResult.class);
  }

  public String getSessionKey() {
    return sessionKey;
  }

  public void setSessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
  }

  public Integer getExpiresin() {
    return expiresin;
  }

  public void setExpiresin(Integer expiresin) {
    this.expiresin = expiresin;
  }

  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public String getUnionid() {
    return unionid;
  }

  public void setUnionid(String unionid) {
    this.unionid = unionid;
  }

}
