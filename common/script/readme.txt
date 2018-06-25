1.编译打包
#一定要先clean
gradle clean
#然后再打包
gradle build -x test
2.生成镜像
#在本地生成带私服前缀的镜像
docker build -t 10.19.13.20:5000/common:v1.0 .   (每次打镜像前版本号要更新)
#将镜像推送到私服
docker push 10.19.13.20:5000/common:v1.0

3. 运行镜像
#--net=host  表示为主机(host)模式  去掉该配置，默认为桥接(bridge)模式
#-e 代表需要设置的环境变量
docker run -d --name common -p 10881:10881 \
-e "REST_REGISTRY_ADDR=10.19.13.23:29181" \
-e "REST_PORT=10881" \
-e "CONTEXT_PATH=common" \
-e "SDK_MODE=0" \
-e "PAAS_AUTH_URL=http://10.1.245.4:19811/service-portal-uac-web/service/auth" \
-e "PAAS_AUTH_PID=D14F7D708109471AB6F3084B2ABAE9A6" \
-e "PAAS_CCS_ID=CCS007" \
-e "PAAS_CCS_PWD=123456" \
-e "SRVAREA_ALL=cn.hb,us.ea"  \
-e "SRVAREA_CURR=cn.hb"  \
-e "EMAIL_HOSTNAME=mail.yourcompany.com" \
-e "EMAIL_SMTPPORT=25" \
-e "EMAIL_FROM_MAIL=x-common@yourcompany.com" \
-e "EMAIL_FROM_NAME=译云" \
-e "EMAIL_FROM_USER=x-common@yourcompany.com" \
-e "EMAIL_FROM_PASSWORD=1q2w3e4r@" \
10.19.13.20:5000/common:v1.0_7 
#查看镜像启动日志
docker logs common
#进入容器，查看镜像内部的情况
docker exec -it common /bin/bash
#删除运行的容器
docker rm -fv common

#=============更新日志========================#
*2016-09-23
1）初始版本


