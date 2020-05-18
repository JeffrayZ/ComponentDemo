package com.example.baselib.app_1;

/**
 * @ProjectName: ComponentDemo
 * @Package: com.example.baselib.app_1
 * @ClassName: BaseAppInit
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/4/25 18:42
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/4/25 18:42
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface BaseAppInit {
    // 优先初始化
    boolean onInitSpeed();
    // 延时初始化
    boolean onInitLow();
}
