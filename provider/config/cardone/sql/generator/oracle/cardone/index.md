
### 配置(configuration)

#### ER 图

![配置](configuration.png)

#### 表结构

##### 导航（C1_NAVIGATION）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_OPTION|YES|String(512)|数据选项
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
ICON_STYLE|YES|String(64)|图标样式
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
NAME|YES|String(128)|名称
NAVIGATION_CODE|NO|String(256)|导航编号
NAVIGATION_ID|NO|String(255)|导航标识
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PARENT_CODE|YES|String(64)|父级编号
PARENT_ID|YES|String(64)|父级标识
PARENT_TREE_CODE|YES|String(1024)|父级树编号
PARENT_TREE_ID|YES|String(1024)|父级树标识
PARENT_TREE_NAME|YES|String(1024)|父级树名称
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
TARGET|YES|String(64)|目标
TYPE_CODE|YES|String(64)|类别编号(数据字典)
URL|YES|String(256)|url
VERSION_|YES|Integer(38)|版本

##### 字典类别（C1_DICTIONARY_TYPE）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
DICTIONARY_TYPE_CODE|NO|String(64)|字典类别编号
DICTIONARY_TYPE_ID|NO|String(255)|字典类别标识
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
NAME|YES|String(128)|名称
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PARENT_CODE|YES|String(64)|父级编号
PARENT_ID|YES|String(64)|父级标识
PARENT_TREE_CODE|YES|String(1024)|父级树编号
PARENT_TREE_ID|YES|String(1024)|父级树标识
PARENT_TREE_NAME|YES|String(1024)|父级树名称
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
REMARK|YES|String(512)|备注
SITE_CODE|YES|String(64)|站点编号
SITE_ID|YES|String(64)|站点标识
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
VERSION_|YES|Integer(38)|版本

##### 字典（C1_DICTIONARY）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
DICTIONARY_CODE|NO|String(64)|字典编号
DICTIONARY_ID|NO|String(255)|字典标识
DICTIONARY_TYPE_CODE|YES|String(64)|字典类别编号
DICTIONARY_TYPE_ID|YES|String(255)|字典类别标识
END_DATE|YES|Date(11)|结束日期
EXPLAIN_|YES|String(512)|解释
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
NAME|YES|String(128)|名称
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
REMARK|YES|String(512)|备注
SITE_CODE|YES|String(64)|站点编号
SITE_ID|YES|String(64)|站点标识
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
VALUE_|YES|String(1024)|值
VERSION_|YES|Integer(38)|版本

##### 字典项（C1_DICTIONARY_ITEM）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
DICTIONARY_CODE|YES|String(64)|字典编号
DICTIONARY_ID|YES|String(255)|字典标识
DICTIONARY_ITEM_CODE|YES|String(255)|字典项代码
DICTIONARY_ITEM_ID|NO|String(255)|字典项标识
DICTIONARY_TYPE_CODE|YES|String(64)|字典类别编号
DICTIONARY_TYPE_ID|YES|String(255)|字典类别标识
END_DATE|YES|Date(11)|结束日期
EXPLAIN_|YES|String(512)|解释
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
NAME|YES|String(128)|名称
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
REMARK|YES|String(512)|备注
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
VALUE_|YES|String(1024)|值
VERSION_|YES|Integer(38)|版本

##### 国际化信息（C1_I18N_INFO）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CONTENT|YES|String(4000)|正文
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
I18N_INFO_CODE|NO|String(64)|国际化信息编号
I18N_INFO_ID|NO|String(255)|国际化信息标识
JSON_DATA|YES|Object(4000)|json数据
LANGUAGE|YES|String(64)|语言
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
SITE_CODE|YES|String(64)|站点编号
SITE_ID|YES|String(64)|站点标识
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
TYPE_CODE|YES|String(64)|类别编号(数据字典)
VERSION_|YES|Integer(38)|版本

##### 系统信息（C1_SYSTEM_INFO）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CONTENT|YES|String(4000)|正文
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
NAME|YES|String(128)|名称
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
REMARK|YES|String(512)|备注
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
SYSTEM_INFO_ID|NO|String(64)|系统信息标识
VERSION_|YES|Integer(38)|版本

##### 站点（C1_SITE）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CONTENT|YES|String(4000)|正文
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
EXPLAIN_|YES|String(512)|解释
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
FTP_IP|YES|String(64)|ftp ip
FTP_PASSWORD|YES|String(64)|ftp 密码
FTP_PORT|YES|String(64)|ftp端口
FTP_USERNAME|YES|String(64)|ftp 用户名
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
LATITUDE|YES|String(64)|纬度
LONGITUDE|YES|String(64)|经度
NAME|YES|String(128)|名称
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PARENT_CODE|YES|String(64)|父级编号
PARENT_ID|YES|String(64)|父级标识
PARENT_TREE_CODE|YES|String(1024)|父级树编号
PARENT_TREE_ID|YES|String(1024)|父级树标识
PARENT_TREE_NAME|YES|String(1024)|父级树名称
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
POSTAL_CODE|YES|String(64)|行政编码
REMARK|YES|String(512)|备注
SITE_CODE|YES|String(64)|站点编号
SITE_ID|NO|String(64)|站点标识
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
SYSTEM_INFO_ID|YES|String(64)|系统信息标识
URL|YES|String(256)|url
VERSION_|YES|Integer(38)|版本

##### 变量（C1_VARIABLE）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
VALUE_|YES|String(1024)|值
VARIABLE_CODE|YES|String(64)|变量编号
VARIABLE_ID|NO|String(64)|变量标识
VERSION_|YES|Integer(38)|版本
