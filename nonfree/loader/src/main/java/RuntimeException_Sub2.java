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

@OriginalClass("loader!c")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "I")
	public static int anInt9608;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/String;")
	private String aString218;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method8273(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg2); local5 != -1; local5 = arg0.indexOf(arg2, arg1.length() + local5)) {
			arg0 = arg0.substring(0, local5) + arg1 + arg0.substring(local5 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method8274(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method8273(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method8275(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method8277(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method8274(local1);
			local1 = method8273(local1, "%3a", ":");
			local1 = method8273(local1, "%40", "@");
			local1 = method8273(local1, "%26", "&");
			local1 = method8273(local1, "%23", "#");
			@Pc(86) URL local86 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt9608 + "&v1=" + Class326.aString228 + "&v2=" + Class326.aString229 + "&e=" + local1);
			@Pc(92) DataInputStream local92 = new DataInputStream(local86.openStream());
			local92.read();
			local92.close();
		} catch (@Pc(111) Exception local111) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!c;")
	private static RuntimeException_Sub2 method8276(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString218 = local8.aString218 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method8277(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			arg0 = local16.aThrowable2;
			local6 = local16.aString218 + " | ";
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local33.toString();
		@Pc(54) BufferedReader local54 = new BufferedReader(new StringReader(local46));
		@Pc(57) String local57 = local54.readLine();
		while (true) {
			@Pc(65) String local65 = local54.readLine();
			if (local65 == null) {
				return local6 + "| " + local57;
			}
			@Pc(73) int local73 = local65.indexOf(40);
			@Pc(80) int local80 = local65.indexOf(41, local73 + 1);
			@Pc(88) String local88;
			if (local73 == -1) {
				local88 = local65;
			} else {
				local88 = local65.substring(0, local73);
			}
			local88 = local88.trim();
			local88 = local88.substring(local88.lastIndexOf(32) + 1);
			local88 = local88.substring(local88.lastIndexOf(9) + 1);
			local6 = local6 + local88;
			if (local73 != -1 && local80 != -1) {
				@Pc(134) int local134 = local65.indexOf(".java:", local73);
				if (local134 >= 0) {
					local6 = local6 + local65.substring(local134 + 5, local80);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString218 = arg1;
	}
}
