update c1_dictionary_item di1 set "name" = i1."content"
from c1_i18n_info i1
where i1.type_code = 'dictionaryItem'
and i1."language" = :language
and i1.i18n_info_code = di1.dictionary_type_code || ',' || di1.dictionary_code || ',' || di1.dictionary_item_code
