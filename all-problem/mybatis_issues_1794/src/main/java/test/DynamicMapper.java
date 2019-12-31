package test;

import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gongshunqiang on 2019/12/31
 */
public interface DynamicMapper<T extends Serializable> {

    List<T> query(List<T> list, RowBounds rowBounds);
}
