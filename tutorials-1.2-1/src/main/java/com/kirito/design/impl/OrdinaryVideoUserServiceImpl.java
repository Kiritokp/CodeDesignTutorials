package com.kirito.design.impl;

import com.kirito.design.IVideoUserService;

/**
 * @description: 普通用户
 */
public class OrdinaryVideoUserServiceImpl implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("普通用户，视频720P超清");
    }

    @Override
    public void advertisement() {
        System.out.println("普通用户，视频有广告");
    }
}
