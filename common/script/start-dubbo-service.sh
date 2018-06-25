#!/bin/sh

#env
APP_HOME=/dubbo-service
APP_NAME="yc.common"
APP_PARM="aiopt.product.name=${APP_NAME}"

for file in ${APP_HOME}/libs/**/*.jar;
do CP=${CP}:$file;
done

DUBBO_CONFIG_PATH=${APP_HOME}/config
LOG_PATH=${APP_HOME}/logs/dubbo-service-${REST_PORT}.log
CLASSPATH="${CP}"
CLASSPATH="${DUBBO_CONFIG_PATH}:${CLASSPATH}"
export CLASSPATH

MEM_ARGS="-Xms256m -Xmx512m -XX:PermSize=64M -XX:MaxPermSize=128M"
JAVA_OPTIONS="-Duser.timezone=GMT -Dfile.encoding=UTF-8 -Djava.net.preferIPv4Stack=true -Dsun.net.inetaddr.ttl=10 -Ddubbo.provider.timeout=20000 -Djava.security.egd=file:/dev/./urandom"

echo "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
START_CMD="${MEM_ARGS} -D${APP_PARM}  ${JAVA_OPTIONS} com.x.sdk.appserver.DubboServiceStart  >> $LOG_PATH & 2 > 1 &"

echo ${JAVA_HOME}
echo ${CLASSPATH}
echo ${DUBBO_PORT}
echo ${START_CMD}

sed -i "s%paas.auth.url=.*%paas.auth.url=${PAAS_AUTH_URL}%g" ${APP_HOME}/config/paas/paas-conf.properties
sed -i "s%paas.auth.pid=.*%paas.auth.pid=${PAAS_AUTH_PID}%g" ${APP_HOME}/config/paas/paas-conf.properties
sed -i "s%paas.ccs.serviceid=.*%paas.ccs.serviceid=${PAAS_CCS_ID}%g" ${APP_HOME}/config/paas/paas-conf.properties
sed -i "s%paas.ccs.servicepassword=.*%paas.ccs.servicepassword=${PAAS_CCS_PWD}%g" ${APP_HOME}/config/paas/paas-conf.properties

sed -i "s%paas.sdk.mode=.*%paas.sdk.mode=${SDK_MODE}%g" ${APP_HOME}/config/paas/paas-conf.properties
sed -i "s%ccs.appname=.*%ccs.appname=${CCS_NAME}%g" ${APP_HOME}/config/paas/paas-conf.properties
sed -i "s%ccs.zk_address=.*%ccs.zk_address=${ZK_ADDR}%g" ${APP_HOME}/config/paas/paas-conf.properties

sed -i "s%srvarea.all=.*%srvarea.all=${SRVAREA_ALL}%g" ${APP_HOME}/config/paas/paas-conf.properties
sed -i "s%srvarea.curr=.*%srvarea.curr=${SRVAREA_CURR}%g" ${APP_HOME}/config/paas/paas-conf.properties

sed -i "s%dubbo.registry.address=.*%dubbo.registry.address=${REST_REGISTRY_ADDR}%g" ${APP_HOME}/config/dubbo/dubbo.properties
sed -i "s%general.common.dubbo.port=.*%general.common.dubbo.port=${REST_PORT}%g" ${APP_HOME}/config/dubbo/dubbo.properties
sed -i "s%dubbo.protocol.contextpath=.*%dubbo.protocol.contextpath=${CONTEXT_PATH}%g" ${APP_HOME}/config/dubbo/dubbo.properties

#email-conf.properties
sed -i "s%email.hostname=.*%email.hostname=${EMAIL_HOSTNAME}%g" ./email/email-conf.properties
sed -i "s%email.smtpport=.*%email.smtpport=${EMAIL_SMTPPORT}%g" ./email/email-conf.properties
sed -i "s%email.from.mail=.*%email.from.mail=${EMAIL_FROM_MAIL}%g" ./email/email-conf.properties
sed -i "s%email.from.name=.*%email.from.name=${EMAIL_FROM_NAME}%g" ./email/email-conf.properties
sed -i "s%email.from.user=.*%email.from.user=${EMAIL_FROM_USER}%g" ./email/email-conf.properties
sed -i "s%email.from.password=.*%email.from.password=${EMAIL_FROM_PASSWORD}%g" ./email/email-conf.properties

echo "-------------------${APP_NAME} dubbo service start --------------------"
java ${START_CMD}
echo "${APP_NAME} dubbo server started!! logs at $LOG_PATH"

