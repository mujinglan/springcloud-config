package com.mujl.springcloud.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BuildTask {
    @JsonProperty("UID")
    private String UID;
    @JsonProperty("Name")
    private String Name;// 任务名称

    @JsonProperty("aliasname")
    private String aliasname;// 任务别名

    @JsonProperty("isbuild")
    private Integer isbuild;

    @JsonProperty("parentName")
    private String parentName;//父级任务名称

    @JsonProperty("Duration")
    private Integer Duration;// 工期

    @JsonProperty("Start")
    private String Start;// 开始时间

    @JsonProperty("Finish")
    private String Finish;// 完成时间

    @JsonProperty("PercentComplete")
    private Integer PercentComplete;// 进度

    @JsonProperty("ID")
    private Integer ID; // Number。序号

    @JsonProperty("Work")
    private Integer Work; // Number。工时
    @JsonProperty("Notes")
    private String Notes; // 任务备注

    @JsonProperty("startlc")
    private String startlc;// 开始里程

    @JsonProperty("stoplc")
    private String stoplc;// 结束里程

    @JsonProperty("middl")
    private String middl;// 中心里程

    @JsonProperty("startlxlc")
    private String startlxlc;// 开始连续里程

    @JsonProperty("stoplxlc")
    private String stoplxlc;// 结束连续里程

    @JsonProperty("middlxl")
    private String middlxl;// 中心连续里程

    @JsonProperty("startlcls")
    private String startlcls;// 开始里程

    @JsonProperty("stoplcls")
    private String stoplcls;// 结束里程

    @JsonProperty("middlls")
    private String middlls;// 中心里程
    @JsonProperty("diapatchStatus")
    private Integer  diapatchStatus; //调度状态   0或者空:非重点工程     10:代表部级重点工程，20：建设级，30：指挥级；40：标段级；
    @JsonProperty("buildType")
    private String buildType;//构筑物类型

    @JsonProperty("buildTypeName")
    private String buildTypeName;//构筑物类型名称

    @JsonProperty("tuiyan")
    private String tuiyan;// 推演日期

    @JsonProperty("Zhihou")
    private Integer Zhihou;// 滞后程度

    @JsonProperty("sectionId")
    private String sectionId;// 标段id

    @JsonProperty("childrenCount")
    private Long childrenCount;
}
