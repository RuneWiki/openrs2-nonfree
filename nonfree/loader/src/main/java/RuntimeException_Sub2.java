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

@OriginalClass("loader!g")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "I")
	public static int anInt7549;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/String;")
	private String aString84;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!g;")
	private static RuntimeException_Sub2 method5848(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString84 = local8.aString84 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method5849(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString84 + " | ";
		} else {
			local20 = "";
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
				return local20 + "| " + local65;
			}
			@Pc(74) int local74 = local68.indexOf(40);
			@Pc(81) int local81 = local68.indexOf(41, local74 + 1);
			@Pc(86) String local86;
			if (local74 == -1) {
				local86 = local68;
			} else {
				local86 = local68.substring(0, local74);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local20 = local20 + local86;
			if (local74 != -1 && local81 != -1) {
				@Pc(135) int local135 = local68.indexOf(".java:", local74);
				if (local135 >= 0) {
					local20 = local20 + local68.substring(local135 + 5, local81);
				}
			}
			local20 = local20 + ' ';
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/applet/Applet;Ljava/lang/String;I)V")
	public static void method5850(@OriginalArg(0) Throwable arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method5849(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method5851(local1);
			local1 = method5852(local1, ":", "%3a");
			local1 = method5852(local1, "@", "%40");
			local1 = method5852(local1, "&", "%26");
			local1 = method5852(local1, "#", "%23");
			@Pc(87) URL local87 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt7549 + "&v1=" + Class277.aString78 + "&v2=" + Class277.aString79 + "&e=" + local1);
			@Pc(93) DataInputStream local93 = new DataInputStream(local87.openStream());
			local93.read();
			local93.close();
		} catch (@Pc(100) Exception local100) {
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method5851(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method5852(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	private static String method5852(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(10) int local10 = arg0.indexOf(arg1); local10 != -1; local10 = arg0.indexOf(arg1, local10 + arg2.length())) {
			arg0 = arg0.substring(0, local10) + arg2 + arg0.substring(local10 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString84 = arg1;
	}
}
