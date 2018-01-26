update c1_dictionary_type dt1 set "name" = i1."content"
from c1_i18n_info i1
where i1.type_code = 'dictionaryType'
and i1."language" = :language
and i1.i18n_info_code = dt1.dictionary_type_code