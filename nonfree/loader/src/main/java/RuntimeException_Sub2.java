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

@OriginalClass("loader!b")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "I")
	public static int anInt7323;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	private String aString209;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method5754(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString209 + " | ";
		} else {
			local20 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local28);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local28.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local20 + "| " + local58;
			}
			@Pc(69) int local69 = local61.indexOf(40);
			@Pc(76) int local76 = local61.indexOf(41, local69 + 1);
			@Pc(85) String local85;
			if (local69 == -1) {
				local85 = local61;
			} else {
				local85 = local61.substring(0, local69);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local20 = local20 + local85;
			if (local69 != -1 && local76 != -1) {
				@Pc(128) int local128 = local61.indexOf(".java:", local69);
				if (local128 >= 0) {
					local20 = local20 + local61.substring(local128 + 5, local76);
				}
			}
			local20 = local20 + ' ';
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!b;")
	private static RuntimeException_Sub2 method5755(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString209 = local8.aString209 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method5756(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method5757("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	private static String method5757(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(11) int local11 = arg1.indexOf(arg0); local11 != -1; local11 = arg1.indexOf(arg0, local11 + arg2.length())) {
			arg1 = arg1.substring(0, local11) + arg2 + arg1.substring(local11 + arg0.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;Ljava/lang/Throwable;)V")
	public static void method5758(@OriginalArg(1) Applet arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method5754(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method5756(local1);
			local1 = method5757(":", local1, "%3a");
			local1 = method5757("@", local1, "%40");
			local1 = method5757("&", local1, "%26");
			local1 = method5757("#", local1, "%23");
			@Pc(91) URL local91 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt7323 + "&v1=" + Class280.aString217 + "&v2=" + Class280.aString218 + "&e=" + local1);
			@Pc(101) DataInputStream local101 = new DataInputStream(local91.openStream());
			local101.read();
			local101.close();
		} catch (@Pc(108) Exception local108) {
		}
	}

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString209 = arg1;
	}
}
