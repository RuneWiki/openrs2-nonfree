import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!da", name = "r", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_69 = new Class181(56, -1);

	@OriginalMember(owner = "client!da", name = "y", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_159 = new Class136(22, -2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZZZ)V")
	public static void method7206(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static407.anInt7009++;
			Static535.method7632();
		}
		if (arg1) {
			Static479.anInt8017++;
			Static402.method8008();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Z")
	public static boolean method7208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static248.method3792(arg0, arg1) & Static479.method6947(arg1, arg0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method7211() {
		Static113.aClass59Array1 = new Class59[50];
		Static44.anInt730 = 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method7213() {
		for (@Pc(15) Class5_Sub25 local15 = (Class5_Sub25) Static587.aClass81_67.method1608(); local15 != null; local15 = (Class5_Sub25) Static587.aClass81_67.method1610()) {
			if (local15.aClass103_Sub1_1.method6151()) {
				Static44.method753(local15.anInt4568);
			} else {
				local15.aClass103_Sub1_1.method6170();
				try {
					local15.aClass103_Sub1_1.method6166();
				} catch (@Pc(38) Exception local38) {
					Static280.method4194("TV: " + local15.anInt4568, local38);
					Static44.method753(local15.anInt4568);
				}
				if (!local15.aBoolean368 && !local15.aBoolean370) {
					@Pc(64) Class5_Sub5_Sub4 local64 = local15.aClass103_Sub1_1.method6164();
					if (local64 != null) {
						@Pc(70) Class5_Sub16_Sub5 local70 = local64.method7389();
						if (local70 != null) {
							local70.method8293(local15.anInt4565);
							Static287.aClass5_Sub16_Sub3_1.method6140(local70);
							local15.aBoolean368 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZZB)V")
	public static void method7217(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static407.anInt7009--;
			if (Static407.anInt7009 == 0) {
				Static421.anIntArray844 = null;
			}
		}
		if (arg1) {
			Static479.anInt8017--;
			if (Static479.anInt8017 == 0) {
				Static643.anIntArray836 = null;
			}
		}
	}
}
