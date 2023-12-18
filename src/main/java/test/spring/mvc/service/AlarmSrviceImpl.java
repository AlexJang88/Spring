package test.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.spring.mvc.repository.MemberMapper;

@Service
public class AlarmSrviceImpl implements AlarmService{
	
	@Autowired
	private MemberMapper mapper;
	
	@Override
	public int alarmCount() {
		return mapper.alarmCount();
	}

}
