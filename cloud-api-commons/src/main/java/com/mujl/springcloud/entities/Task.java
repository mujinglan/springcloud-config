package com.mujl.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task implements Serializable {
    private String UID;// 任务uid

    private String Name;// 任务名称

    private String aliasname;// 任务别名

    private Integer isbuild;

    private String parentName;//父级任务名称

    private Integer Duration;// 工期

    private String Start;// 开始时间

    private String Finish;// 完成时间

    private Integer PercentComplete;// 进度

    private Integer ID; // Number。序号

    private Integer Work; // Number。工时

    private String Notes; // 任务备注

    private String startlc;// 开始里程

    private String stoplc;// 结束里程

    private String middl;// 中心里程

    private String startlxlc;// 开始连续里程

    private String stoplxlc;// 结束连续里程

    private String middlxl;// 中心连续里程

    private String startlcls;// 开始里程

    private String stoplcls;// 结束里程

    private String middlls;// 中心里程

    private Integer  diapatchStatus; //调度状态   0或者空:非重点工程     10:代表部级重点工程，20：建设级，30：指挥级；40：标段级；

    private String buildType;//构筑物类型

    private String buildTypeName;//构筑物类型名称

    private String tuiyan;// 推演日期

    private Integer Zhihou;// 滞后程度

    private String sectionId;// 标段id

    private Long childrenCount;
}
