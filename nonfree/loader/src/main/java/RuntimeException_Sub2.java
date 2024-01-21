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

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "I")
	public static int anInt3169;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method2215(@OriginalArg(0) Applet arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method2216(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(91) URL local91 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt3169 + "&v1=" + Class85.aString8 + "&v2=" + Class85.aString7 + "&e=" + local1);
			@Pc(97) DataInputStream local97 = new DataInputStream(local91.openStream());
			local97.read();
			local97.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
	private static String method2216(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString6 + " | ";
		} else {
			local20 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(43) PrintWriter local43 = new PrintWriter(local28);
		arg0.printStackTrace(local43);
		local43.close();
		@Pc(51) String local51 = local28.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local51));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			while (true) {
				@Pc(65) String local65 = local59.readLine();
				if (local65 == null) {
					return local20 + "| " + local62;
				}
				@Pc(71) int local71 = local65.indexOf(40);
				@Pc(78) int local78 = local65.indexOf(41, local71 + 1);
				if (local71 >= 0 && local78 >= 0) {
					@Pc(93) String local93 = local65.substring(local71 + 1, local78);
					@Pc(97) int local97 = local93.indexOf(".java:");
					if (local97 >= 0) {
						local93 = local93.substring(0, local97) + local93.substring(local97 + 5);
						local20 = local20 + local93 + ' ';
						continue;
					}
					local65 = local65.substring(0, local71);
				}
				local65 = local65.trim();
				local65 = local65.substring(local65.lastIndexOf(32) + 1);
				local65 = local65.substring(local65.lastIndexOf(9) + 1);
				local20 = local20 + local65 + ' ';
			}
		}
	}
}
