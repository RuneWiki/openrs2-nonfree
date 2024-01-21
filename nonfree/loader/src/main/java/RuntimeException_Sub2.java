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

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "I")
	public static int anInt2963;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method2051(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(12) String local12;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			arg0 = local17.aThrowable2;
			local12 = local17.aString6 + " | ";
		} else {
			local12 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			while (true) {
				@Pc(61) String local61 = local55.readLine();
				if (local61 == null) {
					return local12 + "| " + local58;
				}
				@Pc(68) int local68 = local61.indexOf(40);
				@Pc(75) int local75 = local61.indexOf(41, local68 + 1);
				if (local68 >= 0 && local75 >= 0) {
					@Pc(89) String local89 = local61.substring(local68 + 1, local75);
					@Pc(93) int local93 = local89.indexOf(".java:");
					if (local93 >= 0) {
						local89 = local89.substring(0, local93) + local89.substring(local93 + 5);
						local12 = local12 + local89 + ' ';
						continue;
					}
					local61 = local61.substring(0, local68);
				}
				local61 = local61.trim();
				local61 = local61.substring(local61.lastIndexOf(32) + 1);
				local61 = local61.substring(local61.lastIndexOf(9) + 1);
				local12 = local12 + local61 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method2053(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method2051(arg2);
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
			@Pc(99) URL local99 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt2963 + "&v1=" + Class85.aString9 + "&v2=" + Class85.aString7 + "&e=" + local1);
			@Pc(105) DataInputStream local105 = new DataInputStream(local99.openStream());
			local105.read();
			local105.close();
		} catch (@Pc(112) Exception local112) {
		}
	}
}
