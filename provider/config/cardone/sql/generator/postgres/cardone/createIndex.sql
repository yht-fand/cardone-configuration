
-- 配置(configuration)


-- 导航（c1_navigation）

--批次编号
drop index IF EXISTS idx_c1_navigation_batch_no;
create index IF NOT EXISTS idx_c1_navigation_batch_no ON c1_navigation ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_navigation_begin_date;
create index IF NOT EXISTS idx_c1_navigation_begin_date ON c1_navigation ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_navigation_created_by_code;
create index IF NOT EXISTS idx_c1_navigation_created_by_code ON c1_navigation ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_navigation_created_by_id;
create index IF NOT EXISTS idx_c1_navigation_created_by_id ON c1_navigation ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_navigation_created_date;
create index IF NOT EXISTS idx_c1_navigation_created_date ON c1_navigation ("created_date");
--数据选项
drop index IF EXISTS idx_c1_navigation_data_option;
create index IF NOT EXISTS idx_c1_navigation_data_option ON c1_navigation ("data_option" varchar_pattern_ops);
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_navigation_data_state_code;
create index IF NOT EXISTS idx_c1_navigation_data_state_code ON c1_navigation ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_navigation_department_code;
create index IF NOT EXISTS idx_c1_navigation_department_code ON c1_navigation ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_navigation_end_date;
create index IF NOT EXISTS idx_c1_navigation_end_date ON c1_navigation ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_navigation_flag_code;
create index IF NOT EXISTS idx_c1_navigation_flag_code ON c1_navigation ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_navigation_last_modified_by_code;
create index IF NOT EXISTS idx_c1_navigation_last_modified_by_code ON c1_navigation ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_navigation_last_modified_by_id;
create index IF NOT EXISTS idx_c1_navigation_last_modified_by_id ON c1_navigation ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_navigation_last_modified_date;
create index IF NOT EXISTS idx_c1_navigation_last_modified_date ON c1_navigation ("last_modified_date");
--名称
drop index IF EXISTS idx_c1_navigation_name;
create index IF NOT EXISTS idx_c1_navigation_name ON c1_navigation ("name" varchar_pattern_ops);
--导航编号
drop index IF EXISTS idx_c1_navigation_navigation_code;
create index IF NOT EXISTS idx_c1_navigation_navigation_code ON c1_navigation ("navigation_code" varchar_pattern_ops);
--导航标识
drop index IF EXISTS idx_c1_navigation_navigation_id;
create index IF NOT EXISTS idx_c1_navigation_navigation_id ON c1_navigation ("navigation_id" varchar_pattern_ops);
--排序
drop index IF EXISTS idx_c1_navigation_order_by_;
create index IF NOT EXISTS idx_c1_navigation_order_by_ ON c1_navigation ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_navigation_org_code;
create index IF NOT EXISTS idx_c1_navigation_org_code ON c1_navigation ("org_code" varchar_pattern_ops);
--父级编号
drop index IF EXISTS idx_c1_navigation_parent_code;
create index IF NOT EXISTS idx_c1_navigation_parent_code ON c1_navigation ("parent_code" varchar_pattern_ops);
--父级树编号
drop index IF EXISTS idx_c1_navigation_parent_tree_code;
create index IF NOT EXISTS idx_c1_navigation_parent_tree_code ON c1_navigation ("parent_tree_code" varchar_pattern_ops);
--父级树标识
drop index IF EXISTS idx_c1_navigation_parent_tree_id;
create index IF NOT EXISTS idx_c1_navigation_parent_tree_id ON c1_navigation ("parent_tree_id" varchar_pattern_ops);
--父级树名称
drop index IF EXISTS idx_c1_navigation_parent_tree_name;
create index IF NOT EXISTS idx_c1_navigation_parent_tree_name ON c1_navigation ("parent_tree_name" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_navigation_personal_code;
create index IF NOT EXISTS idx_c1_navigation_personal_code ON c1_navigation ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_navigation_personal_id;
create index IF NOT EXISTS idx_c1_navigation_personal_id ON c1_navigation ("personal_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_navigation_site_code;
create index IF NOT EXISTS idx_c1_navigation_site_code ON c1_navigation ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_navigation_state_code;
create index IF NOT EXISTS idx_c1_navigation_state_code ON c1_navigation ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_navigation_system_info_code;
create index IF NOT EXISTS idx_c1_navigation_system_info_code ON c1_navigation ("system_info_code" varchar_pattern_ops);
--类别编号(数据字典)
drop index IF EXISTS idx_c1_navigation_type_code;
create index IF NOT EXISTS idx_c1_navigation_type_code ON c1_navigation ("type_code" varchar_pattern_ops);

-- 字典类别（c1_dictionary_type）

--批次编号
drop index IF EXISTS idx_c1_dictionary_type_batch_no;
create index IF NOT EXISTS idx_c1_dictionary_type_batch_no ON c1_dictionary_type ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_dictionary_type_begin_date;
create index IF NOT EXISTS idx_c1_dictionary_type_begin_date ON c1_dictionary_type ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_dictionary_type_created_by_code;
create index IF NOT EXISTS idx_c1_dictionary_type_created_by_code ON c1_dictionary_type ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_dictionary_type_created_by_id;
create index IF NOT EXISTS idx_c1_dictionary_type_created_by_id ON c1_dictionary_type ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_dictionary_type_created_date;
create index IF NOT EXISTS idx_c1_dictionary_type_created_date ON c1_dictionary_type ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_dictionary_type_data_state_code;
create index IF NOT EXISTS idx_c1_dictionary_type_data_state_code ON c1_dictionary_type ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_dictionary_type_department_code;
create index IF NOT EXISTS idx_c1_dictionary_type_department_code ON c1_dictionary_type ("department_code" varchar_pattern_ops);
--字典类别编号
drop index IF EXISTS idx_c1_dictionary_type_dictionary_type_code;
create index IF NOT EXISTS idx_c1_dictionary_type_dictionary_type_code ON c1_dictionary_type ("dictionary_type_code" varchar_pattern_ops);
--字典类别标识
drop index IF EXISTS idx_c1_dictionary_type_dictionary_type_id;
create index IF NOT EXISTS idx_c1_dictionary_type_dictionary_type_id ON c1_dictionary_type ("dictionary_type_id" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_dictionary_type_end_date;
create index IF NOT EXISTS idx_c1_dictionary_type_end_date ON c1_dictionary_type ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_dictionary_type_flag_code;
create index IF NOT EXISTS idx_c1_dictionary_type_flag_code ON c1_dictionary_type ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_dictionary_type_last_modified_by_code;
create index IF NOT EXISTS idx_c1_dictionary_type_last_modified_by_code ON c1_dictionary_type ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_dictionary_type_last_modified_by_id;
create index IF NOT EXISTS idx_c1_dictionary_type_last_modified_by_id ON c1_dictionary_type ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_dictionary_type_last_modified_date;
create index IF NOT EXISTS idx_c1_dictionary_type_last_modified_date ON c1_dictionary_type ("last_modified_date");
--名称
drop index IF EXISTS idx_c1_dictionary_type_name;
create index IF NOT EXISTS idx_c1_dictionary_type_name ON c1_dictionary_type ("name" varchar_pattern_ops);
--排序
drop index IF EXISTS idx_c1_dictionary_type_order_by_;
create index IF NOT EXISTS idx_c1_dictionary_type_order_by_ ON c1_dictionary_type ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_dictionary_type_org_code;
create index IF NOT EXISTS idx_c1_dictionary_type_org_code ON c1_dictionary_type ("org_code" varchar_pattern_ops);
--父级编号
drop index IF EXISTS idx_c1_dictionary_type_parent_code;
create index IF NOT EXISTS idx_c1_dictionary_type_parent_code ON c1_dictionary_type ("parent_code" varchar_pattern_ops);
--父级树编号
drop index IF EXISTS idx_c1_dictionary_type_parent_tree_code;
create index IF NOT EXISTS idx_c1_dictionary_type_parent_tree_code ON c1_dictionary_type ("parent_tree_code" varchar_pattern_ops);
--父级树标识
drop index IF EXISTS idx_c1_dictionary_type_parent_tree_id;
create index IF NOT EXISTS idx_c1_dictionary_type_parent_tree_id ON c1_dictionary_type ("parent_tree_id" varchar_pattern_ops);
--父级树名称
drop index IF EXISTS idx_c1_dictionary_type_parent_tree_name;
create index IF NOT EXISTS idx_c1_dictionary_type_parent_tree_name ON c1_dictionary_type ("parent_tree_name" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_dictionary_type_personal_code;
create index IF NOT EXISTS idx_c1_dictionary_type_personal_code ON c1_dictionary_type ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_dictionary_type_personal_id;
create index IF NOT EXISTS idx_c1_dictionary_type_personal_id ON c1_dictionary_type ("personal_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_dictionary_type_site_code;
create index IF NOT EXISTS idx_c1_dictionary_type_site_code ON c1_dictionary_type ("site_code" varchar_pattern_ops);
--站点标识
drop index IF EXISTS idx_c1_dictionary_type_site_id;
create index IF NOT EXISTS idx_c1_dictionary_type_site_id ON c1_dictionary_type ("site_id" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_dictionary_type_state_code;
create index IF NOT EXISTS idx_c1_dictionary_type_state_code ON c1_dictionary_type ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_dictionary_type_system_info_code;
create index IF NOT EXISTS idx_c1_dictionary_type_system_info_code ON c1_dictionary_type ("system_info_code" varchar_pattern_ops);

-- 字典（c1_dictionary）

--批次编号
drop index IF EXISTS idx_c1_dictionary_batch_no;
create index IF NOT EXISTS idx_c1_dictionary_batch_no ON c1_dictionary ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_dictionary_begin_date;
create index IF NOT EXISTS idx_c1_dictionary_begin_date ON c1_dictionary ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_dictionary_created_by_code;
create index IF NOT EXISTS idx_c1_dictionary_created_by_code ON c1_dictionary ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_dictionary_created_by_id;
create index IF NOT EXISTS idx_c1_dictionary_created_by_id ON c1_dictionary ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_dictionary_created_date;
create index IF NOT EXISTS idx_c1_dictionary_created_date ON c1_dictionary ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_dictionary_data_state_code;
create index IF NOT EXISTS idx_c1_dictionary_data_state_code ON c1_dictionary ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_dictionary_department_code;
create index IF NOT EXISTS idx_c1_dictionary_department_code ON c1_dictionary ("department_code" varchar_pattern_ops);
--字典编号
drop index IF EXISTS idx_c1_dictionary_dictionary_code;
create index IF NOT EXISTS idx_c1_dictionary_dictionary_code ON c1_dictionary ("dictionary_code" varchar_pattern_ops);
--字典标识
drop index IF EXISTS idx_c1_dictionary_dictionary_id;
create index IF NOT EXISTS idx_c1_dictionary_dictionary_id ON c1_dictionary ("dictionary_id" varchar_pattern_ops);
--字典类别编号
drop index IF EXISTS idx_c1_dictionary_dictionary_type_code;
create index IF NOT EXISTS idx_c1_dictionary_dictionary_type_code ON c1_dictionary ("dictionary_type_code" varchar_pattern_ops);
--字典类别标识
drop index IF EXISTS idx_c1_dictionary_dictionary_type_id;
create index IF NOT EXISTS idx_c1_dictionary_dictionary_type_id ON c1_dictionary ("dictionary_type_id" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_dictionary_end_date;
create index IF NOT EXISTS idx_c1_dictionary_end_date ON c1_dictionary ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_dictionary_flag_code;
create index IF NOT EXISTS idx_c1_dictionary_flag_code ON c1_dictionary ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_dictionary_last_modified_by_code;
create index IF NOT EXISTS idx_c1_dictionary_last_modified_by_code ON c1_dictionary ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_dictionary_last_modified_by_id;
create index IF NOT EXISTS idx_c1_dictionary_last_modified_by_id ON c1_dictionary ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_dictionary_last_modified_date;
create index IF NOT EXISTS idx_c1_dictionary_last_modified_date ON c1_dictionary ("last_modified_date");
--名称
drop index IF EXISTS idx_c1_dictionary_name;
create index IF NOT EXISTS idx_c1_dictionary_name ON c1_dictionary ("name" varchar_pattern_ops);
--排序
drop index IF EXISTS idx_c1_dictionary_order_by_;
create index IF NOT EXISTS idx_c1_dictionary_order_by_ ON c1_dictionary ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_dictionary_org_code;
create index IF NOT EXISTS idx_c1_dictionary_org_code ON c1_dictionary ("org_code" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_dictionary_personal_code;
create index IF NOT EXISTS idx_c1_dictionary_personal_code ON c1_dictionary ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_dictionary_personal_id;
create index IF NOT EXISTS idx_c1_dictionary_personal_id ON c1_dictionary ("personal_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_dictionary_site_code;
create index IF NOT EXISTS idx_c1_dictionary_site_code ON c1_dictionary ("site_code" varchar_pattern_ops);
--站点标识
drop index IF EXISTS idx_c1_dictionary_site_id;
create index IF NOT EXISTS idx_c1_dictionary_site_id ON c1_dictionary ("site_id" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_dictionary_state_code;
create index IF NOT EXISTS idx_c1_dictionary_state_code ON c1_dictionary ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_dictionary_system_info_code;
create index IF NOT EXISTS idx_c1_dictionary_system_info_code ON c1_dictionary ("system_info_code" varchar_pattern_ops);

-- 字典项（c1_dictionary_item）

--批次编号
drop index IF EXISTS idx_c1_dictionary_item_batch_no;
create index IF NOT EXISTS idx_c1_dictionary_item_batch_no ON c1_dictionary_item ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_dictionary_item_begin_date;
create index IF NOT EXISTS idx_c1_dictionary_item_begin_date ON c1_dictionary_item ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_dictionary_item_created_by_code;
create index IF NOT EXISTS idx_c1_dictionary_item_created_by_code ON c1_dictionary_item ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_dictionary_item_created_by_id;
create index IF NOT EXISTS idx_c1_dictionary_item_created_by_id ON c1_dictionary_item ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_dictionary_item_created_date;
create index IF NOT EXISTS idx_c1_dictionary_item_created_date ON c1_dictionary_item ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_dictionary_item_data_state_code;
create index IF NOT EXISTS idx_c1_dictionary_item_data_state_code ON c1_dictionary_item ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_dictionary_item_department_code;
create index IF NOT EXISTS idx_c1_dictionary_item_department_code ON c1_dictionary_item ("department_code" varchar_pattern_ops);
--字典编号
drop index IF EXISTS idx_c1_dictionary_item_dictionary_code;
create index IF NOT EXISTS idx_c1_dictionary_item_dictionary_code ON c1_dictionary_item ("dictionary_code" varchar_pattern_ops);
--字典标识
drop index IF EXISTS idx_c1_dictionary_item_dictionary_id;
create index IF NOT EXISTS idx_c1_dictionary_item_dictionary_id ON c1_dictionary_item ("dictionary_id" varchar_pattern_ops);
--字典项代码
drop index IF EXISTS idx_c1_dictionary_item_dictionary_item_code;
create index IF NOT EXISTS idx_c1_dictionary_item_dictionary_item_code ON c1_dictionary_item ("dictionary_item_code" varchar_pattern_ops);
--字典项标识
drop index IF EXISTS idx_c1_dictionary_item_dictionary_item_id;
create index IF NOT EXISTS idx_c1_dictionary_item_dictionary_item_id ON c1_dictionary_item ("dictionary_item_id" varchar_pattern_ops);
--字典类别编号
drop index IF EXISTS idx_c1_dictionary_item_dictionary_type_code;
create index IF NOT EXISTS idx_c1_dictionary_item_dictionary_type_code ON c1_dictionary_item ("dictionary_type_code" varchar_pattern_ops);
--字典类别标识
drop index IF EXISTS idx_c1_dictionary_item_dictionary_type_id;
create index IF NOT EXISTS idx_c1_dictionary_item_dictionary_type_id ON c1_dictionary_item ("dictionary_type_id" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_dictionary_item_end_date;
create index IF NOT EXISTS idx_c1_dictionary_item_end_date ON c1_dictionary_item ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_dictionary_item_flag_code;
create index IF NOT EXISTS idx_c1_dictionary_item_flag_code ON c1_dictionary_item ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_dictionary_item_last_modified_by_code;
create index IF NOT EXISTS idx_c1_dictionary_item_last_modified_by_code ON c1_dictionary_item ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_dictionary_item_last_modified_by_id;
create index IF NOT EXISTS idx_c1_dictionary_item_last_modified_by_id ON c1_dictionary_item ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_dictionary_item_last_modified_date;
create index IF NOT EXISTS idx_c1_dictionary_item_last_modified_date ON c1_dictionary_item ("last_modified_date");
--名称
drop index IF EXISTS idx_c1_dictionary_item_name;
create index IF NOT EXISTS idx_c1_dictionary_item_name ON c1_dictionary_item ("name" varchar_pattern_ops);
--排序
drop index IF EXISTS idx_c1_dictionary_item_order_by_;
create index IF NOT EXISTS idx_c1_dictionary_item_order_by_ ON c1_dictionary_item ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_dictionary_item_org_code;
create index IF NOT EXISTS idx_c1_dictionary_item_org_code ON c1_dictionary_item ("org_code" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_dictionary_item_personal_code;
create index IF NOT EXISTS idx_c1_dictionary_item_personal_code ON c1_dictionary_item ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_dictionary_item_personal_id;
create index IF NOT EXISTS idx_c1_dictionary_item_personal_id ON c1_dictionary_item ("personal_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_dictionary_item_site_code;
create index IF NOT EXISTS idx_c1_dictionary_item_site_code ON c1_dictionary_item ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_dictionary_item_state_code;
create index IF NOT EXISTS idx_c1_dictionary_item_state_code ON c1_dictionary_item ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_dictionary_item_system_info_code;
create index IF NOT EXISTS idx_c1_dictionary_item_system_info_code ON c1_dictionary_item ("system_info_code" varchar_pattern_ops);

-- 国际化信息（c1_i18n_info）

--批次编号
drop index IF EXISTS idx_c1_i18n_info_batch_no;
create index IF NOT EXISTS idx_c1_i18n_info_batch_no ON c1_i18n_info ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_i18n_info_begin_date;
create index IF NOT EXISTS idx_c1_i18n_info_begin_date ON c1_i18n_info ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_i18n_info_created_by_code;
create index IF NOT EXISTS idx_c1_i18n_info_created_by_code ON c1_i18n_info ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_i18n_info_created_by_id;
create index IF NOT EXISTS idx_c1_i18n_info_created_by_id ON c1_i18n_info ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_i18n_info_created_date;
create index IF NOT EXISTS idx_c1_i18n_info_created_date ON c1_i18n_info ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_i18n_info_data_state_code;
create index IF NOT EXISTS idx_c1_i18n_info_data_state_code ON c1_i18n_info ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_i18n_info_department_code;
create index IF NOT EXISTS idx_c1_i18n_info_department_code ON c1_i18n_info ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_i18n_info_end_date;
create index IF NOT EXISTS idx_c1_i18n_info_end_date ON c1_i18n_info ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_i18n_info_flag_code;
create index IF NOT EXISTS idx_c1_i18n_info_flag_code ON c1_i18n_info ("flag_code" varchar_pattern_ops);
--国际化信息编号
drop index IF EXISTS idx_c1_i18n_info_i18n_info_code;
create index IF NOT EXISTS idx_c1_i18n_info_i18n_info_code ON c1_i18n_info ("i18n_info_code" varchar_pattern_ops);
--国际化信息标识
drop index IF EXISTS idx_c1_i18n_info_i18n_info_id;
create index IF NOT EXISTS idx_c1_i18n_info_i18n_info_id ON c1_i18n_info ("i18n_info_id" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_i18n_info_last_modified_by_code;
create index IF NOT EXISTS idx_c1_i18n_info_last_modified_by_code ON c1_i18n_info ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_i18n_info_last_modified_by_id;
create index IF NOT EXISTS idx_c1_i18n_info_last_modified_by_id ON c1_i18n_info ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_i18n_info_last_modified_date;
create index IF NOT EXISTS idx_c1_i18n_info_last_modified_date ON c1_i18n_info ("last_modified_date");
--排序
drop index IF EXISTS idx_c1_i18n_info_order_by_;
create index IF NOT EXISTS idx_c1_i18n_info_order_by_ ON c1_i18n_info ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_i18n_info_org_code;
create index IF NOT EXISTS idx_c1_i18n_info_org_code ON c1_i18n_info ("org_code" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_i18n_info_personal_code;
create index IF NOT EXISTS idx_c1_i18n_info_personal_code ON c1_i18n_info ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_i18n_info_personal_id;
create index IF NOT EXISTS idx_c1_i18n_info_personal_id ON c1_i18n_info ("personal_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_i18n_info_site_code;
create index IF NOT EXISTS idx_c1_i18n_info_site_code ON c1_i18n_info ("site_code" varchar_pattern_ops);
--站点标识
drop index IF EXISTS idx_c1_i18n_info_site_id;
create index IF NOT EXISTS idx_c1_i18n_info_site_id ON c1_i18n_info ("site_id" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_i18n_info_state_code;
create index IF NOT EXISTS idx_c1_i18n_info_state_code ON c1_i18n_info ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_i18n_info_system_info_code;
create index IF NOT EXISTS idx_c1_i18n_info_system_info_code ON c1_i18n_info ("system_info_code" varchar_pattern_ops);
--类别编号(数据字典)
drop index IF EXISTS idx_c1_i18n_info_type_code;
create index IF NOT EXISTS idx_c1_i18n_info_type_code ON c1_i18n_info ("type_code" varchar_pattern_ops);

-- 错误信息（c1_error_info）

--批次编号
drop index IF EXISTS idx_c1_error_info_batch_no;
create index IF NOT EXISTS idx_c1_error_info_batch_no ON c1_error_info ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_error_info_begin_date;
create index IF NOT EXISTS idx_c1_error_info_begin_date ON c1_error_info ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_error_info_created_by_code;
create index IF NOT EXISTS idx_c1_error_info_created_by_code ON c1_error_info ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_error_info_created_by_id;
create index IF NOT EXISTS idx_c1_error_info_created_by_id ON c1_error_info ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_error_info_created_date;
create index IF NOT EXISTS idx_c1_error_info_created_date ON c1_error_info ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_error_info_data_state_code;
create index IF NOT EXISTS idx_c1_error_info_data_state_code ON c1_error_info ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_error_info_department_code;
create index IF NOT EXISTS idx_c1_error_info_department_code ON c1_error_info ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_error_info_end_date;
create index IF NOT EXISTS idx_c1_error_info_end_date ON c1_error_info ("end_date");
--错误信息编号
drop index IF EXISTS idx_c1_error_info_error_info_code;
create index IF NOT EXISTS idx_c1_error_info_error_info_code ON c1_error_info ("error_info_code" varchar_pattern_ops);
--错误信息标识
drop index IF EXISTS idx_c1_error_info_error_info_id;
create index IF NOT EXISTS idx_c1_error_info_error_info_id ON c1_error_info ("error_info_id" varchar_pattern_ops);
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_error_info_flag_code;
create index IF NOT EXISTS idx_c1_error_info_flag_code ON c1_error_info ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_error_info_last_modified_by_code;
create index IF NOT EXISTS idx_c1_error_info_last_modified_by_code ON c1_error_info ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_error_info_last_modified_by_id;
create index IF NOT EXISTS idx_c1_error_info_last_modified_by_id ON c1_error_info ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_error_info_last_modified_date;
create index IF NOT EXISTS idx_c1_error_info_last_modified_date ON c1_error_info ("last_modified_date");
--对象编号
drop index IF EXISTS idx_c1_error_info_object_code;
create index IF NOT EXISTS idx_c1_error_info_object_code ON c1_error_info ("object_code" varchar_pattern_ops);
--对象标识
drop index IF EXISTS idx_c1_error_info_object_id;
create index IF NOT EXISTS idx_c1_error_info_object_id ON c1_error_info ("object_id" varchar_pattern_ops);
--对象类别编号(数据字典)
drop index IF EXISTS idx_c1_error_info_object_type_code;
create index IF NOT EXISTS idx_c1_error_info_object_type_code ON c1_error_info ("object_type_code" varchar_pattern_ops);
--排序
drop index IF EXISTS idx_c1_error_info_order_by_;
create index IF NOT EXISTS idx_c1_error_info_order_by_ ON c1_error_info ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_error_info_org_code;
create index IF NOT EXISTS idx_c1_error_info_org_code ON c1_error_info ("org_code" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_error_info_personal_code;
create index IF NOT EXISTS idx_c1_error_info_personal_code ON c1_error_info ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_error_info_personal_id;
create index IF NOT EXISTS idx_c1_error_info_personal_id ON c1_error_info ("personal_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_error_info_site_code;
create index IF NOT EXISTS idx_c1_error_info_site_code ON c1_error_info ("site_code" varchar_pattern_ops);
--站点标识
drop index IF EXISTS idx_c1_error_info_site_id;
create index IF NOT EXISTS idx_c1_error_info_site_id ON c1_error_info ("site_id" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_error_info_state_code;
create index IF NOT EXISTS idx_c1_error_info_state_code ON c1_error_info ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_error_info_system_info_code;
create index IF NOT EXISTS idx_c1_error_info_system_info_code ON c1_error_info ("system_info_code" varchar_pattern_ops);
--类别编号(数据字典)
drop index IF EXISTS idx_c1_error_info_type_code;
create index IF NOT EXISTS idx_c1_error_info_type_code ON c1_error_info ("type_code" varchar_pattern_ops);

-- 系统信息（c1_system_info）

--批次编号
drop index IF EXISTS idx_c1_system_info_batch_no;
create index IF NOT EXISTS idx_c1_system_info_batch_no ON c1_system_info ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_system_info_begin_date;
create index IF NOT EXISTS idx_c1_system_info_begin_date ON c1_system_info ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_system_info_created_by_code;
create index IF NOT EXISTS idx_c1_system_info_created_by_code ON c1_system_info ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_system_info_created_by_id;
create index IF NOT EXISTS idx_c1_system_info_created_by_id ON c1_system_info ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_system_info_created_date;
create index IF NOT EXISTS idx_c1_system_info_created_date ON c1_system_info ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_system_info_data_state_code;
create index IF NOT EXISTS idx_c1_system_info_data_state_code ON c1_system_info ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_system_info_department_code;
create index IF NOT EXISTS idx_c1_system_info_department_code ON c1_system_info ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_system_info_end_date;
create index IF NOT EXISTS idx_c1_system_info_end_date ON c1_system_info ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_system_info_flag_code;
create index IF NOT EXISTS idx_c1_system_info_flag_code ON c1_system_info ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_system_info_last_modified_by_code;
create index IF NOT EXISTS idx_c1_system_info_last_modified_by_code ON c1_system_info ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_system_info_last_modified_by_id;
create index IF NOT EXISTS idx_c1_system_info_last_modified_by_id ON c1_system_info ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_system_info_last_modified_date;
create index IF NOT EXISTS idx_c1_system_info_last_modified_date ON c1_system_info ("last_modified_date");
--名称
drop index IF EXISTS idx_c1_system_info_name;
create index IF NOT EXISTS idx_c1_system_info_name ON c1_system_info ("name" varchar_pattern_ops);
--排序
drop index IF EXISTS idx_c1_system_info_order_by_;
create index IF NOT EXISTS idx_c1_system_info_order_by_ ON c1_system_info ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_system_info_org_code;
create index IF NOT EXISTS idx_c1_system_info_org_code ON c1_system_info ("org_code" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_system_info_personal_code;
create index IF NOT EXISTS idx_c1_system_info_personal_code ON c1_system_info ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_system_info_personal_id;
create index IF NOT EXISTS idx_c1_system_info_personal_id ON c1_system_info ("personal_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_system_info_site_code;
create index IF NOT EXISTS idx_c1_system_info_site_code ON c1_system_info ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_system_info_state_code;
create index IF NOT EXISTS idx_c1_system_info_state_code ON c1_system_info ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_system_info_system_info_code;
create index IF NOT EXISTS idx_c1_system_info_system_info_code ON c1_system_info ("system_info_code" varchar_pattern_ops);
--系统信息标识
drop index IF EXISTS idx_c1_system_info_system_info_id;
create index IF NOT EXISTS idx_c1_system_info_system_info_id ON c1_system_info ("system_info_id" varchar_pattern_ops);

-- 站点（c1_site）

--批次编号
drop index IF EXISTS idx_c1_site_batch_no;
create index IF NOT EXISTS idx_c1_site_batch_no ON c1_site ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_site_begin_date;
create index IF NOT EXISTS idx_c1_site_begin_date ON c1_site ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_site_created_by_code;
create index IF NOT EXISTS idx_c1_site_created_by_code ON c1_site ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_site_created_by_id;
create index IF NOT EXISTS idx_c1_site_created_by_id ON c1_site ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_site_created_date;
create index IF NOT EXISTS idx_c1_site_created_date ON c1_site ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_site_data_state_code;
create index IF NOT EXISTS idx_c1_site_data_state_code ON c1_site ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_site_department_code;
create index IF NOT EXISTS idx_c1_site_department_code ON c1_site ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_site_end_date;
create index IF NOT EXISTS idx_c1_site_end_date ON c1_site ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_site_flag_code;
create index IF NOT EXISTS idx_c1_site_flag_code ON c1_site ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_site_last_modified_by_code;
create index IF NOT EXISTS idx_c1_site_last_modified_by_code ON c1_site ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_site_last_modified_by_id;
create index IF NOT EXISTS idx_c1_site_last_modified_by_id ON c1_site ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_site_last_modified_date;
create index IF NOT EXISTS idx_c1_site_last_modified_date ON c1_site ("last_modified_date");
--名称
drop index IF EXISTS idx_c1_site_name;
create index IF NOT EXISTS idx_c1_site_name ON c1_site ("name" varchar_pattern_ops);
--排序
drop index IF EXISTS idx_c1_site_order_by_;
create index IF NOT EXISTS idx_c1_site_order_by_ ON c1_site ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_site_org_code;
create index IF NOT EXISTS idx_c1_site_org_code ON c1_site ("org_code" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_site_personal_code;
create index IF NOT EXISTS idx_c1_site_personal_code ON c1_site ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_site_personal_id;
create index IF NOT EXISTS idx_c1_site_personal_id ON c1_site ("personal_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_site_site_code;
create index IF NOT EXISTS idx_c1_site_site_code ON c1_site ("site_code" varchar_pattern_ops);
--站点标识
drop index IF EXISTS idx_c1_site_site_id;
create index IF NOT EXISTS idx_c1_site_site_id ON c1_site ("site_id" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_site_state_code;
create index IF NOT EXISTS idx_c1_site_state_code ON c1_site ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_site_system_info_code;
create index IF NOT EXISTS idx_c1_site_system_info_code ON c1_site ("system_info_code" varchar_pattern_ops);
--系统信息标识
drop index IF EXISTS idx_c1_site_system_info_id;
create index IF NOT EXISTS idx_c1_site_system_info_id ON c1_site ("system_info_id" varchar_pattern_ops);


