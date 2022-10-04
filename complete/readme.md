### 版本约定
- SpringBoot 2.7.1
- spring native 0.12.1 
- paketobuildpacks/builder:0.1.253-tiny
- paketobuildpacks/run:1.3.72-tiny-cnb

### 三种构建方式,分别对应三个maven profile
#### profile:github
采用GitHub Action构建并将镜像推送到docker hub

#### profile:internal
内网构建,使用本地的docker registry,内网下载jdk和syft,目前地址http://host.docker.internal/指向宿主机,具体可参照本地构建

#### profile:local
本地构建,步骤如下
1. 避免每次到docker.io查找镜像,可使用本地registry
    - 启动registry `docker run -d -p 5000:5000 -v /opt/data/registry:/tmp/registry registry`
    - 标记builder `docker tag paketobuildpacks/builder:0.1.253-tiny localhost:5000/paketobuildpacks/builder:0.1.253-tiny`
    - 推送builder `docker push localhost:5000/paketobuildpacks/builder:0.1.253-tiny`
    - 标记run `docker tag paketobuildpacks/run:1.3.72-tiny-cnb localhost:5000/paketobuildpacks/run:1.3.72-tiny-cnb`
    - 推送run `docker push localhost:5000/paketobuildpacks/run:1.3.72-tiny-cnb`
   
2. 本地挂载jdk和syft`https://download.bell-sw.com/vm/22.2.0/bellsoft-liberica-vm-core-openjdk11.0.16.1+1-22.2.0+3-linux-amd64.tar.gz`和`https://github.com/anchore/syft/releases/download/v0.55.0/syft_0.55.0_linux_amd64.tar.gz`
   - ${basedir}/bindings/local-file挂载到/platform/bindings/local-file

### 容器测试
0. 运行容器 `docker run -d -p 8080:8080 rest-service-complete:lastest`
1. 普通HTTP请求 `curl http://localhost:8080/greeting?name=ypq` 
2. H2数据库测试 `curl http://localhost:8080/increaseAndGetAge?userId=1`
3. Jpa方式访问数据库  `curl http://localhost:8080/findById?userId=3`