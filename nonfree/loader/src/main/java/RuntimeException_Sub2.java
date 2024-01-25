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
	public static int anInt10004;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/String;")
	private String aString96;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method7972(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			arg0 = local17.aThrowable2;
			local6 = local17.aString96 + " | ";
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
			@Pc(67) int local67 = local61.indexOf(40);
			@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
			@Pc(80) String local80;
			if (local67 == -1) {
				local80 = local61;
			} else {
				local80 = local61.substring(0, local67);
			}
			local80 = local80.trim();
			local80 = local80.substring(local80.lastIndexOf(32) + 1);
			local80 = local80.substring(local80.lastIndexOf(9) + 1);
			local6 = local6 + local80;
			if (local67 != -1 && local74 != -1) {
				@Pc(130) int local130 = local61.indexOf(".java:", local67);
				if (local130 >= 0) {
					local6 = local6 + local61.substring(local130 + 5, local74);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method7973(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg2.indexOf(arg1); local14 != -1; local14 = arg2.indexOf(arg1, local14 + arg0.length())) {
			arg2 = arg2.substring(0, local14) + arg0 + arg2.substring(arg1.length() + local14);
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(BLjava/lang/String;)V")
	private static void method7974(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method7973("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!a;")
	private static RuntimeException_Sub2 method7975(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString96 = local8.aString96 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;Ljava/applet/Applet;)V")
	public static void method7976(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method7972(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method7974(local1);
			local1 = method7973("%3a", ":", local1);
			local1 = method7973("%40", "@", local1);
			local1 = method7973("%26", "&", local1);
			local1 = method7973("%23", "#", local1);
			@Pc(91) URL local91 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt10004 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(97) DataInputStream local97 = new DataInputStream(local91.openStream());
			local97.read();
			local97.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString96 = arg1;
		this.aThrowable2 = arg0;
	}
}
