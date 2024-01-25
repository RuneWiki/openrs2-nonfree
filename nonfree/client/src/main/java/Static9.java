import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
	public static int anInt137 = -1;

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
	public static int anInt141 = 0;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)Z")
	public static boolean method136(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			return true;
		}
		try {
			if (Static112.anInt2244 == 2) {
				if (Static305.aClass3_Sub32_2 == null) {
					Static305.aClass3_Sub32_2 = Static729.method5712(Static481.aClass221_127, Static78.anInt1227, Static114.anInt2270);
					if (Static305.aClass3_Sub32_2 == null) {
						return false;
					}
				}
				if (Static595.aClass86_1 == null) {
					Static595.aClass86_1 = new Class86(Static386.aClass221_79, Static300.aClass221_86);
				}
				@Pc(41) Class3_Sub22_Sub5 local41 = Static671.aClass3_Sub22_Sub5_3;
				if (Static713.aClass3_Sub22_Sub5_4 != null) {
					local41 = Static713.aClass3_Sub22_Sub5_4;
				}
				if (local41.method9334(Static595.aClass86_1, Static305.aClass3_Sub32_2, Static343.aClass221_97)) {
					Static671.aClass3_Sub22_Sub5_3 = local41;
					Static671.aClass3_Sub22_Sub5_3.method9337(arg0 ^ 0xFFFFE22C);
					@Pc(72) int local72;
					if (Static89.anInt1479 <= 0) {
						Static112.anInt2244 = 0;
						Static671.aClass3_Sub22_Sub5_3.method9343(32023, Static554.anInt9248);
						for (local72 = 0; local72 < Static588.anIntArray528.length; local72++) {
							Static671.aClass3_Sub22_Sub5_3.method9315(Static588.anIntArray528[local72], local72);
							Static588.anIntArray528[local72] = 255;
						}
					} else {
						Static112.anInt2244 = 3;
						Static671.aClass3_Sub22_Sub5_3.method9343(arg0 + 32023, Static89.anInt1479 <= Static554.anInt9248 ? Static89.anInt1479 : Static554.anInt9248);
						for (local72 = 0; local72 < Static588.anIntArray528.length; local72++) {
							Static671.aClass3_Sub22_Sub5_3.method9315(Static588.anIntArray528[local72], local72);
							Static588.anIntArray528[local72] = 255;
						}
					}
					if (Static713.aClass3_Sub22_Sub5_4 == null) {
						if (Static482.aLong276 <= 0L) {
							Static671.aClass3_Sub22_Sub5_3.method9335(Static375.aBoolean498, Static305.aClass3_Sub32_2);
						} else {
							Static671.aClass3_Sub22_Sub5_3.method9344(Static482.aLong276, Static305.aClass3_Sub32_2, Static375.aBoolean498);
						}
					}
					if (Static296.aClass33_3 != null) {
						Static296.aClass33_3.method8232(Static671.aClass3_Sub22_Sub5_3);
					}
					Static595.aClass86_1 = null;
					Static482.aLong276 = 0L;
					Static713.aClass3_Sub22_Sub5_4 = null;
					Static481.aClass221_127 = null;
					Static305.aClass3_Sub32_2 = null;
					return true;
				}
			}
		} catch (@Pc(191) Exception local191) {
			local191.printStackTrace();
			Static671.aClass3_Sub22_Sub5_3.method9327();
			Static713.aClass3_Sub22_Sub5_4 = null;
			Static481.aClass221_127 = null;
			Static112.anInt2244 = 0;
			Static595.aClass86_1 = null;
			Static305.aClass3_Sub32_2 = null;
		}
		return false;
	}
}
