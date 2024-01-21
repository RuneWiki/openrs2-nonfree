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

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "I")
	public static int anInt3205;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method2045(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString6 + " | ";
		} else {
			local20 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(41) String local41 = local28.toString();
		@Pc(49) BufferedReader local49 = new BufferedReader(new StringReader(local41));
		@Pc(63) String local63 = local49.readLine();
		while (true) {
			while (true) {
				@Pc(66) String local66 = local49.readLine();
				if (local66 == null) {
					return local20 + "| " + local63;
				}
				@Pc(72) int local72 = local66.indexOf(40);
				@Pc(79) int local79 = local66.indexOf(41, local72 + 1);
				if (local72 >= 0 && local79 >= 0) {
					@Pc(94) String local94 = local66.substring(local72 + 1, local79);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local20 = local20 + local94 + ' ';
						continue;
					}
					local66 = local66.substring(0, local72);
				}
				local66 = local66.trim();
				local66 = local66.substring(local66.lastIndexOf(32) + 1);
				local66 = local66.substring(local66.lastIndexOf(9) + 1);
				local20 = local20 + local66 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;ZLjava/applet/Applet;Ljava/lang/String;)V")
	public static void method2046(@OriginalArg(0) Throwable arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(6) String local6 = "";
			if (arg0 != null) {
				local6 = method2045(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local6 = local6 + " | ";
				}
				local6 = local6 + arg2;
			}
			System.out.println("Error: " + local6);
			local6 = local6.replace(':', '.');
			local6 = local6.replace('@', '_');
			local6 = local6.replace('&', '_');
			local6 = local6.replace('#', '_');
			@Pc(95) URL local95 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt3205 + "&v1=" + Class84.aString9 + "&v2=" + Class84.aString7 + "&e=" + local6);
			@Pc(101) DataInputStream local101 = new DataInputStream(local95.openStream());
			local101.read();
			local101.close();
		} catch (@Pc(108) Exception local108) {
		}
	}
}
