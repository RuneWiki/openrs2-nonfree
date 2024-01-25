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

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "I")
	public static int anInt6499;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/String;")
	private String aString70;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!d;")
	private static RuntimeException_Sub2 method5746(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString70 = local8.aString70 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	private static String method5747(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(13) int local13 = arg2.indexOf(arg1); local13 != -1; local13 = arg2.indexOf(arg1, arg0.length() + local13)) {
			arg2 = arg2.substring(0, local13) + arg0 + arg2.substring(arg1.length() + local13);
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method5748(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(23) String local23;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(13) RuntimeException_Sub2 local13 = (RuntimeException_Sub2) arg0;
			local23 = local13.aString70 + " | ";
			arg0 = local13.aThrowable2;
		} else {
			local23 = "";
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
				return local23 + "| " + local58;
			}
			@Pc(68) int local68 = local61.indexOf(40);
			@Pc(75) int local75 = local61.indexOf(41, local68 + 1);
			@Pc(84) String local84;
			if (local68 == -1) {
				local84 = local61;
			} else {
				local84 = local61.substring(0, local68);
			}
			local84 = local84.trim();
			local84 = local84.substring(local84.lastIndexOf(32) + 1);
			local84 = local84.substring(local84.lastIndexOf(9) + 1);
			local23 = local23 + local84;
			if (local68 != -1 && local75 != -1) {
				@Pc(127) int local127 = local61.indexOf(".java:", local68);
				if (local127 >= 0) {
					local23 = local23 + local61.substring(local127 + 5, local75);
				}
			}
			local23 = local23 + ' ';
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private static void method5749(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method5747("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/Throwable;Ljava/lang/String;)V")
	public static void method5750(@OriginalArg(1) Applet arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(12) String local12 = "";
			if (arg1 != null) {
				local12 = method5748(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local12 = local12 + " | ";
				}
				local12 = local12 + arg2;
			}
			method5749(local12);
			local12 = method5747("%3a", ":", local12);
			local12 = method5747("%40", "@", local12);
			local12 = method5747("%26", "&", local12);
			local12 = method5747("%23", "#", local12);
			@Pc(98) URL local98 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt6499 + "&v1=" + Class259.aString76 + "&v2=" + Class259.aString77 + "&e=" + local12);
			@Pc(104) DataInputStream local104 = new DataInputStream(local98.openStream());
			local104.read();
			local104.close();
		} catch (@Pc(111) Exception local111) {
		}
	}

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString70 = arg1;
		this.aThrowable2 = arg0;
	}
}
