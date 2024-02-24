import com.apple.eawt.AppEvent.OpenURIEvent;
import com.apple.eawt.Application;
import com.apple.eawt.OpenURIHandler;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!MacOSXHelpers")
public class MacOSXHelpers {

	@OriginalMember(owner = "jagexappletviewer!MacOSXHelpers", name = "registerURIHandler", descriptor = "()V")
	public static void method1() {
		try {
			Application.getApplication().setOpenURIHandler(new OpenURIHandler() {

				@OriginalMember(owner = "jagexappletviewer!MacOSXHelpers$1", name = "openURI", descriptor = "(Lcom/apple/eawt/AppEvent$OpenURIEvent;)V")
				public void openURI(@OriginalArg(0) OpenURIEvent arg0) {
					jagexappletviewer.method50(arg0.getURI());
				}
			});
		} catch (@Pc(6) Exception local6) {
			local6.printStackTrace();
		}
	}
}
