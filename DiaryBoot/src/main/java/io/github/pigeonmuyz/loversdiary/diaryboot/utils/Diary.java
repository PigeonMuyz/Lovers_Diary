package io.github.pigeonmuyz.loversdiary.diaryboot.utils;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

/**
 * @author 天晨
 * 日记类
 */
@Data
public class Diary {
    /**
     * 日记编号
     */
    @TableId("diary_id")
    Integer diary_id;
    /**
     * 日记日期
     */
    String diary_date;
    /**
     * 日记内容
     */
    String diary_comment;
    /**
     * 用户编号
     */
    String openid;

    /**
     * 追记内容
     */
    @TableField
    List<Addition> Diary_Addition;
}