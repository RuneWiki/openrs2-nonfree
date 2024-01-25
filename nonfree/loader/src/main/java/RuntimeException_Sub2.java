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

@OriginalClass("loader!f")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "I")
	public static int anInt10371;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	private String aString146;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Ljava/lang/Throwable;I)V")
	public static void method8775(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method8778(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method8779(local1);
			local1 = method8776(":", local1, "%3a");
			local1 = method8776("@", local1, "%40");
			local1 = method8776("&", local1, "%26");
			local1 = method8776("#", local1, "%23");
			@Pc(101) URL local101 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt10371 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(107) DataInputStream local107 = new DataInputStream(local101.openStream());
			local107.read();
			local107.close();
		} catch (@Pc(114) Exception local114) {
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	private static String method8776(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(12) int local12 = arg1.indexOf(arg0); local12 != -1; local12 = arg1.indexOf(arg0, arg2.length() + local12)) {
			arg1 = arg1.substring(0, local12) + arg2 + arg1.substring(arg0.length() + local12);
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!f;")
	private static RuntimeException_Sub2 method8777(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString146 = local8.aString146 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method8778(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(28) String local28;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(15) RuntimeException_Sub2 local15 = (RuntimeException_Sub2) arg0;
			arg0 = local15.aThrowable2;
			local28 = local15.aString146 + " | ";
		} else {
			local28 = "";
		}
		@Pc(42) StringWriter local42 = new StringWriter();
		@Pc(47) PrintWriter local47 = new PrintWriter(local42);
		arg0.printStackTrace(local47);
		local47.close();
		@Pc(55) String local55 = local42.toString();
		@Pc(63) BufferedReader local63 = new BufferedReader(new StringReader(local55));
		@Pc(66) String local66 = local63.readLine();
		while (true) {
			@Pc(69) String local69 = local63.readLine();
			if (local69 == null) {
				return local28 + "| " + local66;
			}
			@Pc(75) int local75 = local69.indexOf(40);
			@Pc(82) int local82 = local69.indexOf(41, local75 + 1);
			@Pc(90) String local90;
			if (local75 == -1) {
				local90 = local69;
			} else {
				local90 = local69.substring(0, local75);
			}
			local90 = local90.trim();
			local90 = local90.substring(local90.lastIndexOf(32) + 1);
			local90 = local90.substring(local90.lastIndexOf(9) + 1);
			local28 = local28 + local90;
			if (local75 != -1 && local82 != -1) {
				@Pc(134) int local134 = local69.indexOf(".java:", local75);
				if (local134 >= 0) {
					local28 = local28 + local69.substring(local134 + 5, local82);
				}
			}
			local28 = local28 + ' ';
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method8779(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method8776("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString146 = arg1;
	}
}
