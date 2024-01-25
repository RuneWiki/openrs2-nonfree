import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!h")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "I")
	public static int anInt10935;

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "Ljava/lang/String;")
	private String aString138;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method9236(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(26) RuntimeException_Sub2 local26 = (RuntimeException_Sub2) arg0;
			arg0 = local26.aThrowable2;
			local15 = local26.aString138 + " | ";
		} else {
			local15 = "";
		}
		@Pc(43) StringWriter local43 = new StringWriter();
		@Pc(48) PrintWriter local48 = new PrintWriter(local43);
		arg0.printStackTrace(local48);
		local48.close();
		@Pc(56) String local56 = local43.toString();
		@Pc(64) BufferedReader local64 = new BufferedReader(new StringReader(local56));
		@Pc(67) String local67 = local64.readLine();
		while (true) {
			@Pc(70) String local70 = local64.readLine();
			if (local70 == null) {
				return local15 + "| " + local67;
			}
			@Pc(79) int local79 = local70.indexOf(40);
			@Pc(86) int local86 = local70.indexOf(41, local79 + 1);
			@Pc(91) String local91;
			if (local79 == -1) {
				local91 = local70;
			} else {
				local91 = local70.substring(0, local79);
			}
			local91 = local91.trim();
			local91 = local91.substring(local91.lastIndexOf(32) + 1);
			local91 = local91.substring(local91.lastIndexOf(9) + 1);
			local15 = local15 + local91;
			if (local79 != -1 && local86 != -1) {
				@Pc(137) int local137 = local70.indexOf(".java:", local79);
				if (local137 >= 0) {
					local15 = local15 + local70.substring(local137 + 5, local86);
				}
			}
			local15 = local15 + ' ';
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;Ljava/lang/Throwable;)V")
	public static void method9237(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(6) String local6 = "";
			if (arg2 != null) {
				local6 = method9236(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local6 = local6 + " | ";
				}
				local6 = local6 + arg0;
			}
			method9239(local6);
			local6 = method9240(local6, "%3a", ":");
			local6 = method9240(local6, "%40", "@");
			local6 = method9240(local6, "%26", "&");
			local6 = method9240(local6, "%23", "#");
			@Pc(91) URL local91 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt10935 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local6);
			@Pc(97) DataInputStream local97 = new DataInputStream(local91.openStream());
			local97.read();
			local97.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!h;")
	private static RuntimeException_Sub2 method9238(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString138 = local8.aString138 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method9239(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method9240(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	private static String method9240(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg2); local5 != -1; local5 = arg0.indexOf(arg2, local5 + arg1.length())) {
			arg0 = arg0.substring(0, local5) + arg1 + arg0.substring(local5 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString138 = arg1;
		this.aThrowable2 = arg0;
	}
}
