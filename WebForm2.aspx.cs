using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Demo1
{
    public partial class WebForm2 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btn(object sender, EventArgs e)
        {
            string name = TextBox1.Text;
            string msg = "";
            switch (DateTime.Now.Hour)
            {
                case 20:
                    msg = "吃饭";
                    break;
            }
            msg = name + msg;
            Label1.Text = msg;
        }
    }
}