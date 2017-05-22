
### 配置(configuration)

#### ER 图

![配置](configuration.png)

#### 表结构

##### 导航（c1_navigation）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_OPTION|YES|String(511)|数据选项
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
ICON_STYLE|YES|String(255)|图标样式
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
NAME|YES|String(255)|名称
NAVIGATION_CODE|NO|String(255)|导航代码
NAVIGATION_ID|NO|String(255)|导航标识
ORDER_BY_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
PARENT_CODE|YES|String(255)|父级代码
PARENT_TREE_CODE|YES|String(1023)|父级树代码
PARENT_TREE_NAME|YES|String(1023)|父级树名称
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
TARGET|YES|String(255)|目标
TYPE_CODE|YES|String(255)|类别代码(数据字典)
URL|YES|String(255)|URL
VERSION_|YES|Integer(10)|版本

##### 字典类别（c1_dictionary_type）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
DICTIONARY_TYPE_CODE|NO|String(255)|字典类别代码
DICTIONARY_TYPE_ID|NO|String(255)|字典类别标识
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
NAME|YES|String(255)|名称
ORDER_BY_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
PARENT_CODE|YES|String(255)|父级代码
PARENT_TREE_CODE|YES|String(1023)|父级树代码
PARENT_TREE_NAME|YES|String(1023)|父级树名称
REMARK|YES|String(511)|备注
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
VERSION_|YES|Integer(10)|版本

##### 字典（c1_dictionary）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
DICTIONARY_CODE|NO|String(255)|字典代码
DICTIONARY_ID|NO|String(255)|字典标识
DICTIONARY_TYPE_CODE|YES|String(255)|字典类别代码
END_DATE|YES|Date(19)|结束时间
EXPLAIN_|YES|String(511)|解释
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
NAME|YES|String(255)|名称
ORDER_BY_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
REMARK|YES|String(511)|备注
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
VALUE_|YES|String(1023)|值
VERSION_|YES|Integer(10)|版本

##### 字典项（c1_dictionary_item）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
DICTIONARY_CODE|YES|String(255)|字典代码
DICTIONARY_ITEM_CODE|YES|String(255)|字典项代码
DICTIONARY_ITEM_ID|NO|String(255)|字典项标识
DICTIONARY_TYPE_CODE|YES|String(255)|字典类别代码
END_DATE|YES|Date(19)|结束时间
EXPLAIN_|YES|String(511)|解释
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
NAME|YES|String(255)|名称
ORDER_BY_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
REMARK|YES|String(511)|备注
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
VALUE_|YES|String(1023)|值
VERSION_|YES|Integer(10)|版本

##### 国际化信息（c1_I18N_INFO）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CONTENT|YES|String(4095)|正文
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
I18N_INFO_CODE|NO|String(255)|国际化信息代码
I18N_INFO_ID|NO|String(255)|国际化信息标识
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
ORDER_BY_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
TYPE_CODE|YES|String(255)|类别代码(数据字典)
VERSION_|YES|Integer(10)|版本

##### 错误信息（c1_ERROR_INFO）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CONTENT|YES|String(4095)|正文
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
ERROR_INFO_CODE|NO|String(255)|错误信息代码
ERROR_INFO_ID|NO|String(255)|错误信息标识
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
OBJECT_CODE|YES|String(255)|对象代码
OBJECT_ID|YES|String(255)|对象标识
OBJECT_TYPE_CODE|YES|String(255)|对象类别代码(数据字典)
ORDER_BY_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
TYPE_CODE|YES|String(255)|类别代码(数据字典)
VERSION_|YES|Integer(10)|版本

##### 系统信息（c1_system_info）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CONTENT|YES|String(4095)|正文
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
NAME|YES|String(255)|名称
ORDER_BY_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
REMARK|YES|String(511)|备注
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
SYSTEM_INFO_ID|NO|String(255)|系统信息标识
VERSION_|YES|Integer(10)|版本

##### 站点（c1_site）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CONTENT|YES|String(4095)|正文
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
EXPLAIN_|YES|String(511)|解释
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
NAME|YES|String(255)|名称
ORDER_BY_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
SITE_CODE|YES|String(255)|站点代码
SITE_ID|NO|String(255)|站点标识
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
VERSION_|YES|Integer(10)|版本
