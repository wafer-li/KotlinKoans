// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    return orders
            .filter { it.isDelivered }
            .flatMap { it.products }
            .maxBy { it.price }
}

// Return how many times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    val allOrderedProducts = getAllOrderedProducts()

    return allOrderedProducts.count { it == product }
}

fun Shop.getAllOrderedProducts(): List<Product> =
        this.customers.flatMap { it.orders.flatMap { it.products } }
