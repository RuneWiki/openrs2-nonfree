import app.Class16;
import app.appletviewer;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!jagexappletviewer")
public class jagexappletviewer {

	@OriginalMember(owner = "jagexappletviewer!jagexappletviewer", name = "a", descriptor = "Z")
	private static volatile boolean aBoolean8 = false;

	@OriginalMember(owner = "jagexappletviewer!jagexappletviewer", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		if (arg0.length < 1) {
			System.exit(0);
		}
		try {
			@Pc(12) String local12 = System.getProperty("com.jagex.configuri");
			if (local12 != null) {
				method50(new URI(local12));
			}
		} catch (@Pc(24) URISyntaxException local24) {
		}
		if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
			try {
				Thread.sleep(50L);
			} catch (@Pc(36) Exception local36) {
			}
		}
		aBoolean8 = true;
		appletviewer.method10(8865, arg0[0]);
	}

	@OriginalMember(owner = "jagexappletviewer!jagexappletviewer", name = "receiveURI", descriptor = "(Ljava/net/URI;)V")
	public static void method50(@OriginalArg(0) URI arg0) {
		@Pc(2) String local2 = arg0.getScheme();
		@Pc(16) String local16;
		if (local2.equals("jagex-jav")) {
			local16 = "http";
		} else if (local2.equals("jagex-javs")) {
			local16 = "https";
		} else {
			return;
		}
		try {
			@Pc(36) URI local36 = new URI(local16, arg0.getUserInfo(), arg0.getHost(), arg0.getPort(), arg0.getPath(), arg0.getQuery(), arg0.getFragment());
			@Pc(39) String local39 = local36.toString();
			if (aBoolean8) {
				Class16.method40(appletviewer.method11(86, "alreadyopen"), -116);
			} else {
				System.setProperty("com.jagex.config", local39);
			}
		} catch (@Pc(54) URISyntaxException local54) {
		}
	}

	static {
		if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
			try {
				@Pc(15) Class local15 = Class.forName("MacOSXHelpers", true, jagexappletviewer.class.getClassLoader());
				@Pc(21) Method local21 = local15.getMethod("registerURIHandler");
				local21.invoke(null);
			} catch (@Pc(29) Exception local29) {
			}
		}
	}
}
