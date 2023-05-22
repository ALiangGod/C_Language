<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm3.aspx.cs" Inherits="Demo1.WebForm3" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <%--<asp:Button ID="Button1" runat="server" Text="设置" OnClick="Button1_Click" /><asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>--%>
        <asp:Button ID="Button1" runat="server" Text="编码" OnClick="Button1_Click1" />
        <asp:Button ID="Button2" runat="server" Text="解码" OnClick="Button2_Click"/>
        <asp:Button ID="btnURLEnCode" runat="server" Text="URL编码" OnClick="btnURLEnCode_Click" />
        <asp:Button ID="btnURLDeCode" runat="server" Text="URL解码" OnClick="btnURLDeCode_Click" />
    </div>
    </form>
</body>
</html>
