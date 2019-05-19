$(document).ready(function () {
    $.validator.setDefaults({
        submitHandler: function (form) {
            sbmt();
        }
    });

    $('#login_form').validate({
        rules: {
            loginName: {
                required: true
            },
            password: {
                required: true
            }
        },
        messages: {
            loginName: {
                required: '登陆名不能为空！'
            },
            password: {
                required: '密码不能为空！'
            }
        }
    });
});
