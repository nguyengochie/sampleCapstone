package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.NewDTO;

public interface INewService {

	NewDTO save(NewDTO newDTO);
	NewDTO update(NewDTO newDTO);
	void delete(long[] ids);
	
	
}
