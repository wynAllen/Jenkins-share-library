# Jenkins-share-library
目标：让devops流程更好用

- 项目更简便的接入
- devops流程更方便维护

思路：把各项目中公用的逻辑，抽象成方法，放到独立的library项目中，在各项目中引入shared-library项目，调用library提供的方法。

- 镜像构建、推送
- k8s服务部署、监控
- 钉钉消息推送
- 代码扫描
- robot集成测试
