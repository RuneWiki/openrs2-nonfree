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

@OriginalClass("loader!e")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "I")
	public static int anInt6429;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/String;")
	private String aString70;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method5599(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(10) int local10 = arg1.indexOf(arg0); local10 != -1; local10 = arg1.indexOf(arg0, local10 + arg2.length())) {
			arg1 = arg1.substring(0, local10) + arg2 + arg1.substring(local10 + arg0.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method5600(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString70 + " | ";
		} else {
			local20 = "";
		}
		@Pc(38) StringWriter local38 = new StringWriter();
		@Pc(43) PrintWriter local43 = new PrintWriter(local38);
		arg0.printStackTrace(local43);
		local43.close();
		@Pc(51) String local51 = local38.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local51));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			@Pc(65) String local65 = local59.readLine();
			if (local65 == null) {
				return local20 + "| " + local62;
			}
			@Pc(74) int local74 = local65.indexOf(40);
			@Pc(81) int local81 = local65.indexOf(41, local74 + 1);
			@Pc(90) String local90;
			if (local74 == -1) {
				local90 = local65;
			} else {
				local90 = local65.substring(0, local74);
			}
			local90 = local90.trim();
			local90 = local90.substring(local90.lastIndexOf(32) + 1);
			local90 = local90.substring(local90.lastIndexOf(9) + 1);
			local20 = local20 + local90;
			if (local74 != -1 && local81 != -1) {
				@Pc(134) int local134 = local65.indexOf(".java:", local74);
				if (local134 >= 0) {
					local20 = local20 + local65.substring(local134 + 5, local81);
				}
			}
			local20 = local20 + ' ';
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;Ljava/applet/Applet;)V")
	public static void method5601(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(6) String local6 = "";
			if (arg1 != null) {
				local6 = method5600(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local6 = local6 + " | ";
				}
				local6 = local6 + arg0;
			}
			method5603(local6);
			local6 = method5599(":", local6, "%3a");
			local6 = method5599("@", local6, "%40");
			local6 = method5599("&", local6, "%26");
			local6 = method5599("#", local6, "%23");
			@Pc(91) URL local91 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt6429 + "&v1=" + Class258.aString75 + "&v2=" + Class258.aString79 + "&e=" + local6);
			@Pc(97) DataInputStream local97 = new DataInputStream(local91.openStream());
			local97.read();
			local97.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!e;")
	private static RuntimeException_Sub2 method5602(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString70 = local8.aString70 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(BLjava/lang/String;)V")
	private static void method5603(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method5599("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString70 = arg1;
		this.aThrowable2 = arg0;
	}
}
