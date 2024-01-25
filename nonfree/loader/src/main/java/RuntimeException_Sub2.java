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
	public static int anInt9180;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/String;")
	private String aString93;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
	private static String method7493(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(10) int local10 = arg2.indexOf(arg0); local10 != -1; local10 = arg2.indexOf(arg0, arg1.length() + local10)) {
			arg2 = arg2.substring(0, local10) + arg1 + arg2.substring(arg0.length() + local10);
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method7494(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			local6 = local16.aString93 + " | ";
			arg0 = local16.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(54) String local54 = local33.toString();
		@Pc(62) BufferedReader local62 = new BufferedReader(new StringReader(local54));
		@Pc(65) String local65 = local62.readLine();
		while (true) {
			@Pc(68) String local68 = local62.readLine();
			if (local68 == null) {
				return local6 + "| " + local65;
			}
			@Pc(77) int local77 = local68.indexOf(40);
			@Pc(84) int local84 = local68.indexOf(41, local77 + 1);
			@Pc(92) String local92;
			if (local77 == -1) {
				local92 = local68;
			} else {
				local92 = local68.substring(0, local77);
			}
			local92 = local92.trim();
			local92 = local92.substring(local92.lastIndexOf(32) + 1);
			local92 = local92.substring(local92.lastIndexOf(9) + 1);
			local6 = local6 + local92;
			if (local77 != -1 && local84 != -1) {
				@Pc(136) int local136 = local68.indexOf(".java:", local77);
				if (local136 >= 0) {
					local6 = local6 + local68.substring(local136 + 5, local84);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method7495(@OriginalArg(0) Applet arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(6) String local6 = "";
			if (arg1 != null) {
				local6 = method7494(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local6 = local6 + " | ";
				}
				local6 = local6 + arg2;
			}
			method7497(local6);
			local6 = method7493(":", "%3a", local6);
			local6 = method7493("@", "%40", local6);
			local6 = method7493("&", "%26", local6);
			local6 = method7493("#", "%23", local6);
			@Pc(90) URL local90 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt9180 + "&v1=" + Class321.aString89 + "&v2=" + Class321.aString90 + "&e=" + local6);
			@Pc(96) DataInputStream local96 = new DataInputStream(local90.openStream());
			local96.read();
			local96.close();
		} catch (@Pc(103) Exception local103) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!c;")
	private static RuntimeException_Sub2 method7496(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString93 = local5.aString93 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method7497(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method7493("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString93 = arg1;
	}
}
