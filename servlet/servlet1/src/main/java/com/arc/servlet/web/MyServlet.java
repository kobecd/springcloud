package com.arc.servlet.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 在SpringBoot中通过代码注册的方式来注册Servlet
 * @author chengxi
 */
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-----------doGet----------------");
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-----------doPost----------------");
//        String html = "";

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n" +
                "<!DOCTYPE html>\n" +
                "<html lang=\"zh\">\n" +
                "    <head>\n" +
                "        <meta charset=\"utf-8\">\n" +
                "        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\"/>\n" +
                "        <meta name=\"application-name\" content=\"JIRA\" data-name=\"jira\" data-version=\"7.13.0\">\n" +
                "        <meta name=\"ajs-server-scheme\" content=\"http\">\n" +
                "        <meta name=\"ajs-server-port\" content=\"80\">\n" +
                "        <meta name=\"ajs-server-name\" content=\"10.10.10.107\">\n" +
                "        <meta name=\"ajs-behind-proxy\" content=\"null\">\n" +
                "        <meta name=\"ajs-base-url\" content=\"http://localhost:8080\">\n" +
                "        <meta name=\"ajs-hasCriteriaAutoUpdate\" content=\"true\">\n" +
                "        <meta name=\"ajs-viewissue-use-history-api\" content=\"false\">\n" +
                "        <meta name=\"ajs-viewissue-max-cache-size\" content=\"\">\n" +
                "        <meta name=\"ajs-autocomplete-enabled\" content=\"true\">\n" +
                "        <meta name=\"ajs-view-issue-trace-key\" content=\"jira.issue.refreshed\">\n" +
                "        <meta name=\"ajs-view-issue-psycho-key\" content=\"jira.psycho.issue.refreshed\">\n" +
                "                    class=\"aui-nav-link aui-dropdown2-trigger aui-dropdown2-trigger-arrowless\"\n" +
                "               aria-haspopup=\"true\" aria-owns=\"system-admin-menu-content\" title=\"管理\">\n" +
                "                                        <span class=\"aui-icon aui-icon-small aui-iconfont-configure\">管理</span>\n" +
                "                                    </a>\n" +
                "                                    <div id=\"system-admin-menu-content\" class=\"aui-dropdown2 aui-style-default\">\n" +
                "                                        <div class=\"aui-dropdown2-section\">\n" +
                "                                            <strong>Jira管理</strong>\n" +
                "                                            <ul class=\"aui-list-truncate\">\n" +
                "                                                <li>\n" +
                "                                                    <a href=\"/plugins/servlet/applications/versions-licenses\" class=\"aui-nav-link\" id=\"admin_applications_menu\" >应用程序</a>\n" +
                "                                                </li>\n" +
                "                                                <li>\n" +
                "                                                    <a href=\"/secure/project/BrowseProjects.jspa?s=view_projects\" class=\"aui-nav-link\" id=\"admin_project_menu\" >项目</a>\n" +
                "                                                </li>\n" +
                "                                                <li>\n" +
                "                                                    <a href=\"/secure/admin/ViewIssueTypes.jspa\" class=\"aui-nav-link\" id=\"admin_issues_menu\" >问题</a>\n" +
                "                                                </li>\n" +
                "                                                <li>\n" +
                "                                                    <a href=\"/plugins/servlet/upm/marketplace\" class=\"aui-nav-link\" id=\"admin_plugins_menu\" >插件</a>\n" +
                "                                                </li>\n" +
                "                                                <li>\n" +
                "                                                    <a href=\"/secure/admin/user/UserBrowser.jspa\" class=\"aui-nav-link\" id=\"admin_users_menu\" >用户管理</a>\n" +
                "                                                </li>\n" +
                "                                                <li>\n" +
                "                                                    <a href=\"/secure/PostUpgradeLandingPage.jspa\" class=\"aui-nav-link\" id=\"admin_pulp_menu\" >最新升级报告</a>\n" +
                "                                                </li>\n" +
                "                                                <li>\n" +
                "                                                    <a href=\"/secure/admin/ViewApplicationProperties.jspa\" class=\"aui-nav-link\" id=\"admin_system_menu\" >系统</a>\n" +
                "                                                </li>\n" +
                "                                                <li>\n" +
                "                                                    <a href=\"/secure/admin/StructureAdmin!view.jspa\" class=\"aui-nav-link\" id=\"structure-admin\" >Structure</a>\n" +
                "                                                </li>\n" +
                "                                            </ul>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                                <li id=\"user-options\">\n" +
                "                                    <a id=\"header-details-user-fullname\" class=\"aui-dropdown2-trigger aui-dropdown2-trigger-arrowless\" aria-haspopup=\"true\" aria-owns=\"user-options-content\" data-username=\"admin\" data-displayname=\"huangpeng\" href=\"/secure/ViewProfile.jspa\" title=\"huangpeng的个人信息\">\n" +
                "                                        <span class=\"aui-avatar aui-avatar-small\">\n" +
                "                                            <span class=\"aui-avatar-inner\">\n" +
                "                                                <img src=\"http://10.10.10.107/secure/useravatar?size=small&avatarId=10346\" alt=\"huangpeng的个人信息\"/>\n" +
                "                                            </span>\n" +
                "                                        </span>\n" +
                "                                    </a>\n" +
                "                                    <div id=\"user-options-content\" class=\"aui-dropdown2 aui-style-default\">\n" +
                "                                        <div class=\"aui-dropdown2-section\">\n" +
                "                                            <ul id=\"personal\" class=\"aui-list-truncate\">\n" +
                "                                                <li>\n" +
                "                                                    <a  id=\"view_profile\"   class=\"\"  title=\"查看和修改您的详细情况和配置\" href=\"/secure/ViewProfile.jspa\">用户信息</a>\n" +
                "                                                </li>\n" +
                "                                                <li>\n" +
                "                                                    <a  id=\"upm-requests-link\"   class=\"\"   href=\"/plugins/servlet/upm/requests?source=header_user\">Atlassian Marketplace</a>\n" +
                "                                                </li>\n" +
                "                                            </ul>\n" +
                "                                        </div>\n" +
                "                                        <div class=\"aui-dropdown2-section\">\n" +
                "                                            <strong>我的Jira主页</strong>\n" +
                "                                            <ul id=\"set_my_jira_home\" class=\"aui-list-truncate\">\n" +
                "                                                <li>\n" +
                "                                                    <a  id=\"set_my_jira_home_default\"  class=\"aui-dropdown2-radio interactive    \" title=\"将我的Jira主页设置到此仪表板。\" href=\"/secure/UpdateMyJiraHome.jspa?target=com.atlassian.jira.jira-my-home-plugin%3Aset_my_jira_home_dashboard&atl_token=B8KD-EGXA-CCHP-GYAQ_565123d5b699a81814ec2aae6b50fdc1ca245885_lin\">仪表板</a>\n" +
                "                                                </li>\n" +
                "                                                <li>\n" +
                "                                                    <a  id=\"greenhopper-my-jira-home-set\"  class=\"aui-dropdown2-radio interactive    \" title=\"将我的 Jira 主页设置到面板。\" href=\"/secure/UpdateMyJiraHome.jspa?target=com.pyxis.greenhopper.jira%3Agreenhopper-my-jira-home-set-51&atl_token=B8KD-EGXA-CCHP-GYAQ_565123d5b699a81814ec2aae6b50fdc1ca245885_lin\">面板</a>\n" +
                "                                                </li>\n" +
                "                                                <li>\n" +
                "                                                    <a  id=\"set_my_jira_home_issuenav\"  class=\"aui-dropdown2-radio interactive checked    \" title=\"设置我的Jira主页到问题导航器。\" href=\"/secure/UpdateMyJiraHome.jspa?target=com.atlassian.jira.jira-my-home-plugin%3Aset_my_jira_home_issue&atl_token=B8KD-EGXA-CCHP-GYAQ_565123d5b699a81814ec2aae6b50fdc1ca245885_lin\">问题导航器</a>\n" +
                "                                                </li>\n" +
                "                                            </ul>\n" +
                "                                        </div>\n" +
                "                                        <div class=\"aui-dropdown2-section\">\n" +
                "                                            <ul id=\"system\" class=\"aui-list-truncate\">\n" +
                "                                                <li>\n" +
                "                                                    <a  id=\"log_out\"   class=\"\"  title=\"注销身份并且取消任何自动登录。\" href=\"/logout?atl_token=B8KD-EGXA-CCHP-GYAQ_565123d5b699a81814ec2aae6b50fdc1ca245885_lin\">注销</a>\n" +
                "                                                </li>\n" +
                "                                            </ul>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                            </ul>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                    <!-- .aui-header-inner-->\n" +
                "                </nav>\n" +
                "                <!-- .aui-header -->\n" +
                "    \n" +
                "            </header>\n" +
                "            <section id=\"content\" role=\"main\">\n" +
                "                <div class=\"navigator-container \">\n" +
                "            </fieldset>\n" +
                "        </form>\n" +
                "        <!--\n" +
                "\t                 REQUEST ID : 48x135x1\n" +
                "\t          REQUEST TIMESTAMP : [17/十二月/2018:00:48:55 +0800]\n" +
                "\t               REQUEST TIME : 0.2320\n" +
                "\t                 ASESSIONID : x1ndx\n" +
                "\t        CONCURRENT REQUESTS : 1\n" +
                "\n" +
                "\t             issue.index.reads : OpSnapshot{name='issue.index.reads', invocationCount=2, elapsedTotal=1197584, elapsedMin=24726, elapsedMax=1172858, resultSetSize=0, cpuTotal=0, cpuMin=0, cpuMax=0}\n" +
                "\t                      db.reads : OpSnapshot{name='db.reads', invocationCount=16, elapsedTotal=4225832, elapsedMin=166085, elapsedMax=359228, resultSetSize=0, cpuTotal=0, cpuMin=0, cpuMax=0}\n" +
                "\t                     db.writes : OpSnapshot{name='db.writes', invocationCount=4, elapsedTotal=7505541, elapsedMin=1679976, elapsedMax=2009346, resultSetSize=0, cpuTotal=0, cpuMin=0, cpuMax=0}\n" +
                "\t                      db.conns : OpSnapshot{name='db.conns', invocationCount=38, elapsedTotal=69439318, elapsedMin=195010, elapsedMax=9533083, resultSetSize=0, cpuTotal=0, cpuMin=0, cpuMax=0}\n" +
                "-->\n" +
                "\n" +
                "\n" +
                "    </body>\n" +
                "</html>");
        resp.getWriter().print(stringBuffer.toString());
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}