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

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "I")
	public static int anInt7456;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "Ljava/lang/String;")
	private String aString71;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private static void method5658(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method5660(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method5659(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(11) RuntimeException_Sub2 local11 = (RuntimeException_Sub2) arg0;
			local6 = local11.aString71 + " | ";
			arg0 = local11.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(41) String local41 = local28.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local41));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local6 + "| " + local58;
			}
			@Pc(70) int local70 = local61.indexOf(40);
			@Pc(77) int local77 = local61.indexOf(41, local70 + 1);
			@Pc(82) String local82;
			if (local70 == -1) {
				local82 = local61;
			} else {
				local82 = local61.substring(0, local70);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local6 = local6 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(128) int local128 = local61.indexOf(".java:", local70);
				if (local128 >= 0) {
					local6 = local6 + local61.substring(local128 + 5, local77);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method5660(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(11) int local11 = arg0.indexOf(arg2); local11 != -1; local11 = arg0.indexOf(arg2, arg1.length() + local11)) {
			arg0 = arg0.substring(0, local11) + arg1 + arg0.substring(arg2.length() + local11);
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;Ljava/lang/Throwable;)V")
	public static void method5661(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method5659(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method5658(local1);
			local1 = method5660(local1, "%3a", ":");
			local1 = method5660(local1, "%40", "@");
			local1 = method5660(local1, "%26", "&");
			local1 = method5660(local1, "%23", "#");
			@Pc(90) URL local90 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt7456 + "&v1=" + Class274.aString75 + "&v2=" + Class274.aString79 + "&e=" + local1);
			@Pc(96) DataInputStream local96 = new DataInputStream(local90.openStream());
			local96.read();
			local96.close();
		} catch (@Pc(103) Exception local103) {
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!d;")
	private static RuntimeException_Sub2 method5662(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString71 = local5.aString71 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString71 = arg1;
		this.aThrowable2 = arg0;
	}
}
