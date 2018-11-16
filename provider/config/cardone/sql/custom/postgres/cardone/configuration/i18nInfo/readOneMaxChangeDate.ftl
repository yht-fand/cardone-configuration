select max(t.change_date) from (
select max(last_modified_date) as change_date from c1_dictionary
where dictionary_type_code = 'sys' and dictionary_code = 'language'
union ALL
select max(last_modified_date) as change_date from c1_i18n_info
where type_code = 'page'
) t