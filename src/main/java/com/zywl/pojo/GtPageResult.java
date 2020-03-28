package com.zywl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Class GtPageResult
 * @Description TODO
 * @Author Mr.Wang
 * @Date 2019/11/2 13:36
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GtPageResult {
    private int code;
    private String msg;
    private int count;
    private List data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
    
}
