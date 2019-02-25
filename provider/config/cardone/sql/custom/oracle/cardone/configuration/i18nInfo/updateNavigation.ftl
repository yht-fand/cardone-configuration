update c1_navigation t set name = (select max(s.content) from c1_i18n_info s where
s.type_code = 'navigation'
and s.language = :language
and s.i18n_info_code = t.NAVIGATION_CODE
)