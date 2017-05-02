
### 配置(configuration)

#### ER 图

![配置](configuration.png)

#### 表结构

##### 导航（c1_navigation）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(13)|开始时间
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(13)|创建时间
data_option|YES|String(511)|数据选项
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(13)|结束时间
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
icon_style|YES|String(255)|图标样式
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(13)|最后修改时间
name|YES|String(255)|名称
navigation_code|NO|String(255)|导航代码
navigation_id|NO|String(255)|导航标识
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
parent_code|YES|String(255)|父级代码
parent_tree_code|YES|String(1023)|父级树代码
parent_tree_name|YES|String(1023)|父级树名称
personal_code|YES|String(255)|个人代码
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
target|YES|String(255)|目标
type_code|YES|String(255)|类别代码(数据字典)
url|YES|String(255)|URL
version_|YES|Integer(10)|版本

##### 字典类别（c1_dictionary_type）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(13)|开始时间
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(13)|创建时间
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
dictionary_type_code|NO|String(255)|字典类别代码
dictionary_type_id|NO|String(255)|字典类别标识
end_date|YES|Date(13)|结束时间
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(13)|最后修改时间
name|YES|String(255)|名称
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
parent_code|YES|String(255)|父级代码
parent_tree_code|YES|String(1023)|父级树代码
parent_tree_name|YES|String(1023)|父级树名称
personal_code|YES|String(255)|个人代码
remark|YES|String(511)|备注
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
version_|YES|Integer(10)|版本

##### 字典（c1_dictionary）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(13)|开始时间
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(13)|创建时间
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
dictionary_code|NO|String(255)|字典代码
dictionary_id|NO|String(255)|字典标识
dictionary_type_code|YES|String(255)|字典类别代码
end_date|YES|Date(13)|结束时间
explain_|YES|String(511)|解释
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(13)|最后修改时间
name|YES|String(255)|名称
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
personal_code|YES|String(255)|个人代码
remark|YES|String(511)|备注
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
value_|YES|String(1023)|值
version_|YES|Integer(10)|版本

##### 字典项（c1_dictionary_item）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(13)|开始时间
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(13)|创建时间
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
dictionary_code|YES|String(255)|字典代码
dictionary_item_code|YES|String(255)|字典项代码
dictionary_item_id|NO|String(255)|字典项标识
dictionary_type_code|YES|String(255)|字典类别代码
end_date|YES|Date(13)|结束时间
explain_|YES|String(511)|解释
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(13)|最后修改时间
name|YES|String(255)|名称
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
personal_code|YES|String(255)|个人代码
remark|YES|String(511)|备注
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
value_|YES|String(1023)|值
version_|YES|Integer(10)|版本

##### 国际化信息（c1_i18n_info）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(13)|开始时间
content|YES|String(4095)|正文
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(13)|创建时间
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(13)|结束时间
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
i18n_info_code|NO|String(255)|国际化信息代码
i18n_info_id|NO|String(255)|国际化信息标识
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(13)|最后修改时间
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
personal_code|YES|String(255)|个人代码
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
type_code|YES|String(255)|类别代码(数据字典)
version_|YES|Integer(10)|版本

##### 错误信息（c1_error_info）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(13)|开始时间
content|YES|String(4095)|正文
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(13)|创建时间
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(13)|结束时间
error_info_code|NO|String(255)|错误信息代码
error_info_id|NO|String(255)|错误信息标识
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(13)|最后修改时间
object_code|YES|String(255)|对象代码
object_id|YES|String(255)|对象标识
object_type_code|YES|String(255)|对象类别代码(数据字典)
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
personal_code|YES|String(255)|个人代码
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
type_code|YES|String(255)|类别代码(数据字典)
version_|YES|Integer(10)|版本

##### 系统信息（c1_system_info）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(13)|开始时间
content|YES|String(4095)|正文
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(13)|创建时间
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(13)|结束时间
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(13)|最后修改时间
name|YES|String(255)|名称
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
personal_code|YES|String(255)|个人代码
remark|YES|String(511)|备注
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
system_info_id|NO|String(255)|系统信息标识
version_|YES|Integer(10)|版本

##### 站点（c1_site）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(13)|开始时间
content|YES|String(4095)|正文
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(13)|创建时间
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(13)|结束时间
explain_|YES|String(511)|解释
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(13)|最后修改时间
name|YES|String(255)|名称
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
personal_code|YES|String(255)|个人代码
site_code|YES|String(255)|站点代码
site_id|NO|String(255)|站点标识
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
version_|YES|Integer(10)|版本
