update c1_navigation n1 set "name" = i1."content"
from c1_i18n_info i1
where i1.type_code = 'navigation'
and i1."language" = :language
and i1.i18n_info_code = n1.navigation_code