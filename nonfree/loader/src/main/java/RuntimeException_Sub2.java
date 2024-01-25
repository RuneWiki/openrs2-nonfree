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

@OriginalClass("loader!b")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "I")
	public static int anInt6869;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	private String aString262;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method5745(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(13) String local13;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(23) RuntimeException_Sub2 local23 = (RuntimeException_Sub2) arg0;
			local13 = local23.aString262 + " | ";
			arg0 = local23.aThrowable2;
		} else {
			local13 = "";
		}
		@Pc(40) StringWriter local40 = new StringWriter();
		@Pc(45) PrintWriter local45 = new PrintWriter(local40);
		arg0.printStackTrace(local45);
		local45.close();
		@Pc(53) String local53 = local40.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			@Pc(67) String local67 = local61.readLine();
			if (local67 == null) {
				return local13 + "| " + local64;
			}
			@Pc(75) int local75 = local67.indexOf(40);
			@Pc(82) int local82 = local67.indexOf(41, local75 + 1);
			@Pc(89) String local89;
			if (local75 == -1) {
				local89 = local67;
			} else {
				local89 = local67.substring(0, local75);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local13 = local13 + local89;
			if (local75 != -1 && local82 != -1) {
				@Pc(139) int local139 = local67.indexOf(".java:", local75);
				if (local139 >= 0) {
					local13 = local13 + local67.substring(local139 + 5, local82);
				}
			}
			local13 = local13 + ' ';
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!b;")
	private static RuntimeException_Sub2 method5746(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString262 = local8.aString262 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method5747(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(13) int local13 = arg2.indexOf(arg1); local13 != -1; local13 = arg2.indexOf(arg1, local13 + arg0.length())) {
			arg2 = arg2.substring(0, local13) + arg0 + arg2.substring(local13 + arg1.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;ILjava/lang/Throwable;)V")
	public static void method5748(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method5745(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method5749(local1);
			local1 = method5747("%3a", ":", local1);
			local1 = method5747("%40", "@", local1);
			local1 = method5747("%26", "&", local1);
			local1 = method5747("%23", "#", local1);
			@Pc(85) URL local85 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt6869 + "&v1=" + Class224.aString266 + "&v2=" + Class224.aString265 + "&e=" + local1);
			@Pc(98) DataInputStream local98 = new DataInputStream(local85.openStream());
			local98.read();
			local98.close();
		} catch (@Pc(105) Exception local105) {
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method5749(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method5747("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString262 = arg1;
		this.aThrowable2 = arg0;
	}
}
