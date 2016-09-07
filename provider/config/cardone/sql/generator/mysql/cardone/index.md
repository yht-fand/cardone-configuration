
### 配置(configuration)

#### ER 图

![配置](configuration.png)

#### 表结构

##### 字典类别（c1_dictionary_type）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码
DEPARTMENT_CODE|YES|String(255)|部门代码
DICTIONARY_TYPE_CODE|NO|String(255)|字典类别代码
DICTIONARY_TYPE_ID|NO|String(255)|字典类别标识
END_DATE|YES|Date(19)|结束时间
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
NAME|YES|String(255)|名称
ORDER_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
PARENT_CODE|YES|String(255)|父级代码
PARENT_TREE_CODE|YES|String(1023)|父级树代码
PARENT_TREE_NAME|YES|String(1023)|父级树代名称
PERMISSION_CODES|YES|String(1023)|许可代码集合
REMARK|YES|String(511)|说明
ROLE_CODES|YES|String(1023)|角色代码集合
SITE_CODE|YES|String(255)|站点编号
STATE_CODE|YES|String(255)|状态代码
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
VERSION_|YES|Long(10)|版本
WF_ID|YES|String(255)|工作流标识

##### 字典（c1_dictionary）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码
DEPARTMENT_CODE|YES|String(255)|部门代码
DICTIONARY_CODE|NO|String(255)|字典代码
DICTIONARY_ID|NO|String(255)|字典标识
DICTIONARY_TYPE_CODE|NO|String(255)|字典类别代码
END_DATE|YES|Date(19)|结束时间
EXPLAIN_|YES|String(511)|解释
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
NAME|YES|String(255)|名称
ORDER_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
PERMISSION_CODES|YES|String(1023)|许可代码集合
REMARK|YES|String(511)|说明
ROLE_CODES|YES|String(1023)|角色代码集合
SITE_CODE|YES|String(255)|站点编号
STATE_CODE|YES|String(255)|状态代码
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
VALUE_|YES|String(1023)|值
VERSION_|YES|Long(10)|版本
WF_ID|YES|String(255)|工作流标识

##### 国际化信息（c1_I18N_INFO）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CONTENT|YES|String(4095)|正文
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
I18N_INFO_CODE|NO|String(255)|国际化信息代码
I18N_INFO_ID|NO|String(255)|国际化信息标识
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
ORG_CODE|YES|String(255)|组织代码
PERMISSION_CODES|YES|String(1023)|许可代码集合
ROLE_CODES|YES|String(1023)|角色代码集合
SITE_CODE|YES|String(255)|站点编号
STATE_CODE|YES|String(255)|状态代码
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
TYPE_CODE|NO|String(255)|类别代码
VERSION_|YES|Long(10)|版本
WF_ID|YES|String(255)|工作流标识

##### 错误信息（c1_ERROR_INFO）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CONTENT|YES|String(4095)|正文
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
ERROR_INFO_CODE|NO|String(255)|错误信息代码
ERROR_INFO_ID|NO|String(255)|错误信息标识
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
ORG_CODE|YES|String(255)|组织代码
PERMISSION_CODES|YES|String(1023)|许可代码集合
ROLE_CODES|YES|String(1023)|角色代码集合
SITE_CODE|YES|String(255)|站点编号
STATE_CODE|YES|String(255)|状态代码
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
TYPE_CODE|NO|String(255)|类别代码
VERSION_|YES|Long(10)|版本
WF_ID|YES|String(255)|工作流标识

##### 系统信息（c1_system_info）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CONTENT|YES|String(4095)|正文
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
NAME|YES|String(255)|名称
ORG_CODE|YES|String(255)|组织代码
PERMISSION_CODES|YES|String(1023)|许可代码集合
REMARK|YES|String(511)|说明
ROLE_CODES|YES|String(1023)|角色代码集合
STATE_CODE|YES|String(255)|状态代码
SYSTEM_INFO_CODE|NO|String(255)|系统信息代码
SYSTEM_INFO_ID|NO|String(255)|系统信息标识
VERSION_|YES|Long(10)|版本
WF_ID|YES|String(255)|工作流标识

##### 站点（c1_site）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CONTENT|YES|String(4095)|正文
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
EXPLAIN_|YES|String(511)|解释
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
NAME|YES|String(255)|名称
ORG_CODE|YES|String(255)|组织代码
PERMISSION_CODES|YES|String(1023)|许可代码集合
ROLE_CODES|YES|String(1023)|角色代码集合
SITE_CODE|YES|String(255)|站点编号
SITE_ID|NO|String(255)|站点标识
STATE_CODE|YES|String(255)|状态代码
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
VERSION_|YES|Long(10)|版本
WF_ID|YES|String(255)|工作流标识
