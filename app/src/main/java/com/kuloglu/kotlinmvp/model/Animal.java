package com.kuloglu.kotlinmvp.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class Animal{
  @SerializedName("response_code")
  @Expose
  private Integer response_code;
  @SerializedName("data")
  @Expose
  private List<Data> data;
  @SerializedName("count")
  @Expose
  private Integer count;
  @SerializedName("api_version")
  @Expose
  private String api_version;
  @SerializedName("error")
  @Expose
  private Object error;
  public void setResponse_code(Integer response_code){
   this.response_code=response_code;
  }
  public Integer getResponse_code(){
   return response_code;
  }
  public void setData(List<Data> data){
   this.data=data;
  }
  public List<Data> getData(){
   return data;
  }
  public void setCount(Integer count){
   this.count=count;
  }
  public Integer getCount(){
   return count;
  }
  public void setApi_version(String api_version){
   this.api_version=api_version;
  }
  public String getApi_version(){
   return api_version;
  }
  public void setError(Object error){
   this.error=error;
  }
  public Object getError(){
   return error;
  }
}