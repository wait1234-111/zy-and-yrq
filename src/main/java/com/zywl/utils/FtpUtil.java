package com.zywl.utils;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * ftp上传下载工具类
 */
public class FtpUtil {

	/** 
	 * Description: 向FTP服务器上传文件 
	 * @param host FTP服务器hostname 
	 * @param port FTP服务器端口 
	 * @param username FTP登录账号 
	 * @param password FTP登录密码 
	 * @param basePath FTP服务器基础目录
	 * @param filePath FTP服务器文件存放路径。例如分日期存放：/2019/01/01。文件的路径为basePath+filePath
	 * @param filename 上传到FTP服务器上的文件名 
	 * @param input 输入流 
	 * @return 成功返回true，否则返回false 
	 */  
public static boolean uploadFile(String host, int port, String username, String password, String basePath,
			String filePath, String filename, InputStream input) {
		boolean result = false;
		FTPClient ftp = new FTPClient();
		try {
			int reply;
			ftp.connect(host, port);// 连接FTP服务器
			// 如果采用默认端口，可以使用ftp.connect(host)的方式直接连接FTP服务器
			ftp.login(username, password);// 登录
			reply = ftp.getReplyCode();
			if (!FTPReply.isPositiveCompletion(reply)) {
				ftp.disconnect();
				return result;
			}
			//切换到上传目录
			if (!ftp.changeWorkingDirectory(basePath+filePath)) {
				//如果目录不存在创建目录
				String[] dirs = filePath.split("/");
				String tempPath = basePath;
				for (String dir : dirs) {
					if (null == dir || "".equals(dir)) {
						continue;
					}
					tempPath += "/" + dir;
					if (!ftp.changeWorkingDirectory(tempPath)) {
						if (!ftp.makeDirectory(tempPath)) {
							return result;
						} else {
							ftp.changeWorkingDirectory(tempPath);
						}
					}
				}
			}
			//设置上传文件的类型为二进制类型
			ftp.setFileType(FTP.BINARY_FILE_TYPE);
			//上传文件
			if (!ftp.storeFile(filename, input)) {
				return result;
			}
			input.close();
			ftp.logout();
			result = true;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ftp.isConnected()) {
				try {
					ftp.disconnect();
				} catch (IOException ioe) {
				}
			}
		}
		return result;
	}
	
	/** 
	 * Description: 从FTP服务器下载文件 
	 * @param host FTP服务器hostname 
	 * @param port FTP服务器端口 
	 * @param username FTP登录账号 
	 * @param password FTP登录密码 
	 * @param remotePath FTP服务器上的相对路径 
	 * @param fileName 要下载的文件名 
	 * @param localPath 下载后保存到本地的路径 
	 * @return 
	 */  
	public static boolean downloadFile(String host, int port, String username, String password, String remotePath,
			String fileName, String localPath) {
		boolean result = false;
		FTPClient ftp = new FTPClient();
		try {
			int reply;
			ftp.connect(host, port);
			// 如果采用默认端口，可以使用ftp.connect(host)的方式直接连接FTP服务器
			ftp.login(username, password);// 登录
			reply = ftp.getReplyCode();
			if (!FTPReply.isPositiveCompletion(reply)) {
				ftp.disconnect();
				return result;
			}
			ftp.changeWorkingDirectory(remotePath);// 转移到FTP服务器目录
			FTPFile[] fs = ftp.listFiles();
			for (FTPFile ff : fs) {
				if (ff.getName().equals(fileName)) {
					File localFile = new File(localPath + "/" + ff.getName());

					OutputStream is = new FileOutputStream(localFile);
					ftp.retrieveFile(ff.getName(), is);
					is.close();
				}
			}

			ftp.logout();
			result = true;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ftp.isConnected()) {
				try {
					ftp.disconnect();
				} catch (IOException ioe) {
				}
			}
		}
		return result;
	}


	//String filepath = "http://39.96.26.57/jieagtFile/2019/11/14/1573742273542921.xlsx";
	//String fileName = "1573742273542921.xlsx";
	//boolean res = FtpUtil.downloadFile2(response, fileName, filepath);
	public static boolean downloadFile2(HttpServletResponse response, String filename, String filepath) {
		try {
			//设置响应头，控制浏览器下载该文件
			response.setHeader("content-Disposition", "attachment;filename=" + URLEncoder.encode(filename, "UTF-8"));
			//读取要下载的文件，保存到文件输入流
			URL url = new URL(filepath);
			URLConnection connection = url.openConnection();
			InputStream in = connection.getInputStream();
//			BufferedReader br = new BufferedReader(new InputStreamReader(in,"UTF-8"));
			//创建输出流
			OutputStream out = response.getOutputStream();
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));

			byte[] buf = new byte[1024];
			int len = 0;

			String str = null;
			StringBuffer sb = new StringBuffer();
			//循环将输入流中的内容读取到缓冲区当中
			while ((len = in.read(buf)) != -1) {
				//输出缓冲区的内容到浏览器，实现文件下载
//				bw.write(str);
//				bw.newLine();
				out.write(buf, 0, len);
			}

//			bw.close();
			out.close();
//			br.close();
			in.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}


	public static void main(String[] args) {
		try {
	        FileInputStream in=new FileInputStream(new File("E:/a.png"));  
	        boolean flag = uploadFile("192.168.17.129", 21, "ftpuser", "ftpuser", "/home/ftpuser/","/", "abc1.png", in);  
	        System.out.println(flag);  
	    } catch (FileNotFoundException e) {  
	        e.printStackTrace();  
	    }  
	}
}
