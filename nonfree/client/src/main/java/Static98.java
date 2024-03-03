import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ft", name = "V", descriptor = "I")
	public static int anInt2180;

	@OriginalMember(owner = "client!ft", name = "ab", descriptor = "I")
	public static int anInt2184;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!hb;", line = 11)
	public static Class11_Sub5 method2209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class67 local7 = Static307.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class22 local14 = local7.aClass22_2; local14 != null; local14 = local14.aClass22_1) {
			@Pc(18) Class11_Sub5 local18 = local14.aClass11_Sub5_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort103 == arg1 && local18.aShort101 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 93)
	public static boolean method2210(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Class2_Sub3_Sub30.anInt5688; local11++) {
			if (arg0.equalsIgnoreCase(Class11_Sub3_Sub2.aStringArray39[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Class2_Sub3_Sub20.aStringArray28[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V", line = 118)
	public static void method2211() {
		if (Class216_Sub1.anInt6051 != 0) {
			Class123_Sub1.anInt3381 -= Class216_Sub1.anInt6051 * 5;
			if (Class123_Sub1.anInt3381 >= Class2_Sub3_Sub36.anInt6904) {
				Class123_Sub1.anInt3381 = Class2_Sub3_Sub36.anInt6904 - 1;
			}
			if (Class123_Sub1.anInt3381 < 0) {
				Class123_Sub1.anInt3381 = 0;
			}
			Class216_Sub1.anInt6051 = 0;
		}
		if (InputStream_Sub1.anInt3789 < 102) {
			InputStream_Sub1.anInt3789 += 6;
		}
		@Pc(43) int local43;
		for (@Pc(35) int local35 = 0; local35 < Class2_Sub3_Sub1.anInt159; local35++) {
			local43 = Class111.aClass37Array1[local35].method1463();
			@Pc(49) char local49 = Class111.aClass37Array1[local35].method1458();
			if (local43 == 84) {
				Static55.method1644();
			} else if (Static163.aClass123_2.method3344(82) && local43 == 66) {
				if (Static22.aClipboard1 != null) {
					@Pc(340) String local340 = "";
					for (@Pc(345) int local345 = Static117.aStringArray65.length - 1; local345 >= 0; local345--) {
						if (Static117.aStringArray65[local345] != null && Static117.aStringArray65[local345].length() > 0) {
							local340 = local340 + Static117.aStringArray65[local345] + '\n';
						}
					}
					Static22.aClipboard1.setContents(new StringSelection(local340), null);
				}
			} else if (Static163.aClass123_2.method3344(82) && local43 == 67) {
				if (Static22.aClipboard1 != null) {
					@Pc(76) Transferable local76 = Static22.aClipboard1.getContents(null);
					if (local76 != null) {
						try {
							@Pc(83) String local83 = (String) local76.getTransferData(DataFlavor.stringFlavor);
							if (local83 != null) {
								@Pc(90) String[] local90 = Static187.method3644('\n', local83);
								if (local90.length <= 1) {
									Class22.aString9 = Class22.aString9 + local83;
								} else {
									for (@Pc(107) int local107 = 0; local107 < local90.length; local107++) {
										Class22.aString9 = local90[local107];
										Static55.method1644();
									}
								}
							}
						} catch (@Pc(122) Exception local122) {
						}
					}
				}
			} else if (local43 == 85 && Class2_Sub3_Sub10_Sub1.anInt6670 > 0) {
				Class22.aString9 = Class22.aString9.substring(0, Class2_Sub3_Sub10_Sub1.anInt6670 - 1) + Class22.aString9.substring(Class2_Sub3_Sub10_Sub1.anInt6670);
				Class2_Sub3_Sub10_Sub1.anInt6670--;
			} else if (local43 == 101 && Class2_Sub3_Sub10_Sub1.anInt6670 < Class22.aString9.length()) {
				Class22.aString9 = Class22.aString9.substring(0, Class2_Sub3_Sub10_Sub1.anInt6670) + Class22.aString9.substring(Class2_Sub3_Sub10_Sub1.anInt6670 + 1);
			} else if (local43 == 96 && Class2_Sub3_Sub10_Sub1.anInt6670 > 0) {
				Class2_Sub3_Sub10_Sub1.anInt6670--;
			} else if (local43 == 97 && Class2_Sub3_Sub10_Sub1.anInt6670 < Class22.aString9.length()) {
				Class2_Sub3_Sub10_Sub1.anInt6670++;
			} else if (local43 == 102) {
				Class2_Sub3_Sub10_Sub1.anInt6670 = 0;
			} else if (local43 == 103) {
				Class2_Sub3_Sub10_Sub1.anInt6670 = Class22.aString9.length();
			} else if (local43 == 104 && Static117.aStringArray65.length > Class2_Sub3_Sub15.anInt2650) {
				Class2_Sub3_Sub15.anInt2650++;
				Static132.method2657();
				Class2_Sub3_Sub10_Sub1.anInt6670 = Class22.aString9.length();
			} else if (local43 == 105 && Class2_Sub3_Sub15.anInt2650 > 0) {
				Class2_Sub3_Sub15.anInt2650--;
				Static132.method2657();
				Class2_Sub3_Sub10_Sub1.anInt6670 = Class22.aString9.length();
			} else if (Static83.method1941(local49) || local49 == ':' || local49 == ',' || local49 == ' ' || local49 == '_' || local49 == '-' || local49 == '+' || local49 == '[' || local49 == ']') {
				Class22.aString9 = Class22.aString9.substring(0, Class2_Sub3_Sub10_Sub1.anInt6670) + Class111.aClass37Array1[local35].method1458() + Class22.aString9.substring(Class2_Sub3_Sub10_Sub1.anInt6670);
				Class2_Sub3_Sub10_Sub1.anInt6670++;
			}
		}
		Class2_Sub3_Sub1.anInt159 = 0;
		for (local43 = 0; local43 < 100; local43++) {
			Static114.anIntArray156[local43] += Static290.anIntArray388[local43];
			if (Static114.anIntArray156[local43] >> 4 >= 350) {
				Static114.anIntArray157[local43] = (int) (Math.random() * (double) Static231.anInt4656) << 4;
				Static114.anIntArray156[local43] = 0;
				Static328.anIntArray450[local43] = (int) (Math.random() * 102.0D) + 51;
				Static290.anIntArray388[local43] = (int) (Math.random() * 48.0D) + 8;
			}
		}
		Static91.method2109();
	}
}
