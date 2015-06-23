#!/bin/bash

# avoid virtual desktop jumps at mac terminal on test run
export JAVA_TOOL_OPTIONS='-Djava.awt.headless=true'

./gradlew :app:testDebug \
          :app:jacocoTestReport

echo "test reports: $(pwd)/build/index.html"