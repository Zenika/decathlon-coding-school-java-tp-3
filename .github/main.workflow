workflow "Build on direct push" {
  on = "push"
  resolves = ["GitHub Action for Maven"]
}

action "GitHub Action for Maven" {
  uses = "LucaFeger/action-maven-cli@aed8a1fd96b459b9a0be4b42a5863843cc70724e"
  runs = "mvn clean package"
}

workflow "run maven build on pull request" {
  on = "pull_request"
  resolves = ["GitHub Action for Maven"]
}

action "GitHub Action for Maven" {
  uses = "xlui/action-maven-cli/jdk8@master"
  args = "clean package"
}
