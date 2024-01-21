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

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "I")
	public static int anInt4710;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/applet/Applet;I)V")
	public static void method3590(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method3591(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(87) URL local87 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt4710 + "&v1=" + Class105.aString10 + "&v2=" + Class105.aString9 + "&e=" + local1);
			@Pc(93) DataInputStream local93 = new DataInputStream(local87.openStream());
			local93.read();
			local93.close();
		} catch (@Pc(100) Exception local100) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method3591(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			local6 = local17.aString7 + " | ";
			arg0 = local17.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(42) StringWriter local42 = new StringWriter();
		@Pc(47) PrintWriter local47 = new PrintWriter(local42);
		arg0.printStackTrace(local47);
		local47.close();
		@Pc(55) String local55 = local42.toString();
		@Pc(63) BufferedReader local63 = new BufferedReader(new StringReader(local55));
		@Pc(66) String local66 = local63.readLine();
		while (true) {
			while (true) {
				@Pc(69) String local69 = local63.readLine();
				if (local69 == null) {
					return local6 + "| " + local66;
				}
				@Pc(75) int local75 = local69.indexOf(40);
				@Pc(82) int local82 = local69.indexOf(41, local75 + 1);
				if (local75 >= 0 && local82 >= 0) {
					@Pc(97) String local97 = local69.substring(local75 + 1, local82);
					@Pc(101) int local101 = local97.indexOf(".java:");
					if (local101 >= 0) {
						local97 = local97.substring(0, local101) + local97.substring(local101 + 5);
						local6 = local6 + local97 + ' ';
						continue;
					}
					local69 = local69.substring(0, local75);
				}
				local69 = local69.trim();
				local69 = local69.substring(local69.lastIndexOf(32) + 1);
				local69 = local69.substring(local69.lastIndexOf(9) + 1);
				local6 = local6 + local69 + ' ';
			}
		}
	}
}
