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

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "I")
	public static int anInt7975;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	private String aString70;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!g;")
	private static RuntimeException_Sub2 method6219(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString70 = local5.aString70 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(BLjava/lang/String;)V")
	private static void method6220(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method6222("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method6221(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(22) String local22;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(12) RuntimeException_Sub2 local12 = (RuntimeException_Sub2) arg0;
			local22 = local12.aString70 + " | ";
			arg0 = local12.aThrowable2;
		} else {
			local22 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local33.toString();
		@Pc(54) BufferedReader local54 = new BufferedReader(new StringReader(local46));
		@Pc(57) String local57 = local54.readLine();
		while (true) {
			@Pc(60) String local60 = local54.readLine();
			if (local60 == null) {
				return local22 + "| " + local57;
			}
			@Pc(69) int local69 = local60.indexOf(40);
			@Pc(76) int local76 = local60.indexOf(41, local69 + 1);
			@Pc(83) String local83;
			if (local69 == -1) {
				local83 = local60;
			} else {
				local83 = local60.substring(0, local69);
			}
			local83 = local83.trim();
			local83 = local83.substring(local83.lastIndexOf(32) + 1);
			local83 = local83.substring(local83.lastIndexOf(9) + 1);
			local22 = local22 + local83;
			if (local69 != -1 && local76 != -1) {
				@Pc(130) int local130 = local60.indexOf(".java:", local69);
				if (local130 >= 0) {
					local22 = local22 + local60.substring(local130 + 5, local76);
				}
			}
			local22 = local22 + ' ';
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	private static String method6222(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg0); local5 != -1; local5 = arg2.indexOf(arg0, local5 + arg1.length())) {
			arg2 = arg2.substring(0, local5) + arg1 + arg2.substring(arg0.length() + local5);
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;Ljava/lang/Throwable;)V")
	public static void method6223(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method6221(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method6220(local1);
			local1 = method6222(":", "%3a", local1);
			local1 = method6222("@", "%40", local1);
			local1 = method6222("&", "%26", local1);
			local1 = method6222("#", "%23", local1);
			@Pc(96) URL local96 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt7975 + "&v1=" + Class280.aString80 + "&v2=" + Class280.aString75 + "&e=" + local1);
			@Pc(102) DataInputStream local102 = new DataInputStream(local96.openStream());
			local102.read();
			local102.close();
		} catch (@Pc(109) Exception local109) {
		}
	}

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString70 = arg1;
		this.aThrowable2 = arg0;
	}
}
