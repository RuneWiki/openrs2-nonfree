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
	public static int anInt4078;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method3045(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString8 + " | ";
		} else {
			local20 = "";
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
				@Pc(61) String local61 = local49.readLine();
				if (local61 == null) {
					return local20 + "| " + local52;
				}
				@Pc(67) int local67 = local61.indexOf(40);
				@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
				if (local67 >= 0 && local74 >= 0) {
					@Pc(89) String local89 = local61.substring(local67 + 1, local74);
					@Pc(93) int local93 = local89.indexOf(".java:");
					if (local93 >= 0) {
						local89 = local89.substring(0, local93) + local89.substring(local93 + 5);
						local20 = local20 + local89 + ' ';
						continue;
					}
					local61 = local61.substring(0, local67);
				}
				local61 = local61.trim();
				local61 = local61.substring(local61.lastIndexOf(32) + 1);
				local61 = local61.substring(local61.lastIndexOf(9) + 1);
				local20 = local20 + local61 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;Ljava/lang/Throwable;B)V")
	public static void method3046(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method3045(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(96) URL local96 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt4078 + "&v1=" + Class94.aString10 + "&v2=" + Class94.aString11 + "&e=" + local1);
			@Pc(102) DataInputStream local102 = new DataInputStream(local96.openStream());
			local102.read();
			local102.close();
		} catch (@Pc(109) Exception local109) {
		}
	}
}
