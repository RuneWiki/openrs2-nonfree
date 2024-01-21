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

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "I")
	public static int anInt3283;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method2107(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString9 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(41) String local41 = local28.toString();
		@Pc(49) BufferedReader local49 = new BufferedReader(new StringReader(local41));
		@Pc(61) String local61 = local49.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local49.readLine();
				if (local64 == null) {
					return local17 + "| " + local61;
				}
				@Pc(71) int local71 = local64.indexOf(40);
				@Pc(78) int local78 = local64.indexOf(41, local71 + 1);
				if (local71 >= 0 && local78 >= 0) {
					@Pc(93) String local93 = local64.substring(local71 + 1, local78);
					@Pc(97) int local97 = local93.indexOf(".java:");
					if (local97 >= 0) {
						local93 = local93.substring(0, local97) + local93.substring(local97 + 5);
						local17 = local17 + local93 + ' ';
						continue;
					}
					local64 = local64.substring(0, local71);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local17 = local17 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/applet/Applet;I)V")
	public static void method2108(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method2107(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(94) URL local94 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt3283 + "&v1=" + Class70.aString13 + "&v2=" + Class70.aString12 + "&e=" + local1);
			@Pc(100) DataInputStream local100 = new DataInputStream(local94.openStream());
			local100.read();
			local100.close();
		} catch (@Pc(107) Exception local107) {
		}
	}
}
