workflow "run maven build on pull request" {
  on = "pull_request"
  resolves = ["GitHub Action for Maven"]
}

action "GitHub Action for Maven" {
  uses = "xlui/action-maven-cli/jdk8@master"
  args = "clean package"
}
