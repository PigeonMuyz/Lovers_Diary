package io.github.pigeonmuyz.loversdiary.diaryboot.utils;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Addition {
    /**
     * 追记编号
     */
    @TableId("addition_id")
    Integer addition_id;
    /**
     * 追记日期
     */
    String addition_date;
    /**
     * 追记内容
     */
    String addition_comment;
    /**
     * 日记编号
     */
    Integer diary_id;
    /**
     * 用户编号
     */
    String openid;
}
