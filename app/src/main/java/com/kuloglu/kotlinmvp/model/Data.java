package com.kuloglu.kotlinmvp.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Data{
  @SerializedName("format")
  @Expose
  private String format;
  @SerializedName("verified")
  @Expose
  private Integer verified;
  @SerializedName("checked")
  @Expose
  private Integer checked;
  @SerializedName("id")
  @Expose
  private String id;
  @SerializedName("time")
  @Expose
  private String time;
  @SerializedName("url")
  @Expose
  private String url;
  public void setFormat(String format){
   this.format=format;
  }
  public String getFormat(){
   return format;
  }
  public void setVerified(Integer verified){
   this.verified=verified;
  }
  public Integer getVerified(){
   return verified;
  }
  public void setChecked(Integer checked){
   this.checked=checked;
  }
  public Integer getChecked(){
   return checked;
  }
  public void setId(String id){
   this.id=id;
  }
  public String getId(){
   return id;
  }
  public void setTime(String time){
   this.time=time;
  }
  public String getTime(){
   return time;
  }
  public void setUrl(String url){
   this.url=url;
  }
  public String getUrl(){
   return url;
  }
}