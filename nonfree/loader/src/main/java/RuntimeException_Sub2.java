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

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "I")
	public static int anInt3158;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;ILjava/lang/Throwable;)V")
	public static void method2044(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method2045(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(89) URL local89 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt3158 + "&v1=" + Class86.aString8 + "&v2=" + Class86.aString9 + "&e=" + local1);
			@Pc(95) DataInputStream local95 = new DataInputStream(local89.openStream());
			local95.read();
			local95.close();
		} catch (@Pc(102) Exception local102) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method2045(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(11) RuntimeException_Sub2 local11 = (RuntimeException_Sub2) arg0;
			local6 = local11.aString6 + " | ";
			arg0 = local11.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(41) String local41 = local28.toString();
		@Pc(49) BufferedReader local49 = new BufferedReader(new StringReader(local41));
		@Pc(52) String local52 = local49.readLine();
		while (true) {
			while (true) {
				@Pc(55) String local55 = local49.readLine();
				if (local55 == null) {
					return local6 + "| " + local52;
				}
				@Pc(62) int local62 = local55.indexOf(40);
				@Pc(69) int local69 = local55.indexOf(41, local62 + 1);
				if (local62 >= 0 && local69 >= 0) {
					@Pc(82) String local82 = local55.substring(local62 + 1, local69);
					@Pc(86) int local86 = local82.indexOf(".java:");
					if (local86 >= 0) {
						local82 = local82.substring(0, local86) + local82.substring(local86 + 5);
						local6 = local6 + local82 + ' ';
						continue;
					}
					local55 = local55.substring(0, local62);
				}
				local55 = local55.trim();
				local55 = local55.substring(local55.lastIndexOf(32) + 1);
				local55 = local55.substring(local55.lastIndexOf(9) + 1);
				local6 = local6 + local55 + ' ';
			}
		}
	}
}
