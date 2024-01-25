import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
	public static int anInt2053;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "Lclient!bl;")
	public static final Class41 aClass41_1 = new Class41();

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
	public static void method1889(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static332.aClass247ArrayArrayArray1 = Static618.aClass247ArrayArrayArray3;
			Static343.aClass104Array2 = Static605.aClass104Array3;
		} else {
			Static332.aClass247ArrayArrayArray1 = Static559.aClass247ArrayArrayArray2;
			Static343.aClass104Array2 = Static239.aClass104Array1;
		}
		Static373.anInt6613 = Static332.aClass247ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method1893(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString77 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(61) String local61 = local53.readLine();
		while (true) {
			@Pc(64) String local64 = local53.readLine();
			if (local64 == null) {
				return local24 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(83) String local83;
			if (local70 == -1) {
				local83 = local64;
			} else {
				local83 = local64.substring(0, local70);
			}
			local83 = local83.trim();
			local83 = local83.substring(local83.lastIndexOf(32) + 1);
			local83 = local83.substring(local83.lastIndexOf(9) + 1);
			local24 = local24 + local83;
			if (local70 != -1 && local77 != -1) {
				@Pc(130) int local130 = local64.indexOf(".java:", local70);
				if (local130 >= 0) {
					local24 = local24 + local64.substring(local130 + 5, local77);
				}
			}
			local24 = local24 + ' ';
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!gka;Z)Z")
	public static boolean method1899(@OriginalArg(0) Class145 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean285) {
			return false;
		} else if (!arg0.method3156(Static574.anInterface15_2)) {
			return false;
		} else if (Static632.aClass62_50.method1682((long) arg0.anInt3619) == null) {
			return Static57.aClass62_33.method1682((long) arg0.anInt3628) == null;
		} else {
			return false;
		}
	}
}
