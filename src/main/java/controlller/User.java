package controlller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class User {
	
	private List<Role> roles = Arrays.asList(Role.ADMIN, Role.EMPLOYEE);
	

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }
	
}
