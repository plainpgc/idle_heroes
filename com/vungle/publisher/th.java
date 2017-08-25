package com.vungle.publisher;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: vungle */
public final class th {
    static final Set<String> f3266a = new HashSet(Arrays.asList(new String[]{"http", "https"}));

    public static String m2498a() {
        return "!function(e){\"use strict\";var t,r=e.vungle=e.vungle||{};r.error||(t=r.error=r.error||{},t.bridgeError={BRG000:\"Missing command in mraidBridge.executeSDKCommand method call!\",BRG001:\"Vungle SDK is not ready to process MRAID command!\"},t.bridgeExtError={BRX000:\"Cannot retrieve #dynamic container in Ad Unit!\"},t.mraidError={MRD000:\"Cannot add listener for unknown MRAID event!\",MRD001:\"Missing argument(s)! Both event and/or listener are required for method call!\",MRD002:\"Unable to find listener registered for event!\",MRD003:\"Missing MRAID event! Cannot remove event listener!\",MRD004:\"Missing object! An expand properties object is required for method call!\",MRD005:\"Missing object! An orientation properties object is required for method call!\",MRD006:\"Missing object! An resize properties object is required for method call!\",MRD007:\"Missing URL! A URL is required for method call!\",MRD008:\"Ad unit is hidden and cannot be closed!\",MRD009:\"Missing URL! A video/caption URL is required for method call!\",MRD010:\"Ad Unit is not viewable! Please make sure isViewAble is set to true!\",MRD011:\"Ad unit can only be expanded from the default or resized state!\",MRD012:\"Ad unit can only be resized from the default or resized state!\",MRD013:\"Missing URI! A valid URI is required for method call!\",MRD015:\"Invalid data/type detected when updating MRAID properties!\"},t.mraidClientError={MRC000:\"MRAID SDK error detected!\",MRC001:\"Missing MRAID object in window!\",MRC002:\"Missing video URL!  mraidClient.playVideo cannot retrieve video URL from arguments!\"},t.adTemplateError={ADT000:\"Missing page template JavaScript!\",ADT001:\"Error encountered loading template configuration!\"},t.gestureTrackingError={GET000:\"Cannot serialize user interaction tracking event object!\"})}(window),function(e){\"use strict\";var t=e.vungle=e.vungle||{},r=t.mraidCore=t.mraidCore||{},n=t.debugLog=t.debugLog||[];n&&n.push(\"vungle.mraidCore loaded.\"),r.consts={versions:{V1:\"1.0\",V2:\"2.0\"},states:{LOADING:\"loading\",DEFAULT:\"default\",RESIZED:\"resized\",EXPANDED:\"expanded\",HIDDEN:\"hidden\"},events:{INFO:\"info\",READY:\"ready\",ERROR:\"error\",STATE_CHANGE:\"stateChange\",ORIENTATION_CHANGE:\"orientationChange\",VIEWABLE_CHANGE:\"viewableChange\",SIZE_CHANGE:\"sizeChange\"},placements:{UNKNOWN:\"unknown\",INLINE:\"inline\",INTERSTITIAL:\"interstitial\"},orientations:{PORTRAIT:\"portrait\",LANDSCAPE:\"landscape\",NONE:\"none\"},closePositions:{CENTER:\"center\",TOP_LEFT:\"top-left\",TOP_CENTER:\"top-center\",TOP_RIGHT:\"top-right\",BOTTOM_LEFT:\"bottom-left\",BOTTOM_CENTER:\"bottom-center\",BOTTOM_RIGHT:\"bottom-right\"}},r.PropertiesValueObject=function(e){var t=function(e){var t;return e&&\"object\"==typeof e?(t={},Object.keys(e).forEach(function(r,n,i){t[r]=e[r]})):t=e,t};this.value=t(e),this.clone=function(){return t(this.value)},this.update=function(e){if(e&&\"object\"==typeof e){var t=this;Object.keys(e).forEach(function(r,n,i){t.value[r]=e[r]})}else this.value=e}},r.EventListeners=function(e){var t={};this.event=e,this.listenerCount=0,this.add=function(e){var r=String(e);return t[r]?!1:(t[r]=e,this.listenerCount++,!0)},this.remove=function(e){var r=String(e);return t.hasOwnProperty(r)&&t[r]?(t[r]=null,delete t[r],this.listenerCount--,!0):!1},this.removeAll=function(){var e=this;Object.keys(t).forEach(function(r,n,i){e.remove(t[r])})},this.broadcast=function(e){Object.keys(t).forEach(function(r,n,i){t[r].apply(mraid,e)})}};var i=new r.PropertiesValueObject(r.consts.versions.V1),o=new r.PropertiesValueObject({width:0,height:0}),s=new r.PropertiesValueObject({width:0,height:0}),a=new r.PropertiesValueObject({x:0,y:0,width:0,height:0}),d=new r.PropertiesValueObject({x:0,y:0,width:0,height:0}),c=new r.PropertiesValueObject({width:0,height:0,useCustomClose:!1,isModal:!0}),u=new r.PropertiesValueObject({width:0,height:0,offsetX:0,offsetY:0,customClosePosition:r.consts.closePositions.TOP_RIGHT,allowOffscreen:!0}),l=new r.PropertiesValueObject({allowOrientationChange:!0,forceOrientation:r.consts.orientations.NONE}),p=new r.PropertiesValueObject({sms:!1,tel:!1,calendar:!1,storePicture:!1,inlineVideo:!1}),m=new r.PropertiesValueObject(r.consts.states.LOADING),f=new r.PropertiesValueObject(r.consts.placements.UNKNOWN),E=new r.PropertiesValueObject(!1),g=new r.PropertiesValueObject(!1),v=new r.PropertiesValueObject(!1),R=new r.PropertiesValueObject(!1),h=new r.PropertiesValueObject(!1),y={},C=new r.PropertiesValueObject(\"\"),O=new r.PropertiesValueObject(\"\");r.eventListeners=y,r.propertiesHandlers={os:{update:function(e){C.update(e)},clone:function(){return C.clone()}},osVersion:{update:function(e){O.update(e)},clone:function(){return O.clone()}},incentivized:{update:function(e){g.update(e)},clone:function(){return g.clone()}},version:{update:function(e){i.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting MRAID version to: \"+String(e))},clone:function(){return i.clone()}},maxSize:{update:function(e){o.update(e),c.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting maxSize to: \"+String(e))},clone:function(){return o.clone()}},screenSize:{update:function(e){var t;s.update(e),t=s.clone(),r.broadcastEvent(r.consts.events.INFO,\"Setting screenSize to: \"+String(e)),r.broadcastEvent(r.consts.events.SIZE_CHANGE,t.width,t.height)},clone:function(){return s.clone()}},defaultPosition:{update:function(e){a.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting defaultPosition to: \"+String(e))},clone:function(){return a.clone()}},currentPosition:{update:function(e){d.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting currentPosition to: \"+String(e))},clone:function(){return d.clone()}},expandProperties:{update:function(e){c.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting expandProperties to: \"+String(e))},clone:function(){return c.clone()}},resizeProperties:{update:function(e){u.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting resizeProperties to: \"+String(e))},clone:function(){return u.clone()}},orientationProperties:{update:function(e){l.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting orientationProperties to: \"+String(e))},clone:function(){return l.clone()}},supports:{update:function(e){p.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting supports to: \"+String(e))},clone:function(){return p.clone()}},state:{update:function(e){m.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting state to: \"+String(e)),r.broadcastEvent(r.consts.events.STATE_CHANGE,m.clone()),m.clone()===r.consts.states.DEFAULT&&r.broadcastEvent(r.consts.events.READY)},clone:function(){return m.clone()}},placementType:{update:function(e){f.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting placementType to: \"+String(e))},clone:function(){return f.clone()}},isViewable:{update:function(e){E.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting isViewable to: \"+String(e)),r.broadcastEvent(r.consts.events.VIEWABLE_CHANGE,E.clone())},clone:function(){return E.clone()}},customClose:{update:function(e){v.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting useCustomClose to: \"+String(e))},clone:function(){return v.clone()}},customPrivacy:{update:function(e){R.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting useCustomPrivacy to: \"+String(e))},clone:function(){return R.clone()}},enableBackImmediately:{update:function(e){h.update(e),r.broadcastEvent(r.consts.events.INFO,\"Setting enableBackImmediately to: \"+String(e))},clone:function(){return h.clone()}}},r.propertiesValidator=function(e,r,n){var i=!0;return typeof e!=typeof r&&\"useCustomClose\"!==n?(i=!1,t.mraidBridgeExt&&t.mraidBridgeExt.notifyError([\"MRD015\",n,e].join(\":\"))):\"object\"==typeof e&&Object.keys(e).forEach(function(e,o,s){e in r||(i=!1,t.mraidBridgeExt&&t.mraidBridgeExt.notifyError([\"MRD015\",n,e].join(\":\")))}),i},r.broadcastEvent=function(){var e=Array.prototype.slice.call(arguments),t=e.shift(),r=y[t];r&&r.broadcast(e)},r.isValidMARIDEvent=function(e){for(var t in r.consts.events)if(r.consts.events[t]===e)return!0;return!1}}(window),function(e){\"use strict\";var t=e.vungle=e.vungle||{},r=t.mraidBridge=t.mraidBridge||{};r.notifyContainer=function(t){e.location=t}}(window),function(e){\"use strict\";var t,r=e.vungle=e.vungle||{},n=r.mraidBridge=r.mraidBridge||{},i=r.mraidBridgeExt=r.mraidBridgeExt||{},o=r.debugLog=r.debugLog||[],s=!1,a=!1,d=[],c=!1,u=r.mraidCore.broadcastEvent,l=r.mraidCore.consts.states,p=r.mraidCore.consts.events;o&&o.push(\"vungle.mraidBridge loaded.\"),i.getReplacementTokens=function(){return t},i.getIsVungleAd=function(){return c},i.getEnableBackButtonImmediately=function(){return r.mraidCore.propertiesHandlers.enableBackImmediately.clone()},n.notifyPropertiesChange=function(e,t){o&&o.push(\"mraidBridge.notifyPropertiesChange:\"+JSON.stringify(e)),Object.keys(e).forEach(function(t,i,o){r.mraidCore.propertiesHandlers[t]?r.mraidCore.propertiesHandlers[t].update(e[t]):n.notifyErrorEvent(\"notifyPropertiesChange\",\"MRD015: Unhandled Property received - \"+t+\" - \"+e[t])}),\"undefined\"!=typeof t&&t===!0&&r.mraidBridge.notifyContainer(\"mraid://propertiesChangeCompleted\")},n.notifyCommandComplete=function(){o&&o.push(\"mraidBridge.notifyCommandComplete\");var e=\"\";d.length?(e=d.shift(),r.mraidBridge.notifyContainer(e)):a=!1},n.notifyReadyEvent=function(e){o&&o.push(\"mraidBridge.notifyReadyEvent\");var n=r.mraidCore.propertiesHandlers.state.clone();s=!0,\"undefined\"!=typeof e?(c=!0,t=e):r.mraidBridgeExt.notifySuccessfulViewAd(),n!==l.DEFAULT?r.mraidCore.propertiesHandlers.state.update(l.DEFAULT):u(p.READY)},n.notifyErrorEvent=function(e,t){o&&o.push(\"mraidBridge.notifyErrorEvent:\"+e+\":\"+t),u(p.ERROR,e,t)},n.executeSDKCommand=function(){var e,t,i,c=\"\";if(!s)throw n.notifyErrorEvent(c,r.error.bridgeError.BRG001),{name:\"VungleMRAIDBridgeException\",message:\"BRG001\"};if(!arguments)throw n.notifyErrorEvent(c,r.error.bridgeError.BRG000),{name:\"VungleMRAIDBridgeException\",message:\"BRG000\"};for(c+=\"mraid://\"+arguments[0],i=1;i<arguments.length;i+=2)e=arguments[i],t=arguments[i+1],c+=(1===i?\"?\":\"&\")+encodeURIComponent(e),\"undefined\"!=typeof t&&(c+=\"=\"+encodeURIComponent(t));a?d.push(c):(a=!0,r.mraidBridge.notifyContainer(c)),o&&o.push(\"mraidBridge.executeSDKCommand: \"+c)},i.fireVideoCompleteEvent=function(){o&&o.push(\"mraidBridgeExt.fireVideoCompleteEvent\");var t=e.document.querySelector(\"#dynamic\"),r=new e.Event(\"vungle.events.video.ended\");t?t.dispatchEvent(r):i.notifyError(e.vungle.error.bridgeExtError.BRX000)},i.notifyError=function(t){o&&o.push(\"mraidBridgeExt.notifyError:\"+t);try{r.mraidBridge.executeSDKCommand(\"error\",\"code\",t)}catch(n){\"VungleMRAIDBridgeException\"===n.name?e.console&&console.log(\"%cVungleMRAIDBridgeException caught in mraidBridgeExt.notifyError! Message: %s\",\"color: red; font-size: x-large\",e.vungle.error.bridgeError[n.message]):e.console&&console.log(\"%cUnknown Exception caught in mraidBridgeExt.notifyError! Message: %s\",\"color: red; font-size: x-large\",n.message)}},i.notifyTPAT=function(e){o&&o.push(\"mraidBridgeExt.notifyTPATEvent:\"+e);try{r.mraidBridge.executeSDKCommand(\"tpat\",\"event\",e)}catch(t){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.notifyTPAT\",t.message)}},i.notifyUserInteraction=function(e,t){o&&o.push(\"mraidBridgeExt.notifyUserInteraction\");try{r.mraidBridge.executeSDKCommand(\"action\",e,t)}catch(n){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.notifyUserInteraction\",n.message)}},i.notifyEventValuePairEvent=function(e,t){o&&o.push(\"mraidBridgeExt.notifyEventValuePairEvent\");var n=e||\"null\",i=t||\"null\";try{r.mraidBridge.executeSDKCommand(\"actionWithValue\",\"event\",n,\"value\",i)}catch(n){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.notifyEventValuePairEvent\",n.message)}},i.playHTML5Video=function(e){o&&o.push(\"mraidBridgeExt.playHTML5Video\");try{r.mraidBridge.executeSDKCommand(\"playHTML5Video\",\"selector\",e)}catch(t){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.playHTML5Video\",t.message)}},i.openPrivacy=function(e){o&&o.push(\"mraidBridgeExt.openPrivacy\");try{r.mraidBridge.executeSDKCommand(\"openPrivacy\",\"url\",e)}catch(t){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.openPrivacy\",t.message)}},i.requestMRAIDClose=function(){o&&o.push(\"mraidBridgeExt.requestMRAIDClose\");try{var e,t=\"windows\"===r.mraidExt.getOS()&&(0===r.mraidExt.getOSVersion().indexOf(\"WinPhone81\")||0===r.mraidExt.getOSVersion().indexOf(\"Win81\")),n=\"android\"===r.mraidExt.getOS()&&parseInt(r.mraidExt.getOSVersion(),10)<=17;t||n?(e=document.createEvent(\"Event\"),e.initEvent(\"vungle.events.request.close\",!0,!0)):e=new Event(\"vungle.events.request.close\"),c?document.querySelector(\"#dynamic\").dispatchEvent(e):r.mraidBridge.executeSDKCommand(\"close\")}catch(i){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.requestMRAIDClose\",i.message)}},i.notifySuccessfulViewAd=function(){o&&o.push(\"mraidBridgeExt.notifySuccessfulViewAd\");try{r.mraidBridge.executeSDKCommand(\"successfulView\")}catch(e){r.mraidBridge.notifyErrorEvent(\"mraidBridgeExt.notifySuccessfulViewAd\",e.message)}}}(window),function(e){\"use strict\";var t=e.vungle=e.vungle||{},r=e.mraid=t.mraid=t.mraid||{},n=t.mraidExt=t.mraidExt||{},i=t.debugLog=t.debugLog||[],o=t.mraidBridge.executeSDKCommand,s=t.mraidCore.broadcastEvent,a=t.mraidCore.propertiesHandlers,d=t.mraidCore.propertiesValidator,c=t.mraidCore.consts.states,u=t.mraidCore.consts.events,l=t.mraidCore.consts.placements;i&&i.push(\"vungle.mraid loaded.\"),r.addEventListener=function(e,r){e&&r?t.mraidCore.isValidMARIDEvent(e)?(t.mraidCore.eventListeners[e]||(t.mraidCore.eventListeners[e]=new t.mraidCore.EventListeners(e)),t.mraidCore.eventListeners[e].add(r)):s(u.ERROR,\"mraid.addEventListener\",t.error.mraidError.MRD000+\":\"+e):s(u.ERROR,\"mraid.addEventListener\",t.error.mraidError.MRD001)},r.removeEventListener=function(e,r){var n,i=!1;e?(n=t.mraidCore.eventListeners[e],r?(n&&(i=n.remove(r)),i||s(u.ERROR,\"mraid.removeEventListener\",t.error.mraidError.MRD002+\":\"+e)):n&&t.mraidCore.eventListeners.removeAll(),n&&0===n.count&&(t.mraidCore.eventListeners[e]=null,delete t.mraidCore.eventListeners[e])):s(u.ERROR,\"mraid.removeEventListener\",t.error.mraidError.MRD003)},n.getOS=function(){return a.os.clone()},n.getOSVersion=function(){return a.osVersion.clone()},n.getIncentivized=function(){return a.incentivized.clone()},r.getVersion=function(){return a.version.clone()},r.getMaxSize=function(){return a.maxSize.clone()},r.getScreenSize=function(){return a.screenSize.clone()},r.getDefaultPosition=function(){return a.defaultPosition.clone()},r.getCurrentPosition=function(){return a.currentPosition.clone()},r.getExpandProperties=function(){return a.expandProperties.clone()},r.getResizeProperties=function(){return a.resizeProperties.clone()},r.getOrientationProperties=function(){return a.orientationProperties.clone()},r.supports=function(e){return a.supports.clone()[e]},r.getState=function(){return a.state.clone()},r.getPlacementType=function(){return a.placementType.clone()},r.isViewable=function(){return a.isViewable.clone()},r.getViewable=r.isViewable,r.setExpandProperties=function(e){var r={};\"object\"==typeof e?(Object.keys(e).forEach(function(t,n,i){\"isModal\"!==t&&(r[t]=e[t])}),d(r,a.expandProperties.clone(),\"expandProperties\")&&a.expandProperties.update(r)):(s(u.ERROR,\"mraid.setExpandProperties\",t.error.mraidError.MRD004),t.mraidBridgeExt&&t.mraidBridgeExt.notifyError(\"MRD004\"))},r.setOrientationProperties=function(e){var r;\"object\"==typeof e?(r=[\"setOrientationProperties\",\"allowOrientationChange\",e.allowOrientationChange,\"forceOrientation\",e.forceOrientation],d(e,a.orientationProperties.clone(),\"orientationProperties\")&&(a.orientationProperties.update(e),o.apply(null,r))):(s(u.ERROR,\"mraid.setOrientationProperties\",t.error.mraidError.MRD005),t.mraidBridgeExt&&t.mraidBridgeExt.notifyError(\"MRD005\"))},r.setResizeProperties=function(e){\"object\"==typeof e?d(e,a.resizeProperties.clone(),\"resizeProperties\")&&a.resizeProperties.update(e):(s(u.ERROR,\"mraid.setResizeProperties\",t.error.mraidError.MRD006),t.mraidBridgeExt&&t.mraidBridgeExt.notifyError(\"MRD006\"))},r.useCustomClose=function(e){var t;d(e,a.customClose.clone(),\"useCustomClose\")&&d({useCustomClose:e},a.expandProperties.clone(),\"expandProperties\")&&(a.customClose.update(e),a.expandProperties.update({useCustomClose:e}),t=e===!0?\"invisible\":e===!1?\"visible\":void 0===e?\"gone\":\"\",o(\"useCustomClose\",\"sdkCloseButton\",t))},n.useCustomPrivacy=function(e){d(e,a.customPrivacy.clone(),\"useCustomPrivacy\")&&(a.customPrivacy.update(e),o(\"useCustomPrivacy\",\"useCustomPrivacy\",e))},r.open=function(e){e?o(\"open\",\"url\",encodeURI(e)):s(u.ERROR,\"mraid.open\",t.error.mraidError.MRD007)},r.close=function(){r.getState()!==c.HIDDEN?o(\"close\"):s(u.ERROR,\"mraid.close\",t.error.mraidError.MRD008)},r.playVideo=function(){var e=arguments&&arguments[0]?arguments[0]:\"\",n=arguments&&arguments[1]?arguments[1]:\"\";r.isViewable()?e.length>0?o(\"playVideo\",\"uri\",e,\"captionUrl\",n):s(u.ERROR,\"mraid.playVideo\",t.error.mraidError.MRD009):s(u.ERROR,\"mraid.playVideo\",t.error.mraidError.MRD010)},r.expand=function(e){var r=a.customClose.clone(),n=a.placementType.clone(),i=a.state.clone(),d=[\"expand\",\"useCustomClose\",r];n!==l.INLINE||i!==c.DEFAULT&&i!==c.RESIZED?s(u.ERROR,\"mraid.expand\",t.error.mraidError.MRD011):(e&&(arguments.push(\"url\"),arguments.push(encodeURI(e))),o.apply(null,d))},r.resize=function(){var e=a.resize.clone(),n=[\"resize\"],i=r.getState();i!==c.DEFAULT&&i!==c.RESIZED?(n.push(\"width\"),n.push(e.width),n.push(\"height\"),n.push(e.height),n.push(\"offsetX\"),n.push(e.offsetX),n.push(\"offsetY\"),n.push(e.offsetY),n.push(\"customClosePosition\"),n.push(e.customClosePosition),n.push(\"allowOffscreen\"),n.push(e.allowOffscreen),o.apply(null,n)):s(u.ERROR,\"mraid.resize\",t.error.mraidError.MRD012)},r.createCalendarEvent=function(){},r.storePicture=function(e){r.isViewable()?e?s(u.ERROR,\"mraid.storePicture\",t.error.mraidError.MRD013):o(\"storePicture\",\"uri\",e):s(u.ERROR,\"mraid.storePicture\",t.error.mraidError.MRD010)}}(window);";
    }
}
