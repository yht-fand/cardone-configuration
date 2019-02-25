update c1_dictionary_type t set name = (select max(s.content) from c1_i18n_info s where
s.type_code = 'dictionaryType'
and s.language = :language
and s.i18n_info_code = t.dictionary_type_code
)