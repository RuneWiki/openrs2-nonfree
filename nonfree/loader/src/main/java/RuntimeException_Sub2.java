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
	public static int anInt4811;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method3338(@OriginalArg(0) Applet arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method3340(arg1);
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
			@Pc(90) URL local90 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt4811 + "&v1=" + Class111.aString8 + "&v2=" + Class111.aString9 + "&e=" + local1);
			@Pc(101) DataInputStream local101 = new DataInputStream(local90.openStream());
			local101.read();
			local101.close();
		} catch (@Pc(108) Exception local108) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method3340(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(11) RuntimeException_Sub2 local11 = (RuntimeException_Sub2) arg0;
			arg0 = local11.aThrowable2;
			local6 = local11.aString7 + " | ";
		} else {
			local6 = "";
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
					return local6 + "| " + local58;
				}
				@Pc(70) int local70 = local61.indexOf(40);
				@Pc(77) int local77 = local61.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(90) String local90 = local61.substring(local70 + 1, local77);
					@Pc(94) int local94 = local90.indexOf(".java:");
					if (local94 >= 0) {
						local90 = local90.substring(0, local94) + local90.substring(local94 + 5);
						local6 = local6 + local90 + ' ';
						continue;
					}
					local61 = local61.substring(0, local70);
				}
				local61 = local61.trim();
				local61 = local61.substring(local61.lastIndexOf(32) + 1);
				local61 = local61.substring(local61.lastIndexOf(9) + 1);
				local6 = local6 + local61 + ' ';
			}
		}
	}
}
