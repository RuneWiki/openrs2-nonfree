import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!el", name = "b", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "[I")
	public static final int[] anIntArray107 = new int[4096];

	@OriginalMember(owner = "client!el", name = "c", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
	public static void method1423() {
		for (@Pc(7) int local7 = 0; local7 < Static439.anInt7382; local7++) {
			@Pc(18) int local18 = Static290.anIntArray441[local7];
			@Pc(26) Class11_Sub5_Sub2_Sub2 local26 = ((Class2_Sub34) Static400.aClass220_41.method5099((long) local18)).aClass11_Sub5_Sub2_Sub2_2;
			@Pc(30) int local30 = Static202.aClass2_Sub17_Sub1_1.method6138();
			if ((local30 & 0x80) != 0) {
				local30 += Static202.aClass2_Sub17_Sub1_1.method6138() << 8;
			}
			@Pc(53) int local53;
			@Pc(57) int local57;
			if ((local30 & 0x20) != 0) {
				local53 = Static202.aClass2_Sub17_Sub1_1.method6174();
				local57 = Static202.aClass2_Sub17_Sub1_1.method6119();
				local26.method6226(local57, local53, Static277.anInt5022);
				local26.anInt7690 = Static277.anInt5022 + 300;
				local26.anInt7685 = Static202.aClass2_Sub17_Sub1_1.method6115();
			}
			if ((local30 & 0x800) != 0) {
				local53 = Static202.aClass2_Sub17_Sub1_1.method6148();
				local26.anInt7649 = Static202.aClass2_Sub17_Sub1_1.method6119();
				local26.anInt7696 = Static202.aClass2_Sub17_Sub1_1.method6115();
				local26.aBoolean515 = (local53 & 0x8000) != 0;
				local26.anInt7630 = local53 & 0x7FFF;
				local26.anInt7677 = local26.anInt7630 + Static277.anInt5022 + local26.anInt7649;
			}
			@Pc(141) int local141;
			if ((local30 & 0x4) != 0) {
				local53 = Static202.aClass2_Sub17_Sub1_1.method6124();
				local57 = Static202.aClass2_Sub17_Sub1_1.method6171();
				if (local53 == 65535) {
					local53 = -1;
				}
				local141 = Static202.aClass2_Sub17_Sub1_1.method6119();
				local26.method6222(local57, local141, local53, false);
			}
			if ((local30 & 0x200) != 0) {
				local26.anInt7711 = Static202.aClass2_Sub17_Sub1_1.method6124();
				local26.anInt7719 = Static202.aClass2_Sub17_Sub1_1.method6148();
			}
			if ((local30 & 0x1) != 0) {
				local53 = Static202.aClass2_Sub17_Sub1_1.method6148();
				if (local53 == 65535) {
					local53 = -1;
				}
				local57 = Static202.aClass2_Sub17_Sub1_1.method6119();
				Static406.method5646(local57, local53, local26);
			}
			if ((local30 & 0x10) != 0) {
				if (local26.aClass82_1.method1897()) {
					Static115.method1881(local26);
				}
				local26.method6235(Static227.aClass54_2.method1128(Static202.aClass2_Sub17_Sub1_1.method6124()));
				local26.method6229(local26.aClass82_1.anInt1963);
				local26.anInt7673 = local26.aClass82_1.anInt1974 << 3;
				if (local26.aClass82_1.method1897()) {
					Static238.method3230(local26.aByte101, null, 0, local26.anIntArray633[0], local26.anIntArray632[0], local26, null);
				}
			}
			if ((local30 & 0x40) != 0) {
				local26.aString74 = Static202.aClass2_Sub17_Sub1_1.method6141();
				local26.anInt7659 = 100;
			}
			if ((local30 & 0x100) != 0) {
				local26.anInt7650 = Static202.aClass2_Sub17_Sub1_1.method6150();
				local26.anInt7689 = Static202.aClass2_Sub17_Sub1_1.method6120();
				local26.anInt7661 = Static202.aClass2_Sub17_Sub1_1.method6123();
				local26.anInt7687 = Static202.aClass2_Sub17_Sub1_1.method6120();
				local26.anInt7629 = Static202.aClass2_Sub17_Sub1_1.method6148() + Static277.anInt5022;
				local26.anInt7669 = Static202.aClass2_Sub17_Sub1_1.method6110() + Static277.anInt5022;
				local26.anInt7643 = Static202.aClass2_Sub17_Sub1_1.method6138();
				local26.anInt7650 += local26.anIntArray632[0];
				local26.anInt7705 = 0;
				local26.anInt7661 += local26.anIntArray632[0];
				local26.anInt7689 += local26.anIntArray633[0];
				local26.anInt7687 += local26.anIntArray633[0];
				local26.anInt7707 = 1;
			}
			if ((local30 & 0x2000) != 0) {
				local53 = Static202.aClass2_Sub17_Sub1_1.method6168();
				@Pc(365) int[] local365 = new int[local53];
				@Pc(368) int[] local368 = new int[local53];
				@Pc(371) int[] local371 = new int[local53];
				for (@Pc(373) int local373 = 0; local373 < local53; local373++) {
					@Pc(379) int local379 = Static202.aClass2_Sub17_Sub1_1.method6148();
					if (local379 == 65535) {
						local379 = -1;
					}
					local365[local373] = local379;
					local368[local373] = Static202.aClass2_Sub17_Sub1_1.method6138();
					local371[local373] = Static202.aClass2_Sub17_Sub1_1.method6153();
				}
				Static16.method4093(local371, local26, local368, local365);
			}
			if ((local30 & 0x1000) != 0) {
				local26.aByte103 = Static202.aClass2_Sub17_Sub1_1.method6123();
				local26.aByte104 = Static202.aClass2_Sub17_Sub1_1.method6120();
				local26.aByte102 = Static202.aClass2_Sub17_Sub1_1.method6120();
				local26.aByte105 = (byte) Static202.aClass2_Sub17_Sub1_1.method6115();
				local26.anInt7652 = Static277.anInt5022 + Static202.aClass2_Sub17_Sub1_1.method6124();
				local26.anInt7698 = Static277.anInt5022 + Static202.aClass2_Sub17_Sub1_1.method6110();
			}
			if ((local30 & 0x2) != 0) {
				local53 = Static202.aClass2_Sub17_Sub1_1.method6174();
				local57 = Static202.aClass2_Sub17_Sub1_1.method6115();
				local26.method6226(local57, local53, Static277.anInt5022);
			}
			if ((local30 & 0x400) != 0) {
				local53 = Static202.aClass2_Sub17_Sub1_1.method6148();
				local57 = Static202.aClass2_Sub17_Sub1_1.method6171();
				if (local53 == 65535) {
					local53 = -1;
				}
				local141 = Static202.aClass2_Sub17_Sub1_1.method6138();
				local26.method6222(local57, local141, local53, true);
			}
			if ((local30 & 0x8) != 0) {
				local26.anInt7656 = Static202.aClass2_Sub17_Sub1_1.method6153();
				if (local26.anInt7656 == 65535) {
					local26.anInt7656 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II[S)[S")
	public static short[] method1424(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static472.method5026(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)Lclient!vk;")
	public static Class259 method1426(@OriginalArg(0) int arg0) {
		@Pc(13) Class259[] local13 = Static71.method1102();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class259 local21 = local13[local15];
			if (local21.anInt7305 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
