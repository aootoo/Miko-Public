package im.mingxi.miko.startup

import im.mingxi.mm.hook.AutoClickWinLogin
import im.mingxi.mm.hook.AutoSendRawPic
import im.mingxi.mm.hook.FocusPadMode
import im.mingxi.mm.hook.FuckPicCountLimit
import im.mingxi.mm.hook.inject.PlusMenuInject
import im.mingxi.mm.hook.inject.ServiceBtnInject
import im.mingxi.mm.hook.inject.SettingInject

object HookInstaller {

    //辛苦一下临时手动装载一下
    //等我找个时间了解一下ksp
    fun scanAndInstall() {
        if (StartUp.hostType == 1) {
            PlusMenuInject().initialize()
            ServiceBtnInject().initialize()
            SettingInject().initialize()
            FocusPadMode().initialize()
            AutoSendRawPic().initialize()
            FuckPicCountLimit().initialize()
            AutoClickWinLogin().initialize()
        }
    }

    /* fun scanAndInstall() {
         val hookItems = sortHookItems() as ArrayList<*>
         hookItems.forEach {  func ->
             val funcHook = func as BaseFuncHook
             funcHook.initialize()
         }
     }

     private fun sortHookItems() : Any {

         return when(StartUp.hostType) {
             1 -> Class.forName("im.mingxi.miko.annotation.result.FuncHookResult").getDeclaredField("MMFuncHooks").get(null)
             2 -> Class.forName("im.mingxi.miko.annotation.result.FuncHookResult").getDeclaredField("mobileQQFuncHooks").get(null)

             else -> {}
         }
     }*/

}