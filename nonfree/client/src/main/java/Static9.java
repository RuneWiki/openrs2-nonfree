import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
	public static int anInt164;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	public static int anInt163 = 0;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
	public static final int anInt166 = 2;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!hs;Z)Z")
	public static boolean method128(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static420.aClass84Array4 == Static365.aClass84Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5505();
		if (arg0.aShort97 < 0 || arg0.aShort95 < 0 || arg0.aShort98 >= Static401.anInt6621 || arg0.aShort96 >= Static364.anInt6134) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort97; local34 <= arg0.aShort98; local34++) {
			for (local38 = arg0.aShort95; local38 <= arg0.aShort96; local38++) {
				@Pc(45) Class189 local45 = Static396.method5419(arg0.aByte93, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort97) {
						local49++;
					}
					if (local34 < arg0.aShort98) {
						local49 += 4;
					}
					if (local38 > arg0.aShort95) {
						local49 += 8;
					}
					if (local38 < arg0.aShort96) {
						local49 += 2;
					}
					@Pc(74) Class242 local74 = Static110.method1826(local49, arg0);
					@Pc(77) Class242 local77 = local45.aClass242_2;
					if (local77 == null) {
						local45.aClass242_2 = local74;
					} else {
						while (local77.aClass242_4 != null) {
							local77 = local77.aClass242_4;
						}
						local77.aClass242_4 = local74;
					}
					local45.aByte52 = (byte) (local45.aByte52 | local49);
					if (local6 && (Static5.anIntArrayArray1[local34][local38] & 0xFF000000) != 0) {
						local8 = Static5.anIntArrayArray1[local34][local38];
						local10 = Static340.aByteArrayArray34[local34][local38];
						local12 = Static426.aByteArrayArray46[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort97; local38 <= arg0.aShort98; local38++) {
				for (@Pc(150) int local150 = arg0.aShort95; local150 <= arg0.aShort96; local150++) {
					if ((Static5.anIntArrayArray1[local38][local150] & 0xFF000000) == 0) {
						Static5.anIntArrayArray1[local38][local150] = local8;
						Static340.aByteArrayArray34[local38][local150] = local10;
						Static426.aByteArrayArray46[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static81.aClass3_Sub3Array1[Static215.anInt3735++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < 1 || arg0 < 1 || Static84.anInt1632 - 2 < arg7 || Static261.anInt4480 - 2 < arg0) {
			return;
		}
		@Pc(30) int local30 = arg2;
		if (arg2 < 3 && Static132.method2150(arg7, arg0)) {
			local30 = arg2 + 1;
		}
		if (!Static8.aClass173_Sub1_1.method3965(Static155.anInt2774) && !Static418.method5687(arg7, arg0, local30, Static3.anInt6323)) {
			return;
		}
		if (Static30.aClass189ArrayArrayArray2 == null) {
			return;
		}
		Static160.aClass204_Sub1_1.method4550(arg0, arg7, arg5, Static254.aClass61Array2[arg2], Static44.aClass28_14, arg2);
		if (arg4 < 0) {
			return;
		}
		@Pc(74) boolean local74 = Static8.aClass173_Sub1_1.aBoolean302;
		Static8.aClass173_Sub1_1.aBoolean302 = true;
		Static160.aClass204_Sub1_1.method4542(arg1, arg7, local30, Static254.aClass61Array2[arg2], arg4, Static44.aClass28_14, arg2, arg6, arg0, arg3);
		Static8.aClass173_Sub1_1.aBoolean302 = local74;
		return;
	}
}
