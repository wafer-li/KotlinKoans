// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val allProducts = customers.flatMap { it.orders.flatMap { it.products } }.toSet()

    return customers.fold(allProducts) {
        orderByAll: Set<Product>, customer: Customer ->

        orderByAll.intersect(customer.orders.flatMap { it.products })
    }
}