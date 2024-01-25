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

@OriginalClass("loader!h")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "I")
	public static int anInt9486;

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "Ljava/lang/String;")
	private String aString88;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private static void method8004(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method8008(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method8005(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method8007(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method8004(local1);
			local1 = method8008(local1, ":", "%3a");
			local1 = method8008(local1, "@", "%40");
			local1 = method8008(local1, "&", "%26");
			local1 = method8008(local1, "#", "%23");
			@Pc(92) URL local92 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt9486 + "&v1=" + Class327.aString97 + "&v2=" + Class327.aString98 + "&e=" + local1);
			@Pc(98) DataInputStream local98 = new DataInputStream(local92.openStream());
			local98.read();
			local98.close();
		} catch (@Pc(105) Exception local105) {
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!h;")
	private static RuntimeException_Sub2 method8006(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString88 = local8.aString88 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method8007(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			arg0 = local16.aThrowable2;
			local6 = local16.aString88 + " | ";
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
			@Pc(75) int local75 = local69.indexOf(40);
			@Pc(82) int local82 = local69.indexOf(41, local75 + 1);
			@Pc(88) String local88;
			if (local75 == -1) {
				local88 = local69;
			} else {
				local88 = local69.substring(0, local75);
			}
			local88 = local88.trim();
			local88 = local88.substring(local88.lastIndexOf(32) + 1);
			local88 = local88.substring(local88.lastIndexOf(9) + 1);
			local6 = local6 + local88;
			if (local75 != -1 && local82 != -1) {
				@Pc(137) int local137 = local69.indexOf(".java:", local75);
				if (local137 >= 0) {
					local6 = local6 + local69.substring(local137 + 5, local82);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method8008(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(13) int local13 = arg0.indexOf(arg1); local13 != -1; local13 = arg0.indexOf(arg1, arg2.length() + local13)) {
			arg0 = arg0.substring(0, local13) + arg2 + arg0.substring(local13 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString88 = arg1;
		this.aThrowable2 = arg0;
	}
}
