rm -rf src/main/kotlin/com/nivalit/invoiceninja/apis src/main/kotlin/com/nivalit/invoiceninja/models  src/main/kotlin/com/nivalit/invoiceninja/infrastructure
openapi-generator-cli generate -i ./doc/api-docs.yaml -g kotlin --additional-properties=artifactId=invoiceninja-java-client,groupId=com.nivalit.invoiceninja,packageName=com.nivalit.invoiceninja,apiSuffix=ApiAdapter
./gradlew clean build