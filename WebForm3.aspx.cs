using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Demo1
{
    public partial class WebForm3 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            //TextBox1.Text = "";
            //if (!IsPostBack)
            //{
            //    TextBox1.Text = "第一次";
            //}
        }

        protected void Button1_Click(object sender, EventArgs e)
        {

        }

        protected void Button1_Click1(object sender, EventArgs e)
        {
            string str = "<span style='color:red'>我是一个span</span>";
            str = Server.HtmlEncode(str);
            Response.Write(str);
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            string str = "&lt;span style=&#39;color:red&#39;&gt;我是一个span&lt;/span&gt;";
            str = Server.HtmlDecode(str);
            Response.Write(str);
        }

        protected void btnURLEnCode_Click(object sender, EventArgs e)
        {
            string str = "main?userName=张三";
            str = Server.UrlEncode(str);
            Response.Write(str);
        }

        protected void btnURLDeCode_Click(object sender, EventArgs e)
        {
            string str = "main%3fuserName%3d%e5%bc%a0%e4%b8%89";
            str = Server.UrlDecode(str);
            Response.Write(str);
        }
    }
}