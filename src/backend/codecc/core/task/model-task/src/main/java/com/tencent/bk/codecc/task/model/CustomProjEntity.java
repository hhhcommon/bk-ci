/*
 * Tencent is pleased to support the open source community by making BlueKing available.
 * Copyright (C) 2017-2018 THL A29 Limited, a Tencent company. All rights reserved.
 * Licensed under the MIT License (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * http://opensource.org/licenses/MIT
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tencent.bk.codecc.task.model;

import com.tencent.codecc.common.db.CommonEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Map;

/**
 * 个性化工蜂扫描实体类
 *
 * @date 2020/3/23
 * @version V1.0
 */
@Data
@Document(collection = "t_customized_project")
@CompoundIndexes({
        @CompoundIndex(name = "custom_proj_source_url_indx", def = "{'custom_proj_source': 1, 'url': 1}")
})
public class CustomProjEntity extends CommonEntity
{
    /**
     * 传入项目的url
     */
    @Field("url")
    private String url;

    @Field("branch")
    private String branch;

    /**
     * 代码仓库类型
     */
    @Field("repository_type")
    private String repositoryType;

    /**
     * 流水线id
     */
    @Field("pipeline_id")
    private String pipelineId;

    /**
     * 项目id
     */
    @Field("project_id")
    private String projectId;

    /**
     * 是否显示告警
     */
    @Field("defect_display")
    private Boolean defectDisplay;

    /**
     * 个性化项目来源
     */
    @Field("app_code")
    private String appCode;


    /**
     * 个性化项目来源
     */
    @Field("custom_proj_source")
    private String customProjSource;

    /**
     * 通用模型json字符串
     */
    @Field("common_model_json")
    private Boolean commonModelJson;

    /**
     * 任务id
     */
    @Field("task_id")
    private Long taskId;

    /**
     * 工蜂项目id
     */
    @Field("gongfeng_project_id")
    private Integer gongfengProjectId;

}
