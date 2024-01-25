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

@OriginalClass("loader!c")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "I")
	public static int anInt10668;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/String;")
	private String aString108;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method9059(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			local6 = local17.aString108 + " | ";
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
		@Pc(65) String local65 = local55.readLine();
		while (true) {
			@Pc(68) String local68 = local55.readLine();
			if (local68 == null) {
				return local6 + "| " + local65;
			}
			@Pc(75) int local75 = local68.indexOf(40);
			@Pc(82) int local82 = local68.indexOf(41, local75 + 1);
			@Pc(89) String local89;
			if (local75 == -1) {
				local89 = local68;
			} else {
				local89 = local68.substring(0, local75);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local6 = local6 + local89;
			if (local75 != -1 && local82 != -1) {
				@Pc(135) int local135 = local68.indexOf(".java:", local75);
				if (local135 >= 0) {
					local6 = local6 + local68.substring(local135 + 5, local82);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	private static String method9060(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg1.indexOf(arg0); local5 != -1; local5 = arg1.indexOf(arg0, arg2.length() + local5)) {
			arg1 = arg1.substring(0, local5) + arg2 + arg1.substring(local5 + arg0.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;ZLjava/lang/Throwable;)V")
	public static void method9061(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method9059(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method9062(local1);
			local1 = method9060(":", local1, "%3a");
			local1 = method9060("@", local1, "%40");
			local1 = method9060("&", local1, "%26");
			local1 = method9060("#", local1, "%23");
			@Pc(98) URL local98 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt10668 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(104) DataInputStream local104 = new DataInputStream(local98.openStream());
			local104.read();
			local104.close();
		} catch (@Pc(111) Exception local111) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method9062(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method9060("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!c;")
	private static RuntimeException_Sub2 method9063(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString108 = local8.aString108 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString108 = arg1;
		this.aThrowable2 = arg0;
	}
}
