package dev.villanueva.userland_utility.products.config

class MappingConfiguration {
    var buttons: HashMap<String,
            HashMap<String,
                    LinkedHashSet<Int>
                    >
            > = HashMap()

    var dials: HashMap<String,
            HashMap<String,
                    HashMap<String,
                            LinkedHashSet<Int>
                            >
                    >
            > = HashMap()
}