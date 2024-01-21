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
	public static int anInt2820;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method1824(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method1825(arg2);
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
			@Pc(88) URL local88 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt2820 + "&v1=" + Class71.aString11 + "&v2=" + Class71.aString12 + "&e=" + local1);
			@Pc(94) DataInputStream local94 = new DataInputStream(local88.openStream());
			local94.read();
			local94.close();
		} catch (@Pc(106) Exception local106) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method1825(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(11) RuntimeException_Sub2 local11 = (RuntimeException_Sub2) arg0;
			local21 = local11.aString9 + " | ";
			arg0 = local11.aThrowable2;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(59) String local59 = local53.readLine();
				if (local59 == null) {
					return local21 + "| " + local56;
				}
				@Pc(68) int local68 = local59.indexOf(40);
				@Pc(75) int local75 = local59.indexOf(41, local68 + 1);
				if (local68 >= 0 && local75 >= 0) {
					@Pc(90) String local90 = local59.substring(local68 + 1, local75);
					@Pc(94) int local94 = local90.indexOf(".java:");
					if (local94 >= 0) {
						local90 = local90.substring(0, local94) + local90.substring(local94 + 5);
						local21 = local21 + local90 + ' ';
						continue;
					}
					local59 = local59.substring(0, local68);
				}
				local59 = local59.trim();
				local59 = local59.substring(local59.lastIndexOf(32) + 1);
				local59 = local59.substring(local59.lastIndexOf(9) + 1);
				local21 = local21 + local59 + ' ';
			}
		}
	}
}
