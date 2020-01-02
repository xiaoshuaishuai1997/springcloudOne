package com.jk.service.cs;

import com.jk.entity.CollectModel;
import com.jk.entity.CommodityModel;
import com.jk.entity.ShopModel;

import java.util.List;

public interface CsService {
    CommodityModel findById(Integer id);

    ShopModel queryStore(Integer ctId);

    void addCollect(CollectModel col);

    List<CommodityModel> queryShouCang(Integer userId);

    CollectModel queryShouCangById(Integer coId);

    String deleteShouCang(Integer coId);
}
