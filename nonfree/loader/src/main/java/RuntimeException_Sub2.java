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
	public static int anInt11459;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/lang/String;")
	private String aString137;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ZLjava/lang/Throwable;Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method9834(@OriginalArg(1) Throwable arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method9836(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method9837(local1);
			local1 = method9835("%3a", ":", local1);
			local1 = method9835("%40", "@", local1);
			local1 = method9835("%26", "&", local1);
			local1 = method9835("%23", "#", local1);
			@Pc(88) URL local88 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt11459 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(94) DataInputStream local94 = new DataInputStream(local88.openStream());
			local94.read();
			local94.close();
		} catch (@Pc(101) Exception local101) {
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method9835(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg1); local5 != -1; local5 = arg2.indexOf(arg1, arg0.length() + local5)) {
			arg2 = arg2.substring(0, local5) + arg0 + arg2.substring(arg1.length() + local5);
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method9836(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			local6 = local17.aString137 + " | ";
			arg0 = local17.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(44) PrintWriter local44 = new PrintWriter(local34);
		arg0.printStackTrace(local44);
		local44.close();
		@Pc(52) String local52 = local34.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			@Pc(66) String local66 = local60.readLine();
			if (local66 == null) {
				return local6 + "| " + local63;
			}
			@Pc(73) int local73 = local66.indexOf(40);
			@Pc(80) int local80 = local66.indexOf(41, local73 + 1);
			@Pc(87) String local87;
			if (local73 == -1) {
				local87 = local66;
			} else {
				local87 = local66.substring(0, local73);
			}
			local87 = local87.trim();
			local87 = local87.substring(local87.lastIndexOf(32) + 1);
			local87 = local87.substring(local87.lastIndexOf(9) + 1);
			local6 = local6 + local87;
			if (local73 != -1 && local80 != -1) {
				@Pc(136) int local136 = local66.indexOf(".java:", local73);
				if (local136 >= 0) {
					local6 = local6 + local66.substring(local136 + 5, local80);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private static void method9837(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method9835("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!f;")
	private static RuntimeException_Sub2 method9838(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString137 = local5.aString137 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString137 = arg1;
		this.aThrowable2 = arg0;
	}
}
