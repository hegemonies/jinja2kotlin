package ru.hegemonies.lexer

internal class Jinja2KotlinLexerTest {

    private val jinja2Template = """
        hostname {{ hostname }}

        no ip domain lookup
        ip domain name local.lab
        ip name-server {{ name_server_pri }}
        ip name-server {{ name_server_sec }}

        ntp server {{ ntp_server_pri }} prefer
        ntp server {{ ntp_server_sec }}
    """.trimIndent()

    private val jinja2TemplateData = """
        {
            "hostname": "core-sw-waw-01",
            "name_server_pri": "1.1.1.1",
            "name_server_sec": "8.8.8.8",
            "ntp_server_pri": "0.pool.ntp.org",
            "ntp_server_sec": "1.pool.ntp.org",
        }
    """.trimIndent()

    private val expectedRender = """
        hostname core-sw-waw-01

        no ip domain lookup
        ip domain name local.lab
        ip name-server 1.1.1.1
        ip name-server 8.8.8.8

        ntp server 0.pool.ntp.org prefer
        ntp server 1.pool.ntp.org
    """.trimIndent()
}
