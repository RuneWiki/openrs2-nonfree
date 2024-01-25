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

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "I")
	public static int anInt6560;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/lang/String;")
	private String aString262;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method5749(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			local6 = local16.aString262 + " | ";
			arg0 = local16.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(44) PrintWriter local44 = new PrintWriter(local33);
		arg0.printStackTrace(local44);
		local44.close();
		@Pc(52) String local52 = local33.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			@Pc(66) String local66 = local60.readLine();
			if (local66 == null) {
				return local6 + "| " + local63;
			}
			@Pc(74) int local74 = local66.indexOf(40);
			@Pc(81) int local81 = local66.indexOf(41, local74 + 1);
			@Pc(89) String local89;
			if (local74 == -1) {
				local89 = local66;
			} else {
				local89 = local66.substring(0, local74);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local6 = local6 + local89;
			if (local74 != -1 && local81 != -1) {
				@Pc(136) int local136 = local66.indexOf(".java:", local74);
				if (local136 >= 0) {
					local6 = local6 + local66.substring(local136 + 5, local81);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method5750(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method5752(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!e;")
	private static RuntimeException_Sub2 method5751(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString262 = local5.aString262 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	private static String method5752(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg1); local5 != -1; local5 = arg0.indexOf(arg1, local5 + arg2.length())) {
			arg0 = arg0.substring(0, local5) + arg2 + arg0.substring(local5 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;Ljava/lang/Throwable;)V")
	public static void method5753(@OriginalArg(1) Applet arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method5749(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method5750(local1);
			local1 = method5752(local1, ":", "%3a");
			local1 = method5752(local1, "@", "%40");
			local1 = method5752(local1, "&", "%26");
			local1 = method5752(local1, "#", "%23");
			@Pc(97) URL local97 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt6560 + "&v1=" + Class226.aString264 + "&v2=" + Class226.aString263 + "&e=" + local1);
			@Pc(103) DataInputStream local103 = new DataInputStream(local97.openStream());
			local103.read();
			local103.close();
		} catch (@Pc(110) Exception local110) {
		}
	}

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString262 = arg1;
	}
}
