fun renderProductTable(): String {
    return html {
        table {
            tr (getTitleColor()){
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            products.forEachIndexed { index, (description, price, popularity) ->
                tr {
                    td(getCellColor(0, index)) { text(description) }
                    td(getCellColor(1, index)) { text(price) }
                    td(getCellColor(2, index)) { text(popularity) }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) %2 == 0) "#dce4ff" else "#eff2ff"