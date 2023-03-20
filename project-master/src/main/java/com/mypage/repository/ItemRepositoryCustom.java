package com.mypage.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mypage.dto.ItemSearchDto;
import com.mypage.dto.MainItemDto;
import com.mypage.entity.Item;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

}