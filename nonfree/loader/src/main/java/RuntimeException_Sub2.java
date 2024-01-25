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
	public static int anInt7674;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/String;")
	private String aString75;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method6071(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg0); local5 != -1; local5 = arg2.indexOf(arg0, arg1.length() + local5)) {
			arg2 = arg2.substring(0, local5) + arg1 + arg2.substring(local5 + arg0.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!d;")
	private static RuntimeException_Sub2 method6072(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString75 = local5.aString75 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/Throwable;Ljava/lang/String;)V")
	public static void method6073(@OriginalArg(1) Applet arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method6074(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method6075(local1);
			local1 = method6071(":", "%3a", local1);
			local1 = method6071("@", "%40", local1);
			local1 = method6071("&", "%26", local1);
			local1 = method6071("#", "%23", local1);
			@Pc(94) URL local94 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt7674 + "&v1=" + Class280.aString81 + "&v2=" + Class280.aString80 + "&e=" + local1);
			@Pc(100) DataInputStream local100 = new DataInputStream(local94.openStream());
			local100.read();
			local100.close();
		} catch (@Pc(107) Exception local107) {
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method6074(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString75 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
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
				return local17 + "| " + local58;
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
			local17 = local17 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(131) int local131 = local61.indexOf(".java:", local70);
				if (local131 >= 0) {
					local17 = local17 + local61.substring(local131 + 5, local77);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method6075(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method6071("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString75 = arg1;
	}
}
