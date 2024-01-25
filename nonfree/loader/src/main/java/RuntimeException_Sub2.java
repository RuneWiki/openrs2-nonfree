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

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "I")
	public static int anInt7786;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/String;")
	private String aString76;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method6313(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method6314(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method6317(local1);
			local1 = method6316(":", "%3a", local1);
			local1 = method6316("@", "%40", local1);
			local1 = method6316("&", "%26", local1);
			local1 = method6316("#", "%23", local1);
			@Pc(91) URL local91 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt7786 + "&v1=" + Class279.aString88 + "&v2=" + Class279.aString87 + "&e=" + local1);
			@Pc(97) DataInputStream local97 = new DataInputStream(local91.openStream());
			local97.read();
			local97.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method6314(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString76 + " | ";
		} else {
			local20 = "";
		}
		@Pc(41) StringWriter local41 = new StringWriter();
		@Pc(46) PrintWriter local46 = new PrintWriter(local41);
		arg0.printStackTrace(local46);
		local46.close();
		@Pc(54) String local54 = local41.toString();
		@Pc(62) BufferedReader local62 = new BufferedReader(new StringReader(local54));
		@Pc(65) String local65 = local62.readLine();
		while (true) {
			@Pc(68) String local68 = local62.readLine();
			if (local68 == null) {
				return local20 + "| " + local65;
			}
			@Pc(74) int local74 = local68.indexOf(40);
			@Pc(81) int local81 = local68.indexOf(41, local74 + 1);
			@Pc(90) String local90;
			if (local74 == -1) {
				local90 = local68;
			} else {
				local90 = local68.substring(0, local74);
			}
			local90 = local90.trim();
			local90 = local90.substring(local90.lastIndexOf(32) + 1);
			local90 = local90.substring(local90.lastIndexOf(9) + 1);
			local20 = local20 + local90;
			if (local74 != -1 && local81 != -1) {
				@Pc(135) int local135 = local68.indexOf(".java:", local74);
				if (local135 >= 0) {
					local20 = local20 + local68.substring(local135 + 5, local81);
				}
			}
			local20 = local20 + ' ';
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!e;")
	private static RuntimeException_Sub2 method6315(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString76 = local8.aString76 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;")
	private static String method6316(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(17) int local17 = arg2.indexOf(arg0); local17 != -1; local17 = arg2.indexOf(arg0, arg1.length() + local17)) {
			arg2 = arg2.substring(0, local17) + arg1 + arg2.substring(arg0.length() + local17);
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6317(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method6316("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString76 = arg1;
		this.aThrowable2 = arg0;
	}
}
