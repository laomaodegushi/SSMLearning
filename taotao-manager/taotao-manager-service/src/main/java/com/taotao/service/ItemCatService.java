package com.taotao.service;

import java.util.List;

import com.taotao.easyui.EasyUITreeNode;

public interface ItemCatService {
    List<EasyUITreeNode> getItemCatList(long parentId);
}
