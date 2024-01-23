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

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "I")
	public static int anInt5744;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/String;")
	private String aString342;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method4787(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method4791("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method4788(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			local6 = local16.aString342 + " | ";
			arg0 = local16.aThrowable2;
		} else {
			local6 = "";
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
				return local6 + "| " + local65;
			}
			@Pc(77) int local77 = local68.indexOf(40);
			@Pc(84) int local84 = local68.indexOf(41, local77 + 1);
			@Pc(93) String local93;
			if (local77 == -1) {
				local93 = local68;
			} else {
				local93 = local68.substring(0, local77);
			}
			local93 = local93.trim();
			local93 = local93.substring(local93.lastIndexOf(32) + 1);
			local93 = local93.substring(local93.lastIndexOf(9) + 1);
			local6 = local6 + local93;
			if (local77 != -1 && local84 != -1) {
				@Pc(136) int local136 = local68.indexOf(".java:", local77);
				if (local136 >= 0) {
					local6 = local6 + local68.substring(local136 + 5, local84);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;Ljava/applet/Applet;)V")
	public static void method4789(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method4788(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method4787(local1);
			local1 = method4791("%3a", ":", local1);
			local1 = method4791("%40", "@", local1);
			local1 = method4791("%26", "&", local1);
			local1 = method4791("%23", "#", local1);
			@Pc(97) URL local97 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt5744 + "&v1=" + Class199.aString352 + "&v2=" + Class199.aString354 + "&e=" + local1);
			@Pc(103) DataInputStream local103 = new DataInputStream(local97.openStream());
			local103.read();
			local103.close();
		} catch (@Pc(110) Exception local110) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method4791(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg1); local5 != -1; local5 = arg2.indexOf(arg1, arg0.length() + local5)) {
			arg2 = arg2.substring(0, local5) + arg0 + arg2.substring(local5 + arg1.length());
		}
		return arg2;
	}
}
