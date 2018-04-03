package cn.bdqn.controller;

import cn.bdqn.entity.Meal;
import cn.bdqn.server.MealServer;
import cn.bdqn.util.Message;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Controller
@RequestMapping("meal")
public class MealController {

    @Resource
    private MealServer mealServer;
    @RequestMapping(value = "addMeal",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    public String addMeal (@RequestParam MultipartFile myFiles, String meal,String meal_price,String meal_hotel,String meal_air,String meal_settime,String meal_xiang, HttpServletRequest request,Model model) {
        System.out.println(meal);
        System.out.println(meal_price);
        System.out.println(meal_hotel);
        if(myFiles.isEmpty()){
            System.out.println("文件未上传");
        }else{
            //得到上传的文件名
            String fileName = myFiles.getOriginalFilename();
            //得到服务器项目发布运行所在地址
            String path1 = "/Users/xuwenliang/Desktop/";
            //此处未使用UUID来生成唯一标识,用日期作为标识
            String path = path1 + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + fileName;
            //打印文件上传路径,方便查看是否上传成功
            System.out.println(path);
            //把文件上传至path的路径
            File loadFile = new File(path);

            try {
                myFiles.transferTo(loadFile);
                Meal meal1=new Meal();
                meal1.setMeal(meal);
                meal1.setMealprice(meal_price);
                meal1.setMealhotel(meal_hotel);
                meal1.setMealair(meal_air);
                meal1.setMealsettime(meal_settime);
                meal1.setMealxiang(meal_xiang);
                meal1.setMealphoto(path);
                System.out.println("========================"+meal1);
                Integer rows=mealServer.addMeal(meal1);
                System.out.println(rows);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }


        return tomeal(1,8,model);
    }
    @RequestMapping("tomeal")
    public String tomeal(Integer pageNum, Integer pageSize, Model model){
        PageInfo<Meal> pageInfo = mealServer.queryAll(pageNum, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        return "taocanliebiao";
    }
    //删除一条
    @ResponseBody
    @RequestMapping(value = "deleteGradeById", method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    public String deleteGradeById(Integer mealid) {
        Integer n = mealServer.deleteMealById(mealid);
        if (n > 0) {
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }
//    //添加
//    @ResponseBody
//    @RequestMapping(value = "addMeal", method = RequestMethod.POST,
//            produces = {"application/json;charset=UTF-8"})
//    public String addMeal(Meal meal) {
//        int n = mealServer.addMeal(meal);
//        if (n > 0) {
//            return JSON.toJSONString(Message.success());
//        }
//        return JSON.toJSONString(Message.error());
//    }

}

