/**
 * Created by QAQ on 2016/8/17.
 */
function hello(hello) {
    console.log(hello);
}
hello("hello!");
$.get("/person",{name:"阿喜"}, function (data) {
    alert("success!");
});