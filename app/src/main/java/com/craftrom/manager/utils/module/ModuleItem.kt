package com.craftrom.manager.utils.module

class ModuleItem {
    var title = ""
    var link = ""
    var description = ""
    var pubDate = ""
    var author = ""
    var version = ""

    override fun toString(): String {
        return "RssItem(title='$title', link='$link', description='$description', pubDate='$pubDate', author='$author', version='$version')"
    }
}