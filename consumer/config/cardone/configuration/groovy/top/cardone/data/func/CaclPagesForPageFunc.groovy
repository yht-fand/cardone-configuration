package top.cardone.data.func

import com.google.common.collect.Lists
import org.apache.commons.collections.MapUtils
import org.springframework.data.domain.Pageable
import top.cardone.core.util.func.Func2

/**
 * @author yao hai tao
 * @date 2017/2/16
 */
class CaclPagesForPageFunc implements Func2<Object, Map<String, Object>, String> {
    void setPagesRange(int pagesRange) {
        this.pagesRange = pagesRange
    }

    private int pagesRange = 6

    @Override
    Object func(Map<String, Object> map, String key) {
        long total = MapUtils.getLongValue(map, "total", 0)

        if (total < 1) {
            return Lists.newArrayList(1)
        }

        Pageable pageable = (Pageable) MapUtils.getObject(map, "pageable")

        if (total <= pageable.getPageSize()) {
            return Lists.newArrayList(1)
        }

        double totalPages = pageable.getPageSize() == 0 ? 1 : (int) Math.ceil((double) total / (double) pageable.getPageSize())

        if (totalPages <= 1) {
            return Lists.newArrayList(1)
        }

        final int pagesRangeHalf = new java.math.BigDecimal(pagesRange).divide(new BigDecimal(2), BigDecimal.ROUND_HALF_UP).toBigInteger().intValue()

        int pagesRangeStart = Math.max(pageable.getPageNumber() + 1 - pagesRangeHalf, 1)

        int pagesRangeEnd = Math.min((pagesRangeStart + pagesRange) - 1, (int) totalPages)

        if (((pagesRangeEnd - pagesRangeStart) + 1) < pagesRange) {
            pagesRangeStart = Math.max((pagesRangeEnd - pagesRange) + 1, 1)
        }

        int pagesRangeLength = pagesRangeEnd - pagesRangeStart

        int[] pages = new int[pagesRangeLength + 1]

        for (int i = 0; i <= pagesRangeLength; i++) {
            pages[i] = pagesRangeStart++
        }

        return pages
    }
}