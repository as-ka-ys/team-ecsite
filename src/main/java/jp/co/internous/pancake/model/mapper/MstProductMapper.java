package jp.co.internous.pancake.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.pancake.model.domain.MstProduct;

@Mapper
public interface MstProductMapper {
 
// MstProductからのselect文
 @Select("SELECT * FROM mst_product ORDER BY category_id ASC, id ASC")
 List<MstProduct> find();
 List<MstProduct> findByProductName(@Param("keywords") String[] keywords);
 List<MstProduct> findByCategoryAndProductName(@Param("category") int category, @Param("keywords") String[] keywords);
 
 @Select("SELECT * FROM mst_product WHERE id = #{id}")
 MstProduct findById(@Param("id") int id);

}