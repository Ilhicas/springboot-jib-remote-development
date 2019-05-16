# springboot-jib-remote-development

This project shows how to use Intellij alongside with Jib and Springboot to allow for remote development against a docker container.

It comes with the profiles to directly access via Intellij.

# Getting Started

```
mvn compile jib:dockerBuild
docker-compose up -d
```