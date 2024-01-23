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
	public static int anInt5005;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method3752(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString11 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(51) String local51 = local33.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local51));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			while (true) {
				@Pc(65) String local65 = local59.readLine();
				if (local65 == null) {
					return local17 + "| " + local62;
				}
				@Pc(74) int local74 = local65.indexOf(40);
				@Pc(81) int local81 = local65.indexOf(41, local74 + 1);
				if (local74 >= 0 && local81 >= 0) {
					@Pc(94) String local94 = local65.substring(local74 + 1, local81);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local17 = local17 + local94 + ' ';
						continue;
					}
					local65 = local65.substring(0, local74);
				}
				local65 = local65.trim();
				local65 = local65.substring(local65.lastIndexOf(32) + 1);
				local65 = local65.substring(local65.lastIndexOf(9) + 1);
				local17 = local17 + local65 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/applet/Applet;B)V")
	public static void method3753(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method3752(arg0);
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
			@Pc(88) URL local88 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt5005 + "&v1=" + Class131.aString18 + "&v2=" + Class131.aString22 + "&e=" + local1);
			@Pc(105) DataInputStream local105 = new DataInputStream(local88.openStream());
			local105.read();
			local105.close();
		} catch (@Pc(112) Exception local112) {
		}
	}
}
