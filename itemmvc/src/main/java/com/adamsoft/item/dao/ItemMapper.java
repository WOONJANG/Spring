package com.adamsoft.item.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.adamsoft.item.domain.ItemDTO;

@Repository
public interface ItemMapper {
	@Select("select * from item")
	public List<ItemDTO> getAll();
	
	@Select("select * from item where itemid = #{itemid}")
	public ItemDTO getItem(Integer itemid);
}
