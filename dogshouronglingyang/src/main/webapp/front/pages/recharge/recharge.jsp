<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!-- 充值 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>充值</title>
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
		<style type="text/css">
			.pay-type-list {
				display: flex;
				align-items: center;
				flex-wrap: wrap;
			}

			.pay-type-item {
				background: #FFFFFF;
				border: 3px dotted #EEEEEE;
				margin: 20px;
				padding: 20px;
				width: 200px;
			}
		</style>
	</head>
	<body style="background: #EEEEEE;">

		<div id="app">

			<form class="layui-form" lay-filter="myForm">
				<div class="layui-form-item" style="margin: 20px;background: #FFFFFF;border:3px dotted #EEEEEE;padding: 20px;">
					<label class="layui-form-label">充值金额</label>
					<div class="layui-input-block" id="div1">
					</div>
				</div>
				<div class="pay-type-list">
					<div class="pay-type-item">
						<input type="radio" name="type" value="微信支付" checked>
						<img  src="../../img/weixin.png" alt>
						<span>微信支付</span>
					</div>
					<div class="pay-type-item">
						<input type="radio" name="type" value="支付宝支付">
						<img src="../../img/zhifubao.png" alt>
						<span>支付宝支付</span>
					</div>
					<div class="pay-type-item">
						<input type="radio" name="type" value="建设银行">
						<img style="width: 120px;height: 60px;" src="../../img/jianshe.png" alt>
					</div>
					<div class="pay-type-item">
						<input type="radio" name="type" value="农业银行">
						<img style="width: 120px;height: 60px;" src="../../img/nongye.png" alt>
					</div>
					<div class="pay-type-item">
						<input type="radio" name="type" value="中国银行">
						<img style="width: 120px;height: 60px;" src="../../img/zhongguo.png" alt>
					</div>
					<div class="pay-type-item">
						<input type="radio" name="type" value="交通银行">
						<img style="width: 120px;height: 60px;" src="../../img/jiaotong.png" alt>
					</div>
				</div>
				<button style="margin-left: 20px;width:860px;height: 40px;line-height: 40px;" class="layui-btn btn-submit btn-theme"
				 lay-submit lay-filter="*">确认支付</button>
			</form>

		</div>
		<script src="../../../resources/js/jquery.min.js"></script>
		<!-- layui -->
		<script src="../../layui/layui.js"></script>
		<!-- vue -->
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
				el: '#app',
				data: {
					user: {}
				},
				filters: {
					newsDesc: function(val) {
						if (val) {
							if (val.length > 200) {
								return val.substring(0, 200).replace(/<[^>]*>/g).replace(/undefined/g, '');
							} else {
								return val.replace(/<[^>]*>/g).replace(/undefined/g, '');
							}
						}
						return '';
					}
				},
				methods: {
					jump(url) {
						jump(url)
					}
				}
			})

			layui.use(['layer', 'element', 'http', 'jquery', 'form'], function() {
				var layer = layui.layer;
				var element = layui.element;
				var http = layui.http;
				var jquery = layui.jquery;
				var form = layui.form;

				// 查询用户信息
				let table = localStorage.getItem("userTable");
				http.request(`${table}/session`, 'get', {}, function(data) {
					vue.user = data.data;
                    $("#div1").html('<input type="number" name="'+localStorage.getItem('userTable')+'NewMoney" id="'+localStorage.getItem('userTable')+'NewMoney" required lay-verify="required" placeholder="充值金额" autocomplete="off" class="layui-input">');
				});


				
				// 提交表单
				form.on('submit(*)', function(data) {
					// 添加金额
					data = data.field;
                    var data1 = $.extend(vue.user, data)
					http.requestJson(`${table}/update`, 'post',data1 , function(data) {
						layer.msg('充值成功', {
							time: 2000,
							icon: 6
						}, function() {
							window.parent.location.reload();
						});
					});
					return false
				});

			});
		</script>
	</body>
</html>
