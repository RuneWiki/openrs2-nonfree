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
	public static int anInt3175;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
	private static String method2116(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString6 + " | ";
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
		@Pc(60) String local60 = local49.readLine();
		while (true) {
			while (true) {
				@Pc(63) String local63 = local49.readLine();
				if (local63 == null) {
					return local17 + "| " + local60;
				}
				@Pc(72) int local72 = local63.indexOf(40);
				@Pc(79) int local79 = local63.indexOf(41, local72 + 1);
				if (local72 >= 0 && local79 >= 0) {
					@Pc(93) String local93 = local63.substring(local72 + 1, local79);
					@Pc(97) int local97 = local93.indexOf(".java:");
					if (local97 >= 0) {
						local93 = local93.substring(0, local97) + local93.substring(local97 + 5);
						local17 = local17 + local93 + ' ';
						continue;
					}
					local63 = local63.substring(0, local72);
				}
				local63 = local63.trim();
				local63 = local63.substring(local63.lastIndexOf(32) + 1);
				local63 = local63.substring(local63.lastIndexOf(9) + 1);
				local17 = local17 + local63 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;BLjava/applet/Applet;)V")
	public static void method2117(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method2116(arg0);
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
			@Pc(88) URL local88 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt3175 + "&v1=" + Class85.aString8 + "&v2=" + Class85.aString7 + "&e=" + local1);
			@Pc(98) DataInputStream local98 = new DataInputStream(local88.openStream());
			local98.read();
			local98.close();
		} catch (@Pc(105) Exception local105) {
		}
	}
}
