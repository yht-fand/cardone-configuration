update c1_site t set name = (select max(s.content) from c1_i18n_info s where
s.type_code = 'site'
and s.language = :language
and s.i18n_info_code = t.site_code
)