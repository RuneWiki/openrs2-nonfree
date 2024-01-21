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
	public static int anInt2982;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method2114(@OriginalArg(0) Throwable arg0) throws IOException {
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
		@Pc(54) BufferedReader local54 = new BufferedReader(new StringReader(local41));
		@Pc(57) String local57 = local54.readLine();
		while (true) {
			while (true) {
				@Pc(60) String local60 = local54.readLine();
				if (local60 == null) {
					return local20 + "| " + local57;
				}
				@Pc(67) int local67 = local60.indexOf(40);
				@Pc(74) int local74 = local60.indexOf(41, local67 + 1);
				if (local67 >= 0 && local74 >= 0) {
					@Pc(89) String local89 = local60.substring(local67 + 1, local74);
					@Pc(93) int local93 = local89.indexOf(".java:");
					if (local93 >= 0) {
						local89 = local89.substring(0, local93) + local89.substring(local93 + 5);
						local20 = local20 + local89 + ' ';
						continue;
					}
					local60 = local60.substring(0, local67);
				}
				local60 = local60.trim();
				local60 = local60.substring(local60.lastIndexOf(32) + 1);
				local60 = local60.substring(local60.lastIndexOf(9) + 1);
				local20 = local20 + local60 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;ILjava/applet/Applet;)V")
	public static void method2115(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method2114(arg1);
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
			@Pc(95) URL local95 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt2982 + "&v1=" + Class86.aString9 + "&v2=" + Class86.aString7 + "&e=" + local1);
			@Pc(101) DataInputStream local101 = new DataInputStream(local95.openStream());
			local101.read();
			local101.close();
		} catch (@Pc(108) Exception local108) {
		}
	}
}
