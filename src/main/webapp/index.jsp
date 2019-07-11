<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<script>
    $(document).ready(function () {
        function uploadPic() {
            $.ajaxSubmit({
                type: 'post',
                url: '/v1/fileUpload',
                success: function (data) {
                    if (data===1){
                        alert("Success...")
                    }
                },
                error: function () {
                    alert('Ajax请求失败，请检查网络后重试!');
                }
            })

        }
    })
</script>
<h2>File Upload Page</h2>

<form id="uploadFile" enctype="multipart/form-data">
    <table style="width: 340px">
        <tr>
            <td>文件名: </td>
            <td><input type="text" name="filename" style="margin-left: 30px" id="filename"></td>
        </tr>
        <tr>
            <td>文件: </td>
            <td><input type="file" name="file" style="margin-left: 30px" id="file"></td>
        </tr>
        <input type="button" value="Upload" onclick="uploadPic()">
    </table>
</form>

<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript" src="/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/js/jquery.form.js"></script>
</body>
</html>
