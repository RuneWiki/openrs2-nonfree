import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
	public static int anInt1928;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZZLjava/lang/String;)V")
	public static void method1797(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static173.anInt3293 >= 100) {
			Static304.method4693(Static569.aClass335_40.method7694(Static319.anInt5939));
			return;
		}
		@Pc(23) String local23 = Static102.method2010(arg1);
		if (local23 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(28) int local28 = 0; local28 < Static173.anInt3293; local28++) {
			@Pc(36) String local36 = Static102.method2010(Static564.aStringArray72[local28]);
			if (local36 != null && local36.equals(local23)) {
				Static304.method4693(arg1 + Static569.aClass335_41.method7694(Static319.anInt5939));
				return;
			}
			if (Static196.aStringArray26[local28] != null) {
				local67 = Static102.method2010(Static196.aStringArray26[local28]);
				if (local67 != null && local67.equals(local23)) {
					Static304.method4693(arg1 + Static569.aClass335_41.method7694(Static319.anInt5939));
					return;
				}
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static121.anInt2381; local98++) {
			local67 = Static102.method2010(Static260.aStringArray36[local98]);
			if (local67 != null && local67.equals(local23)) {
				Static304.method4693(Static569.aClass335_46.method7694(Static319.anInt5939) + arg1 + Static569.aClass335_47.method7694(Static319.anInt5939));
				return;
			}
			if (Static217.aStringArray32[local98] != null) {
				@Pc(142) String local142 = Static102.method2010(Static217.aStringArray32[local98]);
				if (local142 != null && local142.equals(local23)) {
					Static304.method4693(Static569.aClass335_46.method7694(Static319.anInt5939) + arg1 + Static569.aClass335_47.method7694(Static319.anInt5939));
					return;
				}
			}
		}
		if (Static102.method2010(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aString34).equals(local23)) {
			Static304.method4693(Static569.aClass335_43.method7694(Static319.anInt5939));
			return;
		}
		@Pc(196) Class3_Sub44 local196 = Static275.method5689(Static107.aClass376_30, Static540.aClass282_4);
		local196.aClass3_Sub17_Sub2_3.method4849(Static153.method2617(arg1) + 1);
		local196.aClass3_Sub17_Sub2_3.method4878(arg1);
		local196.aClass3_Sub17_Sub2_3.method4849(arg0 ? 1 : 0);
		Static616.method8089(local196);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!mo;III)Lclient!fp;")
	public static Class3_Sub6_Sub9 method1798(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg1 << 10 | arg0.anInt6649;
		@Pc(19) Class3_Sub6_Sub9 local19 = (Class3_Sub6_Sub9) Static252.aClass30_1.method1092((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static560.aClass143_128.method3135(Static560.aClass143_128.method3127(local10));
		if (local31 == null) {
			local10 = arg0.anInt6649 | arg2 + 65536 << 10;
			local19 = (Class3_Sub6_Sub9) Static252.aClass30_1.method1092((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static560.aClass143_128.method3135(Static560.aClass143_128.method3127(local10));
			if (local31 == null) {
				local10 = arg0.anInt6649 | 0x3FFFC00;
				local19 = (Class3_Sub6_Sub9) Static252.aClass30_1.method1092((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static560.aClass143_128.method3135(Static560.aClass143_128.method3127(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static533.method7419(local31);
					} catch (@Pc(190) Exception local190) {
						throw new RuntimeException(local190.getMessage() + " S: " + local10);
					}
					local19.aClass239_5 = arg0;
					Static252.aClass30_1.method1094(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static533.method7419(local31);
				} catch (@Pc(122) Exception local122) {
					throw new RuntimeException(local122.getMessage() + " S: " + local10);
				}
				local19.aClass239_5 = arg0;
				Static252.aClass30_1.method1094(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static533.method7419(local31);
			} catch (@Pc(45) Exception local45) {
				throw new RuntimeException(local45.getMessage() + " S: " + local10);
			}
			local19.aClass239_5 = arg0;
			Static252.aClass30_1.method1094(local19, (long) local10 << 16);
			return local19;
		}
	}
}
