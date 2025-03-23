<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>注册</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script>
    addEventListener("load", function () {
      setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
      window.scrollTo(0, 1);
    }
  </script>
  <link rel="stylesheet" href="../../layui/css/layui.css">
  <link rel="stylesheet" href="../../xznstatic/css/style.css" type="text/css" media="all">
  <link href="../../xznstatic/css/font-awesome.min.css" rel="stylesheet">

</head>
<body>
  <div id="mian" class="main-bg">
    <h1 v-text="projectName"></h1>
    <div class="sub-main-w3">
            <div class="vertical-tab">
        <div id="section1" class="section-w3ls">
          <input type="radio" name="sections" id="option1" checked="checked">
            <article>
              <form class="layui-form login-form" lay-filter="register">
                <div class="layui-form-item layui-form-text input">
                    <div class="layui-inline" >
                        <span style="margin-top: 8px;float: left">狗编号:</span>
                        <div class="layui-input-inline">
                            <input type="text" name="zaikuquanName" id="zaikuquanName"  placeholder="狗编号"  lay-verify="required" autocomplete="off" class="layui-input" style="width: 600px;">
                        </div>
                    </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                    <div class="layui-inline" >
                        <span style="margin-top: 8px;float: left">狗性别:</span>
                        <div class="layui-input-inline">
                            <select name="sexdogTypes" id="sexdogTypes" lay-filter="sexdogTypes" style="width: 600px;">
                                <option v-for="item in sexdogTypesList" :value="item.codeIndex" :key="item.codeIndex">{{ item.indexName }}</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                    <div class="layui-inline" >
                        <span style="margin-top: 8px;float: left">品种:</span>
                        <div class="layui-input-inline">
                            <input type="text" name="zaikuquanPinzhong" id="zaikuquanPinzhong"  placeholder="品种"  lay-verify="required" autocomplete="off" class="layui-input" style="width: 600px;">
                        </div>
                    </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                    <div class="layui-inline" >
                        <span style="margin-top: 8px;float: left">性格:</span>
                        <div class="layui-input-inline">
                            <input type="text" name="zaikuquanXingge" id="zaikuquanXingge"  placeholder="性格"  lay-verify="required" autocomplete="off" class="layui-input" style="width: 600px;">
                        </div>
                    </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                    <div class="layui-inline" >
                        <span style="margin-top: 8px;float: left">接收时间:</span>
                        <div class="layui-input-inline">
                            <input type="text" name="jieshouTime" id="jieshouTime"  lay-verify="integer|required"   placeholder="接收时间" autocomplete="off" class="layui-input" style="width: 600px;">
                        </div>
                    </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                    <div class="layui-inline" >
                        <span style="margin-top: 8px;float: left">是否打过疫苗:</span>
                        <div class="layui-input-inline">
                            <select name="sfyimiaoTypes" id="sfyimiaoTypes" lay-filter="sfyimiaoTypes" style="width: 600px;">
                                <option v-for="item in sfyimiaoTypesList" :value="item.codeIndex" :key="item.codeIndex">{{ item.indexName }}</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                    <div class="layui-inline" >
                        <span style="margin-top: 8px;float: left">是否绝育:</span>
                        <div class="layui-input-inline">
                            <select name="sfjueyuTypes" id="sfjueyuTypes" lay-filter="sfjueyuTypes" style="width: 600px;">
                                <option v-for="item in sfjueyuTypesList" :value="item.codeIndex" :key="item.codeIndex">{{ item.indexName }}</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="layui-form-item layui-form-text input">
                    <div class="layui-inline" >
                        <span style="margin-top: 8px;float: left">犬类型:</span>
                        <div class="layui-input-inline">
                            <select name="zaikuquanTypes" id="zaikuquanTypes" lay-filter="zaikuquanTypes" style="width: 600px;">
                                <option v-for="item in zaikuquanTypesList" :value="item.codeIndex" :key="item.codeIndex">{{ item.indexName }}</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="layui-form-item" style="margin-bottom: 0;">
                  <div class="layui-input-block" style="margin-left: 0;">
                    <button class="layui-btn btn-submit btn submit" style="height: 50px;line-height: 25px;" lay-submit lay-filter="register">注册</button>
                  </div>
                </div>
                <a class="bottom-text-w3ls" href="javascript:window.location.href='../login/login.jsp'">已有账号？去登录</a>
              </form>
            </article>
          </div>
        </div>
        <div class="clear"></div>
      </div>
      <div class="copyright">
        <h2><a href="#"></a></h2>
      </div>
    </div>

  <script src="../../layui/layui.js"></script>
  <script src="../../js/vue.js"></script>
  <!-- 组件配置信息 -->
  <script src="../../js/config.js"></script>
  <!-- 扩展插件配置信息 -->
  <script src="../../modules/config.js"></script>
  <!-- 工具方法 -->
  <script src="../../js/utils.js"></script>
  <!-- 校验格式工具类 -->
  <script src="../../js/validate.js"></script>

  <script>
    var vue = new Vue({
      el: '#mian',
      data: {
        //字典表数据容器
        sexdogTypesList : [],
        sfyimiaoTypesList : [],
        sfjueyuTypesList : [],
        zaikuquanTypesList : [],
        projectName: projectName,
        tablename:'zaikuquan'

      },
      updated: function() {
        layui.form.render(null, 'register');
      }
    });

    layui.use(['layer', 'element', 'carousel', 'form', 'http', 'jquery'], function() {
      var layer = layui.layer;
      var element = layui.element;
      var carousel = layui.carousel;
      var form = layui.form;
      var http = layui.http;
      var jquery = layui.jquery;



      // 查询字典表相关
        // 狗性别的查询和初始化
        sexdogTypesSelect();

        //字典表数据容器
        // 狗性别的查询和初始化
        sexdogTypesSelect();
        // 是否打过疫苗的查询和初始化
        sfyimiaoTypesSelect();
        // 是否绝育的查询和初始化
        sfjueyuTypesSelect();
        // 犬类型的查询和初始化
        zaikuquanTypesSelect();


      // 日期效验规则及格式
      dateTimePick();
      // 表单效验规则
      form.verify({
            // 正整数效验规则
            integer: [
                /^[1-9][0-9]*$/
                ,'必须是正整数'
            ]
            // 小数效验规则
            ,double: [
                /^[1-9][0-9]{0,5}(\.[0-9]{1,2})?$/
                ,'最大整数位为6为,小数最大两位'
            ]
      });


      // 注册
      form.on('submit(register)', function(data) {
        http.requestJson(vue.tablename + '/register', 'post', data.field, function(res) {
            if(res.code==0){
                layer.msg('注册成功', {
                    time: 2000,
                    icon: 6
                },function(){
                    // 路径访问设置
                    window.location.href = '../login/login.jsp';
                });
            }else{
                layer.msg(res.msg);
                return false
            }

        });
        return false
      });




      // 日期框初始化
      function dateTimePick(){
      };

      // 狗性别的查询
      function sexdogTypesSelect() {
        //填充下拉框选项
          http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=sexdog_types", "GET", {}, (res) => {
              if(res.code == 0){
                vue.sexdogTypesList = res.data.list;
              }
          });
      }
      // 是否打过疫苗的查询
      function sfyimiaoTypesSelect() {
        //填充下拉框选项
          http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=sfyimiao_types", "GET", {}, (res) => {
              if(res.code == 0){
                vue.sfyimiaoTypesList = res.data.list;
              }
          });
      }
      // 是否绝育的查询
      function sfjueyuTypesSelect() {
        //填充下拉框选项
          http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=sfjueyu_types", "GET", {}, (res) => {
              if(res.code == 0){
                vue.sfjueyuTypesList = res.data.list;
              }
          });
      }
      // 犬类型的查询
      function zaikuquanTypesSelect() {
        //填充下拉框选项
          http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=zaikuquan_types", "GET", {}, (res) => {
              if(res.code == 0){
                vue.zaikuquanTypesList = res.data.list;
              }
          });
      }
});
  </script>
</body>
</html>
