package com.testapp

import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_ADMIN')
class PublicController {

    def index = {}

}
