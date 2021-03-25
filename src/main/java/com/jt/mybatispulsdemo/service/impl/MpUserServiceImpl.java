package com.jt.mybatispulsdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jt.mybatispulsdemo.dao.MpUserMapper;
import com.jt.mybatispulsdemo.pojo.MpUserPojo;
import com.jt.mybatispulsdemo.service.MpUserService;
import org.springframework.stereotype.Service;

/**
 * 继承MyBatis-Plus提供的ServiceImpl，定好Mapper和DO
 * 实现自己的Service接口
 * <p>
 * 但不得不说，这种写法很恶心，语义上讲不通
 *
 * @author qiyu
 * @date 2020-09-13 16:39
 */
@Service
public class MpUserServiceImpl extends ServiceImpl<MpUserMapper, MpUserPojo> implements MpUserService {
}