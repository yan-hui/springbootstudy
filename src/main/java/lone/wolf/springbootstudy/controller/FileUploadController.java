package lone.wolf.springbootstudy.controller;

import lone.wolf.springbootstudy.domain.JsonData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Description
 * @CreateBy hechunhui
 * @created 2018/11/1$ 23:18$
 */
@Controller
public class FileUploadController {
    //private static final String filePath = "D:/workspace/mycode/springbootstudy/src/main/resources/static/images/";
    private static final String filePath = "D:/images/";

    @PostMapping("/upload")
    @ResponseBody
    public JsonData upload(@RequestParam("head_img") MultipartFile file, HttpServletRequest request) {
        String name = request.getParameter("name");
        System.out.println("用户名：" + name);
        //file.isEmpty()
        //long size = file.getSize();
        //获取文件名
        String filename = file.getOriginalFilename();
        System.out.println("上传的文件名为： " + filename);

        //获取文件后缀名
        String suffixName = filename.substring(filename.indexOf("."));
        System.out.println("后缀名为： " + suffixName);
        //文件上传后的名字
        filename = UUID.randomUUID().toString() + suffixName;
        System.out.println("转换名字后：" + filename);

        File local = new File(filePath + filename);
        try {
            file.transferTo(local);
            return new JsonData("0", filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JsonData("1", null, "上传失败");
    }

}
