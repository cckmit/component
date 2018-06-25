define("arale-select/0.11.1/index",["arale-overlay/1.2.0/overlay","jquery","position/1.1.0/index","arale-iframe-shim/1.1.0/index","arale-widget/1.2.0/widget","arale-base/1.2.0/base","arale-class/1.2.0/class","arale-events/1.2.0/events","arale-templatable/0.10.0/src/templatable","handlebars/1.3.0/dist/cjs/handlebars","handlebars-runtime/1.3.0/dist/cjs/handlebars.runtime"],function(e,t,s){s.exports=e("arale-select/0.11.1/src/select")}),define("arale-select/0.11.1/src/select",["arale-overlay/1.2.0/overlay","jquery","position/1.1.0/index","arale-iframe-shim/1.1.0/index","arale-widget/1.2.0/widget","arale-base/1.2.0/base","arale-class/1.2.0/class","arale-events/1.2.0/events","arale-templatable/0.10.0/src/templatable","handlebars/1.3.0/dist/cjs/handlebars","handlebars-runtime/1.3.0/dist/cjs/handlebars.runtime"],function(e,t,s){function i(e,t){var s,i=[],a=e.options,r=a.length,l=!1;for(s=0;r>s;s++){var n,o={},d=a[s],h=["text","value","defaultSelected","selected","disabled"];for(n in h){var c=h[n];o[c]=d[c]}d.selected&&(l=!0),i.push(o)}return!l&&i.length&&(i[0].selected="true"),{options:i,classPrefix:t}}function a(e,t){var s,i,a,r,l=[],n=[];for(s=0,a=e.length;a>s;s++){var o=h.extend({},e[s]);o.selected&&n.push(s),o.selected=o.defaultSelected=!!o.selected,o.disabled=!!o.disabled,l.push(o)}if(n.length>0)for(n.pop(),i=0,r=n.length;r>i;i++)l[n[i]].selected=!1;else l[0].selected=!0;return{options:l,classPrefix:t}}function r(e,t){var s;return s=h.isNumeric(e)?e:t.index("string"==typeof e?t.parent().find(e):e)}function l(e,t){if(e&&e[0]&&(e=e[0],"select"===e.tagName.toLowerCase())){h(e).find("option").remove();for(var s in t){var i=t[s],a=document.createElement("option");a.text=i.text,a.value=i.value,e.add(a)}}}function n(e,t){return e?e+"-"+t:""}function o(e){var t=0;return e.find("li").each(function(e,s){t+=h(s).outerHeight()}),t}var d=e("arale-overlay/1.2.0/overlay"),h=e("jquery"),c=e("arale-templatable/0.10.0/src/templatable"),g=e("arale-select/0.11.1/src/select.handlebars"),u=d.extend({Implements:c,attrs:{trigger:{value:null,getter:function(e){return h(e).eq(0)}},classPrefix:"ui-select",template:g,align:{baseXY:[0,"100%-1px"]},triggerTpl:'<a href="#"></a>',name:"",value:"",length:0,selectedIndex:-1,multiple:!1,disabled:!1,maxHeight:null,selectSource:null},events:{click:function(e){e.stopPropagation()},"click [data-role=item]":function(e){var t=h(e.currentTarget);t.data("disabled")||this.select(t)},"mouseenter [data-role=item]":function(e){var t=h(e.currentTarget);t.data("disabled")||t.addClass(n(this.get("classPrefix"),"hover"))},"mouseleave [data-role=item]":function(e){var t=h(e.currentTarget);t.data("disabled")||t.removeClass(n(this.get("classPrefix"),"hover"))}},templateHelpers:{toString:function(e){return e+""}},initAttrs:function(e,t){u.superclass.initAttrs.call(this,e,t);var s,r=this.get("trigger");if(r.addClass(n(this.get("classPrefix"),"trigger")),"select"===r[0].tagName.toLowerCase()){s=r.attr("name"),s&&this.set("name",s),this.set("selectSource",r);var l=h(this.get("triggerTpl")).addClass(n(this.get("classPrefix"),"trigger"));this.set("trigger",l),this._initFromSelect=!0,r.after(l).css({position:"absolute",left:"-99999px",zIndex:-100}),this.set("model",i(r[0],this.get("classPrefix")))}else{if(s=this.get("name")){var o=h('input[name="'+s+'"]').eq(0);o[0]||(o=h('<input type="text" tabindex="-1" id="select-'+s.replace(/\./g,"-")+'" name="'+s+'" />').css({position:"absolute",left:"-99999px",zIndex:-100}).insertAfter(r)),this.set("selectSource",o)}this.set("model",a(this.get("model"),this.get("classPrefix")))}},setup:function(){this._bindEvents(),this._initOptions(),this._initHeight(),this._tweakAlignDefaultValue(),this._blurHide(this.get("trigger")),u.superclass.setup.call(this)},render:function(){return u.superclass.render.call(this),this._setTriggerWidth(),this},destroy:function(){this._initFromSelect&&this.get("trigger").remove(),this.get("selectSource")&&this.get("selectSource").remove(),this.element.remove(),u.superclass.destroy.call(this)},select:function(e){var t=r(e,this.options),s=this.get("selectedIndex");this.set("selectedIndex",t);var i=this.get("model");if(s>=0&&(i.options[s].selected=!1),t>=0&&(i.options[t].selected=!0),this.set("model",i),s!==t){var a=this.options.eq(t),l=this.options.eq(s);this.trigger("change",a,l)}return this.hide(),this},syncModel:function(e){this.set("model",a(e,this.get("classPrefix"))),this.renderPartial("[data-role=content]"),l(this.get("selectSource"),e),this.options=this.$("[data-role=content]").children(),this.set("length",this.options.length),this.set("selectedIndex",-1),this.set("value","");{var t=r("[data-selected=true]",this.options);this.get("selectedIndex")}return this.set("selectedIndex",t),this._setTriggerWidth(),this},getOption:function(e){var t=r(e,this.options);return this.options.eq(t)},addOption:function(e){var t=this.get("model").options;return t.push(e),this.syncModel(t),this},removeOption:function(e){var t=r(e,this.options),s=this.get("selectedIndex"),i=this.options.eq(t);return i.remove(),this.options=this.$("[data-role=content]").children(),this.set("length",this.options.length),t===s?this.set("selectedIndex",0):s>t&&this.set("selectedIndex",s-1),this},enableOption:function(e){var t=r(e,this.options),s=this.get("model").options;return s[t].disabled=!1,this.syncModel(s),this},disableOption:function(e){var t=r(e,this.options),s=this.get("model").options;return s[t].disabled=!0,this.syncModel(s),this},_onRenderSelectedIndex:function(e){if(-1!==e){var t=this.options.eq(e),s=this.currentItem,i=t.attr("data-value");if(!s||t[0]!==s[0]){var a=this.get("selectSource");a&&("select"===a[0].tagName.toLowerCase()?a[0].selectedIndex=e:a[0].value=i),s&&s.attr("data-selected","false").removeClass(n(this.get("classPrefix"),"selected")),t.attr("data-selected","true").addClass(n(this.get("classPrefix"),"selected")),this.set("value",i);var r=this.get("trigger"),l=r.find("[data-role=trigger-content]");l.length?l.html(t.html()):r.html(t.html()),this.currentItem=t}}},_onRenderDisabled:function(e){var t=n(this.get("classPrefix"),"disabled"),s=this.get("trigger");s[e?"addClass":"removeClass"](t);var i=this.options.eq(this.get("selectedIndex"));this.trigger("disabledChange",i,e)},_bindEvents:function(){var e=this.get("trigger");this.delegateEvents(e,"mousedown",this._triggerHandle),this.delegateEvents(e,"click",function(e){e.preventDefault()}),this.delegateEvents(e,"mouseenter",function(){e.addClass(n(this.get("classPrefix"),"trigger-hover"))}),this.delegateEvents(e,"mouseleave",function(){e.removeClass(n(this.get("classPrefix"),"trigger-hover"))})},_initOptions:function(){this.options=this.$("[data-role=content]").children(),this.select("[data-selected=true]"),this.set("length",this.options.length)},_setTriggerWidth:function(){var e=this.get("trigger"),t=this.element.outerWidth(),s=parseInt(e.css("padding-left"),10),i=parseInt(e.css("padding-right"),10),a=parseInt(e.css("border-left-width"),10)||0,r=parseInt(e.css("border-right-width"),10)||0;e.css("width",t-s-i-a-r)},_tweakAlignDefaultValue:function(){var e=this.get("align");"VIEWPORT"===e.baseElement._id&&(e.baseElement=this.get("trigger")),this.set("align",e)},_triggerHandle:function(e){e.preventDefault(),this.get("disabled")||(this.get("visible")?this.hide():this.show())},_initHeight:function(){this.after("show",function(){var e=this.get("maxHeight");if(e){var t=this.$("[data-role=content]"),s=o(t);this.set("height",s>e?e:""),t.scrollTop(0)}})}});s.exports=u}),define("arale-select/0.11.1/src/select.handlebars",["handlebars-runtime/1.3.0/dist/cjs/handlebars.runtime"],function(e,t,s){var i=e("handlebars-runtime/1.3.0/dist/cjs/handlebars.runtime")["default"];s.exports=i.template(function(e,t,s,i,a){function r(e,t,i){var a,r,n="";return n+='\n        <li data-role="item"\n          class="'+c((a=i&&i.classPrefix,typeof a===h?a.apply(e):a))+"-item ",a=s["if"].call(e,e&&e.disabled,{hash:{},inverse:g.noop,fn:g.programWithDepth(2,l,t,i),data:t}),(a||0===a)&&(n+=a),n+='"\n          data-value="',(r=s.value)?a=r.call(e,{hash:{},data:t}):(r=e&&e.value,a=typeof r===h?r.call(e,{hash:{},data:t}):r),n+=c(a)+'"\n          data-defaultSelected="'+c(s.toString.call(e,e&&e.defaultSelected,{hash:{},data:t}))+'"\n          data-selected="'+c(s.toString.call(e,e&&e.selected,{hash:{},data:t}))+'"\n          data-disabled="'+c(s.toString.call(e,e&&e.disabled,{hash:{},data:t}))+'">',(r=s.text)?a=r.call(e,{hash:{},data:t}):(r=e&&e.text,a=typeof r===h?r.call(e,{hash:{},data:t}):r),(a||0===a)&&(n+=a),n+="</li>\n        "}function l(e,t,s){var i,a="";return a+=c((i=s&&s.classPrefix,typeof i===h?i.apply(e):i))+"-item-disabled"}this.compilerInfo=[4,">= 1.0.0"],s=this.merge(s,e.helpers),a=a||{};var n,o,d="",h="function",c=this.escapeExpression,g=this;return d+='<div class="',(o=s.classPrefix)?n=o.call(t,{hash:{},data:a}):(o=t&&t.classPrefix,n=typeof o===h?o.call(t,{hash:{},data:a}):o),d+=c(n)+'">\n    <ul class="',(o=s.classPrefix)?n=o.call(t,{hash:{},data:a}):(o=t&&t.classPrefix,n=typeof o===h?o.call(t,{hash:{},data:a}):o),d+=c(n)+'-content" data-role="content">\n        ',n=s.each.call(t,t&&t.options,{hash:{},inverse:g.noop,fn:g.programWithDepth(1,r,a,t),data:a}),(n||0===n)&&(d+=n),d+="\n    </ul>\n</div>\n"})});