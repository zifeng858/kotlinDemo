import com.sun.xml.internal.fastinfoset.util.StringArray

/**
 * Created by gao on 2017/5/23.
 */

fun main(args:Array<String>) {

    // 变量声明

    var d: Double = 64.0
    var i:Int = 12
    var x: Long =13
    var f: Float = 32.0F
    var b: Byte = 8
    var s :Short = 16
var  s2: String ="2323"

    d = i.toDouble();
    //d= i 不能向上转换
        println("hello world")

    //基本类型数组
    var arraysInt: IntArray  = intArrayOf(1,2,3)
    var arraysLong: LongArray = longArrayOf(1L,2L,3L)
//其他类型声明数组
    var str: Array<String> = Array(5,{index->index.toString()})

    var hello: String = "Hello world"

    for(index :Int in 0..hello.length-1){
        println(hello[index])
    }
    for(ch in hello){
        println(ch)
    }
    for(a in arraysInt){
        println(a)
    }
    //字符串怎么声明
}

fun sum(a: Int,b: Int):Int{
        return  a+b;
}

fun sum2(a: Int,b: Int) = a+b





