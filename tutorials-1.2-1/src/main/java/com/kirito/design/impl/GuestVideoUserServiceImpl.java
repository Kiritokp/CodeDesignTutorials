package com.kirito.design.impl;

import com.kirito.design.IVideoUserService;

/**
 * @description: Guest用户
 */
public class GuestVideoUserServiceImpl implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("Guest用户，视频1080P蓝光");
    }

    @Override
    public void advertisement() {
        System.out.println("Guest用户，视频无广告");
    }
}
