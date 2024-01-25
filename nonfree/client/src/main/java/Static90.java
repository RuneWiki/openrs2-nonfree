import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "([ILclient!sp;[II[I)V")
	public static void method1966(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class25_Sub2_Sub2_Sub5_Sub2 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg2.length; local11++) {
			@Pc(17) int local17 = arg2[local11];
			@Pc(21) int local21 = arg0[local11];
			@Pc(25) int local25 = arg3[local11];
			@Pc(27) int local27 = 0;
			while (local21 != 0 && arg1.aClass271Array3.length > local27) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg1.aClass271Array3[local27] = null;
					} else {
						@Pc(52) Class270 local52 = Static245.aClass155_1.method3820(local17);
						@Pc(55) int local55 = local52.anInt7686;
						@Pc(60) Class271 local60 = arg1.aClass271Array3[local27];
						if (local60 != null) {
							if (local17 == local60.anInt7811) {
								if (local55 == 0) {
									local60 = arg1.aClass271Array3[local27] = null;
								} else if (local55 == 1) {
									local60.anInt7815 = 1;
									local60.anInt7813 = local25;
									local60.anInt7816 = 0;
									local60.anInt7812 = 0;
									local60.anInt7809 = 0;
									if (!arg1.aBoolean578) {
										Static217.method3600(0, arg1, local52);
									}
								} else if (local55 == 2) {
									local60.anInt7812 = 0;
								}
							} else if (local52.anInt7694 >= Static245.aClass155_1.method3820(local60.anInt7811).anInt7694) {
								local60 = arg1.aClass271Array3[local27] = null;
							}
						}
						if (local60 == null) {
							local60 = arg1.aClass271Array3[local27] = new Class271();
							local60.anInt7812 = 0;
							local60.anInt7809 = 0;
							local60.anInt7816 = 0;
							local60.anInt7813 = local25;
							local60.anInt7811 = local17;
							local60.anInt7815 = 1;
							if (!arg1.aBoolean578) {
								Static217.method3600(0, arg1, local52);
							}
						}
					}
				}
				local27++;
				local21 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)I")
	public static int method1967() {
		if (Static2.aClass251_1 == null) {
			if (!Static289.aBoolean370 && Static161.anInt3613 > 0) {
				if (Static171.aBoolean264 && Static446.aClass237_1.method5292(81) && Static161.anInt3613 > 2) {
					return ((Class3_Sub13) Static260.aClass244_40.aClass3_189.aClass3_286.aClass3_286).anInt2361;
				}
				return ((Class3_Sub13) Static260.aClass244_40.aClass3_189.aClass3_286).anInt2361;
			}
			@Pc(41) int local41 = Static234.aClass54_4.method7306();
			@Pc(45) int local45 = Static234.aClass54_4.method7315();
			@Pc(47) int local47 = Static89.anInt2311;
			@Pc(49) int local49 = Static111.anInt2680;
			@Pc(51) int local51 = Static240.anInt4751;
			if (local47 < local41 && local41 < local47 + local51) {
				@Pc(66) int local66 = -1;
				@Pc(86) int local86;
				for (@Pc(68) int local68 = 0; local68 < Static161.anInt3613; local68++) {
					if (Static582.aBoolean697) {
						local86 = local49 + (Static161.anInt3613 - local68 - 1) * 16 + 33;
						if (local45 > local86 - 13 && local86 + 3 >= local45) {
							local66 = local68;
						}
					} else {
						local86 = local49 + (-local68 + Static161.anInt3613 + -1) * 16 + 31;
						if (local45 > local86 - 13 && local45 <= local86 + 3) {
							local66 = local68;
						}
					}
				}
				if (local66 != -1) {
					local86 = 0;
					@Pc(144) Class85 local144 = new Class85(Static260.aClass244_40);
					for (@Pc(149) Class3_Sub13 local149 = (Class3_Sub13) local144.method2289(); local149 != null; local149 = (Class3_Sub13) local144.method2286()) {
						if (local66 == local86++) {
							return local149.anInt2361;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lclient!si;")
	public static Class54 method1970(@OriginalArg(0) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class54_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class54) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(42) Throwable local42) {
			return new Class54_Sub2(arg0, true);
		}
	}
}
