package dev.villanueva.userland_utility.products

import dev.villanueva.userland_utility.products.config.DeviceConfiguration
import dev.villanueva.userland_utility.products.huion.h1161.H1161Controller
import dev.villanueva.userland_utility.products.huion.h1161.H1161View
import dev.villanueva.userland_utility.products.huion.wh1409_2048.WH1409_2048Controller
import dev.villanueva.userland_utility.products.huion.wh1409_2048.WH1409_2048View
import dev.villanueva.userland_utility.products.huion.wh1409v2.WH1409v2Controller
import dev.villanueva.userland_utility.products.huion.wh1409v2.WH1409v2View
import dev.villanueva.userland_utility.products.xppen.artist_12_pro.Artist12ProController
import dev.villanueva.userland_utility.products.xppen.artist_12_pro.Artist12ProView
import dev.villanueva.userland_utility.products.xppen.artist_13_3_pro.Artist13_3ProController
import dev.villanueva.userland_utility.products.xppen.artist_13_3_pro.Artist13_3ProView
import dev.villanueva.userland_utility.products.xppen.artist_22r_pro.Artist22rProController
import dev.villanueva.userland_utility.products.xppen.artist_22r_pro.Artist22rProView
import dev.villanueva.userland_utility.products.xppen.artist_24_pro.Artist24ProController
import dev.villanueva.userland_utility.products.xppen.artist_24_pro.Artist24ProView
import dev.villanueva.userland_utility.products.xppen.deco.Deco01v2Controller
import dev.villanueva.userland_utility.products.xppen.deco.Deco01v2View
import dev.villanueva.userland_utility.products.xppen.deco_pro.DecoProMediumController
import dev.villanueva.userland_utility.products.xppen.deco_pro.DecoProMediumView
import dev.villanueva.userland_utility.products.xppen.deco_pro.DecoProSmallController
import dev.villanueva.userland_utility.products.xppen.deco_pro.DecoProSmallView
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1

object SupportedProducts {
    private val productToClassMap: MutableMap<String, KClass<out ProductView>> = HashMap()
    private val nameToProductIdMap: MutableMap<String, String> = HashMap()
    private val productIdToName: MutableMap<String, String> = HashMap()
    private val viewDeviceConfigurationMap: MutableMap<String, KProperty1<out ProductView, DeviceConfiguration?>> = HashMap()

    init {
        // XP-Pen Deco Pro Small
        productToClassMap[DecoProSmallController.getProductName()] = DecoProSmallView::class
        nameToProductIdMap[DecoProSmallController.getProductName()] = DecoProSmallController.getVendorProductString()
        productIdToName[DecoProSmallController.getVendorProductString()] = DecoProSmallController.getProductName()
        viewDeviceConfigurationMap[DecoProSmallController.getProductName()] = DecoProSmallView::deviceConfiguration

        // XP-Pen Deco Pro Medium
        productToClassMap[DecoProMediumController.getProductName()] = DecoProMediumView::class
        nameToProductIdMap[DecoProMediumController.getProductName()] = DecoProMediumController.getVendorProductString()
        productIdToName[DecoProMediumController.getVendorProductString()] = DecoProMediumController.getProductName()
        viewDeviceConfigurationMap[DecoProMediumController.getProductName()] = DecoProMediumView::deviceConfiguration

        // XP-Pen Deco 01v2
        productToClassMap[Deco01v2Controller.getProductName()] = Deco01v2View::class
        nameToProductIdMap[Deco01v2Controller.getProductName()] = DecoProSmallController.getVendorProductString()
        productIdToName[Deco01v2Controller.getVendorProductString()] = Deco01v2Controller.getProductName()
        viewDeviceConfigurationMap[Deco01v2Controller.getProductName()] = Deco01v2View::deviceConfiguration

        // XP-Pen Artist 12 Pro
        productToClassMap[Artist12ProController.getProductName()] = Artist12ProView::class
        nameToProductIdMap[Artist12ProController.getProductName()] = Artist12ProController.getVendorProductString()
        productIdToName[Artist12ProController.getVendorProductString()] = Artist12ProController.getProductName()
        viewDeviceConfigurationMap[Artist12ProController.getProductName()] = Artist12ProView::deviceConfiguration

        // XP-Pen Artist 13.3 Pro
        productToClassMap[Artist13_3ProController.getProductName()] = Artist13_3ProView::class
        nameToProductIdMap[Artist13_3ProController.getProductName()] = Artist13_3ProController.getVendorProductString()
        productIdToName[Artist13_3ProController.getVendorProductString()] = Artist13_3ProController.getProductName()
        viewDeviceConfigurationMap[Artist13_3ProController.getProductName()] = Artist13_3ProView::deviceConfiguration

        // XP-Pen Artist 22r Pro
        productToClassMap[Artist22rProController.getProductName()] = Artist22rProView::class
        nameToProductIdMap[Artist22rProController.getProductName()] = Artist22rProController.getVendorProductString()
        productIdToName[Artist22rProController.getVendorProductString()] = Artist22rProController.getProductName()
        viewDeviceConfigurationMap[Artist22rProController.getProductName()] = Artist22rProView::deviceConfiguration

        // XP-Pen Artist 24 Pro
        productToClassMap[Artist24ProController.getProductName()] = Artist24ProView::class
        nameToProductIdMap[Artist24ProController.getProductName()] = Artist24ProController.getVendorProductString()
        productIdToName[Artist24ProController.getVendorProductString()] = Artist24ProController.getProductName()
        viewDeviceConfigurationMap[Artist24ProController.getProductName()] = Artist24ProView::deviceConfiguration

        // Huion WH1409 v2
        productToClassMap[WH1409v2Controller.getProductName()] = WH1409v2View::class
        nameToProductIdMap[WH1409v2Controller.getProductName()] = WH1409v2Controller.getVendorProductString()
        productIdToName[WH1409v2Controller.getVendorProductString()] = WH1409v2Controller.getProductName()
        viewDeviceConfigurationMap[WH1409v2Controller.getProductName()] = WH1409v2View::deviceConfiguration

        // Huion WH1409 (2048)
        productToClassMap[WH1409_2048Controller.getProductName()] = WH1409_2048View::class
        nameToProductIdMap[WH1409_2048Controller.getProductName()] = WH1409_2048Controller.getVendorProductString()
        productIdToName[WH1409_2048Controller.getVendorProductString()] = WH1409_2048Controller.getProductName()
        viewDeviceConfigurationMap[WH1409_2048Controller.getProductName()] = WH1409_2048View::deviceConfiguration

        // Huion H1161
        productToClassMap[H1161Controller.getProductName()] = H1161View::class
        nameToProductIdMap[H1161Controller.getProductName()] = H1161Controller.getVendorProductString()
        productIdToName[H1161Controller.getVendorProductString()] = H1161Controller.getProductName()
        viewDeviceConfigurationMap[H1161Controller.getProductName()] = H1161View::deviceConfiguration
    }

    fun getViewForProduct(product: String): KClass<out ProductView>? {
        return productToClassMap[product]
    }

    fun getProductIdFromName(name: String): String {
        return nameToProductIdMap[name] ?: "0000:0000"
    }

    fun getNameOfProduct(vendorId: Short, productId: Short): String {
        return productIdToName["$vendorId:$productId"] ?: "Unknown device $vendorId:$productId"
    }

    fun getConfigPropertyForProduct(deviceName: String): KProperty1<out ProductView, DeviceConfiguration?> {
        return viewDeviceConfigurationMap[deviceName]!!
    }
}