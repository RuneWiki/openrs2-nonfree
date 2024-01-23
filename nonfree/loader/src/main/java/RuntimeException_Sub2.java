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

@OriginalClass("loader!d")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "I")
	public static int anInt6160;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "Ljava/lang/String;")
	private String aString236;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method5048(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			arg0 = local16.aThrowable2;
			local6 = local16.aString236 + " | ";
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(55) String local55 = local33.toString();
		@Pc(63) BufferedReader local63 = new BufferedReader(new StringReader(local55));
		@Pc(66) String local66 = local63.readLine();
		while (true) {
			@Pc(69) String local69 = local63.readLine();
			if (local69 == null) {
				return local6 + "| " + local66;
			}
			@Pc(77) int local77 = local69.indexOf(40);
			@Pc(84) int local84 = local69.indexOf(41, local77 + 1);
			@Pc(93) String local93;
			if (local77 == -1) {
				local93 = local69;
			} else {
				local93 = local69.substring(0, local77);
			}
			local93 = local93.trim();
			local93 = local93.substring(local93.lastIndexOf(32) + 1);
			local93 = local93.substring(local93.lastIndexOf(9) + 1);
			local6 = local6 + local93;
			if (local77 != -1 && local84 != -1) {
				@Pc(138) int local138 = local69.indexOf(".java:", local77);
				if (local138 >= 0) {
					local6 = local6 + local69.substring(local138 + 5, local84);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	private static String method5050(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(5) int local5 = arg1.indexOf(arg2); local5 != -1; local5 = arg1.indexOf(arg2, local5 + arg0.length())) {
			arg1 = arg1.substring(0, local5) + arg0 + arg1.substring(arg2.length() + local5);
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(BLjava/lang/String;)V")
	private static void method5051(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method5050("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/applet/Applet;B)V")
	public static void method5052(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) Applet arg2) {
		try {
			@Pc(12) String local12 = "";
			if (arg1 != null) {
				local12 = method5048(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local12 = local12 + " | ";
				}
				local12 = local12 + arg0;
			}
			method5051(local12);
			local12 = method5050("%3a", local12, ":");
			local12 = method5050("%40", local12, "@");
			local12 = method5050("%26", local12, "&");
			local12 = method5050("%23", local12, "#");
			@Pc(95) URL local95 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt6160 + "&v1=" + Class202.aString240 + "&v2=" + Class202.aString242 + "&e=" + local12);
			@Pc(101) DataInputStream local101 = new DataInputStream(local95.openStream());
			local101.read();
			local101.close();
		} catch (@Pc(108) Exception local108) {
		}
	}
}
