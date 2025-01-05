package com.sit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pinfo")
@PropertySource(value="info.properties")
public class PersonalInfo {

	//Injecting values from properties files
	@Value("${per.id}")
	private Integer pid;
	
	@Value("${per.name}")
	private String pname;
	
	@Value("${per.addrs}")
	private String addrs;
	
	
	//Direct values
	@Value("9898983423")
	private Long Phno;
	
	//System property values
	@Value("${os.name}")
	private String os_name;
	
	@Value("${os.version}")
	private String os_ver;
	
	//Environmental variables
	@Value("${Path}")
	private String path_data;
	
	
	@Override
	public String toString() {
		return "Personal Info [pid :: "+pid+",pname :: "+pname+",addrs :: "+addrs+",mobileNo :: "+Phno+
				",os_name :: "+os_name+",os_ver :: "+os_ver+",Path_data :: "+path_data+"]";
	}
	
}
