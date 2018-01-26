update c1_site s1 set "name" = i1."content"
from c1_i18n_info i1
where i1.type_code = 'site'
and i1."language" = :language
and i1.i18n_info_code = s1.site_code