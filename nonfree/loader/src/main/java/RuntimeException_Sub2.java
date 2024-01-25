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

@OriginalClass("loader!a")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "I")
	public static int anInt8066;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	private String aString73;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method6604(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(13) int local13 = arg1.indexOf(arg0); local13 != -1; local13 = arg1.indexOf(arg0, local13 + arg2.length())) {
			arg1 = arg1.substring(0, local13) + arg2 + arg1.substring(arg0.length() + local13);
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method6605(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			arg0 = local16.aThrowable2;
			local6 = local16.aString73 + " | ";
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local33.toString();
		@Pc(54) BufferedReader local54 = new BufferedReader(new StringReader(local46));
		@Pc(62) String local62 = local54.readLine();
		while (true) {
			@Pc(65) String local65 = local54.readLine();
			if (local65 == null) {
				return local6 + "| " + local62;
			}
			@Pc(74) int local74 = local65.indexOf(40);
			@Pc(81) int local81 = local65.indexOf(41, local74 + 1);
			@Pc(89) String local89;
			if (local74 == -1) {
				local89 = local65;
			} else {
				local89 = local65.substring(0, local74);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local6 = local6 + local89;
			if (local74 != -1 && local81 != -1) {
				@Pc(136) int local136 = local65.indexOf(".java:", local74);
				if (local136 >= 0) {
					local6 = local6 + local65.substring(local136 + 5, local81);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6606(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method6604("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!a;")
	private static RuntimeException_Sub2 method6607(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString73 = local5.aString73 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;Ljava/lang/Throwable;)V")
	public static void method6608(@OriginalArg(1) Applet arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(10) String local10 = "";
			if (arg2 != null) {
				local10 = method6605(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local10 = local10 + " | ";
				}
				local10 = local10 + arg1;
			}
			method6606(local10);
			local10 = method6604(":", local10, "%3a");
			local10 = method6604("@", local10, "%40");
			local10 = method6604("&", local10, "%26");
			local10 = method6604("#", local10, "%23");
			@Pc(93) URL local93 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt8066 + "&v1=" + Class274.aString84 + "&v2=" + Class274.aString83 + "&e=" + local10);
			@Pc(99) DataInputStream local99 = new DataInputStream(local93.openStream());
			local99.read();
			local99.close();
		} catch (@Pc(106) Exception local106) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString73 = arg1;
		this.aThrowable2 = arg0;
	}
}
