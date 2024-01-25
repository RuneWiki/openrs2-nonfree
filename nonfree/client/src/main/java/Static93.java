import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	public static int anInt1804;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_35 = new Class254(81, -1);

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "Lclient!tn;")
	public static Class229 aClass229_2 = null;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_36 = new Class254(63, 4);

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_34 = new Class96("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
	public static int anInt1805 = 0;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1456(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString41 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(53) String local53 = local32.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			@Pc(67) String local67 = local61.readLine();
			if (local67 == null) {
				return local10 + "| " + local64;
			}
			@Pc(73) int local73 = local67.indexOf(40);
			@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
			@Pc(89) String local89;
			if (local73 == -1) {
				local89 = local67;
			} else {
				local89 = local67.substring(0, local73);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local10 = local10 + local89;
			if (local73 != -1 && local80 != -1) {
				@Pc(133) int local133 = local67.indexOf(".java:", local73);
				if (local133 >= 0) {
					local10 = local10 + local67.substring(local133 + 5, local80);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!vm;)V")
	public static void method1458(@OriginalArg(0) Class253 arg0) {
		if (Static121.anInt2306 >= 65535) {
			return;
		}
		@Pc(6) Class1_Sub12 local6 = arg0.aClass1_Sub12_2;
		Static352.aClass253Array1[Static121.anInt2306] = arg0;
		Static60.aBooleanArray4[Static121.anInt2306] = false;
		Static121.anInt2306++;
		@Pc(21) int local21 = arg0.anInt7485;
		if (arg0.aBoolean639) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt7485;
		if (arg0.aBoolean638) {
			local29 = Static29.anInt482 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method3181() + Static86.anInt1530 - local6.method3180() >> Static58.anInt1051;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method3181() + local6.method3180() - Static86.anInt1530 >> Static58.anInt1051;
			if (local73 >= Static219.anInt3872) {
				local73 = Static219.anInt3872 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray115[local41++];
				@Pc(105) int local105 = (local6.method3182() + Static86.anInt1530 - local6.method3180() >> Static58.anInt1051) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static251.anInt4344) {
					local113 = Static251.anInt4344 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static392.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static392.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static121.anInt2306;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static392.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static121.anInt2306 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static392.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static121.anInt2306 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static392.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static121.anInt2306 << 48;
					}
				}
			}
		}
	}
}
