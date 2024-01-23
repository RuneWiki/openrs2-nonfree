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
	public static int anInt5654;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/String;")
	private String aString339;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method4782(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(10) int local10 = arg1.indexOf(arg2); local10 != -1; local10 = arg1.indexOf(arg2, local10 + arg0.length())) {
			arg1 = arg1.substring(0, local10) + arg0 + arg1.substring(local10 + arg2.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private static void method4783(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method4782("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method4784(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString339 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(51) String local51 = local33.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local51));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			@Pc(65) String local65 = local59.readLine();
			if (local65 == null) {
				return local17 + "| " + local62;
			}
			@Pc(74) int local74 = local65.indexOf(40);
			@Pc(81) int local81 = local65.indexOf(41, local74 + 1);
			@Pc(88) String local88;
			if (local74 == -1) {
				local88 = local65;
			} else {
				local88 = local65.substring(0, local74);
			}
			local88 = local88.trim();
			local88 = local88.substring(local88.lastIndexOf(32) + 1);
			local88 = local88.substring(local88.lastIndexOf(9) + 1);
			local17 = local17 + local88;
			if (local74 != -1 && local81 != -1) {
				@Pc(136) int local136 = local65.indexOf(".java:", local74);
				if (local136 >= 0) {
					local17 = local17 + local65.substring(local136 + 5, local81);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;ILjava/applet/Applet;)V")
	public static void method4786(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method4784(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method4783(local1);
			local1 = method4782("%3a", local1, ":");
			local1 = method4782("%40", local1, "@");
			local1 = method4782("%26", local1, "&");
			local1 = method4782("%23", local1, "#");
			@Pc(90) URL local90 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt5654 + "&v1=" + Class210.aString347 + "&v2=" + Class210.aString346 + "&e=" + local1);
			@Pc(96) DataInputStream local96 = new DataInputStream(local90.openStream());
			local96.read();
			local96.close();
		} catch (@Pc(103) Exception local103) {
		}
	}
}
