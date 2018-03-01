package com.taotao.service;

import com.taotao.easyui.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
    TbItem getItemById(Long id);
    EasyUIDataGridResult getItemList(int page, int rows);
}
