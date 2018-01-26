update c1_dictionary d1 set "name" = i1."content"
from c1_i18n_info i1
where i1.type_code = 'dictionary'
and i1."language" = :language
and i1.i18n_info_code = d1.dictionary_type_code || ',' || d1.dictionary_code
