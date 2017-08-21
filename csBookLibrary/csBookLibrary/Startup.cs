using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(csBookLibrary.Startup))]
namespace csBookLibrary
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
