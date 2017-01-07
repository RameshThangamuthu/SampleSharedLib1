
package com.aricent;


def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}


class Utilities implements Serializable {
  static def mvn(script, args) {
    script.sh "${script.tool 'Maven'}/bin/mvn -s ${script.env.HOME}/jenkins.xml -o ${args}"
  }
  
  static def shellExecute(script, args) {
    script.sh "${args}"
  }
}