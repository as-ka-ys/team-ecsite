//自分で作成していないファイルを使用しているのでエラーが出ているところはコメントアウト

package jp.co.internous.pancake.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import jp.co.internous.pancake.model.domain.MstProduct;
import jp.co.internous.pancake.model.mapper.MstProductMapper;

//import jp.co.internous.pancake.model.session.LoginSession;

@Controller
@RequestMapping("/pancake/product")
public class ProductController {

// @Autowired
// private LoginSession loginSession;

 @Autowired
 private MstProductMapper productMapper;

 @RequestMapping("/{id}")
 public String index(@PathVariable("id") int id, Model m) {
  // 商品情報を取得
  MstProduct product = productMapper.findById(id);
  m.addAttribute("product", product);
//  m.addAttribute("loginSession",loginSession);
    
  return "product_detail";
 }
}