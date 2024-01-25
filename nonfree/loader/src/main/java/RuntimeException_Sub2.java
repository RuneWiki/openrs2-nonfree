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
	public static int anInt10564;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "Ljava/lang/String;")
	private String aString117;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method8680(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			local6 = local17.aString117 + " | ";
			arg0 = local17.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local6 + "| " + local58;
			}
			@Pc(70) int local70 = local61.indexOf(40);
			@Pc(77) int local77 = local61.indexOf(41, local70 + 1);
			@Pc(85) String local85;
			if (local70 == -1) {
				local85 = local61;
			} else {
				local85 = local61.substring(0, local70);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local6 = local6 + local85;
			if (local70 != -1 && local77 != -1) {
				@Pc(131) int local131 = local61.indexOf(".java:", local70);
				if (local131 >= 0) {
					local6 = local6 + local61.substring(local131 + 5, local77);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method8681(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg2); local5 != -1; local5 = arg0.indexOf(arg2, arg1.length() + local5)) {
			arg0 = arg0.substring(0, local5) + arg1 + arg0.substring(local5 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(BLjava/lang/String;)V")
	private static void method8682(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method8681(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!e;")
	private static RuntimeException_Sub2 method8683(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString117 = local5.aString117 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/Throwable;ILjava/lang/String;)V")
	public static void method8684(@OriginalArg(0) Applet arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method8680(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method8682(local1);
			local1 = method8681(local1, "%3a", ":");
			local1 = method8681(local1, "%40", "@");
			local1 = method8681(local1, "%26", "&");
			local1 = method8681(local1, "%23", "#");
			@Pc(94) URL local94 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt10564 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(100) DataInputStream local100 = new DataInputStream(local94.openStream());
			local100.read();
			local100.close();
		} catch (@Pc(107) Exception local107) {
		}
	}

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString117 = arg1;
		this.aThrowable2 = arg0;
	}
}
