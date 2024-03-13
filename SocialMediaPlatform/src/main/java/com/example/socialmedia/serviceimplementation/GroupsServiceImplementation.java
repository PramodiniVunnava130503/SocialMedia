package com.example.socialmedia.serviceimplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.example.socialmedia.bean.Groups;

public class GroupsServiceImplementation {
	private static List<Groups> group = new ArrayList<>();
	Groups groupObject = new Groups();
	
	//All Groups data
	public List<Groups> getGroupsData() {
		return group;
	}
	
	//Groups Data By ID
	public Groups getGroupByID(int groupId) {
		Predicate<? super Groups> predict = groupObject->groupObject.getGroupID()==groupId;
		Optional<Groups> option = group.stream().filter(predict).findFirst();
		
		if(option.isEmpty()) {
			return null;
		}else {
			return option.get();
		}
	}
	
	//To Add Groups Data
	public void addGroups(int groupId,Groups group) {
		List<Groups> grouplist = new ArrayList<Groups>();
		grouplist.add(group);
	}
}
