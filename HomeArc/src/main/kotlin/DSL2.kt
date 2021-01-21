/**
 *@author: Hyman
 *time: 2021/1/20 下午9:56
 *des:目标：生成展示表格的HTML源码
 */

//<table>
//    <tr>
//        <td>Apple</td>
//        <td>Grape</td>
//        <td>Orange</td>
//    </tr>
//    <tr>
//        <td>Pear</td>
//        <td>Banana</td>
//        <td>Watermelon</td>
//    </tr>
//</table>

fun main() {
//    val tr=Tr()
//    tr.td{ "Apple" }
//    tr.td{ "Grape"}
//    tr.td{  "Orange" }
//    println(tr.html())

    //输出Html方法一：
//    val table=Table()
//    table.tr {
//        td{ "Apple" }
//        td{ "Grape"}
//        td{  "Orange" }
//    }
//    table.tr {
//        td{ "Pear" }
//        td{ "Banana"}
//        td{  "Watermelon" }
//    }
//    println(table.html())
    //输出Html方法二：定义个高阶函数table()
    val html = table {
        tr {
            td { "Apple" }
            td { "Grape" }
            td { "Orange" }
        }
        tr {
            td { "Pear" }
            td { "Banana" }
            td { "Watermelon" }
        }
    }
    println(html)
}

class Td {
    var content = ""
    fun html(): String {
        return "\n\t\t<td>$content</td>"
    }
}

class Tr {
    private val children = ArrayList<Td>()

    //高阶函数
    fun td(block: Td.() -> String) {
        val td = Td()
        td.content = td.block() //这个函数类型参数 要返回一个字符串
        children.add(td)
    }

    fun html(): String {
        val builder = StringBuilder()
        builder.append("\n\t<tr>")
        for (childTag in children) {
            builder.append(childTag.html())
        }
        builder.append("\n\t<tr>")
        return builder.toString()
    }
}

class Table {
    val children = ArrayList<Tr>()

    fun tr(block: Tr.() -> Unit) {
        val tr = Tr()
        tr.block() //
        children.add(tr)
    }

    fun html(): String {
        val builder = StringBuilder()
        builder.append("<table>")
        for (childTag in children) {
            builder.append(childTag.html())
        }
        builder.append("\n<table>")
        return builder.toString()
    }
}

fun table(block: Table.() -> Unit): String {
    val table = Table()
    table.block()
    return table.html()
}

