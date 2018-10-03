/**
 * 用户列表
 */
var pageCurr;
$(function() {
    layui.use('table', function(){
        var table = layui.table
            ,form = layui.form;

        tableIns=table.render({
            elem: '#qrCode'
            ,url:'/task/getQrList'
        	,method: 'post' //默认：get请求
            ,cellMinWidth: 80
            ,page: true,
            request: {
                pageName: 'page' //页码的参数名称，默认：page
                ,limitName: 'limit' //每页数据量的参数名，默认：limit
            },response:{
                statusName: 'code' //数据状态的字段名称，默认：code
                ,statusCode: 200 //成功的状态码，默认：0
                ,countName: 'totals' //数据总数的字段名称，默认：count
                ,dataName: 'list' //数据列表的字段名称，默认：data
            }
            ,cols: [[
                {field:'taskId', title:'任务ID', width:80, align:'center'}
                ,{field:'initiator', title:'注册方', width:100, align:'center'}
                ,{field:'qrPhone', title:'注微手机', width:130, align:'center'}
                ,{field:'completer', title: '渠道方', width:100, align:'center' }
                ,{field:'supPhone', title: '完成者', width:130, align:'center' }
                ,{field:'createtime', title:'创建时间', width:180, align:'center'}
                ,{field:'lockTime', title: '接单时间', width:180, align:'center'}
                ,{field:'completeTime', title: '完成时间', width:180, align:'center'}
                ,{field:'qrStatus', title: '状态', width:100, align:'center',templet:'#staTpl'}
                ,{field:'serverStatus', title: '客服介入', width:100,align:'center',templet:'#serTpl'}
                ,{field:'remark', title: '备注', width:140, align:'center'}
                ,{field:'right', title:'操作', width:160,align:'center', toolbar:'#optBar'}
            ]]
            ,  done: function(res, curr, count){
                //如果是异步请求数据方式，res即为你接口返回的信息。
                //如果是直接赋值的方式，res即为：{data: [], count: 99} data为当前页数据、count为数据总长度
                //console.log(res);
                //得到当前页码
                //console.log(curr);
                //得到数据总量
                //console.log(count);
                pageCurr=curr;
            }
        });

        });

        //搜索框
        layui.use(['form','laydate'], function(){
            var form = layui.form ,layer = layui.layer
                ,laydate = layui.laydate;
            //日期
            laydate.render({
                elem: '#insertTimeStart'
            });
            laydate.render({
                elem: '#insertTimeEnd'
            });
            //TODO 数据校验
            //监听搜索框
            form.on('submit(searchSubmit)', function(data){
                //重新加载table
                load(data);
                return false;
            });
        });
});

function load(obj){
    //重新加载table
    tableIns.reload({
        where: obj.field
        , page: {
            curr: pageCurr //从当前页码开始
        }
    });
}


