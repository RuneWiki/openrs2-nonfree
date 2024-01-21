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
	public static int anInt3211;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/Throwable;ILjava/lang/String;)V")
	public static void method2238(@OriginalArg(0) Applet arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(5) String local5 = "";
			if (arg1 != null) {
				local5 = method2239(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg2;
			}
			System.out.println("Error: " + local5);
			local5 = local5.replace(':', '.');
			local5 = local5.replace('@', '_');
			local5 = local5.replace('&', '_');
			local5 = local5.replace('#', '_');
			@Pc(91) URL local91 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt3211 + "&v1=" + Class84.aString7 + "&v2=" + Class84.aString8 + "&e=" + local5);
			@Pc(97) DataInputStream local97 = new DataInputStream(local91.openStream());
			local97.read();
			local97.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method2239(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(11) RuntimeException_Sub2 local11 = (RuntimeException_Sub2) arg0;
			arg0 = local11.aThrowable2;
			local6 = local11.aString6 + " | ";
		} else {
			local6 = "";
		}
		@Pc(36) StringWriter local36 = new StringWriter();
		@Pc(41) PrintWriter local41 = new PrintWriter(local36);
		arg0.printStackTrace(local41);
		local41.close();
		@Pc(49) String local49 = local36.toString();
		@Pc(57) BufferedReader local57 = new BufferedReader(new StringReader(local49));
		@Pc(60) String local60 = local57.readLine();
		while (true) {
			while (true) {
				@Pc(63) String local63 = local57.readLine();
				if (local63 == null) {
					return local6 + "| " + local60;
				}
				@Pc(72) int local72 = local63.indexOf(40);
				@Pc(79) int local79 = local63.indexOf(41, local72 + 1);
				if (local72 >= 0 && local79 >= 0) {
					@Pc(97) String local97 = local63.substring(local72 + 1, local79);
					@Pc(101) int local101 = local97.indexOf(".java:");
					if (local101 >= 0) {
						local97 = local97.substring(0, local101) + local97.substring(local101 + 5);
						local6 = local6 + local97 + ' ';
						continue;
					}
					local63 = local63.substring(0, local72);
				}
				local63 = local63.trim();
				local63 = local63.substring(local63.lastIndexOf(32) + 1);
				local63 = local63.substring(local63.lastIndexOf(9) + 1);
				local6 = local6 + local63 + ' ';
			}
		}
	}
}
