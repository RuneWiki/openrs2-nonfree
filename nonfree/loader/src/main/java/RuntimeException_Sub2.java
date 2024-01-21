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
	public static int anInt3412;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method2206(@OriginalArg(1) Throwable arg0) throws IOException {
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
		@Pc(47) String local47 = local28.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			while (true) {
				@Pc(61) String local61 = local55.readLine();
				if (local61 == null) {
					return local6 + "| " + local58;
				}
				@Pc(69) int local69 = local61.indexOf(40);
				@Pc(76) int local76 = local61.indexOf(41, local69 + 1);
				if (local69 >= 0 && local76 >= 0) {
					@Pc(90) String local90 = local61.substring(local69 + 1, local76);
					@Pc(94) int local94 = local90.indexOf(".java:");
					if (local94 >= 0) {
						local90 = local90.substring(0, local94) + local90.substring(local94 + 5);
						local6 = local6 + local90 + ' ';
						continue;
					}
					local61 = local61.substring(0, local69);
				}
				local61 = local61.trim();
				local61 = local61.substring(local61.lastIndexOf(32) + 1);
				local61 = local61.substring(local61.lastIndexOf(9) + 1);
				local6 = local6 + local61 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/Throwable;ILjava/lang/String;)V")
	public static void method2208(@OriginalArg(0) Applet arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method2206(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(87) URL local87 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt3412 + "&v1=" + Class87.aString8 + "&v2=" + Class87.aString7 + "&e=" + local1);
			@Pc(93) DataInputStream local93 = new DataInputStream(local87.openStream());
			local93.read();
			local93.close();
		} catch (@Pc(104) Exception local104) {
		}
	}
}
