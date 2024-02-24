package netscape.javascript;

import app.Class14;
import app.appletviewer;
import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jagexappletviewer!netscape/javascript/JSObjec_")
public class JSObjec_ {

	@OriginalMember(owner = "jagexappletviewer!netscape/javascript/JSObjec_", name = "eval", descriptor = "(Ljava/lang/String;)Ljava/lang/Object;")
	public Object eval(@OriginalArg(0) String arg0) {
		System.out.println(arg0);
		return null;
	}

	@OriginalMember(owner = "jagexappletviewer!netscape/javascript/JSObjec_", name = "getWindow", descriptor = "(Ljava/applet/Applet;)Ljagexappletviewer!netscape/javascript/JSObjec_;")
	public static JSObjec_ getWindow(@OriginalArg(0) Applet arg0) {
		return new JSObjec_();
	}

	@OriginalMember(owner = "jagexappletviewer!netscape/javascript/JSObjec_", name = "call", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;")
	public Object call(@OriginalArg(0) String arg0, @OriginalArg(1) Object[] arg1) {
		System.out.println("Received command: " + arg0);
		if ("zap".equals(arg0)) {
			Class14.method34("Member", 23853, "yes");
			Class14.method35(0);
			appletviewer.removeadvert();
			appletviewer.method16(15028);
		}
		if ("unzap".equals(arg0)) {
			Class14.method34("Member", 23853, "no");
			Class14.method35(0);
			appletviewer.readdadvert();
			appletviewer.method16(15028);
		}
		if ("loggedout".equals(arg0)) {
			appletviewer.method7(0);
		}
		if ("resizing".equals(arg0) && arg1 != null && arg1.length > 0 && arg1[0] instanceof Integer) {
			appletviewer.doresize((Integer) arg1[0]);
		}
		return null;
	}
}
