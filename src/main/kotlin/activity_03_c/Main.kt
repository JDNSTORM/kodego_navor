package activity_03_c

/*
Covered Topic(s) : Functions

Instructions :

1. Create an ArrayList of grocery products with 20 entries.
2. Create a HashMap called Cart.
    Hint:  Hashmap<String, Int>
3. Create a function "addToCart" that will accept a String and an Int, then it will add the input in the Hashmap. If the Entry already exists, create a new entry in the HashMap.
    Hint : you may add a "_01", "_02"
    Example Coke_01, Coke_02
4. Create a function "checkOut". This will compute how many items have been checked out.
5. Create a function "removeFromCart"  that will accept a String and remove the input from the Hashmap. If there are multiple entries, remove all from the HashMap.
*/

fun main() {
    var groceryProducts: ArrayList<String> = arrayListOf(
        //TODO: List of Grocery Items
    )
    var cart = HashMap<String, Int>()
}

fun addToCart(groceryProducts: ArrayList<String>, cart: HashMap<String, Int>, item: String, quantity: Int): HashMap<String, Int>{
    if(inProducts(groceryProducts, item)) {
        var append = ""
        if (cart.containsKey(item)) {
            var duplicateCount = 1
            for (product in cart.keys) {
                if (product == item) {
                    duplicateCount++
                }
            }
            append =
                if (duplicateCount < 10) {
                    "_0$duplicateCount"
                } else {
                    "_$duplicateCount"
                }
        }
        cart[item + append] = quantity
        println("Item has been added to Cart")
    }else{
        println("Invalid Item")
    }
    return cart
}

fun removeFromCart(groceryProducts: ArrayList<String>, cart: HashMap<String, Int>, item: String, quantity: Int): HashMap<String, Int>{
    if(inProducts(groceryProducts, item)) {
        for (product in cart.keys) {
            if (product.contains(item)) {
                cart.remove(product)
                println("Removed $product from cart.")
            }
        }
    }else{
        println("Invalid Item")
    }
    return cart
}

fun checkOut(cart: HashMap<String, Int>){
    var productCount = cart.count()
    var quanity = cart.values.sum()
    println("A total of $productCount items with a total quantity of $quanity have been checked out.")
}

fun inProducts(groceryProducts: ArrayList<String>, item: String): Boolean = groceryProducts.contains(item)