#!/bin/sh
# jarファイルのパスは環境に応じて変更
JAR_FILE="target/batch-with-spring-di-container-1.0-SNAPSHOT-jar-with-dependencies.jar"

java -jar ${JAR_FILE} sampleBatch
RC=$?
if [[ ${RC} -ne 0 ]]; then
  echo "Failed to execute java program. Return code: ${RC}"
  exit 1
fi

exit 0