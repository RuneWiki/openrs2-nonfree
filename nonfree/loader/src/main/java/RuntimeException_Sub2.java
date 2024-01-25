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

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "I")
	public static int anInt7853;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/String;")
	private String aString67;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method6102(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(13) int local13 = arg1.indexOf(arg0); local13 != -1; local13 = arg1.indexOf(arg0, local13 + arg2.length())) {
			arg1 = arg1.substring(0, local13) + arg2 + arg1.substring(arg0.length() + local13);
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method6103(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString67 + " | ";
		} else {
			local20 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local33.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local46));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local20 + "| " + local61;
			}
			@Pc(73) int local73 = local64.indexOf(40);
			@Pc(80) int local80 = local64.indexOf(41, local73 + 1);
			@Pc(86) String local86;
			if (local73 == -1) {
				local86 = local64;
			} else {
				local86 = local64.substring(0, local73);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local20 = local20 + local86;
			if (local73 != -1 && local80 != -1) {
				@Pc(135) int local135 = local64.indexOf(".java:", local73);
				if (local135 >= 0) {
					local20 = local20 + local64.substring(local135 + 5, local80);
				}
			}
			local20 = local20 + ' ';
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!c;")
	private static RuntimeException_Sub2 method6104(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString67 = local5.aString67 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6105(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method6102("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;ILjava/applet/Applet;)V")
	public static void method6106(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method6103(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method6105(local1);
			local1 = method6102(":", local1, "%3a");
			local1 = method6102("@", local1, "%40");
			local1 = method6102("&", local1, "%26");
			local1 = method6102("#", local1, "%23");
			@Pc(90) URL local90 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt7853 + "&v1=" + Class277.aString77 + "&v2=" + Class277.aString72 + "&e=" + local1);
			@Pc(96) DataInputStream local96 = new DataInputStream(local90.openStream());
			local96.read();
			local96.close();
		} catch (@Pc(103) Exception local103) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString67 = arg1;
		this.aThrowable2 = arg0;
	}
}
